class SharedData 
{
    boolean workDone = false;
}

class P extends Thread
{
    SharedData shared;

    P(SharedData shared)
    {
        this.shared = shared;
    }

    public void run()
    {
        synchronized (shared) 
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println("Thread P: " + i);
                try
                {
                    Thread.sleep(500);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
            shared.workDone = true;
            System.out.println("Thread P completed work, notifying Thread Q...");
            shared.notify(); // notify waiting thread
        }
    }
}

class Q extends Thread 
{
    SharedData shared;

    Q(SharedData shared) 
    {
        this.shared = shared;
    }

    public void run()
    {
        synchronized (shared) 
        {
            System.out.println("Thread Q waiting for P to finish...");
            while (!shared.workDone)
            {  // check condition
                try
                {
                    shared.wait(); // waits until notified
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
            System.out.println("Thread Q resumes after notification.");
            for (int j = 1; j <= 5; j++)
            {
                System.out.println("Thread Q: " + j);
                try 
                {
                    Thread.sleep(500);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}

public class WaitNotifyDemo
{
    public static void main(String[] args)
    {
        SharedData shared = new SharedData();
        new Q(shared).start();
        new P(shared).start();
    }
}
