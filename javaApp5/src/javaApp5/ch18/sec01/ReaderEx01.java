package javaApp5.ch18.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReaderEx01 {

	public static void main(String[] args) {
		// 입력 스트림
		try {
			// 사진을 읽어 들여서 복사하기 연습
			InputStream is = new FileInputStream("D:\\ai\\study\\java_study\\data\\겨울.png");
			OutputStream os = new FileOutputStream("D:\\ai\\study\\java_study\\data\\겨울_copy.png");
						
			while( true ) {
				int data = is.read();//1byte읽는다 
				if(data == -1) break;          // -1은 데이터 끝이라는 의미
				  os.write(data);
			}
			os.flush();
			os.close();
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
