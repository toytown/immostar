package com.immostar.service.interfaces;

import java.util.List;

import com.immostar.domain.GeoLocation;

public interface GeoLocationService {

    public Iterable<GeoLocation> findByZipOrCity(String cityOrZip);

    public GeoLocation findLocation(String cityOrZip);
    
    public GeoLocation findOne(String id);
    
    public List<String>  findCityAreas(String city);
    
}
