package day20.ex;

public class KartRider {
	public static void main(String[] args) {
		
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int dist = 2000;
				try {
					while(dist > 0) {
						String name = Thread.currentThread().getName();
						System.out.println(name + ": " + dist + "m");
						Thread.sleep(1);
						dist--;

					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int dist = 2000;
				String name = Thread.currentThread().getName();
				try {
					while(dist > 0) {
						System.out.println(name +  ": " + dist + "m");
						Thread.sleep(1);
						dist--;

					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});

		th1.setName("다오");
		th2.setName("배찌");
		
		
		System.out.println("카트라이더 경기 시작");
		
		
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("경기종료");
		
		
	}
}

