package com.test.java.question.file;

import java.io.File;
import java.util.*;

public class Q09 {

	public static void main(String[] args) {
		String path = "C:\\class\\파일_디렉토리_문제\\크기 정렬";
		File file = new File(path);
		
		ArrayList<File> arr = new ArrayList<File>();
		if(file.exists()) {
			arr = getFileList(file, arr);
			sort(arr);
			
			System.out.println("[파일명]\t\t\t\t[크기]\t[파일이 들어있는 폴더]");
			for(File e : arr) {
				String parentDir = e.getParentFile().getName();
				String name = e.getName();
				String size = getFileSize(e.length());
				System.out.printf("%-30s\t%s\t%s\n", name, size, parentDir);
			}
			
			
		}//if

	}//main

	private static void sort(ArrayList<File> arr) {
		
		Collections.sort(arr, new Comparator<File>() {
			@Override
			public int compare(File file1, File file2) {
				if(file1.length() < file2.length()) {
					return 1;
				} else if(file1.length() > file2.length()) {
					return -1;
				}
				return 0;
			}
		});
		
	}

	//배열에 파일 추가
	private static ArrayList<File> getFileList(File file, ArrayList<File> arr) {
		
		File[] list = file.listFiles();
		
		for(File f : list) {
			if(f.isFile()) {
				arr.add(f);
			}
			
			if(f.isDirectory()) {
				getFileList(f, arr);
			}
		}
		return arr;
	}
	
	public static String getFileSize(long size) {
		int maxByte = 1024;
		int maxKB = maxByte*1024;
		long maxMB = maxKB*1024;
		long maxGB = maxMB*1024;
		long maxTB = maxGB*1024;

		if(size < maxByte) {
			return size + "Byte";
		} else if(size < maxKB) {
			return size/maxByte + "KB";
		} else if(size < maxMB) {
			return size/maxKB + "MB";
		} else if(size < maxGB) {
			return size/maxMB + "GB";
		} else if(size < maxTB) {
			return size/maxGB + "TB";
		} else {
			return "TB 이상의 파일크기입니다.";			
		}
		

	}
}
