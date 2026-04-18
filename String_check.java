import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = "Hello World Nithish  12#₹34₹#";
        int ss = 0, v = 0, c = 0, sp = 0, d = 0;
        s = s.toLowerCase();
        char[] arr1 = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(arr1[i] == ' '){
            ss++;
            }
            else if(Character.isLetter(arr1[i])){
                if(arr1[i] == 'a' || arr1[i] == 'e' || arr1[i] == 'i' || arr1[i] == 'o' || arr1[i] == 'u')
                v++;
                else
                c++;
            }
            else if(Character.isDigit(arr1[i])){
                d++;
            }
            else{
                sp++;
            }
        }
        System.out.println("space:" + ss);
        System.out.println("vowel:" + v);
        System.out.println("consonants: " + c);
        System.out.println("Digit: " + d);
        System.out.println("Special: " + sp);
    }
}