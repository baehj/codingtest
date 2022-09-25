package java_level1;

public class test7 {
	public static void main(String[] args) {
		
		int n = 5;
	    int h = 500;
	    int[][] sword = {{35,44},{28,83},{46,62},{31,79},{40,43}};
	    int cnt = 0;    
	        
	    int maxWield = 0;
	    
	    for(int i=0; i<n; i++){
	        if (sword[i][0] > maxWield){
	            maxWield = sword[i][0];
	        }
	    }
	    
	    for(int i=0; i<n; i++){
	        while(h>0){
	            if (sword[0][i] > maxWield){
	                h = h - sword[0][i];
	                cnt ++;
	            }    
	        }
	    }
	    
	    while(h<=0){
	        h = h - maxWield;
	         cnt ++;
	    }
	
	    System.out.println(cnt);
	    
	}
}
