package com.javainuse.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.javainuse.model.Employee;

public class CreateEmployeeProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
    	Employee emp = new Employee();
		emp.setName("camel-employee");
		emp.setDesignation("camel-manager");
		emp.setEmpId(111);
		emp.setSalary(30000);
		exchange.getIn().setBody(emp);
    }

}