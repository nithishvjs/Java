import java.util.*;
class Sample{
    public static void main(String args[]){
        String s = "   Hello   World    Nithish   ";
        s = s.trim().replaceAll("\\s+", " ");
        System.out.print(s);
    }
}