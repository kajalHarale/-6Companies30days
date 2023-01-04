import java.util.*;
    import java.io.*;

    public class sunstrings {
      public static void main(String args[]) throws IOException {
        Scanner sc= new Scanner(System.in);
        int test_cases;
        test_cases = sc.nextInt();

        while(test_cases != 0){

            String S = sc.next();
            int start=0, end=0, count=0;

            if(S.length()<3)
              count = 0;
            else{
                while(end <= S.length()){

                  int hash[] = new int[26];
                  hash[0] = 0;
                  hash[1] = 0;
                  hash[2] = 0;
                  for(int i=start; i<end; i++){
                      hash[ S.charAt(i) - 'a' ]++;
                  }

                  if(hash[0]>0 && hash[1]>0 && hash[2]>0){
                      count += S.length() - end + 1;
                      start++;
                  }
                  else{
                      end++;
                  }


                }
            }

            System.out.println(count);
            test_cases--;

        }
      }
    }
