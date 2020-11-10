package ExceptionPerso;

public class MainExceptionPerso {

	public static void main(String[] args) {
		try {
			Compte compte1 = new Compte(1, 1000);
			compte1.consulter();

			Compte compte2 = new Compte(2, -200);
			compte2.consulter();

		} catch (ExceptionSoldeNeg e) {
			System.out.println("J'ai attrape !!!");
			e.printStackTrace();
		}
		System.out.println("le programme continue");

	}

}
