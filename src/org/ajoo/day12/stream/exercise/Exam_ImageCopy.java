package org.ajoo.day12.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {
	public static void main(String[] args) {
		// c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg를 
		// c:\\Temp\\copyimg.jpg 복사해보세요
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
			os = new FileOutputStream("c:\\Temp\\copyimg.jpg");
			int readByteCount;
			byte [] readBytes = new byte[1024*10];
			while(true) {
				readByteCount = is.read(readBytes);
				if(readByteCount == -1) break;
				os.write(readBytes, 0, readByteCount);
//				os.flush();
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
