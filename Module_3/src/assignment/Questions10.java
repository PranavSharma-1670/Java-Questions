// 10.	Stopping a Thread: 
//	Write a program that simulates a file download 
//	in a thread (printing "Downloading chunk X"). 
//	Allow the download to stop gracefully when a 
//	stop flag is set to false.
package assignment;

class DownloadTask extends Thread {
    private volatile boolean running = true;

    public void run() {
        int chunk = 1;
        while (running) {
            System.out.println("Downloading chunk " + chunk++);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
        System.out.println("Download stopped.");
    }

    public void stopDownload() {
        running = false;
    }
}

public class Questions10 {
	public static void main(String[] args) throws InterruptedException {
        DownloadTask task = new DownloadTask();
        task.start();

        Thread.sleep(7000);
        task.stopDownload();
    }
}
