
import java.util.InputMismatchException;
import java.util.Scanner;

//subclass Switches
class Switches extends Product
{
	public void switcho()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Enter 1 : To select Switch.");
		System.out.println("Enter 2 : To select Socket.");
		System.out.println("Enter 3 : To select Fan Regulator");
		System.out.println("Enter 4 : To select Modular Plates");
		System.out.println("Enter 5 : To select Modular Boxes");
		System.out.println("Enter 6 : Return back to menu.");
		System.out.println("======================================");
		
			int i = sc.nextInt();
			switch(i)
			{
			case 1:Switch m = new Switch();
			       m.oswitch();
			        buy1();
			        break;
			
			case 2: Socket n = new Socket();
			        n.Socketo();
			        buy1();
			        break;
			        
			case 3: Regulator o = new Regulator();
	                o.Regulatoro();
	                buy1();
	                break;
	                
			case 4: Plate p = new Plate();
                    p.Plateo();
                    buy1();
                    break;
            
			case 5: Box q = new Box();
                   q.Boxo();
                   buy1();
                   break;
	
			
			
			        
			default: System.out.println("===Please enter valid input=== ");
			        switcho();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			switcho();
			
		}
     }
}

                                     //Switches Subclass section

//Product-> Switches->Switch subclass

class Switch extends Switches
{
	public void oswitch()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select 1 Way 6amp Switch.");
		System.out.println("Enter 2 : To select 1 Way 16amp Switch.");
		System.out.println("Enter 3 : To select 2 Way 16amp Switch.");
		System.out.println("Enter 4 : To select 2 Way 32amp Switch.");
		System.out.println("Enter 5 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:SAO m = new SAO();
			       m.SAOO();
			       break;
			
			case 2:SIAO n = new SIAO();
			       n.SIAOO();
			       break;
			       
			case 3:SAT o = new SAT();
		           o.SATO();
		           break;
		
		    case 4:SIAT p = new SIAT();
		          p.SIATO();
		          break;
			
			case 5 : Producto();
			
			default:System.out.println("===Please enter valid input===");
			        oswitch();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			oswitch();
			
		}
		
	}
}

class SAO extends Switch
{
	public void SAOO()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select ALEMAC SWITCHES.");
		System.out.println("Enter 2 : To select ROMA SWITCHES.");
		System.out.println("Enter 3 : To select LEGRAND SWITCHES.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected 6A 1WAY ALEMAC SWITCH");
			        ALEMAC m = new ALEMAC("ALEMAC", "YES", "BLUE", 90, 2, "NO", 30);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected 6A 1WAY ROMA SWITCH");
			        ROMA n = new ROMA("ROMA", "YES", "BLUE", 90, 2, "NO", 50);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected 6A 1WAY LEGRAND SWITCH");
			        LEGRAND o = new LEGRAND("LEGRAND", "YES", "BLUE", 90, 2, "NO", 80);
			        System.out.println(o);
			        buy1();
			        break;
			
			case 4 :switcho();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        oswitch();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			oswitch();
			
		}
	}
}
class ALEMAC extends SAO
{
	public ALEMAC(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class ROMA extends SAO
{
	public ROMA(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class LEGRAND extends SAO
{
	public LEGRAND(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//**

class SIAO extends Switch
{
	public void SIAOO()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select ANCHOR SWITCHES.");
		System.out.println("Enter 2 : To select CRABTREE SWITCHES.");
		System.out.println("Enter 3 : To select GREATWHITE SWITCHES.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected 16A 1WAY ANCHOR SWITCH");
			        ANCHOR m = new ANCHOR("ANCHOR", "YES", "BLUE", 90, 2, "NO", 30);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected 16A 1WAY CRABTREE SWITCH");
			        CRABTREE n = new CRABTREE("CRABTREE", "YES", "BLUE", 90, 2, "NO", 50);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected 16A 1WAY GREATWHITE");
			        GREATWHITE o = new GREATWHITE("GREATWHITE", "YES", "BLUE", 90, 2, "NO", 80);
			        System.out.println(o);
			        buy1();
			        break;
			
			case 4 :switcho();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        oswitch();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			oswitch();
			
		}
	}
}
class ANCHOR extends SIAO
{
	public ANCHOR(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class CRABTREE extends SIAO
{
	public CRABTREE(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class GREATWHITE extends SIAO
{
	public GREATWHITE(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//**
class SAT extends Switch
{
	public void SATO()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select ALEMAC SWITCHES.");
		System.out.println("Enter 2 : To select ROMA SWITCHES.");
		System.out.println("Enter 3 : To select LEGRAND SWITCHES.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected 6A 2WAY ALEMAC SWITCH");
			        ALEMAC2 m = new ALEMAC2("ALEMAC", "YES", "BLUE", 90, 2, "NO", 30);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected 6A 2WAY ROMA SWITCH");
			        ROMA2 n = new ROMA2("ROMA", "YES", "BLUE", 90, 2, "NO", 50);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected 6A 2WAY LEGRAND");
			        LEGRAND2 o = new LEGRAND2("LEGRAND", "YES", "BLUE", 90, 2, "NO", 80);
			        System.out.println(o);
			        buy1();
			        break;
			
			case 4 :switcho();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        oswitch();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			oswitch();
			
		}
	}
}
class ALEMAC2 extends SAT
{
	public ALEMAC2(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class ROMA2 extends SAT
{
	public ROMA2(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class LEGRAND2 extends SAT
{
	public LEGRAND2(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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
//**
class SIAT extends Switch
{
	public void SIATO()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select ANCHOR SWITCHES.");
		System.out.println("Enter 2 : To select CRABTREE SWITCHES.");
		System.out.println("Enter 3 : To select GREATWHITE SWITCHES.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected 16A 2WAY ANCHOR SWITCH");
			        ANCHOR2 m = new ANCHOR2("ANCHOR", "YES", "BLUE", 90, 2, "NO", 30);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected 16A 2WAY CRABTREE SWITCH");
			        CRABTREE2 n = new CRABTREE2("CRABTREE", "YES", "BLUE", 90, 2, "NO", 50);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected 16A 2WAY GREATWHITE");
			        GREATWHITE2 o = new GREATWHITE2("GREATWHITE", "YES", "BLUE", 90, 2, "NO", 80);
			        System.out.println(o);
			        buy1();
			        break;
			
			case 4 :switcho();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        oswitch();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			oswitch();
			
		}
	}
}
class ANCHOR2 extends SIAT
{
	public ANCHOR2(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class CRABTREE2 extends SIAT
{
	public CRABTREE2(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class GREATWHITE2 extends SIAT
{
	public GREATWHITE2(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//Product-> Switches->Socket subclass

class Socket extends Switches
{
	public void Socketo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select 3 Pin Socket.");
		System.out.println("Enter 2 : To select 5 Pin Socket.");
		System.out.println("Enter 3 : To select Telephone Socket.");
		System.out.println("Enter 4 : To select USB Data Socket.");
		System.out.println("Enter 5 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:TPS m = new TPS();
			       m.TPSO();
			       break;
			
			case 2:FPS n = new FPS();
			       n.FPSO();
			       break;
			       
			case 3:TS o = new TS();
		           o.TSO();
		           break;
		
		    case 4:USB p = new USB();
		          p.USBO();
		          break;
			
			case 5 : Producto();
			
			default:System.out.println("===Please enter valid input===");
			        Socketo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Socketo();
			
		}
		
	}
}

class TPS extends Socket
{
	public void TPSO()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select ALEMAC Socket.");
		System.out.println("Enter 2 : To select ROMA Socket.");
		System.out.println("Enter 3 : To select LEGRAND Socket.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected 3 pin ALEMAC Socket");
			        ALEMAC3 m = new ALEMAC3("ALEMAC", "YES", "white", 90, 2, "NO", 30);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected 3 pin ROMA Socket");
			        ROMA3 n = new ROMA3("ROMA", "YES", "IVORY", 90, 2, "NO", 50);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected 3 pin LEGRAND Socket");
			        LEGRAND3 o = new LEGRAND3("LEGRAND", "YES", "White", 90, 2, "NO", 80);
			        System.out.println(o);
			        buy1();
			        break;
			
			case 4 :switcho();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        Socketo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Socketo();
			
		}
	}
}
class ALEMAC3 extends TPS
{
	public ALEMAC3(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class ROMA3 extends TPS
{
	public ROMA3(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class LEGRAND3 extends TPS
{
	public LEGRAND3(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//**

class FPS extends Socket
{
	public void FPSO()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select ANCHOR Socket.");
		System.out.println("Enter 2 : To select CRABTREE Socket.");
		System.out.println("Enter 3 : To select GREATWHITE Socket.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected 5 pin ANCHOR Socket");
			        ANCHOR3 m = new ANCHOR3("ANCHOR", "YES", "WHITE", 90, 2, "NO", 50);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected 5 Pin CRABTREE Socket");
			        CRABTREE3 n = new CRABTREE3("CRABTREE", "YES", "IVORY", 90, 2, "NO", 60);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected 5 Pin GREATWHITE Socket");
			        GREATWHITE3 o = new GREATWHITE3("GREATWHITE", "YES", "White", 90, 2, "NO", 80);
			        System.out.println(o);
			        buy1();
			        break;
			
			case 4 :switcho();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        Socketo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Socketo();
			
		}
	}
}
class ANCHOR3 extends FPS
{
	public ANCHOR3(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class CRABTREE3 extends FPS
{
	public CRABTREE3(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class GREATWHITE3 extends FPS
{
	public GREATWHITE3(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//**
class TS extends Socket
{
	public void TSO()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select ALEMAC Telephone Socket.");
		System.out.println("Enter 2 : To select ROMA Telephone Socket.");
		System.out.println("Enter 3 : To select LEGRAND Telephone Socket.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected Telephone ALEMAC Socket");
			        ALEMAC4 m = new ALEMAC4("ALEMAC", "YES", "WHITE", 90, 2, "NO", 48);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected Telephone ROMA Socket");
			        ROMA4 n = new ROMA4("ROMA", "YES", "IVORY", 90, 2, "NO", 50);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected Telephone LEGRAND Socket");
			        LEGRAND4 o = new LEGRAND4("LEGRAND", "YES", "BLACK", 90, 2, "NO", 80);
			        System.out.println(o);
			        buy1();
			        break;
			
			case 4 :switcho();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        Socketo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Socketo();
			
		}
	}
}
class ALEMAC4 extends TS
{
	public ALEMAC4(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class ROMA4 extends TS
{
	public ROMA4(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class LEGRAND4 extends TS
{
	public LEGRAND4(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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
//**
class USB extends Socket
{
	public void USBO()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select ANCHOR USB DATA SOCKET.");
		System.out.println("Enter 2 : To select CRABTREE USB DATA SOCKET.");
		System.out.println("Enter 3 : To select GREATWHITE USB DATA SOCKET.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected USB DATA ANCHOR SOCKET");
			        ANCHOR4 m = new ANCHOR4("ANCHOR", "YES", "WHITE", 90, 2, "NO", 45);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected USB DATA CRABTREE SOCKET");
			        CRABTREE4 n = new CRABTREE4("CRABTREE", "YES", "IVORY", 90, 2, "NO", 50);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected USB DATA GREATWHITE SOCKET");
			        GREATWHITE4 o = new GREATWHITE4("GREATWHITE", "YES", "BLACK", 90, 2, "NO", 80);
			        System.out.println(o);
			        buy1();
			        break;
			
			case 4 :switcho();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        Socketo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Socketo();
			
		}
	}
}
class ANCHOR4 extends USB
{
	public ANCHOR4(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class CRABTREE4 extends USB
{
	public CRABTREE4(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class GREATWHITE4 extends USB
{
	public GREATWHITE4(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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
//Product-> Switches->Regulator subclass

class Regulator extends Switches
{
	public void Regulatoro()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select Step Regulator.");
		System.out.println("Enter 2 : To select Dimmer Regulator.");
		System.out.println("Enter 3 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:SR m = new SR();
			       m.SRO();
			       break;
			
			case 2:DR n = new DR();
			       n.DRO();
			       break;
			
			case 3 : Producto();
			
			default:System.out.println("===Please enter valid input===");
			        Regulatoro();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Regulatoro();
			
		}
		
	}
}

class SR extends Regulator
{
	public void SRO()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select ALEMAC Regulator.");
		System.out.println("Enter 2 : To select ROMA Regulator.");
		System.out.println("Enter 3 : To select LEGRAND Regulator.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected Step ALEMAC Regulator");
			        ALEMAC5 m = new ALEMAC5("ALEMAC", "YES", "White", 90, 2, "NO", 130);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected Step ROMA Regulator");
			        ROMA5 n = new ROMA5("ROMA", "YES", "IVORY", 90, 2, "NO", 150);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected Step LEGRAND Regulator");
			        LEGRAND5 o = new LEGRAND5("LEGRAND", "YES", "Black", 90, 2, "NO", 180);
			        System.out.println(o);
			        buy1();
			        break;
			
			case 4 :switcho();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        Regulatoro();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Regulatoro();
			
		}
	}
}
class ALEMAC5 extends SR
{
	public ALEMAC5(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class ROMA5 extends SR
{
	public ROMA5(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class LEGRAND5 extends SR
{
	public LEGRAND5(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//**

class DR extends Regulator
{
	public void DRO()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println("Enter 1 : To select ANCHOR Regulator.");
		System.out.println("Enter 2 : To select CRABTREE Regulator.");
		System.out.println("Enter 3 : To select GREATWHITE Regulator.");
		System.out.println("Enter 4 : Return back to menu.");
		System.out.println("===========================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("You have selected Dimmer ANCHOR Regulator");
			        ANCHOR5 m = new ANCHOR5("ANCHOR", "YES", "WHITE", 90, 2, "NO", 130);
			        System.out.println(m);
			        buy1();
			        break;
			
			case 2: System.out.println("You have selected Dimmer CRABTREE Regulator");
			        CRABTREE5 n = new CRABTREE5("CRABTREE", "YES", "IVORY", 90, 2, "NO", 150);
			        System.out.println(n);
			        buy1();
			        break;
			
			case 3 :System.out.println("You have selected Dimmer GREATWHITE Regulator");
			        GREATWHITE5 o = new GREATWHITE5("GREATWHITE", "YES", "BLack", 90, 2, "NO", 80);
			        System.out.println(o);
			        buy1();
			        break;
			
			case 4 :switcho();
			break;
			
			default:System.out.println("===Please enter valid input=== ");
			        Regulatoro();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Regulatoro();
			
		}
	}
}
class ANCHOR5 extends DR
{
	public ANCHOR5(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class CRABTREE5 extends DR
{
	public CRABTREE5(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class GREATWHITE5 extends DR
{
	public GREATWHITE5(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//Product-> Switches->Plates subclass



class Plate extends Switches
{
	public void Plateo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select 4 Modular Plate.");
		System.out.println("Enter 2 : To select 6 Modular Plate.");
		System.out.println("Enter 3 : To select 8 Modular Plate .");
		System.out.println("Enter 4 : To select 12 Modular Plate.");
		System.out.println("Enter 5 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:FMP m = new FMP();
			       m.FMPO();
			       break;
			
			case 2:SMP n = new SMP();
			       n.SMPO();
			       break;
			       
			case 3:EMP o = new EMP();
		           o.EMPO();
		           break;
		
		    case 4:TMP p = new TMP();
		          p.TMPO();
		          break;
			
			case 5 : Producto();
			
			default:System.out.println("===Please enter valid input===");
			        Plateo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Plateo();
			
		}
		
	}
}

class FMP extends Plate
{
	public void FMPO()
	{
		type1 ref = new type1("ALMEC", "NO", "WHITE", 1, 1.5, "YES", 120);
		System.out.println("==========================================");
		System.out.println("Available Product is 4 MODULAR ALMEC PLATE");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class FMPO extends FMP
{
	public FMPO(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class SMP extends Plate
{
	public void SMPO()
	{
		type1 ref = new type1("ROMA", "NO", "BLACK", 1, 1.5, "YES", 220);
		System.out.println("==========================================");
		System.out.println("Available Product is 6 MODULAR ROMA PLATE");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class SMPO extends SMP
{
	public SMPO(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class EMP extends Plate
{
	public void EMPO()
	{
		type1 ref = new type1("CRABTREE", "NO", "GREY", 1, 1.5, "YES", 120);
		System.out.println("==========================================");
		System.out.println("Available Product is 6 MODULAR CRABTREE PLATE");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class EMPO extends EMP
{
	public EMPO(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class TMP extends Plate
{
	public void TMPO()
	{
		type1 ref = new type1("GREATWHITE", "NO", "GREY", 1, 1.5, "YES", 120);
		System.out.println("==========================================");
		System.out.println("Available Product is 12 MODULAR GREATWHITE PLATE");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class TMPO extends TMP
{
	public TMPO(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//Product-> Switches->Box subclass

class Box extends Switches
{
	public void Boxo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================"); 
		System.out.println("Enter 1 : To select Metal box.");
		System.out.println("Enter 2 : To select PVC box.");
		System.out.println("Enter 5 : Return back to menu.");
		System.out.println("======================================");
		try 
		{
			int i = sc.nextInt();
			switch(i)
			{
			case 1:MB m = new MB();
			       m.MBO();
			       break;
			
			case 2:PB n = new PB();
			       n.PBO();
			       break;
			
			
			case 3 : Producto();
			
			default:System.out.println("===Please enter valid input===");
			        Boxo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			Boxo();
			
		}
		
	}
}

class MB extends Box
{
	public void MBO()
	{
		type1 ref = new type1("JORAN", "YES", "GREY", 1, 1.5, "YES", 120);
		System.out.println("==========================================");
		System.out.println("Available Product is JORAN METAL BOX");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class MBO extends MB
{
	public MBO(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

class PB extends Box
{
	public void PBO()
	{
		type1 ref = new type1("ROMA", "NO", "WHITE", 1, 1.5, "YES", 220);
		System.out.println("==========================================");
		System.out.println("Available Product is ROMA PVC BOX");
		System.out.println("==========================================");
		System.out.println(ref);
	}
}

class PBO extends SMP
{
	public PBO(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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


