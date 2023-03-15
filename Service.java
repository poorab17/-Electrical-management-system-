import java.util.InputMismatchException;
import java.util.Scanner;

//Product Section

class Service extends Electric
{
	
	public void Serviceo()
	{
		Scanner sc = new Scanner(System.in);
   
	    System.out.println("=======================================");
	    System.out.println("Enter 1 : To select Wiring. ");
		System.out.println("Enter 2 : To select Repairing.");
		System.out.println("Enter 3 : To select Maintainance");
		System.out.println("Enter 4 : Return back to menu");
		System.out.println("========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
		    {
		
		     case 1: Wiring m = new Wiring();
		        m.wiringo();
		        break;
		        
		     case 2: Repairing n = new Repairing();
		        n.Repairingo();
		        break;
		        
		     case 3: Maintainance o = new Maintainance();
		        o.Maintainanceo();
		        break;
		        		  
		     case 4 : purchase();
		
		     default : System.out.println("===Please enter valid input===");
		          Serviceo();
	
		    }
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input===");
			 Serviceo();
			
		}
  }
	
}

//=================================================================================================================

//Sub-class under Service
class Wiring extends Service
{
	public void wiringo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select Flat Wiring.");
		System.out.println("Enter 2 : To select Building Wiring.");
		System.out.println("Enter 3 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Flat m = new Flat();
			       m.Flato();
			       break;
			
			case 2:Building n = new Building();
			       n.Buildingo();
			       break;
			
			case 3 : Serviceo();
			
			default:System.out.println("===Please enter valid input===");
			        wiringo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			wiringo();
			
		}
		
	}
}

class Flat extends Wiring
{
	public void Flato()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select 1BHK FLAT.");
		System.out.println("Enter 2 : To select 2BHK FLAT.");
		System.out.println("Enter 3 : To select 3BHK FLAT.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected 1BHK FLAT");
			       // OBHK m = new OBHK("FINOLEX", "YES", "BLUE", 90, 2, "NO", 34000);
			       // System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected 2BHK FLAT");
			        //TBHK n = new TBHK("FINOLEX", "YES", "BLUE", 90, 2, "NO", 34000);
			       // System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected 3BHK FLAT");
			       // THBHK o = new THBHK("FINOLEX", "YES", "BLUE", 90, 2, "NO", 34000);
			       // System.out.println(o);
			        buy1();
			        break;
			
			case 4 :wiringo();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        Flato();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Flato();
			
		}
	}
}

class OBHK extends Flat
{
	public OBHK(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class TBHK extends Flat
{
	public TBHK(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class THBHK extends Flat
{
	public THBHK(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class Building extends Wiring
{
	public void Buildingo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select Full Building Wiring.");
		System.out.println("Enter 2 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected Full Building Wiring");
			        FBW m = new FBW("FINOLEX", "YES", "BLUE", 90, 2, "NO", 34000);
			        System.out.println(m);
			        buy1();
			        break;
			
			
			
			case 2 :Buildingo();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        Buildingo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Buildingo();
			
		}
	}
}

class FBW extends Flat
{
	public FBW(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//-===================================================================================================================
//Sub-class under Service
class Repairing extends Service
{
	public void Repairingo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select Electric Goods Repairing.");
		System.out.println("Enter 2 : To select Water Pump Repairing.");
		System.out.println("Enter 3 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:EG m = new EG();
			       m.EGo();
			       break;
			
			case 2:WP n = new WP();
			       n.WPo();
			       break;
			
			case 3 : Serviceo();
			
			default:System.out.println("===Please enter valid input===");
			        Repairingo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Repairingo();
			
		}
		
	}
}

class EG extends Repairing
{
	public void EGo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select IRON Repairing.");
		System.out.println("Enter 2 : To select Mixture Repairing.");
		System.out.println("Enter 3 : To select Fan Repairing.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected 1BHK FLAT");
			        IR m = new IR("FINOLEX", "YES", "BLUE", 90, 2, "NO", 34000);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected 2BHK FLAT");
			        MR n = new MR("FINOLEX", "YES", "BLUE", 90, 2, "NO", 34000);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected 3BHK FLAT");
			        FR o = new FR("FINOLEX", "YES", "BLUE", 90, 2, "NO", 34000);
			        System.out.println(o);
			        buy1();
			        break;
			
			case 4 :Repairingo();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        EGo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			EGo();
			
		}
	}
}

class IR extends EG
{
	public IR(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class MR extends EG
{
	public MR(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class FR extends EG
{
	public FR(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//Service-> Repairing->WATER PUMP subclass

class WP extends Repairing
{
	public void WPo()
	{
		WPo ref = new WPo("POLYCAB", "YES", "RED", 90, 1.5, "YES", 34000);
		System.out.println("==========================================");
		System.out.println("You have Selected Water Pump Repairing");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//service-> Repairing->Water pump ->wpo subclass

class WPo extends WP
{
	public WPo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//=================================================================================================================

//subclass Maintainance
class Maintainance extends Service
{
	public void Maintainanceo()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Enter 1 : To select maintainance for School.");
		System.out.println("Enter 2 : To select maintainance for Socity ");
		System.out.println("Enter 3 : To select maintainance for Companey");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("======================================");
		
			int i = sc.nextInt();
			switch(i)
			{
			case 1:School m = new School();
			       m.Schoolo();
			        buy1();
			        break;
			
			case 2: Socity n = new Socity();
			        n.Socityo();
			        buy1();
			        break;
			        
			case 3: Company o = new Company();
	                o.Companeyo();
	                buy1();
	                break;
	
			
			
			        
			default: System.out.println("===Please enter valid input=== ");
			   Maintainanceo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Maintainanceo();
			
		}
   }
}



class School extends Maintainance
{
	public void Schoolo()
	{
		type21 ref = new type21("POLYCAB", "YES", "RED", 90, 1.5, "YES", 34000);
		System.out.println("==========================================");
		System.out.println("You have selected School Maintainance");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}



class Schoolo extends School
{
	public Schoolo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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



class Socity extends Maintainance
{
	public void Socityo()
	{
		type1 ref = new type1("FINOLEX", "YES", "BLUE", 90, 2, "NO", 34000);
		System.out.println("==========================================");
		System.out.println("You have Selected Socity Maintainance");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> Cable->Telephone ->type2 subclass

class Socityo extends Socity
{
	public Socityo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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


class Company extends Maintainance
{
	public void Companeyo()
	{
		type1 ref = new type1("FINOLEX", "YES", "BLUE", 90, 2, "NO", 34000);
		System.out.println("==========================================");
		System.out.println("Available Product is LeadFree wire");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}



class Companyo extends Company
{
	public Companyo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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