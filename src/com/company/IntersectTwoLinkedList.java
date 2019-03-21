package com.company;

/*
    Given two singly linked lists that intersect at some point,
    find the intersecting node. The lists are non-cyclical.

    For example, given A=> 3->7->8->10 and
                       B=> 99->1->8->10,
                  return the node with vale 8.
    In this example assume nodes with the same value are the
    exact same node objects.

    Do this in O(M+N) time (where M and N are the lengths of the lists)
    and constant space.
 */
/*
    Solution 1:
    Both list share same z past the point of intersection
    c1 = x + z, List 1
    c2 = y + z, List 2
    c3 = x + y

    x = y -c3
    c1 = (y-c3) + z => c1 + c3 = y+z

 */

import java.util.LinkedList;

public class IntersectTwoLinkedList {
    int c1, c2, c3, x, y, z;
    LinkedList<Integer>l1 = new LinkedList<Integer>();
    LinkedList<Integer>l2 = new LinkedList<Integer>();

    public IntersectTwoLinkedList(){
        l1.add(3); l1.add(7); l1.add(8); l1.add(10);
        l2.add(99); l2.add(5); l2.add(8); l2.add(15);

    }
    public void reverseFirstList(){
        //while(l1.)
    }

}
