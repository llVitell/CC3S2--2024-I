package org.example;

import java.util.*;

class AttackTreeNode {
    private String description;
    private int estimatedCost;
    private double probabilityOfSuccess;
    private List<AttackTreeNode> children;

    public AttackTreeNode(String description, int estimatedCost, double probabilityOfSuccess) {
        this.description = description;
        this.estimatedCost = estimatedCost;
        this.probabilityOfSuccess = probabilityOfSuccess;
        this.children = new ArrayList<>();
    }
    public void addChild(AttackTreeNode child) {
        children.add(child);
    }

    public String getDescription() {
        return description;
    }

    public int getEstimatedCost() {
        return estimatedCost;
    }

    public double getProbability() {
        return probabilityOfSuccess;
    }

    public List<AttackTreeNode> getChildren() {
        return children;
    }

    public double calculateRisk() {
        double risk = estimatedCost * probabilityOfSuccess;
        for (AttackTreeNode child : children) {
            risk += child.calculateRisk();
        }
        return risk;
    }
    public List<String> findCriticalPathDescriptions() {
        List<String> path = new ArrayList<>();
        path.add(description);

        double maxRisk = 0;
        AttackTreeNode criticalNode = null;

        for (AttackTreeNode child : children) {
            double childRisk = child.calculateRisk();
            if (childRisk > maxRisk) {
                maxRisk = childRisk;
                criticalNode = child;
            }
        }

        if (criticalNode != null) {
            path.addAll(criticalNode.findCriticalPathDescriptions());
        }

        return path;
    }
    public void printTree(String prefix, boolean isCritical) {
        System.out.println(prefix + (isCritical ? "-> " : "|- ") + description + " (Value: " + estimatedCost + ", Probability: " + probabilityOfSuccess + ")");
        for (AttackTreeNode child : children) {
            child.printTree(prefix + (isCritical ? " " : "| "), isCritical && findCriticalPathDescriptions().contains(child.getDescription()));
        }
    }
}

