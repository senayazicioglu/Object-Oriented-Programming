/*sena betul yazicioglu
*yazicioglusenabetul@gmail.com
*bu program tanimlanan kisi icin kolestrol degeri kontrolu yapar
*/

public class Person {
    
    String id;
    String gender;
    double total_cholesterol;
    double hdl;
    
    
    
    Person (String id, String gender, double tChol, double hdl){
        
        this.id=id;
        this.gender=gender;
        this.total_cholesterol= tChol;
        this.hdl=hdl;
        
        
    }
    
    public double getCholesterolRatio(){
        
        double a=(total_cholesterol / hdl);
        return a;
         
        
    }
    
    public boolean hasGoodTotalCholesterol(){
      
         if(total_cholesterol<200){
            return true;
        }
        else
        return false; 
       
    }

    
    public boolean hasGoodHDL(){
        if((gender.equalsIgnoreCase("female")&& hdl>= 45) || (gender.equalsIgnoreCase("male")&& hdl>=40)){
            return true;
        }
        else 
        return false; 
        
    }
    
    public boolean hasGoodCholesterolRatio(){
     if(getCholesterolRatio()<=4.5){
            return true;
        }
        else
        return false; 
       
    }
    
    
       public static void main(String[] args) 
    {


    }
}



