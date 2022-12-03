package com.kodlamaio.lawfirmAOP.api.controllers;

import com.kodlamaio.lawfirmAOP.annotations.ProfessionAnnotation;
import com.kodlamaio.lawfirmAOP.business.abstracts.ProfessionService;
import com.kodlamaio.lawfirmAOP.business.requests.CreateProfessionRequest;
import com.kodlamaio.lawfirmAOP.business.responses.CreateProfessionResponse;
import com.kodlamaio.lawfirmAOP.business.responses.GetProfessionResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/professions")
public class ProfessionController {
    ProfessionService service;

    @GetMapping
    @ProfessionAnnotation
    public List<GetProfessionResponse> getAll(){
        return service.getAll();

    }
    @PostMapping
    @ProfessionAnnotation
    CreateProfessionResponse add(@RequestBody CreateProfessionRequest createProfessionRequest){
        return service.add(createProfessionRequest);

    }
}
