public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 12.34,"white");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 1.2);
        hamburger.addHamburgerAddition2("Lettuce", 1.6);
        hamburger.addHamburgerAddition3("Cheese", 2.3);
        price = hamburger.itemizeHamburger();
        System.out.println("Total Hamburger Price is " + String.format("%.3f", price));

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 23.21);
        healthyBurger.addHamburgerAddition1("Eggs",5.64);
        healthyBurger.addHealthAddition1("Lentils",11.23);
        price = healthyBurger.itemizeHamburger();
        System.out.println("Total Healthy Hamburger Price is " + String.format("%.3f", price));

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Eggs", 2.5);
        price = deluxeBurger.itemizeHamburger();
        System.out.println("Total Deluxe Hamburger Price is " + String.format("%.3f", price));
    }
}