
public class Variable_07 {

	public static void main(String[] args) {
		
		
		// 3������ ���� 97 79 85
		// 3���� ������ ������ ������ �� ������ ��� ����ϱ�
		
		// 1. �Է� : Ű�����Է�, �����Է�, ��Ʈ��ũ �Է�, �����ͺ��̽� ...
		// - �Է°��� �����ϱ� ���� ������ ����
		int score_1 = 97;
		int score_2 = 80;
		int score_3 = 85;
		
		// 2. ó�� : �Էµ� �����͸� ����Ͽ� ����ϴ� �۾�
		// - ó���� ����� �����ϱ� ���� ������ ���� (�����̶� ��� ������ ���� �����ϱ�)
		int total = score_1 + score_2 + score_3;
		// ������ ���� �� ���ǻ���.
		// /������ ���װ� ������ ��� ������ ��� ��ȯ�Ǵ� ���� ������ �ȴ�. (�Ҽ��� ���ϴ� ���õ�)
		// ���� �Ҽ��� ������ ���� �ʿ��ϴٸ� / ������ ���� �Ǵ� ������ �Ǽ������� �����ؾ���. (���� ����ȯ�� ���)
		// (double)(total/3)�� �̹� ��ȣ�� ���� ���Ǿ� ������ ��. �׷��� total �Ǵ� 3 ���� �ϳ��� ������ �ٿ��ش�.
		double avg = total/(double)3;
		double avg1 = (double)total/(double)3;
		double avg2 = (double)total/3;
		
		System.out.printf("���� : %-5d��, ��� : %-7.2f��\n", total, avg);
		System.out.printf("���� : %-5d��, ��� : %-7.2f��\n", total, avg1);
		System.out.printf("���� : %-5d��, ��� : %-7.2f��\n", total, avg2);
		
		System.out.printf("%3.2f",(double)2/3);
	}

}