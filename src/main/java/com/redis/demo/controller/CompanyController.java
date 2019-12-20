package com.redis.demo.controller;

import com.redis.demo.model.Company;
import com.redis.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ismayil Hamzatli on Dec, 2019
 */


@RestController
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    @Cacheable(value = "companySave", key = "#company")
    public void save(@RequestBody Company company) {

        companyService.save(company);
    }

    @GetMapping("/get/{id}")
    @Cacheable(value = "company", key = "#id")
    public Company getById(@PathVariable Integer id) {
        return companyService.getById(id);
    }

    @GetMapping
    @CacheEvict(allEntries = true)
    @Cacheable("companies")
    public List<Company> getAll() {
        return companyService.getAll();
    }

    @DeleteMapping
    public void delete(@PathVariable Integer id) {
        companyService.delete(id);
    }
}
