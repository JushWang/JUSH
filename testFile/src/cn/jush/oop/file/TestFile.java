package cn.jush.oop.file;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

public class TestFile {
	public static void main(String[] args) {
//		File f= new File("C:/Users/Jush/Desktop");
//		File f2=new File("C:/Users/Jush/desktop","111112121.txt");
//		File f3=new File("C:/Users/Jush/Desktop/aa/bb/cc");
//		f3.mkdirs();
//		try {
//			f2.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		File f=new File("C:/Users/Jush/Desktop");
		
		getFile(f, 0);
	}
	public static  void getFile(File file,int level){
		for (int i = 0; i < level; i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		if (file.isDirectory()) {
			File[] files=file.listFiles();
			for (File temp : files) {
				getFile(temp,level+1);
			}
		}
	}
}
454