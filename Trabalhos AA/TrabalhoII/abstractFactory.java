// Abstract Product A
interface AbstractWindow {
    void setTitle(String title);
    void repaint();
}

// Abstract Product B
interface AbstractButton {
    void setText(String text);
    void click();
}

// Concrete Product A1
class LinuxWindow implements Window {
    @Override
    public void setTitle(String title) {
        System.out.println("Setting Linux window title to: " + title);
    }

    @Override
    public void repaint() {
        System.out.println("Repainting Linux window");
    }
}

// Concrete Product B1
class LinuxButton implements Button {
    @Override
    public void setText(String text) {
        System.out.println("Setting Linux button text to: " + text);
    }

    @Override
    public void click() {
        System.out.println("Clicking Linux button");
    }
}

// Concrete Product A2
class WindowsWindow implements Window {
    @Override
    public void setTitle(String title) {
        System.out.println("Setting Windows window title to: " + title);
    }

    @Override
    public void repaint() {
        System.out.println("Repainting Windows window");
    }
}

// Concrete Product B2
class WindowsButton implements Button {
    @Override
    public void setText(String text) {
        System.out.println("Setting Windows button text to: " + text);
    }

    @Override
    public void click() {
        System.out.println("Clicking Windows button");
    }
}

// Abstract Factory
// in factory method pattern, this was an abstract class
interface AbstractFactory {
    Window createWindow();
    Button createButton();
}

// Concrete Factory 1
class LinuxFactory implements AbstractFactory {
    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}

// Concrete Factory 2
class WindowsFactory implements AbstractFactory {
    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

// Client code
class Client {
    private AbstractFactory factory;
    private Window window;
    private Button button;

    public Client(AbstractFactory factory) {
        this.factory = factory;
        this.window = factory.createWindow();
        this.button = factory.createButton();
    }

    public void run() {
        window.setTitle("Abstract Factory Example");
        button.setText("OK");
        window.repaint();
        button.click();
    }
}