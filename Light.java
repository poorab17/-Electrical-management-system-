

import java.util.InputMismatchException;
import java.util.Scanner;

//subclass Lighting
class Light extends Product
{
	public void Lighto()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Enter 1 : To select Indoor Lighting.");
		System.out.println("Enter 2 : To select Outdoor Lighting.");
		System.out.println("Enter 3 : To select Architectural Lighting");
		System.out.println("Enter 4 : To select Commercial Lighting");
		System.out.println("Enter 5 : Return back to menu.");
		System.out.println("======================================");
		
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Indoor m = new Indoor();
			       m.Indooro();
			        buy1();
			        break;
			
			case 2: Outdoor n = new Outdoor();
			        n.Outdooro();
			        buy1();
			        break;
			        
			case 3: Archi o = new Archi();
	                o.Archio();
	                buy1();
	                break;
	                
			case 4: Com p = new Com();
                    p.Como();
                    buy1();
                    break;
            
			
        
			default: System.out.println("===Please enter valid input=== ");
			        Lighto();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Lighto();
			
		}
     }
}

                                     // Lighting Subclass section

//Product-> light->Indoor subclass


class Indoor extends Light
{
	public void Indooro()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select LAMP.");
		System.out.println("Enter 2 : To select BULB.");
		System.out.println("Enter 3 : To select SPOT LIGHT.");
		System.out.println("Enter 4 : To select PANEL LIGHT.");
		System.out.println("Enter 5 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Lamp m = new Lamp();
			       m.Lampo();
			       break;
			
			case 2:Bulb n = new Bulb();
			       n.Bulbo();
			       break;
			       
			case 3:SL o = new SL();
		           o.SLO();
		           break;
		
		    case 4:PL p = new PL();
		          p.PLO();
		          break;
			
			case 5 : Producto();
			
			default:System.out.println("===Please enter valid input===");
			        Indooro();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Indooro();
			
		}
		
	}
}

class Bulb extends Indoor
{
	public void Bulbo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select Cool DAY light bulb.");
		System.out.println("Enter 2 : To select Warm white Bulb.");
		System.out.println("Enter 3 : To select LED Bulb.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected Cool day light Bulb");
			        CDL m = new CDL("Philips", "YES", "BLUE", 90, 2, "NO", 230);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected Warm white Bulb");
			        WWB n = new WWB("Wipro", "YES", "BLUE", 90, 2, "NO", 350);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected LED bulb");
			        LED o = new LED("Syska", "YES", "BLUE", 90, 2, "NO", 380);
			        System.out.println(o);
			        buy1();
			        break;
			
			case 4 :Lighto();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        Indooro();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Indooro();
			
		}
	}
}
class CDL extends Bulb
{
	public CDL(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class WWB extends Bulb
{
	public WWB(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class LED extends Bulb
{
	public LED(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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


class Lamp extends Indoor
{
	public void Lampo()
	{
		type1 ref = new type1("Wipro", "YES", "BLUE", 90, 2, "NO", 3400);
		System.out.println("==========================================");
		System.out.println("Available Product 6 Watt LED Table Lamp");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}



class Lampo extends Lamp
{
	public Lampo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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


class SL extends Indoor
{
	public void SLO()
	{
		type1 ref = new type1("Wipro", "YES", "BLUE", 90, 2, "NO", 300);
		System.out.println("==========================================");
		System.out.println("Available Product 5 WATT SPOT LIGHT");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}



class SLO extends SL
{
	public SLO(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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


class PL extends Indoor
{
	public void PLO()
	{
		type1 ref = new type1("PHILIPS", "YES", "BLUE", 90, 2, "NO", 400);
		System.out.println("==========================================");
		System.out.println("Available Product 9 WATT PANEL LIGHT");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}



class PLO extends PL
{
	public PLO(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//Product-> light->outdoor subclass


class Outdoor extends Light
{

	public void Outdooro()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select Street Light.");
		System.out.println("Enter 2 : To select Wall Light.");
		System.out.println("Enter 3 : To select Garden Light.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Street m = new Street();
			       m.Streeto();
			       break;
			
			case 2:Walll n = new Walll();
			       n.Walllo();
			       break;
			       
			case 3:Garden o = new Garden();
		           o.Gardeno();
		           break;
			
			case 4 : Producto();
			
			default:System.out.println("===Please enter valid input===");
			        Outdooro();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Outdooro();
			
		}
		
	}
}

class Street extends Outdoor
{
	public void Streeto()
	{
		Streeto ref = new Streeto("Syska", "NO", "WHITE", 1, 1.5, "YES", 1220);
		System.out.println("==========================================");
		System.out.println("Available Product is Street light of Syska Companey");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Streeto extends Street
{
	public Streeto(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class Walll extends Outdoor
{
	public void Walllo()
	{
		Walllo ref = new Walllo("Fosh Lighting", "NO", "BLACK", 1, 1.5, "YES", 2220);
		System.out.println("==========================================");
		System.out.println("Available Product is Traditional Meena Fosh Lighting");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Walllo extends Walll
{
	public Walllo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class Garden extends Outdoor
{
	public void Gardeno()
	{
		Gardeno ref = new Gardeno("Havells", "NO", "Black", 1, 1.5, "YES", 120);
		System.out.println("==========================================");
		System.out.println("Available Product is 3 Feet Round Bollard Garden Light");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Gardeno extends Garden
{
	public Gardeno(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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
//Product-> light->Architectural subclass

class Archi extends Light
{

	public void Archio()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select Strip Light.");
		System.out.println("Enter 2 : To select Chandeliars Light.");
		System.out.println("Enter 3 : To select Decorative Light.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Strip m = new Strip();
			       m.Stripo();
			       break;
			
			case 2:Chand n = new Chand();
			       n.Chando();
			       break;
			       
			case 3:Deck o = new Deck();
		           o.Decko();
		           break;
			
			case 4 : Producto();
			
			default:System.out.println("===Please enter valid input===");
			        Archio();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Archio();
			
		}
		
	}
}

class Strip extends Archi
{
	public void Stripo()
	{
		Stripo ref = new Stripo("Murphy", "NO", "Blue", 5, 3.5, "YES", 1500);
		System.out.println("==========================================");
		System.out.println("Available Product Self Adhesive LED Strip Light");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Stripo extends Strip
{
	public Stripo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class Chand extends Archi
{
	public void Chando()
	{
		Chando ref = new Chando("Philips", "yes", "Golden", 1, 20, "YES", 2220);
		System.out.println("==========================================");
		System.out.println("Available Product is dark Vision Chandeliar Lighting");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Chando extends Chand
{
	public Chando(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class Deck extends Archi
{
	public void Decko()
	{
		Decko ref = new Decko("Gamer Zane", "NO", "Black", 1, 1.5, "YES", 120);
		System.out.println("==========================================");
		System.out.println("Available Product is LED fairy Decorative Light");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Decko extends Deck
{
	public Decko(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//Product-> light->Commercial subclass

class Com extends Light
{

	public void Como()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select Bottom Light.");
		System.out.println("Enter 2 : To select Flood Light.");
		System.out.println("Enter 3 : To select Halogen Light.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Bottom m = new Bottom();
			       m.Bottomo();
			       break;
			
			case 2:Flood n = new Flood();
			       n.Floodo();
			       break;
			       
			case 3:Halogen o = new Halogen();
		           o.Halogeno();
		           break;
			
			case 4 : Producto();
			
			default:System.out.println("===Please enter valid input===");
			        Como();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Como();
			
		}
		
	}
}

class Bottom extends Com
{
	public void Bottomo()
	{
		Bottomo ref = new Bottomo("Philips", "NO", "Blue", 5, 3.5, "YES", 1500);
		System.out.println("==========================================");
		System.out.println("Available Product Openable Bottom Commercial Light");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Bottomo extends Bottom
{
	public Bottomo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class Flood extends Com
{
	public void Floodo()
	{
		Chando ref = new Chando("Surya", "yes", "DAYLIGHT", 1, 20, "YES", 2220);
		System.out.println("==========================================");
		System.out.println("Available Product is Flood commercial Lighting");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Floodo extends Flood
{
	public Floodo(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class Halogen extends Com
{
	public void Halogeno()
	{
		Halogeno ref = new Halogeno("Osram", "NO", "Black", 1, 1.5, "YES", 120);
		System.out.println("==========================================");
		System.out.println("Available Product is Halogen Commercial Light");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class Halogeno extends Halogen
{
	public Halogeno(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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





