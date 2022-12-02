package com.kodlamaio.lawfirmAOP.business.abstracts;

import com.kodlamaio.lawfirmAOP.business.requests.CreateProfessionRequest;
import com.kodlamaio.lawfirmAOP.business.responses.CreateProfessionResponse;
import com.kodlamaio.lawfirmAOP.business.responses.GetProfessionResponse;

import java.util.List;

public interface ProfessionService {
    List<GetProfessionResponse> getAll();

    CreateProfessionResponse add(CreateProfessionRequest createProfessionRequest);
}
