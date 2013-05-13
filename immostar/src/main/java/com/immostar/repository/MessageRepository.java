package com.immostar.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.immostar.domain.Message;

public interface MessageRepository extends PagingAndSortingRepository<Message, ObjectId>,
        CrudRepository<Message, ObjectId>, QueryDslPredicateExecutor<Message> {

	public List<Message> findMessageByReceiver(String receiver);
}
