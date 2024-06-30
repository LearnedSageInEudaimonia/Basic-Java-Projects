package PizzaBillGenerator;


public class DeluxPizza extends NormalPizza {

    //constructor
    public DeluxPizza(boolean pizzaCateg, int toppings, int cheese) {
        super(pizzaCateg);
        super.addcheese(cheese);
        super.addtoppings(toppings);
    }

    //addMayo method
    public void addmayo(){
        price += 20;
        System.out.println("Mayo added : " + 20);
     }

     //addPepperoni method
     public void pepperoni(){
        price += 80;
        System.out.println("Pepperoni added : " + 80);
     }
     
}