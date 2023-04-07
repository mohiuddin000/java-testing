package junit;

//import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @BeforeAll
    public static void beforeclass(){
        System.out.println("beforeALL");
    }

    
    @AfterAll
    public static void afterclass(){
        System.out.println("afterclass");
    }

    @BeforeEach
    public  void beforemethod(){
        System.out.println("beforemethod");
    }

    @AfterEach
    public  void aftermethod(){
        System.out.println("aftermethod");
    }

    @Test
    public  void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
        
    }
    
}
