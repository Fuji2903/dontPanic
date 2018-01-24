package com.test;

import com.test.thread.PrintStringThread;

public class Main {

	public static void main(String[] args) {
		PrintStringThread thread1 = new PrintStringThread("Don't ");
		PrintStringThread thread2 = new PrintStringThread("Panic \n");
		
		thread2.start();
		thread1.start();

	}
}
