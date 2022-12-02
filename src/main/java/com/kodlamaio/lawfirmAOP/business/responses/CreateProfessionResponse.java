package com.kodlamaio.lawfirmAOP.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProfessionResponse {
    private int id;
    private String description;
}
