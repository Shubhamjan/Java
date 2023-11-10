package com.demo.Generics;

public class main1 {
	public static void main(String[] args) {
		// return max value
		MyIf ob=(x,y)->{return(x>y?x:y);};
		System.out.println("max value is "+ob.compare(22, 23));
		
		//for use Integer class 
		MyGenIf<Integer> ob1=(x,y)->{return(x>y?x:y);};
		System.out.println("max value is "+ob1.compare(55, 56));
		
		//for compare string 
		MyGenIf<String> ob2=(x,y)->
		{
			int ans=x.compareTo(y);
			if(ans>0)
			{
				return x;
			}
			return y;
		};
	//	System.out.println(ob2.compare("p", "b"));
	}
}
