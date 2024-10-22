package com.mybank.acorn;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import com.mybank.bank.Ledger;

public class AcornLedger extends Ledger {

	private ArrayList<String> transactions;

	public AcornLedger() {
		super();
		this.transactions = new ArrayList<>();
	}
	
	public ArrayList<String> getTransactions() {
		return transactions;
	}
	
	public void setTransactions(ArrayList<String> transactions) {
		this.transactions = transactions;
	}

	@Override
	public long getTotalBalance() {
		return super.getTotalBalance();
	}

	@Override
	public void setTotalBalance(long totalBalance) {
		super.setTotalBalance(totalBalance);
	}

	public void addTransaction(String accountNumber, TransactionType type, long amount) {
		String timestamp = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss").format(Calendar.getInstance().getTime());
		String transaction = String.format("%s | %s | %s | %d ", timestamp, accountNumber, type, amount);
		transactions.add(transaction);

		// 잔액 업데이트
		if (type == TransactionType.DEPOSIT) {
			setTotalBalance(getTotalBalance() + amount);
		} else if (type == TransactionType.WITHDRAW) {
			setTotalBalance(getTotalBalance() - amount);
		}
	}
	
	//계좌번호별 트렌젝션 
	public ArrayList<String> getTransactionHistory(String accountNumber) {
		ArrayList<String> accountTransactions = new ArrayList<>();
		for (String transaction : transactions) {
			if (transaction.contains(accountNumber)) {
				accountTransactions.add(transaction);
			}
		}
		return accountTransactions;
	}

	//계좌번호의 트렌젝션 히스토리 출력
	public void printTransactionHistory(String accountNumber) {
		if(transactions.size() > 0) {
			System.out.println(accountNumber + "");
			System.out.println("거래시간\t계좌번호\t거래유형\t잔액");
			System.out.println("-----------------------------------------------------------------");
			int idx = 0;
			ArrayList<String> history = getTransactionHistory(accountNumber);
			for (String transaction : history) {
				System.out.print("[" + (idx++ + 1) + "] ");
				System.out.println(transaction);
				System.out.println();
			}
		} else {
			System.out.println("거래내역이 존재하지 않습니다");
		}
		
	}
	
	//전체 트렌젝션 출력
	public void printAllTransactionHistory() {
		if(transactions.size() > 0) {
			System.out.println("거래시간\t계좌번호\t거래유형\t잔액");
			System.out.println("-----------------------------------------------------------------");
			int idx = 0;
			for(String transaction : transactions) {
				System.out.print("[" + (idx++ + 1) + "] ");
				System.out.println(transaction);
				System.out.println();
			}
		} else {
			System.out.println("거래내역이 존재하지 않습니다");
		}
		
	}

}

