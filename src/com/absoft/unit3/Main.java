package com.absoft.unit3;

import com.absoft.unit3.robots.BalletDancingRobot;
import com.absoft.unit3.robots.DancingRobot;
import com.absoft.unit3.robots.FolkDancingRobot;
import com.absoft.unit3.robots.JazzDancingRobot;

public class Main {

    public static void main(String[] args) {
        DancingRobot robot;
        robot = new BalletDancingRobot();
        printRobot(robot);


        var robot1 = new FolkDancingRobot();
        printRobot(robot1);


        printRobot( new JazzDancingRobot() );
    }

    private static void printRobot(DancingRobot robot) {
        System.out.println("====================");
        System.out.println("Dance Type1: " + robot.getDanceType1());
        System.out.println("Dance Type2: " + robot.getDanceType2());
        System.out.println("Default Dance Type: " + robot.getDefaultDanceType());
        System.out.println("====================\n");
    }
}
