public class Gra
{
	String haslo;
	char[]odLitery;
	String znaki = "";
	boolean znaleziony;
	int bledneLitery;
	
	Gra(String h)
	{
		haslo = h;
		
		odLitery = new char [haslo.length()];
		for(int i = 0; i < odLitery.length; i++)
		{
			odLitery[i] = ' ';
		}
	}
	
	void SzukajZnaku(char szukanyZnak)
	{
		znaleziony = false;
		if(Sprawdzenie(szukanyZnak))
		{
			System.out.println("Podany znak powtarza się");
		}
		else
		{
			for(int i = 0; i < haslo.length(); i++)
			{
				if (haslo.charAt(i) == szukanyZnak) 
				{
	                //System.out.println("Litera '" + szukanyZnak + "' występuje na indeksie " + i);
	                odLitery[i] = szukanyZnak;
	                znaleziony = true;
	            }
			}
			
			if(znaleziony == false)
			{
				bledneLitery++;
				Rysuj();
			}
			
		}
		
		WyswietlZuzyteLitery();
		WyswietlOdgadniete();
		
	}
	
	boolean Sprawdzenie(char znak)
	{
		for(int i = 0; i < znaki.length(); i++)
		{
			if(znaki.charAt(i) == znak)
			{
				return true;
			}
		}
		
		znaki += znak;
		return false;
	}
	
	void WyswietlOdgadniete()
	{
		System.out.print("Hasło: ");
		for(char c : odLitery)
		{
			if(Character.isWhitespace(c))
				System.out.print("_");
			else
				System.out.print(c);
			
			System.out.print(' ');
		}
		System.out.println("\n");
	}
	
	void WyswietlZuzyteLitery()
	{
		System.out.print("Zużyte litery: ");
		for(char c : znaki.toCharArray())
		{
			System.out.print(c+ ", ");
		}
		System.out.println("");
	}

	boolean SprawdzCzyKoniec()
	{
		if(new String(odLitery).equals(haslo))
		{
			System.out.println("Wygrałeś!");
			return true;
		}
		else if(bledneLitery >= 6)
		{
			System.out.println("Przegrałeś!");
			System.out.print("Hasło: ");
			for(char c : haslo.toCharArray())
				System.out.print(c);
			System.out.println("\n");
			return true;
		}
		return false;
	}

	void Rysuj()
	{
		switch(bledneLitery)
		{
		case 1:
			System.out.println("         ");
			System.out.println("         ");
			System.out.println("         ");
			System.out.println("         ");
			System.out.println("         ");
			System.out.println("         ");
			System.out.println("=========\n\n\n");
			break;
		case 2:
			System.out.println("         ");
			System.out.println("       | ");
			System.out.println("       | ");
			System.out.println("       | ");
			System.out.println("       | ");
			System.out.println("       | ");
			System.out.println("=========\n\n\n");
			break;
		case 3:
			System.out.println("   +---+ ");
			System.out.println("       | ");
			System.out.println("       | ");
			System.out.println("       | ");
			System.out.println("       | ");
			System.out.println("       | ");
			System.out.println("=========\n\n\n");
			break;
		case 4:
			System.out.println("   +---+ ");
			System.out.println("   |   | ");
			System.out.println("   O   | ");
			System.out.println("       | ");
			System.out.println("       | ");
			System.out.println("       | ");
			System.out.println("=========\n\n\n");
			break;
		case 5:
			System.out.println("   +---+ ");
			System.out.println("   |   | ");
			System.out.println("   O   | ");
			System.out.println("  /|\\  | ");
			System.out.println("       | ");
			System.out.println("       | ");
			System.out.println("=========\n\n\n");
			break;
		case 6:
			System.out.println("   +---+ ");
			System.out.println("   |   | ");
			System.out.println("   O   | ");
			System.out.println("  /|\\  | ");
			System.out.println("  / \\  | ");
			System.out.println("       | ");
			System.out.println("=========\n\n\n");
			break;
		}
	}
	
}
