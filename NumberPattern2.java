public class NumberPattern2 {
    public static void main(String[] args){
        int n =4;
        int number = 1;

        for(int line=1;line<=n;line++){
            for(number=1;number<=line;number++)
            System.out.print(number);
            System.out.println();
            number++;
        }
        
    }
    
}
