package ex_11082024.Abstraction.realEg;

public class Runner {

    public static void main(String[] args) {
        Chrome c = new Chrome();
        String s1 = c.openBrowser("Chrome");
        String s2 = c.closeBrowser("Chrome");

        System.out.println(s1);
        c.takeScreenShot();
        System.out.println(s2);

    }
}
