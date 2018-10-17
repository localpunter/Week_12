public class InternetRadio implements IConnect {

    public String play(String data) {
        return "playing: " + data;
    }

    public String connect(String data) {
        return "tuned to station: " + data;
    }
}
