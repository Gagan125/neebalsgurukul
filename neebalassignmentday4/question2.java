package neebalassignmentday4;
//The following array contains attendance data of a student:
//int[] arr = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
//Write a program to find the attendance percentage of this student.
public class question2 {
    public static void main(String[] args) {
		int[]a= {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		int num=a.length;
		int totaldata=0;
		double percentage=0;
		for(int i=0;i<num;i++) {
			//System.out.println();
			if(a[i]==1) {
				totaldata+=1;
			} 
		}	percentage =(double)totaldata/num*100;
		//System.out.println(totaldata);
		System.out.println(num);
		System.out.println(totaldata);
		System.out.println(percentage);
			
		
}
}