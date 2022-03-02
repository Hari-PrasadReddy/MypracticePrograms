
public class methodOverloading {
	public void num(int i,int j)
	  {
	       System.out.println("Addition of two numbers: "+(i+j));
	  }
	  public void num(int k) 
	  {
	       System.out.println("The value of k is : "+k);
	  }

	public static void main(String[] args) {
		methodOverloading obj=new methodOverloading();
	     obj.num(10,12);
	     obj.num(8); 

	}

}


