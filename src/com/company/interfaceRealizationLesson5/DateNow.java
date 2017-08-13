package com.company.interfaceRealizationLesson5;

/**
 * Created by user on 11.08.2017
 */
public class DateNow implements Command {
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
