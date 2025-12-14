//Name: Khaled Kanaan Albreiki
//ID: 302679
//class: CAI 1 - 11

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        //Step1 Create ArrayLists to store student names and their math marks: 
      	ArrayList<String> studentNames = new ArrayList<String>();
      	ArrayList<Integer> mathMarks = new ArrayList<Integer>();
      
     	//step2  Add student names to the studentNames list: 
      	studentNames.add("Ali");
      	studentNames.add("Ahmad");
      	studentNames.add("Rashed");
      	studentNames.add("Saeed");
      	studentNames.add("Saif");
      	studentNames.add("Khaled");
      	mathMarks.add(95);
  	mathMarks.add(78);
  	mathMarks.add(89);
  	mathMarks.add(99);
  	mathMarks.add(76);
  	mathMarks.add(80);
      
      	//step 3 Insert a new student named "Mohammad" at index 2 in the studentNames list: 
      	studentNames.add(2,"Mohammad");
      	System.out.println(studentNames);
      
        //step 4 Convert all student names to uppercase and remove RASHED: 
        for(int i=0; i<studentNames.size();i++){
            studentNames.set(i,(studentNames.get(i)).toUpperCase());
            if((studentNames.get(i)).equals("RASHED")){
                studentNames.remove(i);
                i--;
            }
        }
        System.out.println(studentNames);
        
  	    //Step 8: 
        long startTime1 = System.nanoTime();
        selectionSort(mathMarks);
        long endTime1 = System.nanoTime();
        System.out.println("After selection sort: " + mathMarks);
        System.out.println("Selection Sort Execution Time: " + (endTime1 - startTime1) + " ns");

        ArrayList<Integer> mathMarksCopy=new ArrayList<Integer>(mathMarks);      
        
        long startTime2 = System.nanoTime();
        insertionSort(mathMarksCopy);
        long endTime2 = System.nanoTime();
        System.out.println("After insertion sort: " + mathMarksCopy);
        System.out.println("Insertion Sort Execution Time: " + (endTime2 - startTime2) + " ns");
    }
  	    
  	    
  	//Step 5a Method to update all marks by adding a specified value 'm': 
        public static void updateMarks(ArrayList<Integer> marks,int m){
                for(int i=0;i<marks.size();i++){
                        marks.set(i,marks.get(i)+m);	
                }
        }

        //Step 5b Method to calculate the average of all marks: 
        public static double calculateAVG(ArrayList<Integer> marks){
                double sum=0;
                double avg=0;
                for(int i:marks){
                        sum += i;
                }
                avg = sum/marks.size();
                return avg;
        }

        //Step 5c Method to print each student's name and their corresponding mark: 
        public static void printData(ArrayList<String> names,ArrayList<Integer> marks){
                for(int i =0; i<names.size();i++){
                        System.out.println(names.get(i) + "\t" + marks.get(i));
                }
        }
  
    
    
        //Step6 Method to search for a student by name: 
        public static boolean searchForStudent(ArrayList<String> names, String name){
                for(int i =0; i<names.size();i++){
                         // Check if the current name matches the search name
                        if((names.get(i)).equals(name))
    		                return true;
    	        }
                return false;
        }
  
  
    //Step 7: 
    public static void selectionSort(ArrayList<Integer> marks){
        for (int j = 0; j < marks.size() - 1; j++){
            int minIndex = j;
            for (int k = j + 1; k < marks.size(); k++){
                if (marks.get(k) < marks.get(minIndex)){
                    minIndex = k;
                }
            }
            int temp = marks.get(j);
            marks.set(j,marks.get(minIndex));
            marks.set(minIndex, temp);
        }
    }
  
    public static void insertionSort( ArrayList<Integer> marks){
        for (int j = 1; j < marks.size(); j++){
            int temp = marks.get(j);
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < marks.get(possibleIndex - 1)){
                marks.set(possibleIndex,marks.get(possibleIndex - 1));
                possibleIndex--;
            }
            marks.set(possibleIndex, temp);
        }
    }
}

