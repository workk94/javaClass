package day5.di_injection_service;

public class BatisDAO implements MyDAOInterface{

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		System.out.println("batis 이용해서 전체 조회하기");
	}

	@Override
	public void selectOne() {
		// TODO Auto-generated method stub
		System.out.println("batis 이용해서 하나 조회하기");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("batis 이용해서 삽입하기");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("batis 이용해서 삭제하기");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("batis 이용해서 변경하기");
	}

}
