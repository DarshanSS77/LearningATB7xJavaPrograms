package ex_17082024.enumsExample;

public enum Colors {

    RED("#ff0022"),
    GREEN("#ff1133"),
    BLUE("#ff6655");
    private String hexValue;

    Colors(String hexValue) {
        this.hexValue = hexValue;
    }

    public String getValue() {
        return hexValue;
    }
}
