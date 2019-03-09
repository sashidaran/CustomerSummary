package com.sashi.springCrud.SpringCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CrudController {


    @Autowired
    private UserRepository userRepository;



    @GetMapping("/v1/customer/{customerSummary}")
    private Optional<CustomerSummary> getCustomerSummary(@PathVariable Integer customerId) {
        return userRepository.findById(customerId);
    }

}
