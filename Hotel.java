package hotel;
import java.util.Scanner;

public class Hotel {
	
	
	
		public static void main(String[] args) 
		{
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("*****Wlecome To Hotel VIP*****");
				System.out.println("1.Veg");
				System.out.println("2.Non-Veg");
				System.out.println("3.Desserts");
				System.out.println("4.Drinks");
				int ip=sc.nextInt();
				
				switch (ip)
				{
				case 1 :
					{
						System.out.println("====Veg Menu====");
						System.out.println("1.Paneer Kaju Masala");
						System.out.println("2.Aalu Matar");
						System.out.println("3.Mix Veg");
				        System.out.println("4.Dal Khichdi");
						System.out.println("5.Roti");
				        System.out.println("Select your dish:");

						int veg=sc.nextInt();
						switch (veg)
						{
						case 1 :
							{
							System.out.println("Paneer Kaju Masala Available Any Time");
							System.out.println("Cost per plat is: 500");
							System.out.println("Please Enter the Quantity of plat");
							int quantity = sc.nextInt();
							System.out.println("Your bill is:"+quantity*500);
							System.out.println("Thank You...!");
							break;
				       }

					   case 2:
						{
						
							System.out.println("Aalu Matar Available Any Time");
							System.out.println("Cost per plat is: 300");
							System.out.println("Please Enter the Quantity of plat");
							int quantity= sc.nextInt();
							System.out.println("Your bill is:"+quantity*300);
							System.out.println("Thank You...!");
							break;
						}
						case 3:
						{
							System.out.println("Mix Veg Available Any Time");
							System.out.println("Cost per plat is: 400");
							System.out.println("Please Enter the Quantity of plat");
							int quantity = sc.nextInt();
							System.out.println("Your bill is:"+quantity*400);
							System.out.println("Thank You...!");
							break;
						}
						case 4:
						{
							System.out.println("Dal Khichdi Available Any Time");
							System.out.println("Cost per plat is: 250");
							System.out.println("Please Enter the Quantity of plat");
							int quantity = sc.nextInt();
							System.out.println("Your bill is:"+quantity*250);
							System.out.println("Thank You...!");
							break;
						}
						case 5:
						{
							System.out.println("Roti Available Any Time");
							System.out.println("Cost per plat is: 25");
							System.out.println("Please Enter the Quantity of plat");
							int quantity = sc.nextInt();
							System.out.println("Your bill is:"+quantity*25);
							System.out.println("Thank You...!");
							break;
						}
						default:
						{
							System.out.println("Sorry.. This Dish Not Available On This Time");

						}
						    break;
					}
					}
					break;
					
					
					case 2:
					{
						
						System.out.println("++++Non-Veg++++");
						System.out.println("1.Chicken curry");
						System.out.println("2.Biryani");
						System.out.println("3.Egg curry");
						System.out.println("4.Chicken-65");
					    System.out.println("Select your dish:");

						 int nonveg=sc.nextInt();
					     
						  switch (nonveg)
						{
					
					 

						case 1:
						       {
						   System.out.println("Chicken Curry Available Any Time ");
						   System.out.println("Cost per plat is: 800");
						   System.out.println("Please Enter the Quantity of plat");
						   int quantity = sc.nextInt();
						   System.out.println("Your bill is:"+quantity*800);
						   System.out.println("Thank You...!");
							break;	   
					        	}
						case 2:
						       {
						   System.out.println("Biryani Available Any Time ");
						   System.out.println("Cost per plat is: 250");
						   System.out.println("Please Enter the Quantity of plat");
						   int quantity = sc.nextInt();
						   System.out.println("Your bill is:"+quantity*250);
						   System.out.println("Thank You...!");
							break;
					               	}
						case 3:
						{
						   System.out.println("Egg curry Available Any Time ");
						   System.out.println("Cost per plat is: 450");
						   System.out.println("Please Enter the Quantity of plat");
						   int quantity = sc.nextInt();
						   System.out.println("Your bill is:"+quantity*450);
						   System.out.println("Thank You...!");
							break;
						}
						case 4:
						{
						   System.out.println("Chicken-65 Available Any Time ");
						   System.out.println("Cost per plat is: 280");
						   System.out.println("Please Enter the Quantity of plat");
						   int quantity = sc.nextInt();
						   System.out.println("Your bill is:"+quantity*280);
						  System.out.println("Thank You...!");
							break;	
						}
						default:
						{
							System.out.println("Sorry.. This Dish Not Available On This Time");

						}
						    break;			
						
					}

					}
					            break;
					
					   case 3:
					{
						System.out.println("####Desserts####");
						System.out.println("1.Goan Cake");
						System.out.println("2.Kheer");
						System.out.println("3.Modak");
					    System.out.println("Select your dish:");

						 int Desserts=sc.nextInt();
					     
						  switch (Desserts)
						{
							case 1:
						{
				           System.out.println("Gona Cake Available Any Time ");
						   System.out.println("Cost per plat is: 80");
						   System.out.println("Please Enter the Quantity of plat");
						   int quantity = sc.nextInt();
						   System.out.println("Your bill is:"+quantity*80);
						  System.out.println("Thank You...!");
							break;	 
						}
						case 2:
							{
							System.out.println("Kheer Available Any Time ");
						   System.out.println("Cost per plat is: 100");
						   System.out.println("Please Enter the Quantity of plat");
						   int quantity = sc.nextInt();
						   System.out.println("Your bill is:"+quantity*100);
						  System.out.println("Thank You...!");
							break;	
							}
				      case 3:
							{
						   System.out.println("Modak Available Any Time ");
						   System.out.println("Cost per plat is: 40");
						   System.out.println("Please Enter the Quantity of plat");
						   int quantity = sc.nextInt();
						   System.out.println("Your bill is:"+quantity*40);
						  System.out.println("Thank You...!");
							break;	
							}
							default:
						{
							System.out.println("Sorry.. This Dish Not Available On This Time");

						}
						    break;
				              

						}
					}

					   case 4:
					{
						System.out.println("$$$$Drinks$$$$");
						System.out.println("1.Coco-cola");
						System.out.println("2.Pepsi");
						System.out.println("3.Sprite");
					    System.out.println("Select your Drinks:");

						 int Drinks=sc.nextInt();
					     
						  switch (Drinks)
						{
							  case 1:
							{
						   System.out.println("Coco-cola Available Any Time ");
						   System.out.println("Cost per Drinks is: 20");
						   System.out.println("Please Enter the Quantity of Drinks");
						   int quantity = sc.nextInt();
						   System.out.println("Your bill is:"+quantity*20);
						  System.out.println("Thank You...!");
							break;
							}
							case 2:
							{
							 System.out.println("Pepsi Available Any Time ");
						   System.out.println("Cost per Drinks is: 25");
						   System.out.println("Please Enter the Quantity of Drinks");
						   int quantity = sc.nextInt();
						   System.out.println("Your bill is:"+quantity*25);
						  System.out.println("Thank You...!");
							break;
							}
							case 3:
							{
						System.out.println("Sprite Available Any Time ");
						   System.out.println("Cost per Drinks is: 30");
						   System.out.println("Please Enter the Quantity of Drinks");
						   int quantity = sc.nextInt();
						   System.out.println("Your bill is:"+quantity*30);
						  System.out.println("Thank You...!");
							break;
							}
					}

					}
				}
			}
		}
	}
			
			
			




