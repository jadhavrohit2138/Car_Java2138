package core_java;

import java.util.Random;
import java.util.Scanner;

class Vehicle    // Super-class
{
	public static void token()
	{
		while (true) {
			Scanner tk = new Scanner(System.in);
			System.out.println("Do You want to book this Vehicle?");
			System.out.println("Press 1 for yes else Press any key");
			String token_choice = tk.nextLine();
			if (token_choice.equals("1")) {
				String str1;
			    Random rnd1 = new Random();        // using random class
				int token_no = rnd1.nextInt(999999999);
				str1 = String.format("%010d", token_no);
				System.out.println("!! Conngratulations !!!");
				System.out.println("Your Vehicle is booked Successfully");
				System.out.println("Your Token no is: "+str1);
				System.out.println("************************************");
				System.out.println("************************************");
				break;
			}			
			else
			{
				break;
			}
		}
	}
	public static String rto()
	{
		System.out.println(".....................................");
		System.out.println("\nRTO\n");
		System.out.println("Do you want Choice number? ");
		System.out.println("\nPress 1 for random number");
		System.out.println("Press 2 for choice number");
		String str = null;
		Scanner rto_no = new Scanner(System.in);
		while (true)
		{
			System.out.print("Choice: ");
			int rto_input = rto_no.nextInt();
			if(rto_input == 1) 
			{
			    Random rnd = new Random();        // using random class
			    int number = rnd.nextInt(9999);
			    str = String.format("%04d", number);
			    break;
			}
			else if(rto_input == 2) 
			{
				
				System.out.print("Enter vehcile no: ");
				int var = rto_no.nextInt();
				if (var < 9999)
				{
					str = String.format("%04d", var);
					break;
							
				}
				else {
					System.out.print("only 4 digit number");
					rto();
					break;
				}
//				str = String.valueOf(i); // converting int to String or Primitive to Non primitive
			}

		}
	    return str;

	}
	public static String color()
	{
		System.out.println(".....................................");
		System.out.println("\nChoice the color");
		System.out.println("\nChoice 1 for Black");
		System.out.println("Choice 2 for White");
		System.out.println("Choice 3 for Red");
		Scanner col_bike = new Scanner(System.in);
		System.out.print("choice:  ");
		int col_input = col_bike.nextInt();
		String col = null;
		while (true)
		{
			if(col_input == 1)
			{
				col="Black";
				break;
			}
			else if(col_input == 2)
			{
				col="White";
				break;
			}
			else if(col_input == 3)
			{
				col="Red";
				break;
			}
			else
			{
				System.out.println("Invalid input");
				break;
			}
		}
		
	return col; 
	}
}

class Two_wheeler extends Vehicle    // Sub-class
{
	public static void honda()
	{
		Scanner sc_honda = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("Honda bike's \n");
		System.out.println("We have total 3 types of Honda bikes \nkindly choice one of them \n");
		System.out.println("press 1 for Unicorn 150 ");
		System.out.println("press 2 for Shine ");
		System.out.println("press 3 for Hornet ");
		System.out.print("choice:  ");
		int h_input = sc_honda.nextInt();
		int price;
		while (true)
		{
			if(h_input == 1)
			{
				String col_1 = color();
				String bike_no = rto();
				price = 110000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Unicorn is "+col_1);
				System.out.print("\nYour Bike No is "+bike_no+"\n");
				System.out.print("Bike Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
				
			}
			else if(h_input == 2)
			{
				String col_1 = color();
				String bike_no = rto();
				price = 90000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Shine is "+col_1);
				System.out.print("\nYour Bike No is "+bike_no+"\n");
				System.out.print("Bike Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else if(h_input == 3)
			{
				String col_1 = color();
				String bike_no = rto();
				price = 115000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Hornet is "+col_1);
				System.out.print("\nYour Bike No is "+bike_no+"\n");
				System.out.print("Bike Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else
			{
				System.out.print("invalid choice, try again");
				honda();
				break;
			}
		}

	}
	public static void yamaha()
	{
		Scanner sc_yamaha = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("\nYamaha bike's \n");
		System.out.println("We have total 3 types of Yamaha bikes \nkindly choice one of them \n");
		System.out.println("press 1 for FZ-V3 ");
		System.out.println("press 2 for R1-5 ");
		System.out.println("press 3 for RX-100 ");
		System.out.print("\nChoice:  ");
		int y_input = sc_yamaha.nextInt();
		int price;
		while (true)
		{
			if(y_input == 1)
			{
				String col_2 = color();
				String bike_no = rto();
				price = 125000;
				System.out.println("\n************************************");
				System.out.print("\nColor of FZ-V3 is "+col_2);	
				System.out.print("\nYour Bike No is "+bike_no+"\n");
				System.out.print("Bike Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else if(y_input == 2)
			{
				String col_2 = color();
				String bike_no = rto();
				price = 175000;
				System.out.println("\n************************************");
				System.out.print("\nColor of R1-5 is "+col_2);
				System.out.print("\nYour Bike No is "+bike_no+"\n");
				System.out.print("Bike Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else if(y_input == 3)
			{
				String col_2 = color();
				String bike_no = rto();
				price = 100000;
				System.out.println("\n************************************");
				System.out.print("\nColor of RX-100 is "+col_2);
				System.out.print("\nYour Bike No is "+bike_no+"\n");
				System.out.print("Bike Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else
			{
				System.out.print("invalid choice, try again");
				yamaha();
				break;
			}
		}
	}
	public static void bajaj()
	{
		Scanner sc_bajaj = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("\nBajaj bike's \n");
		System.out.println("We have total 3 types of Bajaj bikes \nkindly choice one of them \n");
		System.out.println("press 1 for Pulsar-220 ");
		System.out.println("press 2 for Pulsar-NS ");
		System.out.println("press 3 for Platina ");
		System.out.print("\nChoice:  ");
		int price;
		int b_input = sc_bajaj.nextInt();
		while (true)
		{
			if(b_input == 1)
			{
				String col_3 = color();
				String bike_no = rto();
				price = 190000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Pulsar-220 is "+col_3);
				System.out.print("\nYour Bike No is "+bike_no+"\n");
				System.out.print("Bike Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else if(b_input == 2)
			{
				String col_3 = color();
				String bike_no = rto();
				price = 160000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Pulsar-NS is "+col_3);
				System.out.print("\nYour Bike No is "+bike_no+"\n");
				System.out.print("Bike Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else if(b_input == 3)
			{
				String col_3 = color();
				String bike_no = rto();
				price = 80000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Platina is "+col_3);
				System.out.print("\nYour Bike No is "+bike_no+"\n");
				System.out.print("Bike Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else
			{
				System.out.print("invalid choice, try again");
				bajaj();
				break;
			}	
		}
	}
}

class Four_wheeler extends Vehicle
{
	public static void maruti()
	{
		Scanner sc_maruti = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("\nMaruti car's \n");
		System.out.println("We have total 3 types of Maruti cars \nkindly choice one of them \n");
		System.out.println("press 1 for Ecco ");
		System.out.println("press 2 for Swift ");
		System.out.println("press 3 for Baleno ");
		System.out.print("\nChoice:  ");
		int price;
		int m_input = sc_maruti.nextInt();
		while (true)
		{
			if(m_input == 1)
			{
				String col_4 = color();
				String car_no = rto();
				price = 600000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Ecco is "+col_4);	
				System.out.print("\nYour Car No is "+car_no+"\n");
				System.out.print("Car Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else if(m_input == 2)
			{
				String col_4 = color();
				String car_no = rto();
				price = 1000000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Swift is "+col_4);
				System.out.print("\nYour Car No is "+car_no+"\n");
				System.out.print("Car Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else if(m_input == 3)
			{
				String col_4 = color();
				String car_no = rto();
				price = 800000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Baleno is "+col_4);
				System.out.print("\nYour Car No is "+car_no+"\n");
				System.out.print("Car Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else
			{
				System.out.print("invalid choice, try again");
				maruti();
				break;
			}	
		}
	}
	public static void toyota()
	{
		Scanner sc_toyota = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("\nToyota car's \n");
		System.out.println("We have total 3 types of Toyota cars \nkindly choice one of them \n");
		System.out.println("press 1 for Fortuner ");
		System.out.println("press 2 for Innova ");
		System.out.println("press 3 for Scorpio ");
		System.out.print("\nChoice:  ");
		int t_input = sc_toyota.nextInt();
		int price;
		while (true)
		{
			if(t_input == 1)
			{
				String col_5 = color();
				String car_no = rto();
				price = 4800000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Fortuner is "+col_5);	
				System.out.print("\nYour Car No is "+car_no+"\n");
				System.out.print("Car Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else if(t_input == 2)
			{
				String col_5 = color();
				String car_no = rto();
				price = 2200000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Innova is "+col_5);
				System.out.print("\nYour Car No is "+car_no+"\n");
				System.out.print("Car Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else if(t_input == 3)
			{
				String col_5 = color();
				String car_no = rto();
				price = 1500000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Scorpio is "+col_5);
				System.out.print("\nYour Car No is "+car_no+"\n");
				System.out.print("Car Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else
			{
				System.out.print("invalid choice, try again");
				toyota();
				break;
			}	
		}
	}
	public static void tata()
	{
		Scanner sc_tata = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("\nTata car's \n");
		System.out.println("We have total 3 types of Tata cars \nkindly choice one of them \n");
		System.out.println("press 1 for Indica ");
		System.out.println("press 2 for Tigor ");
		System.out.println("press 3 for Nano ");
		System.out.print("\nChoice:  ");
		int price;
		int ta_input = sc_tata.nextInt();
		while (true)
		{
			if(ta_input == 1)
			{
				String col_6 = color();
				String car_no = rto();
				price = 500000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Indica is "+col_6);	
				System.out.print("\nYour Car No is "+car_no+"\n");
				System.out.print("Car Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else if(ta_input == 2)
			{
				String col_6 = color();
				String car_no = rto();
				price = 800000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Tigor is "+col_6);
				System.out.print("\nYour Car No is "+car_no+"\n");
				System.out.print("Car Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else if(ta_input == 3)
			{
				String col_6 = color();
				String car_no = rto();
				price = 150000;
				System.out.println("\n************************************");
				System.out.print("\nColor of Nano is "+col_6);
				System.out.print("\nYour Car No is "+car_no+"\n");
				System.out.print("Car Price  is "+price+"\n");
				System.out.println("\n************************************");
				token();
				break;
			}
			else
			{
				System.out.print("invalid choice, try again");
				tata();
				break;
			}	
		}
	}
}

public class Company   // driver class
{
	public static void runner()
	{
		Vehicle vc = new Vehicle();
		Two_wheeler tw = new Two_wheeler();
		Four_wheeler fw = new Four_wheeler();
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.println("\nIn which type of vehicle are you intrested");
			System.out.println("Press 1 for Two-Wheeler");
			System.out.println("Press 2 for Four-Wheeler");
			System.out.println("Press 3 to Exit");
			System.out.println(" ");
			System.out.print("Please Enter Your Choice ");
			
			int user_input = sc.nextInt();
			
			if(user_input == 1)
			{
				System.out.println(".....................................");
				System.out.println("\nWhich company of Bike you want to buy? ");
				System.out.println(" ");
				System.out.println("Press 1 for 'Honda'");
				System.out.println("Press 2 for 'Yamaha'");
				System.out.println("Press 2 for 'Bajaj'");
				System.out.println("press 4 for Previous options");
				System.out.println(" ");
				System.out.print("Please Enter Your Choice ");
				int bike_input = sc.nextInt();
				if(bike_input == 1)
				{
					tw.honda();
					System.out.println("\nWant to visit again \n");
					System.out.print("\nif yes press 1 else press 2 ");

					int bh_input =sc.nextInt();
					if(bh_input == 1)
					{
						runner();
						break;
					}
					else if(bh_input == 2)
					{
						break;
					}
					else
					{
						System.out.println("invalid choice");
					}

				}
				else if(bike_input == 2)
				{
					tw.yamaha();
					System.out.println("\nWant to visit again \n");
					System.out.print("\nif yes press 1 else press 2 ");

					int by_input =sc.nextInt();
					if(by_input == 1)
					{
						runner();
						break;
					}
					else if(by_input == 2)
					{
						break;
					}
					else
					{
						System.out.println("invalid choice");
					}

				}
				else if(bike_input == 3)
				{
					tw.bajaj();
					System.out.println("\nWant to visit again \n");
					System.out.print("\nif yes press 1 else press 2 ");

					int bb_input =sc.nextInt();
					if(bb_input == 1)
					{
						runner();
						break;
					}
					else if(bb_input == 2)
					{
						break;
					}
					else
					{
						System.out.println("invalid choice");
					}

				}
				else if(bike_input == 4)
				{
					runner();
					break;
				}

				else
				{
					System.out.println("Invalid choice");
				}
			}
			else if (user_input == 2)
			{
				System.out.println("\nWhich company of Car are you interested? \n ");
				System.out.println("Press 1 for 'Maruti'");
				System.out.println("Press 2 for 'Toyota'");
				System.out.println("Press 3 for 'Tata'");
				System.out.println("press 4 for Previous options \n");
				int car_input = sc.nextInt();
				if(car_input == 1)
				{
					fw.maruti();
					System.out.println("\nWant to visit again \n");
					System.out.print("\nif yes press 1 else press 2 ");

					int cm_input =sc.nextInt();
					if(cm_input == 1)
					{
						runner();
						break;
					}
					else if(cm_input == 2)
					{
						break;
					}
					else
					{
						System.out.println("invalid choice");
					}
				}
				else if(car_input == 2)
				{
					fw.toyota();
					System.out.println("\nWant to visit again \n");
					System.out.print("\nif yes press 1 else press 2 ");

					int ct_input =sc.nextInt();
					if(ct_input == 1)
					{
						runner();
						break;
					}
					else if(ct_input == 2)
					{
						break;
					}
					else
					{
						System.out.println("invalid choice");
					}

				}
				else if(car_input == 3)
				{
					fw.tata();
					System.out.println("\nWant to visit again \n");
					System.out.print("\nif yes press 1 else press 2 ");

					int cta_input =sc.nextInt();
					if(cta_input == 1)
					{
						runner();
						break;
					}
					else if(cta_input == 2)
					{
						break;
					}
					else
					{
						System.out.println("invalid choice");
					}

				}
				else if(car_input == 4)
				{
					runner();
					break;
				}
				else
				{
					System.out.println("Invalid choice");
				}

			}
			else if (user_input == 3)
			{
				break;
			}
		}

	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Company");
		System.out.println(" ");
		runner();
		System.out.println("\nOk,Thank you, Have a great day");
		System.out.println(".....................................");

	}
	
}

