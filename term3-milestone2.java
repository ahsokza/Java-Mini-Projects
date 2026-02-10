// Khaled Kanaan Albreiki
// CAI 1 - 302679


public class Main{
	public static void main(String[] args) {
	        
	        // step 1
		String[] names = {"Salem", "Mohammad", "Zayed", "Farouq", "Salem"};
		
		
		// step 2 
		int[] grades = new int[6]; 
		
		// step 3 
		grades[0] = 92; 
		grades[1] = 24; 
		grades[2] = 76; 
		grades[3] = 86; 
		grades[4] = 82; 
	}
		
	//step 5 creating calculation method
	public static double calculateAVG(int [] marks){
	        int sum = 0; 
		double average = 0; 
		       
		for (int i=0; i<marks.length;i++){
		        sum += marks[i];
		}
		
		average = (double)sum/marks.length;
		return average;
        }
        
        // B. min_max method usinf Enhanced-for CloneNotSupportedException
        
        public static vid min_max_1(int[] marks){
                int min=marks[0]; 
                int max=marks[0]; 
                for (int i: marks){
                        if (min > i)
                            min = i;
                        if (max < i)
                            max = i; 
                            
        }
                
        System.out.println("Minimum Mark: " + min); 
        System.out.println("Maximum Mark: " + max); 
        
                }
                
        // min_max method using Indexed for loop 
        public static void min_max_2(int[] marks){
                int min=marks[0]; 
                int max=marks[0]; 
                for(int i=0; i< marks.length; i++){
                        for(int i=0; i<marks.length;i++){
                                if (min > marks[i])
                                    min = marks[i]; 
                                if (max < marks[i])
                                    max - marks[i];
                        }
                System.out.println("Minimum Mark: " + min);
                System.out.println("Maximum Mark: " + max); 
                                  
                 }
                }
        }
        }
}
