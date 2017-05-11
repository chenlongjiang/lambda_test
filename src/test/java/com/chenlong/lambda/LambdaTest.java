package com.chenlong.lambda;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;

import static java.security.AccessController.doPrivileged;

/**
 * Created by dell、 on 2017/5/10.
 */
public class LambdaTest {
    @Test
    public void threadTest() {
        new Thread(() -> {
            System.out.println("hi");
        }).start();
        new Thread(() -> {
            System.out.printf("s");
        }).start();
        FileFilter java = f -> f.getName().endsWith("*.java");
        System.out.println(java);

    }
}
