/*sena betul yazicioglu-20120205061
*yazicioglusenabetul@gmail.com
*/
/**
 * manipulates a string
 * @author 
 *
 */
public class StringManipulator {
	
	/**
	 * returns intiail of the given name
	 * e.g.: if name is "ALI VELI", it returns "AV". 
	 * Verilen ismin bas harflerini bulur, ornegin "Ayse Fatma" icin
	 * "AF" return eder
	 * ismin sadece 2 kelimeden olustugunu varsayabilirsiniz.
	 * @param name
	 * @return the initials
	 */
	String findInitials(String name) {
	    

	    int i= name.lastIndexOf(" ");  /*i degiskenine boslugu atadim*/
	    
	    char j= name.toUpperCase().charAt(0); /*ismin ilk harflerini buyulterek degiskenlere atadim*/
	    char k= name.toUpperCase().charAt(i+1);
	    
	    String a,b;
	    
	    a=String.valueOf(j); /*char karakterleri stringe donusturdum*/
	    b=String.valueOf(k);
	    
	    String c= a.concat(b); /*karakterleri birbirlerine ekledim*/
	    
	    return c;

	}
	
	
	/**
	 * changes the extension of the filename
	 * e.g. if filename is "data.txt" and ext is "java"
	 * it returns "data.java"
	 * tr: verilen dosyanin uzantisini degistirir. Ornegin 
	 * e.g.  filename icin "data.txt" ve ext icin "java" verilirse
	 * "data.java" yi  return eder
	 * @param filename
	 * @param ext
	 * @return
	 */
	String changeExtension(String filename, String ext) {
	    
	    int i=filename.lastIndexOf("."); /*k degiskenine noktayi atadim*/
	    
	    String j=filename.substring(0,i+1); /*ismin basindan noktaya kadar olan kismini degiskene atadim*/
	    String k= j.concat(ext); /*degiskene atadigim kismin sonuna istenilen uzantiyi ekledim*/
	    
	    return k;

	}

	public static void main(String[] args) {
		/*This part is not tested and graded. 
		You can try to manually test your program from here 
		bu kisim proje kapsaminda degerlendirilmeyecektir. 
		*/

	}

}

public class StringManipulatorTest {
	
	
	public void testFindInitials() {
		StringManipulator sm =new StringManipulator();
		assertEquals("JD", sm.findInitials("john Doe"));
	}

	
	public void testChangeExtension() {
		StringManipulator sm =new StringManipulator();
		assertEquals("afile.java", sm.changeExtension("afile.afile","java"));
	}

}

