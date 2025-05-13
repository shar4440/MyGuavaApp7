package com.example;
/**
 * Hello world!
 *
 */
 
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.google.common.collect.ImmutableList;
public class App 
{
    public static void main( String[] args )
    {
    
    
        ImmutableList<String> f = ImmutableList.of("Apple","Bannaana","carrot");
        System.out.println(f);
        
        File srcfile = new File("src.txt");
        File destfile = new File ("dest.txt");
        
        try{
            FileUtils.copyFile(srcfile,destfile);   
            System.out.println("Success in coping");     
        }
        
        catch(IOException e){
        System.err.println("Error ocuurredd:"+e.getMessage());
        }

    }
}
