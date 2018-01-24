package com.test.thread;

public class PrintStringThread extends Thread {

	private String printString;

	public PrintStringThread(String printString) {
		this.printString = printString;
	}

	
	public void run() {
		while (true) {
			System.out.print(printString);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
