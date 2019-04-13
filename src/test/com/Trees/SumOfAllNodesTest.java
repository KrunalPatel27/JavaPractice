package com.Trees;

import static org.junit.jupiter.api.Assertions.*;

class SumOfAllNodesTest {

    @org.junit.jupiter.api.Test
    void sum() {
        SumOfAllNodes sumOfAllNodes = new SumOfAllNodes();
        int val = sumOfAllNodes.sum(sumOfAllNodes.root);
        assertEquals(val, 51);
    }
}