package com.demo.PC;

import com.demo.Storage.strg;

public class Producer extends Thread{
	private strg s;
	private int n;
	public Producer(strg s,int n) {
		this.s=s;
		this.n=n;
	}
	public void run() {
		for(int i=0;i<n;i++) {
			s.put(i);
		}
	}
}
