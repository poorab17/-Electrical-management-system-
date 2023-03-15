import java.util.InputMismatchException;
import java.util.Scanner;

//subclass-Accessories

class Acess extends Product
{
	public void acesso()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Enter 1 : To select Door Bells");
		System.out.println("Enter 2 : To select SpikeGaurd");
		System.out.println("Enter 3 : Return back to menu.");
		System.out.println("======================================");
		
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Bell m = new Bell();
			       m.type71();
			        buy1();
			        break;
			
			case 2: Spike n = new Spike();
			        n.type72();
			        buy1();
			        break;
			
			
			        
			default: System.out.println("===Please enter valid input=== ");
			        acesso();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			acesso();
			
		}
     }
}

//Product-> Accessories->Bell subclass

class Bell extends Acess
{
	public void type71()
	{
		type71 ref = new type71("PANASONIC", "NO", "RED", 30, 6.5, "YES", 300);
		System.out.println("==========================================");
		System.out.println("Available Product is PANASONIC'S DingDong Bell");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> accessories->bell ->type71 subclass

class type71 extends Bell
{
	public type71(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
	{
		super();
		this.Bname=Bname;
		this.FireProof=FireProof;
		this.colour=colour;
		this.size=size;
		this.thickness=thickness;
		this.EnergySaving=EnergySaving;
		this.price=price;
		
	}
}

//****************************************************************************************************

//Product-> Accessories->spike subclass

class Spike extends Acess
{
	public void type72()
	{
		type72 ref = new type72("GM", "YES", "RED", 190, 2, "NO", 400);
		System.out.println("==========================================");
		System.out.println("Available Product is GM'S Spike Gaurd with 5 Socket");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> Accessories->Spike ->type72 subclass

class type72 extends Spike
{
	public type72(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
	{
		super();
		this.Bname=Bname;
		this.FireProof=FireProof;
		this.colour=colour;
		this.size=size;
		this.thickness=thickness;
		this.EnergySaving=EnergySaving;
		this.price=price;
		
	}
}

