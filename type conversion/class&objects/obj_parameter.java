//Passing object as a parameter.........................
class rect
{ 
	int l,w; 

	
	rect(rect ob) 
	{ 
	l= ob.l; 
	w = ob.w; 
	} 
	rect(int a, int b) 
	{ 
	l = a; 
	w= b; 
	} 
	int volume() 
	{ 
	return l*w; 
	} 
} 
class test 
{ 
	public static void main(String args[]) 
	{ 
		
		rect ob = new rect(5,2); 
		rect ob1 = new rect(ob); 
		int vol1,vol2; 
		vol1 = ob.volume(); 
		System.out.println(vol1); 
		vol2= ob1.volume(); 
		System.out.println(vol2); 
	} 
} 
