package ex_11082024.Abstraction.realEg;

public abstract class BaseClass extends GrandbaseClass{
    abstract String openBrowser(String browser);
    abstract String closeBrowser(String browser);

    void takeScreenShot(){
        System.out.println("takeScreenShot");
    }

}
