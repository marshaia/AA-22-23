public interface AbstractWindow {
    void use();
}

public class LinuxWindow implements AbstractWindow {
    @Override
    public void use() {
        System.out.println("Using window type: Linux");
    }
}

public class WindowsWindow implements AbstractWindow {
    @Override
    public void use() {
        System.out.println("Using window type: Windows");
    }
}

// in abstract factory pattern this was an interface
public abstract class AbstractFactory {
    public AbstractWindow createWindow() {
        AbstractWindow window = createConcreteWindow();
        window.use();
        return window;
    }
    protected abstract AbstractWindow createConcreteWindow();
}

public class LinuxFactory extends AbstractFactory {
    @Override
    protected AbstractWindow createConcreteWindow() {
        return new LinuxWindow();
    }
}

public class WindowsFactory extends AbstractFactory {
    @Override
    protected AbstractWindow createConcreteWindow() {
        return new WindowsWindow();
    }
}


// Client code
class Client {
    AbstractFactory factory = new LinuxFactory();
    AbstractWindow window = factory.createWindow();
}