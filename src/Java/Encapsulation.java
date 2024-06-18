
public class Encapsulation {

/*	public static void main(String args[])
	{
		System.out.println("Test");
	}
*/
	
	private String empName;
	
	public String getName()
	{
		return empName;
	}
	
	public void setName(String empName)
	{
		this.empName = empName;
	}
	
	
	public void setType(String empName)
	{
		if(empName.equals("Anil"))
		{
			this.empName="";
		}
		else
		{
			
		}
	}
}
