package Codes_InterviewQuestions.first;

public class MultiThreading {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String str="AABBCCDDEEEFFFGHJKLMN";
		Q02_Palindrome a1=new Q02_Palindrome();
		Q28_Reverse reverse=new Q28_Reverse();
		Q14_RemDup_Freq_Max_Min frg=new Q14_RemDup_Freq_Max_Min();
		
		
		Thread t1=new Thread(()->{
			;
			System.out.println("First Thread: "+a1.palindrome.function(str));
			System.out.println(frg.frequency.function(str));
			try {
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		});
		
		Thread t2=new Thread(()->{
			System.out.println("Second Thread: "+reverse.reverse.function(str));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		});
		Thread t3=new Thread(()->{
			System.out.println("Third Thread: "+reverse.reverse.function(str));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		});
		
		
		t1.start();
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		t2.start();
		t3.isAlive();
		
	}

}
