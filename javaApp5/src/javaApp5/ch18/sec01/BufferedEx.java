package javaApp5.ch18.sec01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedEx {

	public static void main(String[] args) {
		// 입출력의 성능을 높여 주고 싶은 경우 Buffered~ 보조 스트림 클래스를 사용한다.
		
		try {
			// 주스트림
			InputStream is = new FileInputStream("D:/ai/study/java_study/data/test3.txt");
			BufferedInputStream bis =  new BufferedInputStream(is); //보조스크림
			
			OutputStream os = new FileOutputStream("D:/ai/study/java_study/data/copy_test3.txt");
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			long startTime = System.nanoTime();
			
			while(true) {
				int data = bis.read();
				if( data == -1) break;
				bos.write(data);
			}
			bos.flush();
			
			long stopTime = System.nanoTime();
			
			
			bos.close();
			os.close();
			bis.close();
			is.close();
			// 680700
			// 168000 nano second
			System.out.println( "파일 읽고 쓰는데 걸린 시간은? (나노초) " + ( stopTime - startTime) );
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
