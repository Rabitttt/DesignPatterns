package AbstractFactory.products.keyboard;

public class MsiKeyboard implements Keyboard {
    @Override
    public void write() {
        System.out.println("Msi Keyboard Writes");
    }
}