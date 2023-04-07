package maven;

import org.testng.annotations.Test;

public class GroupingInTestNG {
    
    @Test(groups ="regression")
    void testng(){
        System.out.println("testing");
    }

    @Test(groups = "critial")
    void testng2(){
        System.out.println("testing2");
    }

    @Test(groups = "critical")
    void testng3(){
        System.out.println("testing3");
    }

    @Test(groups = "regression")
    void testng4(){
        System.out.println("testing4");
    }

    @Test(groups = "critical")
    void testng5(){
        System.out.println("testing5");
    }

    @Test(groups = "critial")
    void testng6(){
        System.out.println("testing6");
    }
}
