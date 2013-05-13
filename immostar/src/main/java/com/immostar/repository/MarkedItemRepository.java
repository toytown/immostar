package com.immostar.repository;

import org.bson.types.ObjectId;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.immostar.domain.MarkedItem;

public interface MarkedItemRepository extends PagingAndSortingRepository<MarkedItem, ObjectId>, CrudRepository<MarkedItem, ObjectId>, QueryDslPredicateExecutor<MarkedItem> {

	public MarkedItem findMarkedItemByUserId(String userId);
}
