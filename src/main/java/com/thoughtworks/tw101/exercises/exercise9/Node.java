package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(name) <= 0) {
            if (left == null) {
                this.left = new Node(nameOfNewNode);
            } else {
                this.left.add(nameOfNewNode);
            }
        } else {
            if (right == null) {
                this.right = new Node(nameOfNewNode);
            } else {
                this.right.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        List<String> list = new ArrayList<>();
        if (left != null) {
            list.addAll(left.names());
        }
        if (name != null) {
            list.add(name);
        }
        if (right != null) {
            list.addAll(right.names());
        }
        return list;
    }
}
