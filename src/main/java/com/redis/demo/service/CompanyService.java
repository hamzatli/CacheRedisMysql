package com.redis.demo.service;

import com.redis.demo.model.Company;

import java.util.List;

/**
 * Created by Ismayil Hamzatli on Dec, 2019
 */
public interface CompanyService {

     List<Company> getAll();

     Company getById(Integer id);

     void delete(Integer id);

     void save (Company company);


}
