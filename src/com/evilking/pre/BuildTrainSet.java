package com.evilking.pre;

import java.io.File;

public class BuildTrainSet {

	private static String TRAIN_PATH = "E:\\迅雷下载\\ai_challenger_caption_train_20170902";
	
	private static String ROOT_PATH = "data//";
	
	public static void readFiles(String filename){
		File file = new File(TRAIN_PATH);
		if(!file.exists()){
			System.out.println(file.getPath() + " : 文件不存在!");
		}
		if(file.isDirectory()){
			//图像目录
			File[] images = file.listFiles();
		
		}else{
			//json文件
			
			
		}
		
		
		
	}
	
	public static void writeFiles(String filename){
		
		
		
	}
	
	public static void main(String[] args) {
		
	}

}
