package com.interview;

public class VirtusaTwoStrings {

	public static void main(String[] args) {
//		String str1 = "ABC";
//		String str2 = "BC";
//		String finalString = "";
//		char[] str1Char = str1.toCharArray();
//		char[] str2Char = str2.toCharArray();
//		for (int i = 0; i < str1Char.length; i++) {
//			for (int j = str2Char.length - 1; j >= 0; j--) {
//				if (str1Char[i] != str2Char[j]) {
//					System.out.println(str1Char[i]);
//				} else {
//					System.err.println(str1Char[i]);
//				}
//			}
//		}
//		// System.out.println(finalString);

		String str1 = "ABC";
		String str2 = "BC";
	//	String str1 = "BC";
	//	String str2 = "BANGALORE";
		char[] strArray1 = str1.toCharArray();
		char[] strArray2 = str2.toCharArray();
		String op1 = "";
		String op2 = "";
		
		for (int i = 0; i < str1.length(); i++) {
			if (!str2.contains(Character.toString(strArray1[i]))) {
				if (!op1.contains(Character.toString(strArray1[i]))) {
					op1 = op1 + strArray1[i];
				}
				if(op1.equals("")){
					op1="N/A";
				}

			} else {
				for (int j = 0; j < str2.length(); j++) {
					if (!str1.contains(Character.toString(strArray2[j]))) {
						if (!(op2.contains(Character.toString(strArray2[j])))) {
							op2 = op2 + strArray2[j];
						}

					}
				}
				if(op2.equals("")){
					op2="N/A";
				}
			}

		}
		
		System.out.println("Op1: " + op1);
		System.out.println("Op2: " + op2);
	}
}
