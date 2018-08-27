package com.oca.javaBuildingBlocks1.creatingObjects;

public class InstanceInitializerBlocks {

    // Below we have 3 code blocks (and only 1 instance initializer)
    public static void main(String[] args) {
        {
            System.out.println("Feathers");
        }
    }

    // instance initializer (code block outside the method)
    {
        System.out.println("Snowy");
    }
}
