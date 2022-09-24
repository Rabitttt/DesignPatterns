package AbstractFactory;


import AbstractFactory.factories.Company;
import AbstractFactory.factories.msi.MsiFactory;

public class Main {
    public static void main(String[] args) {
        //We have 2 companies and bunch of different product types.
        //Don't break Single-Responsibility
        //Don't break Open-Closed Principle
        //When we get product from company, all products are compatible with each other.
        Company msi = new MsiFactory();
        msi.sellGamingSet();
    }
}
