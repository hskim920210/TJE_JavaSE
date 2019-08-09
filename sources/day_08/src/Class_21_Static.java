
public class Class_21_Static {
	public static void main(String[] args) {
		// static �޼ҵ�
		// static ��� �ʵ�� ���� ���α׷��� �������� �޸𸮿� �ε��Ǿ�
		// ��ü�� �������� Ŭ������ �̸��� ����� ȣ���� �� �ִ� �޼ҵ�

		// 1. ������ �������� �����ϱ� ���ؼ�(Math Ŭ����)
		// 2. private ���������ڰ� ����� static ����� �ʱ�ȭ�ϱ� ���ؼ�

		// �������� static �޼ҵ�� �����ϴ� ��
		// Math Ŭ������ Ȱ��
		int num = -10;

		System.out.printf("num ������ ������ �� : %f\n", Math.sqrt(num));
		System.out.printf("num ������ sin �� : %f\n", Math.sin(num));
		System.out.printf("num ������ ���� �� : %f\n", Math.pow(num, 2));
		System.out.printf("num ������ ���� : %d\n", Math.abs(num));

		// Integer Ŭ���� (�⺻ Ÿ���� �ڷ����� int�� ���� Ŭ����)
		// Integer Ŭ������ parseInt �޼ҵ��
		// ���ڿ��� �Ǿ��ִ� �������� int Ÿ������ ��ȯ
		String strNum1 = "757";
		String strNum2 = "3";
		String strNum3;
		String strResult = strNum1 + strNum2;
		System.out.printf("%s + %s = %s\n", strNum1, strNum2, strResult);

		// ���ڿ��� ����� 757�� ���������� �����Ͽ� ��ȯ�ϴ� parseInt �޼ҵ�
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, result);

		// Double Ŭ���� (�⺻ Ÿ���� �ڷ����� int�� ���� Ŭ����)
		// Double Ŭ������ parseDouble �޼ҵ��
		// ���ڿ��� �Ǿ��ִ� �Ǽ����� double Ÿ������ ��ȯ
		strNum1 = "10.719";
		strNum2 = "7.315";

		double d1 = Double.parseDouble(strNum1);
		double d2 = Double.parseDouble(strNum2);
		double resultd = d1 + d2;
		System.out.printf("%f + %f = %f\n", d1, d2, resultd);
	}

}