package AbstractFactory.products.mouse;

public class MsiMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Msi mouse clicks");
    }
}
