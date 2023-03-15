import java.util.InputMismatchException;
import java.util.Scanner;

//subclass Cable
class Appliance extends Product
{
	public void Appo()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Enter 1 : To select Home Appliances");
		System.out.println("Enter 2 : To select Kitchen Appliances");
		System.out.println("Enter 3 : To select Water Heater");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("======================================");
		
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Home m = new Home();
			       m.Homo();
			        buy1();
			        break;
			
			case 2: Kitchen n = new Kitchen();
			        n.Kitcheno();
			        buy1();
			        break;
			        
			case 3: WH o = new WH();
	                o.WHo();
	                buy1();
	                break;
	
			
			
			        
			default: System.out.println("===Please enter valid input=== ");
			        Appo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Appo();
			
		}
     }
}

//Product-> Appliance->home subclass

class Home extends Appliance
{

	public void Homo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select press/Iron.");
		System.out.println("Enter 2 : To select Hair Dryer.");
		System.out.println("Enter 3 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Iron m = new Iron();
			       m.Irono();
			       break;
			
			case 2:HD n = new HD();
			       n.HDo();
			       break;
			       
			
			case 3 : Producto();
			
			default:System.out.println("===Please enter valid input===");
			        Appo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Appo();
			
		}
		
	}
}

class Iron extends Home
{
	public void Irono()
	{
		Irono ref = new Irono("Croma", "NO", "Blue", 12, 3.5, "YES", 1500);
		System.out.println("==========================================");
		System.out.println("Available Product is Croma 's Steam Iron");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Irono extends Iron
{
	public Irono(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class HD extends Home
{
	public void HDo()
	{
		HDo ref = new HDo("Philips", "yes", "Purple", 15, 8, "YES", 2220);
		System.out.println("==========================================");
		System.out.println("Available Product is Philips's Hair Dryer ");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class HDo extends HD
{
	public HDo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//Product-> Appliance->Kitchen subclass

class Kitchen extends Appliance
{

	public void Kitcheno()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select Mixture.");
		System.out.println("Enter 2 : To select Toaster.");
		System.out.println("Enter 3 : To select Induction.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Mixture m = new Mixture();
			       m.Mixtureo();
			       break;
			
			case 2:Toaster n = new Toaster();
			       n.Toastero();
			       break;
			       
			case 3:Induction o = new Induction();
		          o.Inductiono();
		           break;
			       
			
			case 4 : Producto();
			
			default:System.out.println("===Please enter valid input===");
			        Appo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Appo();
			
		}
		
	}
}

class Mixture extends Kitchen
{
	public void Mixtureo()
	{
		Mixtureo ref = new Mixtureo("Prestige", "YES", "BLACK", 22, 3.5, "YES", 1500);
		System.out.println("==========================================");
		System.out.println("Available Product is Prestige 's Mixter Grinder");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Mixtureo extends Mixture
{
	public Mixtureo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class Toaster extends Kitchen
{
	public void Toastero()
	{
	    Toastero ref = new Toastero("i-Bell", "yes", "Black", 25, 8, "YES", 2020);
		System.out.println("==========================================");
		System.out.println("Available Product is i-BELL 'S Sandwich maker Toaster. ");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Toastero extends Toaster
{
	public Toastero(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class Induction extends Kitchen
{
	public void Inductiono()
	{
		Inductiono ref = new Inductiono("Pigeon", "yes", "Black", 25, 6, "YES", 1699);
		System.out.println("==========================================");
		System.out.println("Available Product is Pigeon 's Induction CookTape. ");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Inductiono extends Induction
{
	public Inductiono(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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


//Product-> Appliance->water heater subclass

class WH extends Appliance
{
	public void WHo()
	{
		type1 ref = new type1("Raycold", "YES", "BLUE", 90, 24, "NO", 3000);
		System.out.println("==========================================");
		System.out.println("Available Product is Raycold's Gyser");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> Appliance->water heater ->type63 subclass

class WHo extends WH
{
	public WHo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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