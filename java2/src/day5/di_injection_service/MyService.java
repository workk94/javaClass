package day5.di_injection_service;

public class MyService {
	
	
	// 
	//의존성
	MyDAOInterface dao;
	
	//의존성 주입
	//생성자, 세터 주입 

	public MyService() {
		// TODO Auto-generated constructor stub
	}
	
	public MyService(MyDAOInterface dao) {
		super();
		this.dao = dao;
	}
	
	
	// 고객전체 조회
	public void getMembers() {
		dao.selectAll();
	}

	
}
