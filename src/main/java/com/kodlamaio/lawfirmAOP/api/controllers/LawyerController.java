package com.kodlamaio.lawfirmAOP.api.controllers;

import com.kodlamaio.lawfirmAOP.business.abstracts.LawyerService;
import com.kodlamaio.lawfirmAOP.business.requests.CreateLawyerRequest;
import com.kodlamaio.lawfirmAOP.business.responses.CreateLawyerResponse;
import com.kodlamaio.lawfirmAOP.business.responses.GetLawyerResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/lawyers")
public class LawyerController {
    LawyerService service;

    @GetMapping
    public List<GetLawyerResponse> getAll(){
        return service.getAll();
    }
    @PostMapping
    public CreateLawyerResponse add(@RequestBody CreateLawyerRequest createLawyerRequest) {
        return service.add(createLawyerRequest);
    }
}
