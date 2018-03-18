package com.cn;

import java.util.Arrays;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

public class Demo3 {

	public static void main(String[] args) {
		//nio 的动态buffer 既没有内容截断  又没有容量限制
		//通过写入内容的类型 分配空间来避免截断  例如int就分配4byte long就分配8byte
		ChannelBuffer buffer = ChannelBuffers.dynamicBuffer();
		buffer.writeInt(101);
		buffer.writeDouble(80.1);
		
		byte[] bytes = new byte[buffer.writerIndex()];
		buffer.readBytes(bytes);
		
		System.out.println(Arrays.toString(bytes));
		
		
		ChannelBuffer wrappedBuffer = ChannelBuffers.wrappedBuffer(bytes);
		System.out.println(wrappedBuffer.readInt());
		System.out.println(wrappedBuffer.readDouble());
	}
}
