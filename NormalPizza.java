package PizzaBillGenerator;


public class NormalPizza {
		 protected int price;
		 private int pizzaprice;
		 private Boolean addtoppings= false;
		 private Boolean addcheese= false;
		 private Boolean takeout = false;


		// Constructor
		public NormalPizza(Boolean pizzaCateg) {
			if(pizzaCateg)this.price = 250;
			else this.price = 300;
			pizzaprice = this.price;

		}
		
		//addtoppings Method
		public void addtoppings(int toppings){
			if(toppings==0){this.price += 50;
			             addtoppings = true;
			}
			if(toppings>1) System.out.println("Invalid Input");

		}

		//addcheese Method
		public void addcheese(int cheese){
			if(cheese==0){
				this.price += 40;

			   addcheese = true;
			}
			if(cheese>1) System.out.println("Invalid Input");
		}

		//takeout Method
		public void takeout(int takeout){
			if(takeout ==0){this.price += 20;
			this.takeout = true;}
			if(takeout>1) System.out.println("Invalid Input");

		}
		//generate Bill Method
		public void generateBill(int bill){
			System.out.println("Pizzaprice : " + pizzaprice);
			if(addtoppings) System.out.println("Added Toppings :" +  50);
			if(addcheese)   System.out.println("Added Cheese :" +  40);
			if(takeout)     System.out.println("Takeout :" +  20);
			System.out.println(this.price);
		}
		 

	
}