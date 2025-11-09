package com.avn.tns.copsdemo;

public class WorkerMain {
    public static void main(String[] args) {
        Worker e = new Worker();
        Worker e1 = new Developer();
        Worker e2 = new UIDeveloper();

        e.work();   // Calls Worker class method
        e1.work();  // Calls Developer class method
        e2.work();  // Calls UIDeveloper class method
    }
}
