package javaplaygroud;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a,b;
		
		//�Է� : Ű����� �� ���� �Է��� �޴´�.
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("�� ���� �Է��� �ּ���.");
		s1 = scanner.next();
		s2 = scanner.next();
		System.out.println(s1+","+s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//��� : ȭ�鿡 �� ���� ���� ����Ѵ�.
		System.out.printf("%d�� %d�� ���� %d�Դϴ�.", a, b, a+b);
		scanner.close();
	}

}
