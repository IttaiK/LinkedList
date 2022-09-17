public class Tester{
    public static void main(String[] args){
        int testCases = 0;
        int testCasesPassed = 0;

        //test initialization
        testCases++;
        linkedList l0 = new linkedList();
        testCasesPassed++;

        //test getRoot for empty list
        testCases++;
        if(l0.getRoot() == null) testCasesPassed++; 

        //test printWalk for empty list
        testCases++;
        if(l0.printWalk().equals("")) testCasesPassed++;

        //test findMinimum for empty list
        testCases++;
        try{
            l0.findMinimum();
         } catch(Exception runtimeException){
            testCasesPassed++;
         }

        //test insert for root
        testCases++;
        l0.insert(10);
        if(l0.getRoot() == 10) testCasesPassed++;

        //test insert for next values
        testCases++;
        l0.insert(8);
        l0.insert(9);
        l0.insert(3);
        l0.insert(4);
        l0.insert(5);
        l0.insert(-1);
        l0.insert(100);
        l0.insert(4);
        l0.insert(-100);
        testCases++; //tests printWalk too
        if(l0.printWalk().equals("10 8 9 3 4 5 -1 100 4 -100 ")) testCasesPassed += 2;

        //test delete for root
        testCases++;
        l0.delete(10);
        if(l0.getRoot() == 8) testCasesPassed++;

        //test delete for non existent value
        testCases++;
        try{
            l0.delete(55);
         } catch(Exception runtimeException){ 
            testCasesPassed++;
        }

        //test delete for random value
        testCases++;
        l0.delete(-1);
        if(l0.printWalk().equals("8 9 3 4 5 100 4 -100 ")) testCasesPassed++;

        //test findMinimum
        testCases++;
        if(l0.findMinimum() == -100) testCasesPassed++;

        //test delete for last value
        testCases++;
        l0.delete(-100);
        if(l0.printWalk().equals("8 9 3 4 5 100 4 ")) testCasesPassed++;

        //test findMinimum
        testCases++;
        if(l0.findMinimum() == 3) testCasesPassed++;

        System.out.println("");
        System.out.println("Passed: " + testCasesPassed + "/" + testCases + " test cases.");
        System.out.println("");

    }
}