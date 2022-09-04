package testNGDemos;

import org.testng.annotations.Test;

public class GroupingDemo_And_OR {
    @Test(groups = {"Smoke","GUI"})
    public void smokeTestCase1(){
        System.out.println("smokeTestCase1 & GUI ");
    }

    @Test(groups = "Smoke")
    public void smokeTestCase2(){
        System.out.println("smokeTestCase2");
    }

    @Test(groups = "Sanity")
    public void sanityTestCase(){
        System.out.println("sanityTestCase1");
    }

    @Test(groups = "Regression")
    public void regressionTestCase1(){
        System.out.println("regressionTestCase1");
    }

    @Test(groups = "Regression")
    public void regressionTestCase2(){
        System.out.println("regressionTestCase2");
    }

    @Test(groups = {"Smoke,Regression"})
    public void smokeRegressionTC(){
        System.out.println("smokeRegressionTC");
    }
}
