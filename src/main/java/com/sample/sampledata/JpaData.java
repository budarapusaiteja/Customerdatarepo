package com.sample.sampledata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface JpaData extends JpaRepository<CustomerTable,Integer>{

}
