package _02Ejemplos;

public class _08TodosMayores {
	public static void main(String[] args) {
		int[] edad = { 20, 30, 40, 1231, 5123, 412, 18, 321, 221, 721, 121 };

		boolean hayMenor = false;
		for (int i = 0; i < edad.length && !hayMenor; i++) {
			if (edad[i] < 18) {
				System.out.println("No son todos mayores de edad");
				hayMenor = true;
			}
		}
		if (!hayMenor)
			System.out.println("Son todos mayores de edad");

	}

}
