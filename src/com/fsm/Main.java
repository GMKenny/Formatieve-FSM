package com.fsm;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String inputOne = "BAAB";
        String inputTwo = "A";
        String inputThree = "BBBB";
        String inputFour = "BABA";
        String inputFive = "BBBA";

        List<Node> nodeList = new ArrayList<Node>(){{
            add(new Node("so"));
            add(new Node("s1"));
            add(new Node("s2"));
            add(new Node("s3"));
        }};

        nodeList.get(0).settingNodes(nodeList.get(2), nodeList.get(1));
        nodeList.get(1).settingNodes(nodeList.get(1), nodeList.get(2));
        nodeList.get(2).settingNodes(null, nodeList.get(3));
        nodeList.get(3).settingNodes(nodeList.get(3), nodeList.get(0));

        StateMachine fSM = new StateMachine(nodeList);
        fSM.setInputText(inputOne);
        System.out.println(fSM.processInput());

        fSM.setInputText(inputTwo);
        System.out.println(fSM.processInput());

        fSM.setInputText(inputThree);
        System.out.println(fSM.processInput());

        fSM.setInputText(inputFour);
        System.out.println(fSM.processInput());

        fSM.setInputText(inputFive);
        System.out.println(fSM.processInput());



    }



}
