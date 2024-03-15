package com.sample;

class Hello {
    public static void main(String args[]) {
        int num1 = 8;
        double num2 = 1.5;
        float num3 = 1.5f;
        float num4 = 1.5f;
        int num5 = 0b101; //binary
        int num6 = 0x7E; //hex
        int num7 = 1_00_00_000;
        System.out.println("hello world");
        System.out.println(num1+num2);
        System.out.println(num3+num4);
        System.out.println(num4+num1);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);

        //type conversion
        int a = 257;
        byte k = (byte)a; // performs modulous operation : 257%256(range of byte) = 1
        System.out.println(k);

        byte n1 = 10;
        byte n2 = 30;
        System.out.println(n1*n2); // type propomtion - byte to int

        System.out.println(n1>n2 ? n1 : n2);
    }
}