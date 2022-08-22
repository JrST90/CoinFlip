
package joshs.coinflip;

import java.util.Random;

public class Function 
{
    public static int coinFlip()
    {
        Random flipCoin = new Random();
        int result = flipCoin.nextInt(2) - 1;
        return result;
    }
}
