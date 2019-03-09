package com.sashi.springCrud.SpringCrudRepository;




import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<CustomerSummary, Integer> {

    List<CustomerSummary> findByStudentName(String customerFirstName);
}
