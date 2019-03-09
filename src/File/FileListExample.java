package File;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FileListExample {

	public static void main(String[] args) {
		
		File file = new File("D:\\Datastructures");
		if(file.isDirectory()){
			File[] files = file.listFiles();
			System.out.println("count of files"+files.length);
			for ( File f : files){
				System.out.println(f);
				//System.out.println(f.getPath());
				//System.out.println(f.getAbsolutePath());
				try {
					System.out.println(f.getCanonicalPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}

	/*	///Using File Filter 
		FileFilter fileFilter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isFile();
			}
		};
		
		File[]  filewdFilter= file.listFiles(fileFilter);
		for (File file1 : filewdFilter){
			System.out.println(file1);
		}		
		*/
	}

}
