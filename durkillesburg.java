public class durkillesburg {
    
    public static int gregg(String input) {
        int bad = -1;
        int good = 1;
        int evenBetter = 1000;
        if(input.equals("Eide")) {
            return bad;
        }
        else if(input.equals("Angus")) {
            return evenBetter;
        }
        else {
            return good;
        }
    }
    
}