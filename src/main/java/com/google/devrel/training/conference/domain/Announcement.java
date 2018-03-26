package com.google.devrel.training.conference.domain;

import com.google.api.server.spi.Constant;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;

@Cache
public class Announcement {
	private String message;

	public Announcement(){}

	public Announcement(String message){
	this.message = message;
	}

	public String getMessage(){
	return message;
	}
	
}
