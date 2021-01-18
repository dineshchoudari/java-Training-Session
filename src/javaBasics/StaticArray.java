package javaBasics;

public class StaticArray {

	public static void main(String[] args) {
		
		// array:To store similar data type values in a array variable 
		//Diadvantages of array: To Overcome this we need collection like Array list,linked list,Hashmpap. 
		//1.Size is fixed
		//2.it stores similsr type of data to overcome this we use object array 
		//1. Integer  array:
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]); //Arrayindex Outof Bound Exception
		
		System.out.println(i.length);
		
		//print all the values of the array:Use for loop
		
		System.out.println("***************************");
		
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}
		//2.Double Array
		
		double d[]=new double[3];
		d[0]=10.33;
		d[1]=22.88;
		d[2]=67.66;
		System.out.println(d[2]);
		
		//3.Char Array
		char c[]=new char[5];
		c[0]='S';
		c[1]='D';
		c[2]='K';
		c[3]='$';
		
		//4.Boolean array
		
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5.String array
		String s[]=new String[3];
		s[0]="Dinesh";
		s[1]="Kethan";
		s[2]="Sravanthi";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		//Object array(object is a class)
		// Object array is used to store different data type values
		
		Object obj[]=new Object [6];
		obj[0]="Dinesh";
		obj[1]=12.33;
		obj[2]='C';
		obj[3]=true;
		obj[4]="16/11/1985";
		obj[5]="London";
		
		
		System.out.println(obj[5]);
		System.out.println(obj.length);
		
		
		
		
		
		
		

	}

}
