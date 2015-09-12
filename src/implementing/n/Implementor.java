package implementing.n;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 9/11/2015.
 */
public class Implementor {
//    Implement n! (N * (N -1) * (N -2 ) �.2 * 1)
    public void factorialImplement(int n) {
        final List<Integer> builtUpNotation = new ArrayList<>();
        final List<Integer> solution = new ArrayList<>();

        System.out.println("====" + n + "====");
        for (int i = 1; n >= i; i++) {
            builtUpNotation.add(i);
        }

        System.out.println("[[[[" + builtUpNotation + "]]]]");
        System.out.println("----" + n + "----");
        for (int i = 0; i < n; i++) {
            if (solution.isEmpty()) {
                solution.add(builtUpNotation.get(i));
                System.out.println("<<<<" + solution + ">>>>");
            } else {
                solution.add(builtUpNotation.get(i) * solution.get(i - 1));
                System.out.println("////" + solution + "////");
            }
        }
        System.out.println(solution);
    }
}
