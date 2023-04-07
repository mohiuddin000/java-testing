package maven;

import org.testng.annotations.Test;

public class DependencyExample {
    
    @Test
    void login(){
        System.out.println("login to ums");
    }

    @Test(dependsOnMethods = "login")
    void accessHomepage(){
        System.out.println("access to the home page");
    }

    @Test(dependsOnMethods = {"login" , "accessHomepage"})
    void accessAnou(){
        System.out.println("view annt");
    }
}
