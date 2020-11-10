package Exception;

public class MainException {

	public static void main(String[] args) {
		
		int a, b;
		
		a = 10;
		b = 2;
		
		// Создаётся в случае если есть ошибка деления на ноль try кидает нас в catch
		// Если ошибки нет catch пропускается, и программа работает в нормально режиме.
		try {
			System.out.println(a/b);
			System.out.println("Tout va bien !!!");
		}
		catch (java.lang.ArithmeticException ex) {
			System.out.println("J'ai chope l'exeption");
		}

	}

}
