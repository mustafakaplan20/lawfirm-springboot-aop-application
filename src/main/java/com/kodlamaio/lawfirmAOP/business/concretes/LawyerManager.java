package com.kodlamaio.lawfirmAOP.business.concretes;

import com.kodlamaio.lawfirmAOP.business.abstracts.LawyerService;
import com.kodlamaio.lawfirmAOP.business.requests.CreateLawyerRequest;
import com.kodlamaio.lawfirmAOP.business.responses.CreateLawyerResponse;
import com.kodlamaio.lawfirmAOP.business.responses.GetLawyerResponse;
import com.kodlamaio.lawfirmAOP.dataAccess.LawyerRepository;
import com.kodlamaio.lawfirmAOP.dataAccess.ProfessionRepository;
import com.kodlamaio.lawfirmAOP.entities.Lawyer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class LawyerManager implements LawyerService {
    LawyerRepository repository;
    ProfessionRepository professionRepository;

    @Override
    public List<GetLawyerResponse> getAll() {
        List<Lawyer> lawyers=repository.findAll();
        List<GetLawyerResponse> responses=new ArrayList<>();
        for (Lawyer l:lawyers) {
            GetLawyerResponse item=new GetLawyerResponse();
            item.setId(l.getId());
            item.setName(l.getName());
            item.setSurname(l.getSurname());
            item.setProfessionDescription(l.getProfession().getDescription());
            responses.add(item);
        }
        return responses;
    }

    @Override
    public CreateLawyerResponse add(CreateLawyerRequest createLawyerRequest) {
        Lawyer lawyer=new Lawyer();
        lawyer.setName(createLawyerRequest.getName());
        lawyer.setSurname(createLawyerRequest.getSurname());
        lawyer.setProfession(professionRepository.findById(createLawyerRequest.getProfessionId()).get());
        repository.save(lawyer);

        CreateLawyerResponse response=new CreateLawyerResponse();
        response.setId(lawyer.getId());
        response.setName(lawyer.getName());
        response.setSurname(lawyer.getSurname());
        response.setProfessionDescription(lawyer.getProfession().getDescription());
        return response;
    }
}
