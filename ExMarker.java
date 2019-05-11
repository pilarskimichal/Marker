package My;

import java.util.Scanner;


// Kasia niedawno pozna³a wszystkie literki w szkole. Z wielk¹ pasj¹ potrafi³a ca³e dnie spêdzaæ na pisaniu d³ugich s³ów swoim ulubionym flamastrem. 
// Pisa³a i pisa³a "tasiemce" tak d³ugo, a¿ flamaster wypisa³ siê. Kasia posmutnia³a. Z trudem, ale uda³o jej siê uprosiæ swoj¹ mamê, aby kupi³a jej 
// nowy pisak. Musia³a jednak obiecaæ, ¿e tym razem bêdzie bardziej oszczêdna przy jego u¿ywaniu ¿eby wystarczy³ na d³u¿ej. Kasia zaczê³a zastanawiaæ 
// siê w jaki sposób bêdzie mog³a zrealizowaæ obietnicê dan¹ mamie. 

// Postanowi³a, ¿e aby zaoszczêdziæ wk³ad flamastra bêdzie wypisywa³a skrócon¹ wersjê wymyœlanych wyrazów. Jeœli mia³a zamiar napisaæ wiêcej ni¿ 
//dwie takie same literki obok siebie w wyrazie, to teraz napisze literkê a nastêpnie liczbê, okreœlaj¹c¹ iloœæ wyst¹pieñ tej literki.

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
	
	//PRZYPISANIE DO KOLEJNYCH ELEMENOW TABLICY TAB ZNAKOW Z PODANEGO S£OWA
	for (int i=0; i<l; i++) 
		{
			tab[i]=wyraz.substring(i,i+1);
		}
		System.out.println();
	
	//SPRAWDZANIE KOLEJNYCH ELEMENTÓW TABLICY, W PRZYPADKU POWTARZALNEGO ZNAKU PRZYPISANIE LICZBY OKRESLAJ¥CA JEJ KOLEJNE POWTORZENIE, GDY JEST PO RAZ PIERWSZY TO WYŒWIETLA 0
	for (int i=0;i<(l-1);i++) // sprawdza kolejne elementy tablicy	i jesli wartosc kolejna jest taka sama to przypisuje w tablicy inf wartosc 2 (ze pojawia sie drugi taz itd			//0,1
	{
		if(tab[i].equals(tab[i+1]))	//sprawdza czy element i tablicy jest taki sam jak element i+1											
		{							//jeœli tak to wchodzi do œrodka
			int k=2;				//przypisuje wartosc k=2 ktora oznacza ze liczba pojawia sie po raz 2 
			do 						//rozpoczecie petli do
			{
				inf[i+1]=k;			//do tablicy inf i elementu i+1 (czyli tego co siê powtarza) przypisuje wartosc k na pocz¹tku równ¹ 2 (¿e liczba jest drugi raz)
				i++;				//zwieksza "lokalnie" wartosc i 
				k++;				//zwieksza wartosc k
			} while (i<l-1 && tab[i].equals(tab[i+1]));	//sprawdza czy wartosc i jest mniejsza od dlugosci tablicy (a wiec ilosci przypisanych znakow pobranych od uzytkownika) i (a wiec musza byc dwa warunki spe³nione) czy wartosc elementu tablicy i (ju¿ powiekszonego o 1) jest taki sam jak kolejnego, jesli dwa warunki s¹ spe³nione to wraca do s³ówka do
		}							//jeœli nie to wychodzi z instrukcji if
	}
	//WYŒWIETLENIE TABLICY TAB I INF
	for (int i=0; i<l; i++) 
	{
		System.out.println("tab [" + i + "]:  " + tab[i] + "     inf [" + i + "]:  " + inf[i]);
	}
	System.out.println();
		

	//DODATKOWA TABLICA MIESZAJ¥CA ZNAKI Z KLAWIATURY Z INFORMACJA O ICH POWTORZENIACH	
	String [] dod = new String [l];
	for (int i=0; i<l; i++)
	{
		dod[i]=wyraz.substring(i,i+1);
	}
	
	//WYŒWIETLENIE TABLICY TAB, INF I DOD Z WARTOSCIAMI
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







