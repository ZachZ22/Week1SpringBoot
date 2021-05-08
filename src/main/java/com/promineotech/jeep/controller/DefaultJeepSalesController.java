package com.promineotech.jeep.controller;

import java.util.List;

import com.promineotech.jeep.Constants;
import com.promineotech.jeep.service.JeepSalesService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

import javax.validation.constraints.Pattern;

@RestController
@Slf4j
public class DefaultJeepSalesController implements JeepSalesController {

  @Autowired
  private JeepSalesService jeepSalesService;


  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {


    return null;
  }

  @Override
  public List<Jeep> fetchJeeps(String model, @Length(max = Constants.TRIM_MAX_LENGTH) @Pattern(regexp = "[\\w\\s]*") String trim) {

    log.debug("model={}, trim={},", model, trim);

    return jeepSalesService.fetchJeeps(model, trim);
  }
}
