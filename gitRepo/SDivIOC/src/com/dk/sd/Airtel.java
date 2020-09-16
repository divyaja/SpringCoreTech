package com.dk.sd;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("calling from airtel");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet from airtel");
		
	}

}
