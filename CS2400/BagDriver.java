package CS2400;

import java.util.Arrays;

public class BagDriver {
    public static void main(String[] args){
        //Create bags
        BagInterface<String> bag1 = new ResizableArrayBag<>();
        BagInterface<String> bag2 = new LinkedBag1<>();

        //Fill bags
        bag1.add("A");
        bag1.add("B");
        bag1.add("C");
        bag1.add("B");
        bag1.add("A");

        bag2.add("X");
        bag2.add("Y");
        bag2.add("C");
        bag2.add("A");
        bag2.add("B");

        System.out.println("Bag 1: " + Arrays.toString(bag1.toArray()));
        System.out.println("Bag 2: " + Arrays.toString(bag2.toArray()));

        BagInterface<String> unionOfBags = bag1.union(bag2);
        System.out.println("Union of Bags: " + Arrays.toString(unionOfBags.toArray()));

        BagInterface<String> intersectionOfBags = bag1.intersection(bag2);
        System.out.println("Intersection of Bags: " + Arrays.toString(intersectionOfBags.toArray()));

        BagInterface<String> differenceOfBags = bag1.difference(bag2);
        System.out.println("Difference of Bags: " + Arrays.toString(differenceOfBags.toArray()));


    }


}
