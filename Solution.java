import java.util.ArrayList;

public class Solution {
    public static char mostFrequentChar(String s) {
      String unique = "";
      ArrayList<Integer> count = new ArrayList<Integer>();
      for(int i =0; i < s.length();i++)
      {
        String c = s.substring(i,i+1);
        
        if(!unique.contains(c))
        {
          
          
          unique += c;
          count.add(0);
        }
        count.set(unique.indexOf(c),count.get(unique.indexOf(c))+ 1);
       
        

      }
     
      int max = 0;
      char maxchar = 'a';
      for(int j =0; j < count.size();j++)
      {
        
        if(count.get(j)>max)
        {
          max = count.get(j);
          maxchar = unique.charAt(j);
        }
      }
      
      return maxchar;
      
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
    }

  }
