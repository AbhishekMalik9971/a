package com.spring2code.demo;

public class Myapp 
{

	public static void main(String[] args) {
		Coach theCoach = new BaseballCoach();
		Coach theCoach1 = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach1.getDailyWorkout());

	}

}
