package com.achanzhang.free;

public class HexToASCIITest {
    public static void main(String[] args) {
        String hex = "49 4f 54 40 00 16 75 20 99 00 01 01 02 00 07 20 20 03 31 15 50 09 fb 9f 2e 7a 25 5e";
        StringBuilder sb = new StringBuilder();
        String[] split = hex.split(" ");
        for (String str : split) {
            int i = Integer.parseInt(str, 16);
            sb.append((char)i);
        }
        System.out.println(sb.toString());
    }

}
