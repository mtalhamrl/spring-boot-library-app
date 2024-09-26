package com.luv2code.spring_boot_library.requestmodels;


import lombok.Data;

import java.util.Optional;

@Data
public class ReviewRequest {

    //kitaba rating verip description yapacak user.

    private double rating;

    private Long bookId;

    private Optional<String> reviewDescription;
}
