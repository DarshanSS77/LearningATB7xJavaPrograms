package ex_04082024.SingleInheritance;

public class TestCase1 extends Base{

    void testcase1(){
        BrowserStart();

        //code

        BrowserEnd();
    }

    public static void main(String[] args) {
     TestCase1 t1 =   new TestCase1();
     t1.testcase1();
     t1.BrowserStart();
    }
}
