package AbstractFactory.products.mouse;

public class LogitechMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Logitech mouse clicks");
    }
}
