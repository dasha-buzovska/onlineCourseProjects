package com.company.interfaceRealizationLesson5;

/**
 * Created by user on 11.08.2017
 */
public class Application {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Error");
            return;
        }
        Command command = null;
        if (args.length == 2) {
            if (args[0].equals("echo")){
                command = new Echo(args[1]);
            } else if (args[0].equals("date") && args[1].equals("now")) {
                command = new DateNow();
            }
        } else if (args.length == 1) {
            if (args[0].equals("help")) {
                command = new Help();
            } else if (args[0].equals("exit")) {
                command = new Exit();
            }
        }

        if (command == null) {
            System.out.println("Error");
        } else {
            command.execute();
        }
    }
}
