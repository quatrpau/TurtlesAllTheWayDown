
/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {
    public static int factorial(int multiplier){
        if(multiplier == 0)return 0;
        else if(multiplier == 1)return 1;
        else{
            return multiplier * factorial(multiplier - 1);
        }
    }
    // recursive implementation
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    // non-recursive implementation
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
}
