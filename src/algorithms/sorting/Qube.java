package src.algorithms.sorting;
public class Qube{
       public static void qube(int x){
           StdOut.println(x*x*x);
       }
        public static void main(String[] args){
            while(true){
                String s = StdIn.readString();
                if(s.equals("end")) {
                    StdOut.println(s);
                    break;
                }
                int x=Integer.parseInt(s);
                qube(x);
            }

    }
}
