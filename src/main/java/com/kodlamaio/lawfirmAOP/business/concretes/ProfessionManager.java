package com.kodlamaio.lawfirmAOP.business.concretes;

import com.kodlamaio.lawfirmAOP.business.abstracts.ProfessionService;
import com.kodlamaio.lawfirmAOP.business.requests.CreateProfessionRequest;
import com.kodlamaio.lawfirmAOP.business.responses.CreateProfessionResponse;
import com.kodlamaio.lawfirmAOP.business.responses.GetProfessionResponse;
import com.kodlamaio.lawfirmAOP.dataAccess.ProfessionRepository;
import com.kodlamaio.lawfirmAOP.entities.Profession;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProfessionManager implements ProfessionService {
    ProfessionRepository repository;
    @Override
    public List<GetProfessionResponse> getAll() {
        List<Profession> professions=repository.findAll();
        List<GetProfessionResponse> responses=new ArrayList<>();
        for (Profession p:professions) {
            GetProfessionResponse item=new GetProfessionResponse();
            item.setId(p.getId());
            item.setDescription(p.getDescription());
            responses.add(item);
        }
        return responses;
    }

    @Override
    public CreateProfessionResponse add(CreateProfessionRequest createProfessionRequest) {
        Profession profession=new Profession();
        profession.setDescription(createProfessionRequest.getDescription());
        repository.save(profession);

        CreateProfessionResponse response=new CreateProfessionResponse();
        response.setId(profession.getId());
        response.setDescription(profession.getDescription());

        return response;
    }
}
