package ex_10082024.polymorphism.superKeyword;

public class realTimeEg {

    public static void main(String[] args) {
        base b = new testCase1();
        b.openBrowser("Chrome");
        b.closebrowser();
    }
}

class testCase1 extends base {
    testCase1() {
        super();
        this.setBrowser("Edge", true);
    }

    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("set browser from testcase1 class");
        super.setBrowser("Chrome", true);
    }
}

class base {
    base() {
        System.out.println("Base constructor - D");
    }

    base(String a) {
        System.out.println("Base constructor - P");
    }

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        } else {
            System.out.println("Not allowed to set the browser");
        }
    }

    void openBrowser() {
        System.out.println("Browser opened");
    }

    void openBrowser(String browser) {
        System.out.println("Opened the " + browser + " browser");
    }

    void closebrowser() {
        System.out.println("Brwoser closed");
    }

}
