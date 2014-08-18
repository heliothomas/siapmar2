package org.vistahermosa.util;

/**
 *
 * @author thomas
 */
import java.util.Timer;
import java.util.TimerTask;

/**
 * Simple demo that uses java.util.Timer to schedule a task to execute
 * once 5 seconds have passed.
 */

public class Reminder {
    Timer timer;

    public Reminder(final int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }

    private class RemindTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Time's up!");
	    timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) {
	System.out.println("About to schedule task. Recordar en 15 segundos...");
        Reminder reminder = new Reminder(15);
        reminder = new Reminder(5);
        reminder = new Reminder(20);
	System.out.println("Task scheduled.");
    }
}