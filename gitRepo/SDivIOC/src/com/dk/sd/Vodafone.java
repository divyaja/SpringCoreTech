package com.dk.sd;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		System.out.println("calling from vodafone");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet from vodafone");
		
	}

}
