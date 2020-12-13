package Classes.Scenes;

import Classes.Tasks.GlobalScheduler;

public class ThreadStarter implements Runnable {
    public static GlobalScheduler globalScheduler;

    @Override
    public void run()
    {
        globalScheduler = new GlobalScheduler();
        globalScheduler.Start();

    }

}
