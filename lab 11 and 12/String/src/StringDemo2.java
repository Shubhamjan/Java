
public class StringDemo2 {
	public static void main(String[] args)
	{
		String s ="Test String";
//		System.out.println("Uppercase "+s.toUpperCase());
//		System.out.println("Lowercase "+s.toLowerCase());
//		System.out.println("Charat  "+s.charAt(2));
		System.out.println(s.substring(0,2));
		System.out.println(s.lastIndexOf('S'));
		StringBuilder sb=new StringBuilder("string builder");
		sb.append("Test append");
		System.out.println(sb);
	}
}
package com.demo.service;
import java.util.Scanner;

import com.demo.dao.PersonDao;


public class PersonServiceImpl implements PersonService {
private PersonDao pdao;
public PersonServiceImpl() {
	pdao=new PersonDaoImpl();
}
	@Override
	public void addNewPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		Person p=new Person(pid,nm,mob);
		pdao.save(p);
		
	}

}
