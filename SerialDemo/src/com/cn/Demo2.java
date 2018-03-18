package com.cn;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Demo2 {
	
	public static void main(String[] args) {
		//必须考虑容量  
		//不用考虑 内容截断的问题
		ByteBuffer buffer = ByteBuffer.allocate(8);
		
		buffer.putInt(100000);
		buffer.putInt(11);
		
		System.out.println(Arrays.toString(buffer.array()));
		
		ByteBuffer buffer2=ByteBuffer.wrap(buffer.array());
		System.out.println(buffer2.getInt());
		System.out.println(buffer2.getInt());
	}

}
