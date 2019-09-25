package e06;

public class E06 {

    public static void main(String[] args) {
        System.out.println(MCD_Euclides(225,300));
    }
    
    public static int MCD_Euclides(int p, int q){
    if (q == 0){
        return p;
    }else{
        return MCD_Euclides(q, p % q);
    }
} 
    
}
