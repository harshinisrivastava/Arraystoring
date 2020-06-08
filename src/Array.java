public class Array {
    public static void main(String[] args) {
    	 int[] a;	
      

        a = new int[3000000];
       // System.out.println(" enter the values ");
       // System.out.println(a.length);
        long start = System.currentTimeMillis();
        for (int i = 0; i < a.length; i++) {
        //	System.out.println("looping");
           a[i] = i;
            //System.out.println(  " ");
        }
       // System.out.println("abc");
        long end = System.currentTimeMillis(); 
        System.out.println("Counting  300000 takes " + 
                                    (end - start) + "ms"); 
    } 
    }
