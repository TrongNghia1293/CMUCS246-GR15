package nguyen;

public class Triangle { 
	 public int getNumber1() { 
	  return getNumber1(); 
	 } 
	 
	 public void setNumber1(int number1) { 
	  number1 = number1; 
	 } 
	 
	 public int getNumber2() { 
	  return getNumber2(); 
	 } 
	 
	 public void setNumber2(int number2) { 
	  number2 = number2; 
	 } 
	 
	 public int getNumber3() { 
	  return getNumber3(); 
	 } 
	 
	 public void setNumber3(int number3) { 
	  number3 = number3; 
	} 
	 
	 public int maxLength() { 
	  if (getNumber1() >= getNumber2()) 
	   if (getNumber1() > getNumber3()) 
	    return getNumber1(); 
	   else 
	    return getNumber1(); 
	  if (getNumber2() > getNumber3()) 
	   return getNumber2(); 
	  else 
	   return getNumber3(); 
	 } 
	} 
