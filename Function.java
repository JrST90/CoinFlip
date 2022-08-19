
package joshs.coinflip;

import java.util.Random;

/**
 *
 * @author joshs
 */
public class Function 
{
    public static int coinFlip()
    {
        Random flipCoin = new Random();
        int result = flipCoin.nextInt(2) - 1;
        return result;
    }
}
