package intersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chris on 9/11/2015.
 */
public class IntersectionFinder {
//    Find the intersection of two arrays, like {1,3,5,7,9}, {1,2,3,4,5}; the intersection is {1,3,5}
    public List findIntersection()
    {
        final List<Integer> listOne = new ArrayList<>(Arrays.asList(21, 13, 45, 22, 55, 36, 86));
        final List<Integer> listTwo = new ArrayList<>(Arrays.asList(13, 2, 22, 24, 29, 94, 36));
        final List<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < listOne.size(); i++) {
            System.out.println(listOne.toString().contains(listTwo.get(i).toString()));
            System.out.println(listTwo.get(i));
            if (listOne.contains(listTwo.get(i))) {
                finalList.add(listTwo.get(i));
            }
        }

        System.out.println(finalList);

        return finalList;
    }
}
