package ch04;

class FlowEx24 {
	public static void main(String[] args) throws Exception{ 
		int i=11;

		System.out.println("��, ���� ī��Ʈ�ٿ��� �����մϴ�.");

		while(i--!=0) {
			System.out.println(i);

			for(int j=0;j<2_000_000_000;j++) {}
			Thread.sleep(1000); // 1초 동안 지연
		}

		System.out.println("GAME OVER");
	}
}
