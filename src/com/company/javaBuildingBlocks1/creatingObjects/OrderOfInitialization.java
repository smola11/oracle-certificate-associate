package com.company.javaBuildingBlocks1.creatingObjects;

public class OrderOfInitialization {

    private String name = "Fluffy";

    {
        System.out.println("setting field");
    }

    public OrderOfInitialization() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        OrderOfInitialization chick = new OrderOfInitialization();
        System.out.println(chick.name);
    }
}
