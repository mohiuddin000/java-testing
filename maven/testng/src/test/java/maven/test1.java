package maven;

import org.testng.annotations.*;

public class test1 {
    @BeforeSuite

    void beforeSuit(){
        System.out.println("this will runs before suit");
    }
    @AfterSuite
    void AfterSuit(){
        System.out.println("this will runs after suit");
    }


    @BeforeTest
    void beforeTest(){
        System.out.println("this will runs before test");
    }
    @AfterTest
    void AfterTest(){
        System.out.println("this will runs after test");
    }
    @BeforeClass

    void beforeclass(){
        System.out.println("this will reun before cass");
    }
    @AfterClass

    void aftereclass(){
        System.out.println("this will reun after cass");
    }

    @BeforeMethod
    void beforemethod(){
        System.out.println("this will run before every method");
    }
    @AfterMethod
    void aftermethod(){

        System.out.println("this will run after every method");
    }
    @Test
    void Test1(){

        System.out.println("print test1");
    }
    @Test
    void test2(){

        System.out.println("print test 2");
    }

}