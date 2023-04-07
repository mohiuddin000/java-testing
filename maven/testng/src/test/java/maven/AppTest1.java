package maven;
import org.testng.annotations.Test;

public class AppTest1 {
   @Test(priority = 1)
    public void kamal(){
        System.out.println("kamal");
    }
    @Test(priority = 2)
    public void aniket(){
        System.out.println("aniket");
    }

    @Test(priority = 3)
    public void hum(){
        System.out.println("hum");
    }


}
