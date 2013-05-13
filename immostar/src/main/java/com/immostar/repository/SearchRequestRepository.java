package com.immostar.repository;

import org.bson.types.ObjectId;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.immostar.domain.SearchRequest;

public interface SearchRequestRepository extends PagingAndSortingRepository<SearchRequest, ObjectId>, CrudRepository<SearchRequest, ObjectId>,
        QueryDslPredicateExecutor<SearchRequest> {

}
