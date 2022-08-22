package com.ajmoro.graphql.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesPersonRepository extends JpaRepository<SalesPerson, Long> {
    SalesPerson findSalespersonByEmail(String email);
}
