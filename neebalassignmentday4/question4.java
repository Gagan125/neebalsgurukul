package neebalassignmentday4;

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ev = {850, 945, 1145, 1155, 1230, 1245, 1330, 1340, 1425, 1445};
        int tt = 0;
        
        for (int i = 0; i < ev.length - 1; i += 2) {
            int t1 = ev[i];
            int t2 = ev[i + 1];
            int m1 = (t1 / 100) * 60 + (t1 % 100);
            int m2 = (t2 / 100) * 60 + (t2 % 100);
            tt += m2 - m1;
        }
        
        int h = tt / 60;
        int m = tt % 60;

        System.out.println("Running time: " + h + " hr " + m + " min");
	}

}