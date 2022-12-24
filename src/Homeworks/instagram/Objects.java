package Homeworks.instagram;

import Homeworks.instagram.Discord;
import Homeworks.instagram.Instagram;

public class Objects {
    public static void main(String[] args) {

        Instagram instagram = new Instagram("2.38.6");
        Discord discord = new Discord("3.6.21");

        System.out.println(discord);
        System.out.println(instagram);

    }
}
