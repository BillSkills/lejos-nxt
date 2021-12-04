package projects;

import java.io.*;
import java.util.*;

import lejos.nxt.*;
import lejos.robotics.*;
import lejos.util.*;

public class music_test {

    public static void main(String[] args) {
        File music = new File("running90s.wav");
        Sound.playSample(music);
    }
}
