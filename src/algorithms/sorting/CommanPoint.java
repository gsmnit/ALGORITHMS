package src.algorithms.sorting;

public class CommanPoint {
    private static int IsCommonPoint(Point2D[] A,Point2D[] B) {
        ShellSort.Sort(A);
        ShellSort.Sort(B);
        int j=0;
        int count=0;
        for(int i=0; i<A.length; i++){
            while(true){
                if(A[i].x==B[j].x) 
                    {  
                        if(A[i].y==B[j].y){
                            count++;
                            break;

                        }
                        j++;
                    }
                else if(A[i].x>B[j].x) j++;
                      else break;
            }
        }
        return count;
        
    }
    
    
    public static void main(String[] args) {
        Point2D[] A={ new Point2D(7,2), new Point2D(1,3), new Point2D(6,8), new Point2D(6,6), new Point2D(0,0)};
        Point2D[] B={new Point2D(8,2), new Point2D(-3,5), new Point2D(6,7), new Point2D(6,0), new Point2D(-1,6)};
        int CommanPoint=IsCommonPoint(A, B);
        StdOut.println("there is "+ CommanPoint+" common point in A & B");
        //StdOut.println(A[1].x);
         //ShellSort.Sort(A);
        //ShellSort.Sort(B);
        //for(Point2D P: B) StdOut.println(P.x);


    }
    
}
