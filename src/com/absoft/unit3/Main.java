package com.absoft.unit3;

public class Main {

    public static void main(String[] args) {
        BalletDancingRobot robot;
        robot = new BalletDancingRobot();
        printRobot(robot);


        BalletDancingRobot robot1 = new BalletDancingRobot();
        printRobot(robot1);


        printRobot( new FolkDancingRobot() );
    }

    private static void printRobot(DancingRobot robot) {
        System.out.println("====================");
        System.out.println("Dance Type1: " + robot.getDanceType1());
        System.out.println("Dance Type2: " + robot.getDanceType2());
        System.out.println("Default Dance Type: " + robot.getDefaultDanceType());
        System.out.println("====================\n");
    }
}
