package com.example.classloaderdemo;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Author: xuwei
 * @Date: 2021/1/15 9:41
 * @Description:
 */
public class DiskClassLoader extends ClassLoader {
    private String path;

    public DiskClassLoader(String path) {
        this.path = path;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected Class<?> findClass(String name) {
        String newPath = path + name + ".class";
        byte[] classBytes = null;
        Path path = null;
        try {
            path = Paths.get(new URI(newPath));
            classBytes = Files.readAllBytes(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defineClass(name, classBytes, 0, classBytes.length);
    }
}
