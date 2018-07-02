package com.huiwenyuan.effectivejava.directories.lesson2.section9;

import java.io.*;

/**
 * 慧文院
 * 对于需要手动调用close方法关闭的资源，比如InputStream，OutputStream 建议使用try-with-resources来控制资源的释放
 * 简单来说：比如对文件流进行读取操作时，以往的写法是要在finally方法中进行手动close操作，
 * 那么使用try-with-resources就可以自动调用close方法。
 *
 * "try-with-resources"是java7引入的，若要使用"try-with-resources"这个语句，资源必须实现AutoCloseable接口
 * 而"AutoCloseable"接口只有一个返回类型为void的close方法。
 */
public class FileUtils {

    public static String firstLineOfFile(String path) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new FileReader(path))
        ) {
            return br.readLine();
        }
    }

    public static void copy(String src, String dst) throws IOException {
        try (
                InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dst)
        ) {
            byte[] buf = new byte[1024 * 10]; int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }
        }
    }

}
