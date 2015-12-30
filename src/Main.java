
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ok");
		LecteurFichier LF = new LecteurFichier("test.txt");
		LF.lecturefichier();

		LecteurReverse LR = new LecteurReverse("test.txt");
		LR.lecturefichier();
	}

}
