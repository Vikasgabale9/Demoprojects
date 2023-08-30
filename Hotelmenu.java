
import java.util.Scanner;
class Hotelmenu
{
	static int itli        = 30;
	static int planedosa   = 40;
    static int butterdosa  = 60;
	static int masaladosa  = 50;
	static int specialdosa = 100;
	static int vadasamber  = 40;
    static int bonda       = 40;
	static int puribhaji   = 60;
	static int pavbhaji    = 50;

public static void customer(){
     System.out.println("[At a time type one number] : ");
	System.out.println("1:itli        = 30\n2:planedosa   = 40\n3:butterdosa  = 60\n4:masaladosa  = 50\n5:specialdosa = 100\n6:vadasamber  = 40\n7:bonda       = 40\n8:puribhaji   = 60\n9:pavbhaji    = 50");
    
	Scanner s = new Scanner(System.in);
	System.out.println("how many plates you want ");
	int n = s.nextInt();
	System.out.println("what you want Enter item number & give space in each number");
	
    // int order = s.nextInt(); for get correct value of every plate must create in loop

	 for(int i=0;i<n;i++){
		// System.out.println("what you want Enter item number");
		   int order = s.nextInt();
	
	switch (order) {
    case 1:
        System.out.println("Give receipt of one plate itli ");
        break;
    case 2:
        System.out.println("Give receipt of one plate planedosa ");
        break;
    case 3:
        System.out.println("Give receipt of one plate butterdosa ");
        break;
    case 4:
        System.out.println("Give receipt of one plate masaladosa ");
        break;
    case 5:
        System.out.println("Give receipt of one plate specialdosa");
        break;
    case 6:
        System.out.println("Give receipt of one plate vadasamber");
        break;
    case 7:
        System.out.println("Give receipt of one plate bonda ");
        break;
    case 8:
        System.out.println("Give receipt of one plate puribhaji ");
        break;
    case 9:
        System.out.println("Give receipt of one plate pavbhaji ");
       break;
    default:
        System.out.println("You entered a wrong value");
        }	 
     }
	// int bill = 0;
	 //for(int i = 0; i<=n.length;i++ ){

		// System.out.print("Your total bill is"+bill);
//	 }

  } 
	public static void main(String[] args) 
	{
		customer();

	}
}