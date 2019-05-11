package My;

import java.util.Scanner;


// Kasia niedawno pozna�a wszystkie literki w szkole. Z wielk� pasj� potrafi�a ca�e dnie sp�dza� na pisaniu d�ugich s��w swoim ulubionym flamastrem. 
// Pisa�a i pisa�a "tasiemce" tak d�ugo, a� flamaster wypisa� si�. Kasia posmutnia�a. Z trudem, ale uda�o jej si� uprosi� swoj� mam�, aby kupi�a jej 
// nowy pisak. Musia�a jednak obieca�, �e tym razem b�dzie bardziej oszcz�dna przy jego u�ywaniu �eby wystarczy� na d�u�ej. Kasia zacz�a zastanawia� 
// si� w jaki spos�b b�dzie mog�a zrealizowa� obietnic� dan� mamie. 

// Postanowi�a, �e aby zaoszcz�dzi� wk�ad flamastra b�dzie wypisywa�a skr�con� wersj� wymy�lanych wyraz�w. Je�li mia�a zamiar napisa� wi�cej ni� 
//dwie takie same literki obok siebie w wyrazie, to teraz napisze literk� a nast�pnie liczb�, okre�laj�c� ilo�� wyst�pie� tej literki.

public class ExMarker 
{
// sprawdzic jaka jest dlugosc slowa
	// sprawdzic czy po pierwszej literce wystepuja kolejna taka sama
	
	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Kasiu podaj wyraz.");
	String wyraz = input.nextLine();
	int l = wyraz.length();
	String [] tab = new String [l];
	int [] inf = new int [l];
	
	//PRZYPISANIE DO KOLEJNYCH ELEMENOW TABLICY TAB ZNAKOW Z PODANEGO S�OWA
	for (int i=0; i<l; i++) 
		{
			tab[i]=wyraz.substring(i,i+1);
		}
		System.out.println();
	
	//SPRAWDZANIE KOLEJNYCH ELEMENT�W TABLICY, W PRZYPADKU POWTARZALNEGO ZNAKU PRZYPISANIE LICZBY OKRESLAJ�CA JEJ KOLEJNE POWTORZENIE, GDY JEST PO RAZ PIERWSZY TO WY�WIETLA 0
	for (int i=0;i<(l-1);i++) // sprawdza kolejne elementy tablicy	i jesli wartosc kolejna jest taka sama to przypisuje w tablicy inf wartosc 2 (ze pojawia sie drugi taz itd			//0,1
	{
		if(tab[i].equals(tab[i+1]))	//sprawdza czy element i tablicy jest taki sam jak element i+1											
		{							//je�li tak to wchodzi do �rodka
			int k=2;				//przypisuje wartosc k=2 ktora oznacza ze liczba pojawia sie po raz 2 
			do 						//rozpoczecie petli do
			{
				inf[i+1]=k;			//do tablicy inf i elementu i+1 (czyli tego co si� powtarza) przypisuje wartosc k na pocz�tku r�wn� 2 (�e liczba jest drugi raz)
				i++;				//zwieksza "lokalnie" wartosc i 
				k++;				//zwieksza wartosc k
			} while (i<l-1 && tab[i].equals(tab[i+1]));	//sprawdza czy wartosc i jest mniejsza od dlugosci tablicy (a wiec ilosci przypisanych znakow pobranych od uzytkownika) i (a wiec musza byc dwa warunki spe�nione) czy wartosc elementu tablicy i (ju� powiekszonego o 1) jest taki sam jak kolejnego, jesli dwa warunki s� spe�nione to wraca do s��wka do
		}							//je�li nie to wychodzi z instrukcji if
	}
	//WY�WIETLENIE TABLICY TAB I INF
	for (int i=0; i<l; i++) 
	{
		System.out.println("tab [" + i + "]:  " + tab[i] + "     inf [" + i + "]:  " + inf[i]);
	}
	System.out.println();
		

	//DODATKOWA TABLICA MIESZAJ�CA ZNAKI Z KLAWIATURY Z INFORMACJA O ICH POWTORZENIACH	
	String [] dod = new String [l];
	for (int i=0; i<l; i++)
	{
		dod[i]=wyraz.substring(i,i+1);
	}
	
	//WY�WIETLENIE TABLICY TAB, INF I DOD Z WARTOSCIAMI
	for (int i=0; i<l; i++) 
	{
		System.out.println("tab [" + i + "]:  " + tab[i] + "     inf [" + i + "]:  " + inf[i] + "     dod [" + i + "]:  " + dod[i])  ;
	}
	
	// LIKWIDACJA POWTARZAJACYCH SIE ZNAKOW NA LICZBY Z INFORMACJA ILE ICH JEST
	int j=(l-1); 
	int k=j; 
	int m;
	String wyraz2=" ";
	do {
		if (inf[j]==0)       
		{
			wyraz2 = tab[j]+ wyraz2; 
			j--; 
		}
		else
		{
			m=inf[j]; 
			wyraz2 = m + wyraz2; 
			j=j-m+1; 
		}
		
	} while (j>-1); 
	
	System.out.println();
	
	System.out.println(wyraz);
	System.out.println(wyraz2);

	}
}







