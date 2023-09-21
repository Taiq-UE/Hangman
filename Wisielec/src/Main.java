import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		String haslo = "CZAPKA";
		Scanner scan = new Scanner(System.in);
		Gra g1 = new Gra(haslo);
		g1.WyswietlOdgadniete();
		do
		{
		
		System.out.print("Podaj litere lub całe hasło: ");
		String s1 = scan.nextLine().toUpperCase();
		
		if(s1.equals(haslo))
		{
			System.out.println("Wygrałeś!");
			return;
		}
		else
		{
			char c = s1.charAt(0);
			g1.SzukajZnaku(c);
		}
		
		}while(g1.SprawdzCzyKoniec() != true);
		
		scan.close();
		System.out.print("Koniec");
		
		
		
		
	}

}
