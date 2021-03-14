package com.example.androidQr.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {

    private String firstName;
    private String lastName;
    private String middleName;
    private String event;
    private String role;
    private String weapon;
}
