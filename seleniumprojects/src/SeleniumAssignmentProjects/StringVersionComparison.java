package SeleniumAssignmentProjects;

public class StringVersionComparison 
{

	public static void main(String[] args)
	{
		String s1="3.05.06.07";
		String s2="3.06.07.01";
	String[] subS1=s1.split(":");
	String[] subS2=s2.split(":");
	for(int i=0;i<subS1.length;i++)
	{
		
		int num1=Integer.parseInt(subS1[i]);
		int num2=Integer.parseInt(subS2[i]);
		if(num1>num2) 
		{
			System.out.println(s1 +"is version");
			
		}
		else if(Integer.parseInt(subS1[i])<Integer.parseInt(subS2[i]))
				{
			System.out.println(s2 +"is version");
			break;
				}
		
		
	}
	
		

	}

}