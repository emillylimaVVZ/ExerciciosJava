package repetiçoes;

public class ex04 {public static void main(String[] args) {
	
	String s1="Hello";
	String s2="HELLO";
	
	boolean b1=s1.equals("Hello");
	boolean b2=s1.equals(s2);
	boolean b3=s1.equalsIgnoreCase(s2);
	boolean b4=s1.equalsIgnoreCase("Azul");
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	
	
	String str="Hello World World2";
	int pos=str.indexOf("l");
	System.out.println(pos);
	//retorna o numero do indice da ultima ocorrencia de 'l'
	int poss=str.lastIndexOf("l");
	System.out.println(poss);
	
	
	String valor="CDD4.0 - Java";
	
	System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true : false);
	System.out.println(valor.compareTo("CDD4.0 - JAVA") == 0 ? true : false);	
	System.out.println(valor.compareToIgnoreCase("CDD4.0 - JAVA")==0 ? true : false);
	
	System.out.println(" ");
	
	System.out.println(valor.endsWith("Java"));
	System.out.println(valor.startsWith("C"));
	System.out.println(valor.startsWith("DD", 1));
	
	
	
}



}





//true,false,true 
//vai perguntar se é igual a sentença original)