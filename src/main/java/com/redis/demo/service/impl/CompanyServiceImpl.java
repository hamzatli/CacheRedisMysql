package com.redis.demo.service.impl;

import com.redis.demo.model.Company;
import com.redis.demo.repository.CompanyRepository;
import com.redis.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ismayil Hamzatli on Dec, 2019
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;



    public List<Company> getAll(){

        return (List<Company>) companyRepository.findAll();
    }

    public Company getById(Integer id){
        return companyRepository.findById(id).orElse(null);
    }

    public void delete(Integer id){
        companyRepository.deleteById(id);
    }


    public void save (Company company){
        companyRepository.save(company);
    }

}
