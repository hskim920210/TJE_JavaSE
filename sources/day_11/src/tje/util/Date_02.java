package tje.util;

// �̱��� �������� ������ ���� ��ü ��ȯ Ŭ����
import java.util.Calendar;
// ���� ������ �����ϱ� ���� Ŭ����
import java.util.Date;

// ���� ������ ���ڿ��� ó���ϱ� ���� Ŭ����
// 1. Date Ŭ������ ��ü�� ���ڿ��� ��ȯ
// 2. ���ڿ��� ����� ���������� Date Ŭ������ ��ü�� ��ȯ
import java.text.SimpleDateFormat;

public class Date_02 {

	public static void main(String[] args) {
		// ���� �ð��� ���� ������ ó���ϴ� ���
		// java.util.Calendar�� ���� ���� �ð��� ���õ�
		// Date ��ü�� ��ȯ�޾� ó���� �� �ִ�.

		// ���� �ð� ���� ����
		Calendar cal = Calendar.getInstance();
		Date now = cal.getTime();

		// Date Ŭ������ ��ü�� ���ڿ��� ��ȯ
		String format = "yy-MM-dd HH:mm:ss a"; // a�� am���� pm����, hh �� 12�ð�, HH�� 24�ð� ǥ������� 
		SimpleDateFormat sdf = new SimpleDateFormat(format);

		System.out.println("���� �ð��� " + sdf.format(now));

	}

}