package com.test;

import com.test.thread.PrintStringThread;
import com.test.thread.PrintStringPriority;

public class Main {

	public static void main(String[] args) {
		PrintStringPriority priority = new PrintStringPriority(2);
		PrintStringThread thread1 = new PrintStringThread("Don't ", priority, 0);
		PrintStringThread thread2 = new PrintStringThread("Panic \n", priority, 1);

		thread2.start();
		thread1.start();

	}
}
