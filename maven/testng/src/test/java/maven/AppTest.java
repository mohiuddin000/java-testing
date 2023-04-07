package maven;
import org.testng.annotations.Test;

class AppTest {
    
    @Test(priority = 1)
    public void openbrowser(){
        System.out.println("openbrowser");
    }

    @Test(priority = 2)
    public void openUms(){
        System.out.println("openUms");
    }
    @Test(priority = 3)
    public void openHomepage(){
        System.out.println("openHomepage");
    }
    @Test(priority = 4)
    public void closeUms(){
        System.out.println("closeUms");
    }
    @Test(priority = 5)
    public void closebrowser(){
        System.out.println("closebrowser");
    }
    
}
