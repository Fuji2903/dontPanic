package com.dontpanic.thread;

/**
 * Print string value according to priority
 * 
 * @author Christian
 *
 */
public class PrintStringPriority {

	private int priority;
	private int numberOfThread;

	public PrintStringPriority(int number) {
		this.priority = 0;
		this.numberOfThread = number;
	}

	/**
	 * Print string value according to priority
	 * 
	 * @param printString
	 *            String to print
	 * @param threadPriority
	 *            thread number
	 */
	public synchronized void printString(String printString, int threadPriority) {
		while (threadPriority != priority) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (priority >= numberOfThread - 1) {
			priority = 0;
		} else {
			priority++;
		}
		System.out.print(printString);
		notifyAll();
	}
}
