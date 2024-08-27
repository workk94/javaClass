package com.mybank.util;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//데이터저장함 
public class DataStorage {
	
	//field
	private String[] filePathArr = {"./data/고객정보.txt", "./data/고객계좌정보.txt", "./data/은행장부.txt"};
	
	
	//constructor
	public DataStorage(){}
	
	
	
	//method
	public void loadData() {
		ObjectInputStream ois = null;
		try {
			// 고객정보, 은행계좌, 은행장부 불러오기 
			for(int i = 0; i < filePathArr.length; i++) {
				ois = new ObjectInputStream(new FileInputStream(filePathArr[i]));
			}
		} catch(EOFException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//데이터 저장하기 
	public void saveData() {
		ObjectOutputStream oos = null;
		try {
			// 고객정보, 은행계좌, 은행장부 불러오기 
			for(int i = 0; i < filePathArr.length; i++) {
				oos = new ObjectOutputStream(new FileOutputStream(filePathArr[i]));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
