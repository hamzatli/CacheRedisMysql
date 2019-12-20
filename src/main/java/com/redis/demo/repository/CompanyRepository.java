package com.redis.demo.repository;

import com.redis.demo.model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ismayil Hamzatli on Dec, 2019
 */
@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {
}
