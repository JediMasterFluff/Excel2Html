package handlers;

/*
 * This class is for the use of the TextPanel controls
 * 
 * All controls in TextPanel will call upon functions from this class
 */
public class TextEditor {

	public TextEditor() {
		super();
	}

	//private int tabCount = 0;
	
	public String addTag(String string_to_add, String startTag, String endTag){
		String taggedString = "";
		String beginningTag = "";
		
		
		int iEnd = startTag.indexOf(" ");
		if(iEnd != -1)
			beginningTag = string_to_add.substring(0, iEnd);
		
		System.out.println("Index - " + iEnd);
		
		if (string_to_add.contains(beginningTag)){
			string_to_add = removeBeginningTag(string_to_add);
			string_to_add = removeEndingTag(string_to_add);
					
			taggedString = startTag + string_to_add + endTag;
		}
		else{
			taggedString = startTag + string_to_add + endTag;
		}
				
		return taggedString;
	}

	private String removeEndingTag(String string_to_add) {
		// TODO Auto-generated method stub
		String returnStr = "";
		int iEnd = string_to_add.indexOf("<");
		
		if(iEnd != -1)
			returnStr = string_to_add.substring(0, (iEnd));
		
		return returnStr;
	}

	private String removeBeginningTag(String string_to_add) {
		// TODO Auto-generated method stub
		String returnStr = "";
		int iEnd = string_to_add.indexOf(">");
		
		if(iEnd != -1)
			returnStr = string_to_add.substring((iEnd+1), string_to_add.length());
		
		return returnStr;
	}
}
