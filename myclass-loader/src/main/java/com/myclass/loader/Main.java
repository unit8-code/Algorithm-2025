package com.myclass.loader;

import com.sun.crypto.provider.DESKeyFactory;
import sun.misc.Launcher;

import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println(String.class.getClassLoader());
        System.out.println(DESKeyFactory.class.getClassLoader());
        System.out.println("Main's classLoader" + Main.class.getClassLoader());
        System.out.println("Launcher's classLoader:" + Launcher.class.getClassLoader());
//        System.out.println(Launcher.ExtClassLoader.class.getClas sLoader());

        System.out.println();
        System.out.println("java.bootstrap.class.path:");
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url);
        }
        System.out.println();
        System.out.println("java.ext.dirs:");
        String ext = System.getProperty("java.ext.dirs");
        // 逗号分隔打印
        String[] extPaths = ext.split(":");
        for (String extPath : extPaths) {
            System.out.println(extPath);
        }

        System.out.println();
        System.out.println("java.class.path:");
        String s = System.getProperty("java.class.path");
        // 逗号分隔打印
        String[] paths = s.split(":");
        for (String path : paths) {
            System.out.println(path);
        }
    }
}