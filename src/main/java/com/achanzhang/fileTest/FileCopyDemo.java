package com.achanzhang.fileTest;

import java.io.*;
import java.util.Arrays;

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        String source = "daemon.txt";
        String dest = "deamon1.txt";
        File fileSource = new File(source);
        File fileDest = new File(dest);

        boolean newFile = fileDest.createNewFile();

        if (newFile) {
            copyFile(fileSource, fileDest);
        }

        FileInputStream fileInputStream = new FileInputStream(fileDest);
        byte[] buf = new byte[fileInputStream.available()];
        int read = fileInputStream.read(buf);

        if (read > 0) {
            System.out.println(new String(buf));
        }

    }

    public static void copyFile(File src, File dest) {
        if (!src.exists()) {
            System.out.println("源文件不存在");
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(src);
            FileOutputStream fileOutputStream = new FileOutputStream(dest);
            byte[] buf = new byte[fileInputStream.available()];
            int i = fileInputStream.read(buf);
            if (i > 0) {
                fileOutputStream.write(buf);
            } else {
                System.out.println("源文件读取失败");
                return;
            }
            fileOutputStream.flush();
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
