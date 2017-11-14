package log330_tp05.log330_tp05;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.print("Veuillez saisir l'emplacement du ficher : ");
		String myFile = sc.nextLine();
		FileAnalyser fa = new FileAnalyser(myFile);
		try {
			List<Points> myList = fa.tp5LoadFile();
			CalculD c = new CalculD();
			if(c.start(myList)){
				double correlation = c.calculateCorrelation();
				System.out.println("Correlation  = " + correlation);
				if(correlation >0.8) {
					System.out.println("On peut conclure qu'on a une bonne correlation");
				}
				else{
					System.out.println("On peut conclure qu'on n'a pas une bonne correlation");
				}
			}
			else
				System.out.println("erreur lors de traitement de données");

		} catch (FileNotFoundException e) {
			System.out.println("Le fichier nexiste pas");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erreur survenu lors du traitement du fichier");
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Erreur survenu lors de la conversion");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Voulez vous continuer ?(o,n)");
		String myRep = sc.nextLine();
		if(myRep.equals("n")) {
		  break;
		}

		}

	}

}
