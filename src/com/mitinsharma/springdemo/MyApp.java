package com.mitinsharma.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//Coach b = new BaseballCoach();
		Coach c = new TrackCoach();
		
		
		System.out.print(c.getDailyWorkout());
	}

}
