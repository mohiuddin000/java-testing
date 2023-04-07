package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.*;;


/* 
* Unit test for simple App.
*/
public class exam{

    public void test(){
        Assert.assertEquals(2, 3, 2);

        Assert.assertNull(getClass());
    }
}
