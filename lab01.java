/**
* yazicioglusenabetul@gmail.com
* bu program verilen kisilerin bilgilerini yazdirir ve bu kisilerin bakiyeleri farkini verir
*/
class Main {
  String isim;
  int hesapNo;
  int bakiye;
  
  Main(String i,int hN,int b)
  {
    isim=i;
    hesapNo=hN;
    bakiye=b;
    }

    public static void main(String[] args) {
    
    Main musteri;
    
    musteri=new Main("ali", 111 , 3000);
    Main musteri2=new Main("ayse", 222 , 2000);
      
       System.out.println(musteri.isim + musteri.hesapNo + musteri.bakiye + "\n");
       System.out.println(musteri2.isim + musteri2.hesapNo + musteri2.bakiye + "\n");
      
       int fark=musteri.bakiye - musteri2.bakiye;
       System.out.println("bakiyeler farki: " + Math.abs(fark));
    }
  }