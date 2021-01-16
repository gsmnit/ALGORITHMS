package src.algorithms.sorting;

public class Date implements Comparable<Date> {
    private final int day,month,year;
    public Date(int d,int m,int y){
        day=d;
        month=m;
        year=y;
     }
    public int compareTo(Date that){
        if(this.year<that.year) 
            return -1;
        if(this.year>that.year) 
            return +1;
        if (this.month < that.month) 
            return -1;
        if (this.month > that.month)
            return +1;
        if (this.day < that.day)
            return -1;
        if (this.day > that.day)
            return +1;
        return 0;

    }
     public static void main(String[] args) {
         Date MyBirthday= new Date(22,12,1998);
         Date MySisBirthday=new Date(9,9,2000);
         StdOut.print(Is.less(MyBirthday,MySisBirthday));
        
    }
    
}
