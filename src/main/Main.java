package main;

import buzz.Buzz;
import implementing.n.Implementor;
import intersection.IntersectionFinder;
import reverse.string.ReversalFactory;

/**
 * Created by Chris on 9/11/2015.
 */
public class Main
{
    public static void main(String[] args)
    {
        Buzz buzz = new Buzz();
//        Implementor implementor = new Implementor();
        IntersectionFinder intersectionFinder = new IntersectionFinder();
        ReversalFactory reversalFactory = new ReversalFactory();

//        buzz.buildBuzzList();
//        reversalFactory.reverseAnyString();
        intersectionFinder.findIntersection();

    }
}
