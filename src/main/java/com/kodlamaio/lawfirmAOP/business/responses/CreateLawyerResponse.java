package com.kodlamaio.lawfirmAOP.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLawyerResponse {
    private int id;
    private String name;
    private String surname;
    private String professionDescription;
}
