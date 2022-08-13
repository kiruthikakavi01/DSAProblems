package com.day1;

public class AddBinary2 {

	private static String addBinary(String s1, String s2)
    {
        String a, b;
        if(s1.length() >= s2.length())
        {
            a = s1;
            b = s2;
        }
        else
        {
            a = s2;
            b = s1;
        }
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for(int i = a.length() - 1, j = b.length() - 1; i >= 0; i--, j--)
        {
            int first = ('0' - a.charAt(i))*-1;
            int second = 0;
            if(j >= 0)
            {
                second = ('0' - b.charAt(j))*-1;
            }
            result.append((first + second+ carry) % 2);
            carry = (first + second + carry) / 2;
        }
        if(carry >= 0)
            result.append(carry);
        
       
        return result.reverse().toString();
    }
	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		System.out.println(addBinary(a, b));
	}

}
