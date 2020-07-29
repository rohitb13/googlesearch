package com.devops.devops;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		Runtime rTime = Runtime.getRuntime();
		String url = "http://192.168.1.100/";
		String browser = "C:\\Program Files\\internet explorer\\iexplore.exe ";
		Process pc = rTime.exec(browser + url);
		pc.waitFor();

	}

}
