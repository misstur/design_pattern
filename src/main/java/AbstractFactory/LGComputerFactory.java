package AbstractFactory;

public class LGComputerFactory implements ComputerFactory {
    @Override
    public LGKeyboard createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public LGMouse createMouse() {
        return new LGMouse();
    }
}
