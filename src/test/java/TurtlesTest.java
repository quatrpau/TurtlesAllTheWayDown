import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

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
    @Test
    public void gcd0(){
        Assert.assertEquals(2,Turtles.gcd(6,8));
    }
    @Test
    public void gcd1(){
        Assert.assertEquals(500, Turtles.gcd2(500,1000));
    }
    @Test
    public void gcdTime(){
        Instant start = Instant.now();
// CODE to be timed goes HERE
        Turtles.gcd(500_000_000,7_541_432);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        Instant start2 = Instant.now();
// CODE to be timed goes HERE
        Turtles.gcd2(500_000_000,7_541_432);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start, finish).toMillis();
        System.out.printf("1:%d.10%n",timeElapsed);
        System.out.printf("2:%d.10%n",timeElapsed2);
    }


}