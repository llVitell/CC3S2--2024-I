package org.example;

import java.util.*;

class AttackTree {
    private AttackTreeNode root;

    public AttackTree(AttackTreeNode root) {
        this.root = root;
    }

    public double calculateTotalRisk() {
        return root.calculateRisk();
    }

    public List<String> findCriticalPathDescriptions() {
        return root.findCriticalPathDescriptions();
    }

    public void printTree() {
        root.printTree("", true);
    }
}

