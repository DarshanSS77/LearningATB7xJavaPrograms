package ex_11082024.Abstraction.realEg;

public class Chrome extends BaseClass{
    @Override
    String openBrowser(String browser) {
        return browser + " browser opened";
    }

    @Override
    String closeBrowser(String browser) {
        return browser + " browser closed";
    }
}
