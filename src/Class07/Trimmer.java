package Class07;

public class Trimmer { 
    	
	public String deleteAllWhiteSpacesQuick(String input) {         
        return input.replace(" ","");
    }
	public String deleteAllWhiteSpaces(String input) { 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
        	char c = input.charAt(i);
            if (c != ' ') {
        		sb.append(c);
            }
        }
        return sb.toString();
    }

	
	public String squeeze(String s) { 
        StringBuilder sb = new StringBuilder();
        int numberOfWhiteSpaces = 0;
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
            if (c != ' ') {
        		sb.append(c);
            	numberOfWhiteSpaces = 0;
            } else {
                if (numberOfWhiteSpaces < 1) {
            		sb.append(c);
                } 
            	numberOfWhiteSpaces++;
            }
        }
        return sb.toString();
    }

}
