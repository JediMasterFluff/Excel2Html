package main;

import java.awt.EventQueue;

import forms.MainScreen;

/*
 * This project is to be used my the members of the DKA to take their spreadsheet data
 * and create customizable HTML tables that they can copy/paste into our web site CMS
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			String test = "<Span>This is a test string</span>";
			
			TextEditor te = new TextEditor();
			
			String newStr = te.addTag(test, "<span padding:10px 11px 0px 0px; ", "</span>");
			
			System.out.println("Output - " + newStr);
			*/
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					try {
						MainScreen window = new MainScreen();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
	}

}
