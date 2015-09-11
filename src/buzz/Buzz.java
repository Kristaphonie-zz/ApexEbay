package buzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chris on 9/11/2015.
 */
public class Buzz
{
    public void buildBuzzList()
    {
        final List<Integer> twoDigits = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99));
        final List<String> totalArray = new ArrayList<>();

        int j = 0;
        for (int i = 0; totalArray.size() <= 99; i++)
        {
            totalArray.add(i + 1 + "");
            if (i >= 9) {
                final String[] splitTotal = totalArray.get(i).split("");
                final String splitTotalOne = splitTotal[0];
                final String splitTotalTwo = splitTotal[1];
                if (Integer.parseInt(totalArray.get(i)) % 7 == 0
                        || Integer.parseInt(splitTotalOne) == 7
                        || Integer.parseInt(splitTotalTwo) == 7) {
                    System.out.println("Buzz");
                }
                else if (Integer.parseInt(totalArray.get(i)) == twoDigits.get(j)) {
                    System.out.println("Buzz");
                    j++;
                }
                else
                {
                    System.out.println(i + 1);
                }
            } else {
                if (Integer.parseInt(totalArray.get(i)) == twoDigits.get(i)
                        || Integer.parseInt(totalArray.get(i)) % 7 == 0)
                {
                    System.out.println("Buzz");
                }
                else
                {
                    System.out.println(i + 1);
                }
            }
        }
    }
}
