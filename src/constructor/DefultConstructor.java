package constructor;
class DefultCon
{
	DefultCon()
	{
		System.out.println(10+20);
	}
}
class Inheri extends DefultCon
{
	Inheri()
	{
		System.out.println("Inheritance and constructor");
	}
}

public class DefultConstructor extends Inheri
{
	DefultConstructor()
	{
		System.out.println("Defult constructor");
	}

	public static void main(String[] args) 
	{
		DefultConstructor ab=new DefultConstructor();

	}

}
