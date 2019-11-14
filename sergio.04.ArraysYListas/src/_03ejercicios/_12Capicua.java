package _03ejercicios;

public class _12Capicua {

	public static boolean capicua(String[] a) {
		boolean capicua = true;

		for (int i = 0, j = a.length - 1; i < j && capicua; i++, j--) {
			if (!a[i].equals(a[j])) {
				capicua = false;
			}
		}
		return capicua;

	}

	public static void main(String[] args) {

		String[] a = { "sergio", "chimo", "sergio", "chimo", "sergio" };

		System.out.println(capicua(a));

	}

}
