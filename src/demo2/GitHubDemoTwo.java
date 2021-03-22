package demo2;

public class GitHubDemoTwo {
public static void main(String[] args) {
	int a =5;
	String strOne = "Java";
	String strTwo = "java";
	System.out.println("My First Github Commit...");
	nameIs();
    isOdd(a);
    isEqual(strOne, strTwo);
}
public static void nameIs() {
	System.out.println("My Name Is Lakhan");

}

public static boolean isOdd(int a ) {
  
	if(a % 2 ==0) {
		return true;
	}else{
		return false;
	
	}
}


public static void isEqual(String strOne, String strTwo) {
	
	if(strOne.equals(strTwo)) {
		System.out.println("They Are Even");
	}else {
		System.out.println("They Are Not Even");
	}
	
	
}
}