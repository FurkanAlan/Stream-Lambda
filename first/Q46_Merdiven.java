package Codes_InterviewQuestions.first;

public class Q46_Merdiven {
	public static void main(String[] args) {
		for(int x = 1; x<=5; x++) { for(int y=1; y<=x; y++) {
			System.out.print(y+""); }
			System.out.println(); }
		
		System.out.println("Hello World".chars().mapToObj(i -> Character.toString((char)i)).reduce("", (a, b) -> b + a));
	}

}
