package com.airchina.xn.rest.webservice.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.airchina.xn.model.Order;
import com.airchina.xn.rest.webservice.ExampleTest;

@Service("exampletestService")
@Path("/")
public class ExampleTestImpl implements ExampleTest {

	@Override
	@GET
//	@Path("/order")
	@Produces({MediaType.APPLICATION_JSON})
	public Order getOrder() {
		return new Order(10L, "李先生", "牛肉面", 20);
	}

}
