package AbstractFactory.products.keyboard;

public class LogitechKeyboard implements Keyboard {
    @Override
    public void write() {
        System.out.println("Logitech Keyboard Writes");
    }
}
