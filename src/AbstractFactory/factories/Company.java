package AbstractFactory.factories;

import AbstractFactory.products.keyboard.Keyboard;
import AbstractFactory.products.mouse.Mouse;

public abstract class Company {
    public void sellGamingSet () {
        Keyboard keyboard = createKeyboard();
        Mouse mouse = createMouse();
        keyboard.write();
        mouse.click();
    }

    public abstract Keyboard createKeyboard();
    public abstract Mouse createMouse();
}
