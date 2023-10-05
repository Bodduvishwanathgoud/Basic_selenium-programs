package selenium;

public class string_method {

	public static void main(String[] args) {
		
		String ActRes="Account Created";
		 String ExpRes="account created";
		 		
		 			//equal method
		 
		 	boolean flag=ActRes.equals(ExpRes);
			System.out.println("Equal Comparision is --> "+flag);
		
					//equal ingnore method
			
			boolean flag1=ActRes.equalsIgnoreCase(ExpRes);
			System.out.println("Equal coarision is-->"+flag1);
			
			
					//contain method
			
				
			
			String status="Account 100 Created";
			System.out.println("Comparision1:--> "+status.contains("Account"));
			System.out.println("Comparision2:--> "+status.contains("Account Created"));
			System.out.println("Comparision3:--> "+status.contains("100 Cre"));
			
			 //length method
			
			String MobileNumber="9849533706";
			int Length=MobileNumber.length();
			System.out.println(Length);
			if(Length==10)  
				System.out.println("Length match");
			else 
				
				System.out.println("Length mismatch");
			
			//Trim method
			
			String Pincode="   500075     ";
			System.out.println("Before Trim length is --> "+Pincode.length());
			if(Pincode.length() == 6)
				System.out.println("Valid PinCode");
			else
				System.out.println("Invalid Pincode");
			
			
			//substring method
			
			
			String AccountNum="123455889874";
			String LastDigits=AccountNum.substring(8);
			System.out.println("last Digits are --> "+LastDigits);
			
			String MiddleDigts=AccountNum.substring(4, 8);
			System.out.println("Middle Digits are --> "+MiddleDigts);
			
			
			String ProductPrice="$50000";
			System.out.println(ProductPrice.substring(3));
			
			String var1="";
			String var2="Hi";
			System.out.println("var1 empty status is ---> "+var1.isEmpty());
			System.out.println("Var2 empty status is ---> "+var2.isEmpty());
			if(!var2.isEmpty())  //!--Not
				System.out.println("Chars available");
			else
				System.out.println("Chars not available");
			
			
			
			
			
			
			
			
			
			
	}

} 
