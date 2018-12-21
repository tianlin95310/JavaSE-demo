package com.newio;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

/**
 * created by tianlin on 2018/12/21
 */
public class TestBuffer {
    public static void main (String []args ) {
//        testByteBuffer();

        readFile();
    }

    private static void readFile() {
        // 通道类似旧IO操作中的Stream对象，不过通道对象能够读也能够写，
        // 通道只能读取缓冲区中的数据获取将数据写入到缓冲区中。
        // 通道对象代表的是数据文件或者Socket等与程序之间的连接通路，
        // 因而所有的Channel都不是通过构造器创建的，
        // 而是通过传统的节点InputStream、OutputStream的getChannel方法来返回响应的Channel。
        try {
            RandomAccessFile file = new RandomAccessFile("", "rw");
            FileChannel fileChannel = file.getChannel();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void testByteBuffer() {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(10 * 1024 * 1024);
        byteBuffer.order(ByteOrder.nativeOrder());
        IntBuffer intBuffer = byteBuffer.asIntBuffer();
        intBuffer.put(1);
        // intBuffer.position(0);
        // intBuffer.rewind();
        intBuffer.flip();
        int value = intBuffer.get();
        System.out.print(value);

    }

}
