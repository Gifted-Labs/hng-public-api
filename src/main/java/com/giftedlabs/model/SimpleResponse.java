package com.giftedlabs.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SimpleResponse {

    private String email;
    private LocalDateTime current_datetime = LocalDateTime.now();
    private String githubUrl;
}
