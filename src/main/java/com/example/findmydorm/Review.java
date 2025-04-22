package com.example.findmydorm;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("review")
public class Review {

    @Id
    private String id;
    private String comment;
}
