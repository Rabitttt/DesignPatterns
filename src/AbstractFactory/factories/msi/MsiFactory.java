package AbstractFactory.factories.msi;

import AbstractFactory.factories.Company;
import AbstractFactory.products.keyboard.Keyboard;
import AbstractFactory.products.keyboard.MsiKeyboard;
import AbstractFactory.products.mouse.Mouse;
import AbstractFactory.products.mouse.MsiMouse;

public class MsiFactory extends Company {
    @Override
    public Keyboard createKeyboard() {
        return new MsiKeyboard();
    }
    @Override
    public Mouse createMouse() {
        return new MsiMouse();
    }
}
