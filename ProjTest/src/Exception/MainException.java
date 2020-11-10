package Exception;

public class MainException {

	public static void main(String[] args) {
		
		int a, b;
		String s = null;
		
		a = 10;
		b = 2;
		
		// Создаётся в случае если есть ошибка деления на ноль try кидает нас в catch
		// Если ошибки нет catch пропускается, и программа работает в нормально режиме.
		try {
			System.out.println(a/b);
			System.out.println("Tout va bien !!!");
			System.out.println(s.charAt(3));
		}
		catch (java.lang.ArithmeticException deviseZeroInterdit) {
			System.out.println("J'ai chope l'exeption");
		}
		catch (java.lang.NullPointerException itsNotString) {
			System.out.println("c'est pas un String");
		}

	}

}
