class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class paraConstrDemo {

	public static void main(String[] args) {
		Std std1=new Std(12,"Hari");
		Std std2=new Std(5,"Manoj");
		std1.display();
		std2.display();


	}

}
