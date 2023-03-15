
import java.util.InputMismatchException;
import java.util.Scanner;

//subclass Fan
class Fan extends Product
{
	public void Fano()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Enter 1 : To select Ceiling Fan.");
		System.out.println("Enter 2 : To select Table Fan.");
		System.out.println("Enter 3 : To select Tower Fan");
		System.out.println("Enter 4 : To select Wall Fan");
		System.out.println("Enter 5 : To select Decorative Fan");
		System.out.println("Enter 6 : To select Pedestial Fan");
		System.out.println("Enter 7 : Return back to menu.");
		System.out.println("======================================");
		
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Ceiling m = new Ceiling();
			       m.Ceilingo();
			        buy1();
			        break;
			
			case 2: Table n = new Table();
			        n.type92();
			        buy1();
			        break;
			        
			case 3: Tower o = new Tower();
	                o.type93();
	                buy1();
	                break;
	                
			case 4: Wall p = new Wall();
                    p.type94();
                    buy1();
                    break;
            
			case 5: Deco q = new Deco();
                   q.type95();
                   buy1();
                   break;
                   
			case 6: Ped r = new Ped();
                   r.type96();
                   buy1();
                   break;
	
			
			
			        
			default: System.out.println("===Please enter valid input=== ");
			        Fano();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Fano();
			
		}
     }
}

                                     //FAN Subclass section

//Product-> Fan->Ceiling subclass

class Ceiling extends Fan
{

	public void Ceilingo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select 3 Blade Fan.");
		System.out.println("Enter 2 : To select 4 Blade Fan.");
		System.out.println("Enter 3 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:TBF m = new TBF();
			       m.TBFo();
			       break;
			
			case 2:FBF n = new FBF();
			       n.FBFo();
			       break;
			       
			
			case 3 : Producto();
			
			default:System.out.println("===Please enter valid input===");
			        Ceilingo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Ceilingo();
			
		}
		
	}
}

class TBF extends Ceiling
{
	public void TBFo()
	{
		TBFo ref = new TBFo("Crompton", "NO", "Blue", 5, 3.5, "YES", 1500);
		System.out.println("==========================================");
		System.out.println("Available Product is Crompton 3 blade Fan");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class TBFo extends TBF
{
	public TBFo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class FBF extends Fan
{
	public void FBFo()
	{
		FBFo ref = new FBFo("Orient", "yes", "DAYLIGHT", 1, 20, "YES", 2220);
		System.out.println("==========================================");
		System.out.println("Available Product is 4 Blade Orient Fan ");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class FBFo extends FBF
{
	public FBFo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//Product-> Fan->Table subclass

class Table extends Fan
{
	public void type92()
	{
		type92 ref = new type92("REMI", "NO", "BLUE", 90, 2, "YES", 1400,120,4);
		System.out.println("==========================================");
		System.out.println("Available Product is REMI's Table Fan");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> Fan->Table ->type92 subclass

class type92 extends Table
{
	public type92(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price,int rpm,int BladeSize) 
	{
		super();
		this.Bname=Bname;
		this.FireProof=FireProof;
		this.colour=colour;
		this.size=size;
		this.thickness=thickness;
		this.EnergySaving=EnergySaving;
		this.price=price;
		this.rpm=rpm;
		this.BladeSize=BladeSize;
		
	}
}

//**********************************************************************************************************************
//Product-> Fan->Tower subclass

class Tower extends Fan
{
	public void type93()
	{
		type93 ref = new type93("Symphoney", "NO", "BLACK", 90, 2, "NO", 34000);
		System.out.println("==========================================");
		System.out.println("Available Product is Symphoney Tower Fan");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> Fan->Tower ->type93 subclass

class type93 extends Tower
{
	public type93(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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
//**********************************************************************************************************************

//Product-> fan->wall subclass

class Wall extends Fan
{
	public void type94()
	{
		type94 ref = new type94("SUJATA", "NO", "RED", 400, 3.5, "YES", 1300,4);
		System.out.println("==========================================");
		System.out.println("Available Product is Sujata Wall Fan");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> Fan->wall ->type94 subclass

class type94 extends Wall
{
	public type94(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price,int BladeSize) 
	{
		super();
		this.Bname=Bname;
		this.FireProof=FireProof;
		this.colour=colour;
		this.size=size;
		this.thickness=thickness;
		this.EnergySaving=EnergySaving;
		this.price=price;
		this.BladeSize=BladeSize;
		
	}
}

//****************************************************************************************************

//Product-> Fan->Deco subclass

class Deco extends Fan
{
	public void type95()
	{
		type95 ref = new type95("ORIENT", "YES", "BROWN", 90, 2, "NO", 34000,3);
		System.out.println("==========================================");
		System.out.println("Available Product is ORIENT 's Decorative Fan");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> fan->Deco ->type95 subclass

class type95 extends Deco
{
	public type95(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price,int BladeSize) 
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
//*******************************************************************************************************************

//Product-> Fan->Ped subclass

class Ped extends Fan
{
	public void type96()
	{
		type96 ref = new type96("USHA", "YES", "BLUE", 4000, 2, "NO", 3000,3);
		System.out.println("==========================================");
		System.out.println("Available Product is USHA'S Pedestal Fan");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> fan->Ped ->type95 subclass

class type96 extends Ped
{
	public type96(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price,int BladeSize) 
	{
		super();
		this.Bname=Bname;
		this.FireProof=FireProof;
		this.colour=colour;
		this.size=size;
		this.thickness=thickness;
		this.EnergySaving=EnergySaving;
		this.price=price;
		this.BladeSize=BladeSize;
		
	}
}

