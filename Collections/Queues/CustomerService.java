package com.Collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

class CustomerRequest {
	String name;
	
	CustomerRequest(String name) {
		this.name = name;
	}
}
public class CustomerService {

	public static void main(String[] args) {
		Queue<CustomerRequest> requestQueue = new LinkedList<>();
		
		requestQueue.add(new CustomerRequest("Abc"));
		requestQueue.add(new CustomerRequest("Pqr"));
		requestQueue.add(new CustomerRequest("Xyz"));
		
		while(!requestQueue.isEmpty()) {
			CustomerRequest request = requestQueue.poll();
			System.out.println("Processing request from: "+ request.name);
		}
	}
}
