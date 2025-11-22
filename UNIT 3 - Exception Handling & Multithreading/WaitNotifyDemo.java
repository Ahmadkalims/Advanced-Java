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

// This program demonstrates inter-thread communication using wait() and notify() in Java.
//output will be:
// Thread Q waiting for P to finish...
// Thread P: 1
// Thread P: 2
// Thread P: 3
// Thread P: 4
// Thread P: 5
// Thread P completed work, notifying Thread Q...
// Thread Q resumes after notification.
// Thread Q: 1
// Thread Q: 2
// Thread Q: 3
// Thread Q: 4
// Thread Q: 5