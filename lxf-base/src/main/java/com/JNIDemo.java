package com;

//javac lxf-base/src/main/java/com/JNIDemo.java
//cd  lxf-base/src/main/java/
//javah com.JNIDemo
//javah -d ./com  com.JNIDemo

public class JNIDemo {
    public native void testHello();

    public static void main(String[] args) {
        System.loadLibrary("TestJNI");
//        System.load("E:\\users\\coder\\source\\repos\\TestJNI\\x64\\Release\\TestJNI.dll");
        JNIDemo jniDemo = new JNIDemo();
        jniDemo.testHello();
    }
}