package com.techlabs.patterns.creational.abstractfactory.ex1;

public class VisaPlatinumCreditCard extends CreditCard{

	@Override
	public void getInformation(CreditCard card){
		System.out.println("Your CVV number is :"+card.cvvNumber);
	}
	
}
