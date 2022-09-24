package AbstractFactory.factories.logitech;

import AbstractFactory.factories.Company;
import AbstractFactory.products.keyboard.Keyboard;
import AbstractFactory.products.keyboard.LogitechKeyboard;
import AbstractFactory.products.mouse.LogitechMouse;
import AbstractFactory.products.mouse.Mouse;

public class LogitechFactory extends Company {
    @Override
    public Keyboard createKeyboard() {
        return new LogitechKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new LogitechMouse();
    }
}
