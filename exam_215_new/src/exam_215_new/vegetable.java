package exam_215_new;

public class vegetable {
	String name;
	vegetable(String name)
	{
		this.name=name;
		
	}
	public static void main(String[]args) {
	//TODO Auto-generated method sub
	vegetable spinach=new vegetable("spinach");
	System.out.println("Vegetable is "+spinach.name);
	}
	String getType()
	{
		return name;
	}	
}
