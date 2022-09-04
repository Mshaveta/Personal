package testNGDemos;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {
    @Test(enabled = false)
    public void matchAppTitleUsingIfElseCond() {
         String expectedAppTitle = "Gmail";
        String actualAppTitle = "gmail";
        if(expectedAppTitle.equals(actualAppTitle)){
            System.out.println("yes, Matched");
        }else{
            System.out.println("Not, Matched");
        }
    }

    @Test(enabled = false)
    public void hardAssertion() {
        System.out.println("Start Execution...");
        String expectedAppTitle = "Gmail";
        String actualAppTitle = "gmail";
        Assert.assertEquals(actualAppTitle,expectedAppTitle,"Mismatch AppTitle");//stop execution
        System.out.println("End Execution...");
    }

    @Test
    public void softAssertion() {
        SoftAssert sa =  new SoftAssert();
        System.out.println("Start Execution...");
        String expectedAppTitle = "Gmail";
        String actualAppTitle = "gmail";
        sa.assertEquals(actualAppTitle,expectedAppTitle,"Mismatch AppTitle");//mismatch- fail
        System.out.println("End Execution...");
        sa.assertAll(); //it's mandatory and should be last statement of method
    }


}
