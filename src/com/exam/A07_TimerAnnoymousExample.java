package com.exam;

import java.util.Timer;
import java.util.TimerTask;

public class A07_TimerAnnoymousExample {
	static class Alpha extends TimerTask{
		@Override
		public void run() {
			System.out.println((char)(Math.random()*26+'A'));
		}
	}
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		Alpha a = new Alpha();
		timer.schedule(a, 0, 100);
		
		
		
		
		
		//익명 자식 객체 선언 : 원래는 위 처럼 Alpha라는 자식 클래스를 생성하여 main에 객체를 만들었지만 익명 자식 객체를 main에 바로 선언할 수도 있음 
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				System.out.println((int)(Math.random()*10));
			}
		};
		timer.schedule(timerTask, 0, 1000);
		
		
		
		// 익명 자식 객체를 timer 메소드 안에 바로 선언한 것
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println((char)(Math.random()*26+'a'));
			}
		}, 0, 1000);
		
		
		
	}

}
