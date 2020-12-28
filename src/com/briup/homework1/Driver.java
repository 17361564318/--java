package com.briup.homework1;

public class Driver {

public static void main(String[] args) {
	Track myTrack = new Track();             
    myTrack.setTitle("Watching The Wheels");
	try {
	Duration myDuration = new Duration(234);
   // Duration myDuration = new Duration(0, 3, 48);
	myTrack.setDuration(myDuration);
	System.out.println("总秒数： "+myTrack.getDuration().getTotalSeconds());
    System.out.println("myTrack is: " + myTrack);		
	System.out.println("Title = " + myTrack.getTitle());
	System.out.println("Duration = " + myTrack.getDuration().toString());
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
