package com.kodlamaio.lawfirmAOP.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProfessionRequest {
    @NotNull
    @NotBlank
    private String description;
}
