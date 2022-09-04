package testNGDemos;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestNGAnnotations {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuiteAnnot(){
        System.out.println("@BeforeSuite - this method gets Executed at project level, before the BeforeTest " +
                "annotation or other annotations");
    }

    @BeforeTest
    public void beforeTestAnnot(){
        System.out.println("@BeforeTest - this method gets Executed at before the beforeclass annotation");
    }

    @BeforeClass
    public void beforeClassAnnot(){
        System.out.println("@BeforeClass - this method gets Executed at class level, before the execution of @test or" +
                " " +
                "any other annotations");
    }

    @BeforeMethod
    public void beforeMethodAnnot(){
        System.out.println("@BeforeMethod - this method gets Executed before the each @Test method ");
    }

    @Test
    public void aTestCase(){
        System.out.println("@Test - aTestCase - TestCase1");
    }

    @Test
    public void bTestCase(){
        System.out.println(" @Test - bTestCase - TestCase2");
    }

    @AfterMethod
    public void afterMethodAnnot(){
        System.out.println("@AfterMethod - this method gets Executed after the each @Test method ");
    }

    @AfterClass
    public void afterClassAnnot(){
        System.out.println("@AfterClass - this method gets Executed at class level, after the execution of @test or " +
                "any other annotations");
    }

    @AfterTest
    public void afterTestAnnot(){
        System.out.println("@AfterTest - this method gets Executed  after the afterclass or other annotation");
    }

    @AfterSuite
    public void afterSuiteAnnot(){
        System.out.println("@AfterSuite - this method gets Executed at project level, after the BeforeTest " +
                "annotation or other annotations");
    }


}
