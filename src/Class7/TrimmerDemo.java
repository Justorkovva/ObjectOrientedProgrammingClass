package Class7;

public class TrimmerDemo { 
	
    public static void main(String[] args) {
    	Trimmer myTrimmer = new Trimmer();

    	String originalString = "Hello   this a    test!";
    	System.out.println("original string:              " + originalString);
    	
    	String noWhiteSpaceString1 = myTrimmer.deleteAllWhiteSpacesQuick(originalString);
    	System.out.println("without white spaces (quick): " + noWhiteSpaceString1);
    	
    	String noWhiteSpaceString2 = myTrimmer.deleteAllWhiteSpaces(originalString);
    	System.out.println("without white spaces:         " + noWhiteSpaceString2);
    	
    	String trimmedString = myTrimmer.squeeze(originalString);
    	System.out.println("Squeezed string:              " + trimmedString);
    }

}
