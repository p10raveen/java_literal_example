package com.example;

public class LiteralExample2 {

	public static void main(String[] args) {
		
		int a = 100;  // int <-- int        : Valid      
		long b = 100; // long(8) <-- int(4) : ITC : Valid
		
		long c = 100L; // long(8) <-- long(8) : Valid
		
		int d = 100L; // int(4) <-- long(8): ERROR
		
		byte e = 127; //  Valid
		byte f = 140; //  byte(1) <-- int(4) : ERROR
		
		double g = 100.5; // double(8) <-- double(8) : Valid
		float h = 100.5; // float(4) <-- double(8) : ERROR
		
		float i = 100.5f; // float(4) <-- float(4) : Valid
		
		double j = 100; // double(8) <-- int(4) : ITC: Valid
		// j = 100.0;
		
		char k = 'a'; // valid
		char l = 'ab'; // Invalid
		char m = a; // Invalid
		
		char n = 65; // Valid
		char o = 65535; // Valid 
		char p = 65536; // char(2) <-- int(4) :Invalid: ERROR
		
		/*
		 0-9, A-F
		 
		 */
		char q = '\u0100'; // valid
		char r = '\uabcd'; // valid
		char s = '\uabcde'; // Invalid
		
		/*
		 Char 		min_range		max_range
		 -------------------------------------
		 Integral      0               65535
		 Unicode     '\u0000'         '\uffff'
		  
		 */
		
		
		
		
		
		
		
		
	}

}
