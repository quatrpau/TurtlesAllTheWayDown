
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
    //one or two must not be 0 //denom always starts at 0
    public static int greatestCommonDenominator(int one, int two, int denom){
        if(one == two){
            return one *
        }
        else if(one % 2 == 0 && two % 2 == 0){
            return greatestCommonDenominator(one / 2, two / 2, denom + 1);
        }
        else if(one % 2 == 0){
            return greatestCommonDenominator(one /2, two, denom);
        }
        else if(two % 2 == 0){
            return greatestCommonDenominator(one, two/2, denom);
        }
    }
}
