

import java.util.InputMismatchException;
import java.util.Scanner;

//subclass MCB
class MCB extends Product
{
	public void MCBo()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("Enter 1 : To select Single Pole MCB.");
		System.out.println("Enter 2 : To select Double Pole MCB.");
		System.out.println("Enter 3 : To select Three Pole MCB");
		System.out.println("Enter 4 : To select Four Pole MCB");
		System.out.println("Enter 5 : Return back to menu.");
		System.out.println("======================================");
		
			int i = sc.nextInt();
			switch(i)
			{
			case 1:SPM m = new SPM();
			       m.type41();
			        buy1();
			        break;
			
			case 2: DPM n = new DPM();
			        n.type42();
			        buy1();
			        break;
			        
			case 3: TPM o = new TPM();
	                o.type43();
	                buy1();
	                break;
	                
			case 4: FPM p = new FPM();
                    p.type44();
                    buy1();
                    break;
            
			
        
			default: System.out.println("===Please enter valid input=== ");
			        MCBo();
			}
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("===Please enter valid input=== ");
			MCBo();
			
		}
     }
}

                                     //Switches Subclass section

//Product-> MCB->SIngle pole subclass

class SPM extends MCB
{
	public void type41()
	{
		type41 ref = new type41("HAVELLS", "YES", "RED", 90, 1.5, "YES", 526);
		System.out.println("==========================================");
		System.out.println("Available Product is Single Pole MCB.");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> MCB->SPM ->type41 subclass

class type41 extends Switch
{
	public type41(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//Product-> MCB->DPM subclass

class DPM extends MCB
{
	public void type42()
	{
		type1 ref = new type1("Legrand", "YES", "BLUE", 90, 2, "NO", 1139);
		System.out.println("==========================================");
		System.out.println("Available Product is Double pole MCB");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> ->MCB->DPM ->type42 subclass

class type42 extends Socket
{
	public type42(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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
//Product-> MCB->TPM subclass

class TPM extends MCB
{
	public void type43()
	{
		type1 ref = new type1("CONA", "YES", "BLUE", 90, 2, "NO", 34000);
		System.out.println("==========================================");
		System.out.println("Available Product is Three pole MCB");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> MCB->TPM ->type43 subclass

class type43 extends TPM
{
	public type43(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

//Product-> MCB->FPM subclass

class FPM extends MCB
{
	public void type44()
	{
		type1 ref = new type1("CRABTREE", "YES", "RED", 90, 1.5, "YES", 34000);
		System.out.println("==========================================");
		System.out.println("Available Product is 4 pole MCB");
		System.out.println("==========================================");
		System.out.println(ref);
		
	}
}

//Product-> MCB->FPM ->type44 subclass

class type44 extends FPM
{
	public type44(String Bname, String FireProof,String colour, double size, double thickness, String EnergySaving,double price) 
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

