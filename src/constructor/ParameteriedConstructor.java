package constructor;
class Parameter
{
	Parameter(int a,int b)
	{
		
		System.out.println(a+b);
	}
}

public class ParameteriedConstructor 
{

	public static void main(String[] args) 
	{
		Parameter ab=new Parameter(10,20);	

	}

}
