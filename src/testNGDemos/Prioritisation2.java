package testNGDemos;

import org.testng.annotations.Test;

public class Prioritisation2 {
    @Test(priority = 1)
    public void bTestCase(){
        System.out.println("bTestCase...browser launch and App Launch");
    }

    @Test(priority = 2)
    public void aTestCase(){
        System.out.println("aTestCase...Login");
    }

    @Test(priority = 3)
    public void cTestCase(){
        System.out.println("cTestCase...logout");
    }
}
