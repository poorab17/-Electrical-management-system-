
import java.util.InputMismatchException;
import java.util.Scanner;

//Home Automation
class HA extends Product
{
	public void HAo()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Enter 1 : To select CCTV");
		System.out.println("Enter 2 : To select Sensors");
		System.out.println("Enter 3 : Return back to menu.");
		System.out.println("======================================");
		
			int i = sc.nextInt();
			switch(i)
			{
			case 1:CCTV m = new CCTV();
			       m.type81();
			        buy1();
			        break;
			
			case 2: Sensor n = new Sensor();
			        n.type82();
			        buy1();
			        break;
			
			
			        
			default: System.out.println("===Please enter valid input=== ");
			        HAo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			HAo();
			
		}
     }
}

//Product-> HA->CCTV subclass

class CCTV extends HA
{
	public void type81()
	{
		type81 ref = new type81("CP-Plus", "YES", "BLACK", 60, 9.0, "YES", 4000);
		System.out.println("==========================================");
		System.out.println("Available Product is CP-Plus 's CCTV Camera");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> accessories->CCTV ->type81 subclass

class type81 extends CCTV
{
	public type81(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//Product-> HA->sensor subclass

class Sensor extends HA
{
	public void type82()
	{
		type82 ref = new type82("Tata-Power", "YES", "BLUE", 80, 2, "Yes", 3000);
		System.out.println("==========================================");
		System.out.println("Available Product is Tata-Power's motion detector Sensor");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> HA->Sensor ->type82 subclass

class type82 extends Spike
{
	public type82(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

