package com.brand;

public class Nokia extends Os implements MobileFeature {

    private final int simCard;
    private final String memory;
    private final String camera;
    private final String keypad;
    private final String game;

    // Create constructor
    public Nokia(int simCard, String memory, String camera, String keypad, String game){

        this.simCard = simCard;
        this.memory = memory;
        this.camera = camera;
        this.keypad = keypad;
        this.game = game;
    }

    public void simCard() {
        System.out.println("\n - " + this.simCard + " sim card slot");
    }
    public void inbuiltMemory() {
        System.out.println(" - " + this.memory + " Storing Capacity");
    }

    public void camera() {
        System.out.println(" - " + this.camera + "camera");
    }

    public void keypad() {
        System.out.println(" - " + this.keypad + "keypad");
    }

    // Extra functionality
    public void game() {
        System.out.println(" - I has provide " + this.game);
    }
}
