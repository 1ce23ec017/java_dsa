package com;

public class Reverse_order_of_words_in_sentence {
	public static void main(String[] args) {
		String sentence = "java is lenthy";
		String reversed = "";
		
		String[] words = sentence.split(" ");
		
		for  (int i = words.length - 1; i >= 0; i--)
		{
			reversed += words[i] + " ";
		}
		
		System.out.println("Revrse string is : " +reversed);
	}

}
