package com.immostar.service.interfaces;

import com.immostar.domain.Subscriber;

public interface Newsletter {

	public void save(Subscriber subscriber);
	
	public void sendNewsletter();
}
