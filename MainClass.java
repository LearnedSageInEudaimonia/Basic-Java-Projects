package PizzaBillGenerator;

import java.util.Scanner;

public class MainClass {
	final static Scanner read = new Scanner(System.in);
		public static void main(String[] args) {
		 
		 System.out.println("Enter the Number to select the Option");

		 // Input the pizza Category into veg and non- veg
		 // Change Integer Input to Boolean value;

		 System.out.println("Veg Pizza  : 0 \nNon-Veg Pizza : 1 \n");
		 final int pizzaCate = read.nextInt();
		 boolean pizzaCateg = false;
		if(pizzaCate==1)  pizzaCateg = true;
		
		 //Input the pizza Type into Normal and Delux Pizza
		 System.out.println("Normal Pizza : 0 \nDelux Pizza : 1 \n");
		 final int pizzaType = read.nextInt();
			
		 
		// Input the Cheese option 
		 System.out.println("Cheese : 1 : 0 (1 for Yes, 0 for No)");
		 final int cheese = read.nextInt();

		 // Input the  Toppings option
		 System.out.println(" Toppings : 1 : 0 (1 for Yes, 0 for No)");
		 final int toppings = read.nextInt();		
		 
		 //Input the Takeout option
		 System.out.println(" Takeout : 1 : 0 (1 for Yes, 0 for No)");
		 final int takeout = read.nextInt();		
		
		 if(pizzaType == 1) {
			NormalPizza np = new NormalPizza(pizzaCateg);
			MainClass mc = new MainClass();
			
			np.addcheese(cheese);
			np.addtoppings(toppings);
			np.takeout(takeout);
			np.generateBill(1);
		}
		else if(pizzaType==2){
			DeluxPizza dp = new DeluxPizza(pizzaCateg, cheese, takeout);
			dp.addmayo();
			dp.pepperoni();
			dp.generateBill(1);
		}
		
}

}

