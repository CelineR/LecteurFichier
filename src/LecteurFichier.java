import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class LecteurFichier {

	private String NomFichier;
	
	public LecteurFichier(String Fichier){
		
		this.NomFichier= Fichier;
		
	}
	
	public void lecturefichier(){
		
	FileInputStream in = null;
	File Fichier = new File(this.getNomFichier());		
	try{
		try {
			in = new FileInputStream(Fichier);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		InputStreamReader ipsr=new InputStreamReader(in);
		BufferedReader br =new BufferedReader(ipsr);
		String ligne;
		while ((ligne=br.readLine())!=null){
			System.out.println(ligne);
		
		}
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
				if(in!= null){
						try {
							in.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
	}
	}

	public String getNomFichier() {
		return NomFichier;
	}

	public void setNomFichier(String nomFichier) {
		NomFichier = nomFichier;
	}
	
}
