

public class Sort {
    public static void main(final String[] args) {
        sortnum();

    }

    // static void sortnum() {
    // System.out.println("hello");
    // int a[] = {4,5,5,7,8};
    // Arrays.sort(a);
    // System.out.println(Arrays.toString(a));

    // }

    static void sortnum() {
        final int a[] = { 4, 5, 5, 7, 8 };
        final int n = a.length;
        int temp =0;
       for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(a[i]>a[j]){
                a[j] = temp;
                
            }
    
          
        }
       
        
       }   
       //System.out.println("max is\n"+maxx);

    }

}
