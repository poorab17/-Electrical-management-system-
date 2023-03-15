import java.io.DataInputStream;
import java.util.Scanner;
import java.util.InputMismatchException;

//super most class
public class Electric 
{
	 String Bname;
	 String FireProof;
	 String colour;
	 double size;
	 double price;
	 double thickness;
	String EnergySaving;
	String warranty;
	int power;
	int rpm;
	int BladeSize;
	static String name;
	
	
	//static block

		static
		{  
			 System.out.println("****************************");
			 System.out.println("*        WELCOME           *");
			 System.out.println("*          TO              *");
			 System.out.println("*   GUPTA ELECTRICALS      *");
			 System.out.println("****************************");
	    }
		
		//main method
		public static void main(String[] args) 
		{
			
			Electric ref = new Electric();
			
			ref.login();
			ref.purchase();
			
		}
		
		//login method
		
		public void login()
		{
			//electric ref2 = new electric();
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter Your Name: ");
			String name = sc.next();
			this.name=name;
		}
		
		//Purchase method
		public void purchase() 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("==================================");
			System.out.println("  Enter 1 : To select Electrical Products.  ");
			System.out.println("  Enter 2 : To select Electrical Services.  ");
			System.out.println("==================================");
			try 
			{
				int i = sc.nextInt();
			    Electric a = new Product();
			    Electric d = new Service(); 
			    Product m = (Product) a;
			    Service n = (Service) d;
			    
			    switch(i)
				{
				case 1: m.Producto();
				break;
				
				case 2: n.Serviceo();
				break;
				
				default: System.out.println("===Please enter valid input===");
		                 purchase();
					}
				}
				catch(InputMismatchException Ex)
				{
					System.out.println("===Please enter valid input===");
					purchase();
				}
				
			}
			
			//toString to override reference variable
		    public String toString()
		    {
		    	System.out.println();
				System.out.println("==========================================");
				System.out.println("        ----Thank You so much----         ");
				System.out.println("         Please fill your details         ");
				System.out.println("==========================================");
		    	System.out.println("BRAND NAME: " +Bname);
		    	System.out.println("Product is Fireproof: "+FireProof);
		    	System.out.println("Color:"+colour);
		    	System.out.println("Size:"+size);
		    	System.out.println("Thickness:"+thickness);
		    	System.out.println("Power:"+power);
		    	System.out.println("RPM:"+rpm);
		    	System.out.println("BladeSize:"+BladeSize);
		    	System.out.println("Warranty for Product:"+warranty);
		    	System.out.println("The price of Product is : Rs"+ price +"only");
		    	return "";
		    }
		    
		    
	     //Buy method for Product
		    public void buy() 
		    {
				Scanner sc = new Scanner(System.in);
				
				System.out.println();
				System.out.println("Enter 1: Would you like to buy..? "); 
				System.out.println("Enter 2: cancle and go to the  menu");
				System.out.print("choice: ");
				try 
				{
					int i=sc.nextInt();
				    switch(i) 
				    {
				    
				    case 1: 
					System.out.println();
					System.out.println();
					System.out.println("==========================================");
					System.out.println("        ----Thank You so much----         ");
					System.out.println("        Please fill your details          ");
					System.out.println("==========================================");
					cutomerDetails();
					break;
				
				    case 2:
					System.out.println("Cancel and go back to the Menu");
					Product ref = new Product();
					ref.Producto();
					System.out.println();
				
					break;
				
				   default : buy();
				   
				   }
				}
				catch(InputMismatchException Ex)
				{
					System.out.println("===Please enter valid input=== ");
					buy();
				}
			}
		   
		    
		    //buy method for Service
		    public void buy1() 
		    {
				Scanner sc = new Scanner(System.in);
				
				System.out.println();
				System.out.println("Enter 1: Would you like to buy ....?"); 
				System.out.println("Enter 2: cancle and go to the  menu");
				System.out.print("choice: ");
				try 
				{
					int i=sc.nextInt();
				    switch(i) 
				    {
				    case 1: 
					System.out.println();
					System.out.println("==========================================");
					System.out.println("        ----Thank You so much----         ");
					System.out.println("        Please fill your details          ");
					System.out.println("==========================================");
					cutomerDetails();
					break;
				
				    case 2:
					System.out.println("Cancel and go back to the  Menu");
					Service ref = new Service();
					ref.Serviceo();
					
					System.out.println();
				    break;
				
				    default : buy1();
				    }
				}
				catch(InputMismatchException Ex)
				{
					System.out.println("===Please enter valid input===");
					buy1();
					
				}
		    }
		    
		
		    
		    //customer details method
		    
		    
			public void cutomerDetails() 
			{
				try
				{
					Electric ref = new Electric();
				Scanner s = new Scanner(System.in);
				System.out.print("Enter Your Name: ");
				System.out.println(name);
				//String name= s.nextLine();
				System.out.print("Enter Phone Number: ");
				long i= s.nextLong();
				System.out.print("Enter Email ID: ");
				String email= s.next();
				}
				catch(InputMismatchException Ex)
				{
					System.out.println("Enter Valid Details.");
					cutomerDetails();
					
				}
				System.out.println("==========================================");
				System.out.println();
				System.out.println("!!!!-- Please Choose Your Payment Option --!!!!");
				System.out.println("Enter 1. Cash");
				System.out.println("Enter 2. UPI");
				System.out.println("Enter 3. Bank Transfer.");
				System.out.print("choice: ");
				System.out.println();
				
				try 
				{
					Scanner s1 = new Scanner(System.in);
					int p= s1.nextInt();
				    switch(p)
				    {
				    case 1: 
						System.out.println("==== THANK YOU SO MUCH VISIT US AGAIN ===");
						Electrics();
						
						break;
				    case 2: 
						System.out.println(" WE GOT YOUR MONEY TRANSFER..");
						System.out.println("==== THANK YOU SO MUCH VISIT US AGAIN ===");
						Electrics();
						break;
				    case 3: 
						System.out.println("Yes... Bank Transfer Successful..");
						System.out.println("==== THANK YOU SO MUCH VISIT US AGAIN ===");
						Electrics();
						break;
						
				    default: cutomerDetails();
				    }
				}
				
				catch(InputMismatchException Ex)
				{
					System.out.println("===Please enter valid input===");
					cutomerDetails();
					
				}
			}
			
			public static void Electrics() 
			{
				    System.out.println("**************************");
				    System.out.println("*     CONGRATULATIONS    *");
				    System.out.println("*          ON            *");
				    System.out.println("*     YOUR NEW Product     *");
				    System.out.println("**************************");
				    
			}
				
		 }
			    
			    

//********Product Section

class Product extends Electric
{
	
	public void Producto()
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("=======================================");
	    System.out.println("Enter 1 : To select Wire");
		System.out.println("Enter 2 : To select cable");
		System.out.println("Enter 3 : To select Switches");
		System.out.println("Enter 4 : To select MCB");
		System.out.println("Enter 5 : To select Lighting");
		System.out.println("Enter 6 : To select Appliances");
		System.out.println("Enter 7 : To select Acessories");
		System.out.println("Enter 8 : To select Home Automation ");
		System.out.println("Enter 9 : To select Fan ");
		System.out.println("Enter 10 : Return back to menu");
		System.out.println("========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
		    {
		
		     case 1: wire m = new wire();
		        m.wireo();
		        break;
		        
		     case 2: Cable n = new Cable();
		        n.cableo();
		        break;
		        
		     case 3: Switches o = new Switches();
		        o.switcho();
		        break;
		        
		     case 4: MCB p = new MCB();
		        p.MCBo();
		        break;
		        
		     case 5: Light q = new Light();
		        q.Lighto();
		        break;
		        
		     case 6: Appliance r = new Appliance();
		        r.Appo();
		        break;
		        
		     case 7: Acess s = new Acess();
		        s.acesso();
		        break;
		        
		     case 8: HA t = new HA();
		        t.HAo();   
		        break;
		        
		     case 9: Fan u = new Fan();
		        u.Fano();   
		        break;
		        
		  
		     case 10 : purchase();
		
		     default : System.out.println("===Please enter valid input===");
		          Producto();
	
		    }
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input===");
			 Producto();
			
		}
  }
	
}

//subclass-WIRE
class wire extends Product
{
	public void wireo()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Enter 1 : To select Flame Retarded wire.");
		System.out.println("Enter 2 : To select Lead Free wire");
		System.out.println("Enter 3 : Return back to menu.");
		System.out.println("======================================");
		
			int i = sc.nextInt();
			switch(i)
			{
			case 1:FlameRetarted m = new FlameRetarted();
			       m.type1();
			        buy1();
			        break;
			
			case 2: LeadFree n = new LeadFree();
			        n.type2();
			        buy1();
			        break;
			
			
			        
			default: System.out.println("===Please enter valid input=== ");
			        wireo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			wireo();
			
		}
     }
}

//Product-> wire->FlameRetarted subclass

class FlameRetarted extends wire
{
	public void type1()
	{
		type1 ref = new type1("POLYCAB", "YES", "RED", 90, 1.5, "YES", 34000);
		System.out.println("==========================================");
		System.out.println("Available Product is FlameRetarted wire");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> wire->FlameRetarted ->type1 subclass

class type1 extends FlameRetarted
{
	public type1(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//Product-> wire->LeadFree subclass

class LeadFree extends wire
{
	public void type2()
	{
		type1 ref = new type1("FINOLEX", "YES", "BLUE", 90, 2, "NO", 34000);
		System.out.println("==========================================");
		System.out.println("Available Product is LeadFree wire");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> wire->LeadFree ->type1 subclass

class type2 extends LeadFree
{
	public type2(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//---------------------------------------------------------------------------------------------------------------

















