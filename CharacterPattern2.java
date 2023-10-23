public class CharacterPattern2 {
    public static void main(String[] args){
        int n = 4;

        for(int line = 1; line <= n; line++){
            char ch = 'A';  
            for(int i = 1; i <= line; i++){
                System.out.print(ch);
                ch++;  
            }
            System.out.println();
        }
    }
}
