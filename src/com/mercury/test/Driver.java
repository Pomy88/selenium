package com.mercury.test;

import java.awt.AWTException;
import java.io.IOException;


public class Driver {

	public static void main(String[] args) throws Exception  {
		
		MR mr1 = new MR();
		mr1.browserAppLaunch();
		mr1.login();
		//mr1.browserClose();
	}

}
