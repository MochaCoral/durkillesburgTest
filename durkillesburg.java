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

//java -cp ".;libs/junit-4.13.2.jar;libs/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore durkillesburgTester

//javac -cp ".;libs\junit-4.13.2.jar;libs\hamcrest-core-1.3.jar" durkillesburgTester.java    