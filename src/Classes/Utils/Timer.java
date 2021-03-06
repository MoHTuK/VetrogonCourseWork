package Classes.Utils;

import sample.Configuration;

import java.util.ArrayList;
import java.util.TimerTask;

public class Timer extends TimerTask {
    ArrayList<TimerListener> listenersList = new ArrayList<>();

    private static int tick;
    public static int getTick() {
        return tick;
    }
    public static void TickUP(){
        tick++;
    }

    public static void clearTime(){tick =0;}

    @Override
    public void run() {
        while (true)
        {
            try {
                Thread.sleep(1000, Configuration.TICK_PER_SECOND);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            TickUP();

            for(TimerListener listener : listenersList)
                listener.tickEvent();

        }
    }

    public void addListener(TimerListener listener)
    {
        listenersList.add(listener);
    }
}