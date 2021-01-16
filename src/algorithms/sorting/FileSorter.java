package src.algorithms.sorting;
import java.io.File;
public class FileSorter {
    public static void main(String[] args){
        File dir=new File(".");
        File[] files=dir.listFiles();
        for(int i=0; i<files.length; i++)
            StdOut.println(files[i].getName());
    }

}
