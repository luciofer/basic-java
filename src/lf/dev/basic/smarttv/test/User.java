package lf.dev.basic.smarttv.test;

import lf.dev.basic.smarttv.domain.SmartTv;

public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Is the TV on ? " + smartTv.on);
        System.out.println("Current channel : " + smartTv.channel);
        System.out.println("Current volume : " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("New Status -> Is the TV on ? " + smartTv.on);
        smartTv.turnOff();
        System.out.println("New Status -> Is the TV on ? " + smartTv.on);
        smartTv.turnOn();
        System.out.println("New Status -> Is the TV on ? " + smartTv.on);

        smartTv.turnUpVolume();
        System.out.println("New Status -> current volume : " + smartTv.volume);

        smartTv.turnDownVolume();
        smartTv.turnDownVolume();
        smartTv.turnDownVolume();
        smartTv.turnDownVolume();
        smartTv.turnDownVolume();
        System.out.println("New Status -> current volume : " + smartTv.volume);

        smartTv.turnUpChannel();
        smartTv.turnUpChannel();
        System.out.println("New Status -> Current channel : " + smartTv.channel);

        smartTv.changeChannel(25);
        System.out.println("New Status -> Current channel : " + smartTv.channel);

        smartTv.turnDownChannel();
        smartTv.turnDownChannel();
        smartTv.turnDownChannel();
        smartTv.turnDownChannel();
        System.out.println("New Status -> Current channel : " + smartTv.channel);
    }
}