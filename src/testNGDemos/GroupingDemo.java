package testNGDemos;

import org.testng.annotations.Test;

public class GroupingDemo {
    @Test(groups = "Smoke")
    public void smokeTestCase1() {
        System.out.println("smokeTestCase1");
    }

    @Test(groups = "Smoke")
    public void smokeTestCase2() {
        System.out.println("smokeTestCase2");
    }

    @Test(groups = "Sanity")
    public void sanityTestCase() {
        System.out.println("sanityTestCase1");
    }

    @Test(groups = "Regression")
    public void regressionTestCase1() {
        System.out.println("regressionTestCase1");
    }

    @Test(groups = "Regression")
    public void regressionTestCase2() {
        System.out.println("regressionTestCase2");
    }
}
