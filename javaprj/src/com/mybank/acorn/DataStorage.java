package com.mybank.acorn;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import com.mybank.bank.Account;
import com.mybank.user.User;

//데이터저장함 
public class DataStorage {
	
	private String[] filePathArr = {"data/user.txt", "data/account.txt", "data/ledger.txt"};
	private AcornBank bank;
	private AcornLedger ledger;

    // 생성자에서 AcornBank 객체를 받도록 수정
    public DataStorage(AcornBank bank, AcornLedger ledger) {
        this.bank = bank;
        this.ledger = ledger;
    }
	
	public void loadData() throws EOFException, ClassNotFoundException {
		try (InputStream in = new FileInputStream(filePathArr[0]);
				ObjectInputStream oin = new ObjectInputStream(in);){
			// 고객정보 불러오기 
			ArrayList<User> ulist = new ArrayList<>();
			ulist = (ArrayList<User>) oin.readObject();
			bank.setUsers(ulist);
		} catch (IOException e) {
			System.out.println("파일 불러오기 오류");
		}
		try (InputStream in = (new FileInputStream(filePathArr[1]));
				ObjectInputStream oin = new ObjectInputStream(in);){
			// 은행계좌 불러오기 
			ArrayList<Account> alist = new ArrayList<>();
			alist = (ArrayList<Account>) oin.readObject();
			bank.setAccounts(alist);
		} catch (IOException e) {
			System.out.println("파일 불러오기 오류");
		}
		try (InputStream in = (new FileInputStream(filePathArr[2]));
				ObjectInputStream oin = new ObjectInputStream(in);){
			// 은행장부 불러오기 
			ArrayList<String> transactions = new ArrayList<>();
			transactions = (ArrayList<String>) oin.readObject();
			ledger.setTransactions(transactions);
		} catch (IOException e) {
			System.out.println("파일 불러오기 오류");
		}
	}
	
	//데이터 저장하기 
	public void saveData() throws EOFException{
		
		try (OutputStream out = new FileOutputStream(filePathArr[0]);
				ObjectOutputStream oout = new ObjectOutputStream(out);
				){
			// 고객정보 저장하기
			ArrayList<User> ulist = bank.getUsers();
			oout.writeObject(ulist);
		} catch (IOException e) {
			System.out.println("파일저장 오류");
		}
		try (OutputStream out = new FileOutputStream(filePathArr[1]);
				ObjectOutputStream oout = new ObjectOutputStream(out);
				){
			// 은행계좌 저장하기 
			ArrayList<Account> alist = bank.getAccounts();
			oout.writeObject(alist);
		} catch (IOException e) {
			System.out.println("파일저장 오류");
		}
		try (OutputStream out = new FileOutputStream(filePathArr[2]);
				ObjectOutputStream oout = new ObjectOutputStream(out);
				){
			// 은행장부 저장하기 
			ArrayList<String> transactions = ledger.getTransactions();
			oout.writeObject(transactions);
		} catch (IOException e) {
			System.out.println("파일저장 오류");
		}
	}
}
