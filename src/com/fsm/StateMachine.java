package com.fsm;

import java.util.List;

public class StateMachine {

    private String inputText;
    private final List<Node> nodeList;

    public StateMachine(List<Node> nodeList) {
        this.nodeList = nodeList;
    }

    public void setInputText(String inputText){
        this.inputText = inputText;
    }

    public String processInput(){
        Node mainNode = this.nodeList.get(0);
        String sequence = "Input: " + inputText + " uses these nodes:: ";
        for (int i = 0; i < inputText.length(); i++){
            String character = String.valueOf(inputText.charAt(i));

            if (character.equals("A")){
                mainNode = mainNode.getNodeA();
            }
            else if(character.equals("B")){
                mainNode = mainNode.getNodeB();
            }

            if (mainNode == null){
                return sequence + "\nFSM machine is searching for a non existing node the current node doesn't have a connection with "
                        + character;
            }
            sequence += mainNode.getNodeName() + " ";
        }
        return sequence + "\nFSM machine works correctly and ended at node " + mainNode.getNodeName();

    }

}
