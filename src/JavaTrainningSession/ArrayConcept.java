package JavaTrainningSession;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//array : to store the similar data type values in a array variables 
		//dis -advantage of array :
		//1.size is fixed -- static array =to overcome this problem --- we use collection ---array list ,hashtable 
		//2.stores only simillar data type ---to over come of this problem .we use object array
		
		//1.int array :
		int i [] = new int [4];
		
		//lowest bound/index =0;
		//upper bound /index = n -1;
		
		i[0] = 10;
		i[1] =20;
		i[2]= 30;
		i[3]= 40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		System.out.println(i.length);
		
		//for loop :
		for(int j = 0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//double array :
		
		double d [] = new double [3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		System.out.println(d[1]);
		
		//char array :
		char c [] = new char [3];
		c[0] = 'q';
		c[1] =2;
		c[2] ='$';
		
		//boolean array : 
		boolean b[] = new boolean [2];
		b[0] = true ;
		b[1] = false;
		
		//string array :
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
		s[2] = "world";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		//Object array :(object is class ) 
		Object ob []= new Object [6];
		
		//Object ---is used to store different data types values 
		ob[0] = "satya ";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1994";
		ob[4] ='M';
		ob[5] ="Vizage";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		
		
		
		
		
		
		
		
	}

}
