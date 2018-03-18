package com.cn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		//自动扩容  但是有内容截断的问题
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		baos.write(int2byte(1000000));
		
		System.out.println(Arrays.toString(baos.toByteArray()));
		System.out.println(bytes2int(baos.toByteArray()));
	}
	
	public static byte[] int2byte(int i) {
		byte[] bytes=new byte[4];
		bytes[0]=(byte)(i>>3*8);
		bytes[1]=(byte)(i>>2*8);
		bytes[2]=(byte)(i>>8);
		bytes[3]=(byte)i;
		return bytes;
				
	}
	
	public static int bytes2int(byte[] bytes) {
		return (bytes[0]<<3*8)|(bytes[1]<<2*8)|(bytes[2]<<8)|(bytes[3]);
	}
}
