package com.demo.Storage;

public class strg {
	private int n;
	private boolean Vcheck;
	
	public strg() {
		Vcheck = false;
	}
	
	public synchronized void put(int n) {
		if(Vcheck) {
			try {
				wait();
			}catch(InterruptedException p) {
				p.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("Put "+n);
		Vcheck = true;
		notify();
	}
	public synchronized void get() {
		if(!Vcheck) {
			try {
				wait();
			}catch(InterruptedException p) {
				p.printStackTrace();
			}
		}
		System.out.println("gOT "+n);
		Vcheck = false;
		notify();
	}
}
