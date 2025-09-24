package com.tnsif.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Food implements ShoppingMall {
	public void purchase()
	{
		System.out.println("I'm going to ordering the food..");
	}

}
