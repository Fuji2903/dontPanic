package com.test.thread;

/**
 * Thread to print string value
 */
public class PrintStringThread extends Thread {

	private String printString;
	private PrintStringPriority priority;
	private int threadNumber;

	public PrintStringThread(String printString, PrintStringPriority priority, int threadNumber) {
		this.printString = printString;
		this.priority = priority;
		this.threadNumber = threadNumber;
	}

	public void run() {
		while (true) {
			priority.printString(printString,threadNumber);
		}
	}
}
