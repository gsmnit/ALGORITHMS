package src.algorithms.sorting;

public class Point2D implements Comparable<Point2D> {
    public int x,y;
    Point2D(int x,int y){
        this.x=x;
        this.y=y;
    
    }
    @Override
    public int compareTo(Point2D that) {
        if(this.x>that.x) 
             return +1;
        if(this.x<that.x) 
             return -1;
        return 0;
    }
    
}
