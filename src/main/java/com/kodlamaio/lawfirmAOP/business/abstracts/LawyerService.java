package com.kodlamaio.lawfirmAOP.business.abstracts;

import com.kodlamaio.lawfirmAOP.business.requests.CreateLawyerRequest;
import com.kodlamaio.lawfirmAOP.business.responses.CreateLawyerResponse;
import com.kodlamaio.lawfirmAOP.business.responses.GetLawyerResponse;

import java.util.List;

public interface LawyerService {

    List<GetLawyerResponse> getAll();

    CreateLawyerResponse add(CreateLawyerRequest createLawyerRequest);
}
