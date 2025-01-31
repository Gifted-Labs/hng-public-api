package com.giftedlabs.controller;

import com.giftedlabs.model.SimpleResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/info")
public class PublicController {

    @GetMapping
    public ResponseEntity<SimpleResponse> showMessage(){
        SimpleResponse info = new SimpleResponse();
        info.setEmail("juliusadjeteysowah@gmail.com");
        info.setGithub_url("https://github.com/Gifted-Labs/hng-public-api.git");

        return ResponseEntity.status(HttpStatus.OK).body(info);
    }

}
