package com.achanzhang.threadTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestRunnable implements Runnable {
    @Override
    public void run() {
        //守护线程阻塞1秒后运行
        try {
            Thread.sleep(1000);
            File f = new File("daemon.txt");
            FileOutputStream os = new FileOutputStream(f, true);
            os.write("daemon".getBytes());
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
