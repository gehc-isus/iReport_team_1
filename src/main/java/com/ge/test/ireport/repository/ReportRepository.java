package com.ge.test.ireport.repository;

import com.ge.test.ireport.model.ListResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends CrudRepository<ListResponse, Long> {
}
