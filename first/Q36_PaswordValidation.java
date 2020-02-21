package Codes_InterviewQuestions.first;
/*
1. Write a return method that can verify if a password is valid or not.

requirements:

1. Password MUST be at least have 6 characters and should not contain space

2. PassWord should at least contain one upper case letter

3. PassWord should at least contain one lowercase letter

4. Password should at least contain one special characters

5. Password should at least contain a digit



if all requirements above are met, the method returns true, otherwise returns  false
*/
interface PasswordFactory<T,X>{
	T func(X x);
}
public class Q36_PaswordValidation {
	public static void main(String[] args) {
		
	}
	public static PasswordFactory<Boolean,String> validationPassword=password->{
		String upperCase="(.*[A-Z]*.)";
		String lowerCase="(.*[a-z]*.)";
        String special="(.*[-/, :-@]*.)";
        String numbers="(.*[0-9]*.)";
        
        Boolean HasUpper=password.matches(upperCase),
        		HasLower=password.matches(lowerCase),
        		HasSpecial=password.matches(special),
        		HasNumber=password.matches(numbers),
        		valid=false;
                 
        if(password.length()>=6)
        	if(HasLower&&HasNumber&&HasSpecial&&HasUpper)
        		valid=true;
        return valid;
	};

}
