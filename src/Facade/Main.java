package Facade;



public class Main {
    public static void main(String[] args) {
        // As a client of facade, I don't have to know anything about
        // how to make foods. I just want to eat by giving name.
        // If I want to make food myself with every detail.
        // I can do it as well by creating subclass of food.
        FoodMaker foodMaker = new FoodMaker();
        foodMaker.eat(FoodMaker.Food.PIZZA);

        //Main idea of facade is making 'Simple Interfaces' for clients.
    }
}
