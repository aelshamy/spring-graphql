package com.ajmoro.graphql.controller;

import com.ajmoro.graphql.data.SalesPerson;
import com.ajmoro.graphql.data.SalesPersonRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;

public class SalesPersonController {

    private final SalesPersonRepository salesPersonRepository;

    public SalesPersonController(SalesPersonRepository salespersonRepository) {
        this.salesPersonRepository = salespersonRepository;
    }

    @QueryMapping
    public Iterable<SalesPerson> salespeople(){
        return this.salesPersonRepository.findAll();
    }

    @QueryMapping
    public SalesPerson salespersonById(@Argument Long id){
        return this.salesPersonRepository.findById(id).orElseThrow();
    }

    @QueryMapping
    public SalesPerson salespersonByEmail(@Argument String email){
        return this.salesPersonRepository.findSalespersonByEmail(email);
    }
}
