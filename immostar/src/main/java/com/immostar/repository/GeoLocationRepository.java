package com.immostar.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.immostar.domain.GeoLocation;

public interface GeoLocationRepository extends PagingAndSortingRepository<GeoLocation, String>,
        CrudRepository<GeoLocation, String>, QueryDslPredicateExecutor<GeoLocation> {
    
}
