package day11.ex;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Day {
	private int titleNum = 0;
	private String title;
	private String createdAt;
	private String dueDate;
	private String desc;
	
	//Date 객체 불러오기 
	Date now = new Date();
	
	//SimpleDateFormat 객체 불러오기
	SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
	SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

	//생성자
	public Day() {
		
	}

	public Day(int titleNum, String title, String desc, String dueDate) {
		this.titleNum = titleNum;
		this.title = title;
		this.createdAt = date.format(now) + " " + time.format(now);
		this.dueDate = dueDate;
		this.desc = desc;
	}

	//toString
	@Override
	public String toString() {
		return "Day [title=" + title + ", date=" + date + ", desc=" + desc + "]";
	}
	
	//getter
	//setter
	public int getTitleNum() { 
		return titleNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCreatedAt() {
		return createdAt;
	}
	
	public String getDueDate() {
		return dueDate;
	}
	
	
}
