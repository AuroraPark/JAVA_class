package ch03;
class OperatorEx13 { 
      public static void main(String[] args) { 
			char c1 = 'a';

//			char c2 =  c1+1;           // ���� 5 : ������ �����߻�!!!
			char c2 = 'a'+1;           // ���� 6 : ������ ��������
// 컴파일러가 최적화 기능
//			char c2 = (char)('a'+1);	//이게 맞는 코드
            System.out.println(c2); 
      } 
}
