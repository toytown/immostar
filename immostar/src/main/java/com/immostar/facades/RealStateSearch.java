package com.immostar.facades;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.PageRequest;

import com.immostar.domain.RealState;
import com.immostar.domain.SearchRequest;
import com.immostar.service.interfaces.RealStateService;

public class RealStateSearch {

	@Resource
	private RealStateService<RealState> realStateService;
	
	public List<RealState> findRealStates(SearchRequest req, PageRequest pageReq) {
		return realStateService.find(req, pageReq);
		
	}
}
