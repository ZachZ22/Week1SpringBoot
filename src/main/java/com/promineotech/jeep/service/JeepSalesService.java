package com.promineotech.jeep.service;

import com.promineotech.jeep.entity.Jeep;

import java.util.List;

public interface JeepSalesService {

/*
*
* @param model
* @param trim
* @return
 */
    List<Jeep> fetchJeeps(String model, String trim);
}
