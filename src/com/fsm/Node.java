package com.fsm;

public class Node {

    private final String name;
    private Node nodeA;
    private Node nodeB;

    public Node(String name) {
        this.name = name;
    }

    public String getNodeName(){
        return name;
    }

    public Node getNodeA (){
        return nodeA;
    }

    public Node getNodeB (){
        return nodeB;
    }

    public void settingNodes(Node nodeA, Node nodeB){
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }


}
