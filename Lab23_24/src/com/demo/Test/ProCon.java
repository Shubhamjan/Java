package com.demo.Test;

import com.demo.PC.Consumer;
import com.demo.PC.Producer;
import com.demo.Storage.strg;

public class ProCon {
	public static void main(String[] args) {
		strg s = new strg();
		Producer p = new Producer(s,20);
		Consumer c = new Consumer(s,10);
		p.start();
		c.start();
	}
}
