package com.giftedlabs.model;

import lombok.Data;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class SimpleResponse {

    private String email;
    private String current_datetime = ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT).toString();
    private String github_url;
}
