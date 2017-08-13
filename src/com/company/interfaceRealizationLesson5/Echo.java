package com.company.interfaceRealizationLesson5;

/**
 * Created by user on 11.08.2017
 */
public class Echo implements Command {
    String printString;

    public Echo(String printString) {
        this.printString = printString;
    }

    public void execute() {
        System.out.println(printString);
    }

}
