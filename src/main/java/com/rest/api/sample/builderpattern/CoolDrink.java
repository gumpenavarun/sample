package com.rest.api.sample.builderpattern;

public abstract class CoolDrink implements Item{
	@Override
	   public Packing packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract float price();
	   
	 
}
