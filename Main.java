import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int wybor, zmiany=0;
    String tekst;
    char wynik;
    System.out.println("1 - zamiana z małych na duże");
    System.out.println("2- zamiana z dużych na małe");
    wybor=in.nextInt();
    System.out.print("Podaj ciąg znakow:");
    tekst=in.next();
    
  switch (wybor){
    case 1:{
      for(int i=0;i<tekst.length();i++)
      {
        char znak=tekst.charAt(i);
       
        if(znak>=97&&znak<=122){
          int asci=znak;
          asci-=32;
          zmiany++;
          wynik=(char)asci;
          System.out.print(wynik);
        }
        else
          System.out.print(znak);
      }
      System.out.println("\n"+"liczba zmian to:"+zmiany);
      break;
    }
      case 2:{
      for(int i=0;i<tekst.length();i++)
      {
        char znak=tekst.charAt(i);
       
        if(znak>=65&&znak<=90){
          int asci=znak;
          asci+=32;
          zmiany++;
          wynik=(char)asci;
          System.out.print(wynik);
        }
        else
          System.out.print(znak);
      }
      System.out.println("\n"+"liczba zmian to:"+zmiany);
      break;
    }
  }
    
    in.close();
  }
}