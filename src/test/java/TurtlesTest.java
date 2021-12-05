import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {
    @Test
    public void factorial0(){
        Assert.assertEquals(0,Turtles.factorial(0));
    }
    @Test
    public void factorial1(){
        Assert.assertEquals(1,Turtles.factorial(1));
    }
    @Test
    public void factorial2(){
        Assert.assertEquals(2,Turtles.factorial(2));
    }
    @Test
    public void factorial3(){
        Assert.assertEquals(6,Turtles.factorial(3));
    }



}