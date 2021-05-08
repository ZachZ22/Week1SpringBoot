package com.promineotech.jeep.dao;

import com.promineotech.jeep.entity.Jeep;

import java.util.List;

public interface JeepSalesDao {


    List<Jeep> fetchJeeps(String model, String trim);





}
