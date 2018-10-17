import java.util.*;

public class Network {
    private String name;
    private ArrayList<Desktop> devicesDesktop;
    private ArrayList<Printer> devicesPrinter;

//    public Network() {
//        this.devicesDesktop = new ArrayList<>();
//        this.name = "CodeClan Network";
//    }

    public Network(String name){
        this.devicesDesktop = new ArrayList<>();
        this.devicesPrinter = new ArrayList<>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devicesDesktop.size() + devicesPrinter.size();
    }

    public void connect(Desktop desktop){
        devicesDesktop.add(desktop);
    }

    public void connect(Printer printer) {
        devicesPrinter.add(printer);
    }

    public void disconnectAll(){
        devicesDesktop.clear();
        devicesPrinter.clear();
    }
}
