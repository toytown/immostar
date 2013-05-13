package com.immostar.repository;

import org.bson.types.ObjectId;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.immostar.domain.Subscriber;

public interface SubscriberRepository extends PagingAndSortingRepository<Subscriber, ObjectId>, CrudRepository<Subscriber, ObjectId>,
		QueryDslPredicateExecutor<Subscriber> {

}
