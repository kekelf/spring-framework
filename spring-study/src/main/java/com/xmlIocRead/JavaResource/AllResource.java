package com.xmlIocRead.JavaResource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.UrlResource;

/**
 * FileSystemResource
 * UrlResource
 * InputResource
 * ClassPathResource
 * ByteArrayResource
 *
 * EncodedResource对资源进行：在资源读取的时候，设置响应的编码去读取资源
 * spring利用Resource对资源进行抽象
 */
public class AllResource {
	public void readLocalFile() {
		String path = "d:\\pdf\\a.txt";
		File file = new File(path);
		FileSystemResource fsr = new FileSystemResource(file);
		System.out.println(fsr.exists());
		System.out.println(fsr.isOpen());
		System.out.println(fsr.isReadable());
		System.out.println(fsr.getDescription());
		InputStream is = null;
		try {
			is =fsr.getInputStream();
			byte[] b = new byte[1024];
			int n = 0;
			while( (n = is.read(b)) != -1) {
//				System.out.println(new String(b,0,n));
				System.out.println("=====: "+n);
				for(int i=0;i<n;) {
					String str = Integer.toBinaryString((b[i] & 0xFF) + 0x100).substring(1);
					String show = null;
					if(str.charAt(0) == '1' && str.charAt(1) == '1' && str.charAt(2) != '1') {
						byte temp[] = new byte[2];
						temp[0] = b[i++];
						temp[1] = b[i++];						
						show = new String(temp);
					}else if(str.charAt(0) == '1' && str.charAt(1) == '1' && str.charAt(2) == '1') {
						byte temp[] = new byte[3];
						temp[0] = b[i++];
						temp[1] = b[i++];
						temp[2] = b[i++];
						show = new String(temp);
						show+="<中文utf-8>";
					}else {
						////ASCII字符
						byte temp[] = new byte[1];
						temp[0] = b[i++];
						show = new String(temp);
					}
					System.out.println(show);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
				try {
					if(is !=null)is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	
	public void urlResource() {
		URL url = null;
		try {
			url = new URL("https://www.baidu.com");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		UrlResource ur = new UrlResource(url);
		InputStream is = null;
		try {
			is = ur.getInputStream();
			byte b[] = new byte[1024];
			int n=0;
			while( (n = is.read(b)) != -1) {
				System.out.print(new String(b,0,n));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		AllResource ar = new AllResource();
		ar.readLocalFile();
		ar.urlResource();
		
	}
}
