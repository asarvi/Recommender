import java.io.*;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Reader {

    private Vector<String> asin = new Vector<>();
    private Vector<String> helpFul =new Vector<>();
    private Vector<String>  reviews =new Vector<>();
    private Vector<String>  overall =new Vector<>();
    private Vector<String> summeryVec =new Vector<>();
    private HashMap<String,String>  helpFulDic =new HashMap<>();
    private HashMap<String[],String>  reviewsDic =new HashMap<>();
    private HashMap<String,String>  overallDic =new HashMap<>();
    private HashMap<String,String>  summeryDic =new HashMap<>();




    public void DataSetSplitter(String fileName) throws IOException {
        InputStream inputFile = getClass().getResourceAsStream(fileName);
        BufferedReader readFile = new BufferedReader(new InputStreamReader(inputFile));
        String temp ="";
        String file_line;

        try {
            int count = 0;
            while ((file_line = readFile.readLine()) != null) {
                if(file_line.indexOf("reviewerName")<0)
                    continue;

                   file_line= file_line.replace("\\", " ");
                   file_line= file_line.replace(",", " ");
               //    file_line= file_line.replace(".", " ");
                   file_line= file_line.replace(",", " ");
                   file_line= file_line.replace("\"", " ");
                //   file_line= file_line.replace("!", " ");

                  file_line= file_line.replace(":", " ");
                //   file_line=file_line.toLowerCase();


                String[] split= file_line.split("reviewText");
              //  System.out.println(split[1]);
                split[0]=split[0].replace("   ","    ");
                String[] asinAndHelp=split[0].split("    ");
                asin.add(asinAndHelp[3]);
                helpFul.add(asinAndHelp[7]);
                //review be bad ro miare
                String secondPart=split[1];
                //deletes "overalls" in review
                secondPart=extraOveralls(secondPart);
                String[] thirdPart=secondPart.split("overall");
                reviews.add(thirdPart[0]);

                String[] summeryPart=thirdPart[1].split("unixReviewTime");
                String[] FinalSummary=summeryPart[0].split("summary");
                //summery vector is ready!
                overall.add(FinalSummary[0]);
                summeryVec.add(FinalSummary[1]);


            }


        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private String extraOveralls(String s) {
        String[] reviewpart = s.split("overall");
        String ret = "";
        int count = reviewpart.length;
        if (count > 2) {
            for (int j = 0; j < count - 2; j++) {
                ret += reviewpart[j];
            }
            ret += "overall";
            ret += reviewpart[count - 1];

           // System.out.println(ret);
            return ret;
        }
          //  System.out.println(s);
            return s;

    }

    public void commentReciever(){
        System.out.println("please enter the ID-Product");
        Scanner scanner = new Scanner(System. in);
        String input = scanner. nextLine();
        System.out.println("Now write your comment please");
        Scanner scanner2 = new Scanner(System. in);
        String comment = scanner. nextLine();
        String recommendedProduct =randomRecommender();
        System.out.println("we found a product that you might like, the product ID is:");
        System.out.println(recommendedProduct);
    }
     private String randomRecommender(){

         Random rand = new Random();
         int  n = rand.nextInt(996) + 1;
         String overAll = overall.get(n);
        // System.out.println(overAll.charAt(3));
         while(overAll.charAt(3) <'3'){
             Random rand2 = new Random();
             int  n2 = rand.nextInt(996) + 1;
              overAll = overall.get(n);
         }

         return asin.get(n);
     }




    public static void main(String args[]) throws IOException {
        Reader reader = new Reader();
        reader.DataSetSplitter("reviewsData.txt");
        reader.commentReciever();

        //  reader.extraOveralls("  \"The case pictured is a soft violet color, but the case cover I received was a dark purple. While I'm sure the quality of the product is fine, the color is very different.\", \"overall\": 1.0, \"summary\": \"Wrong color\", \"unixReviewTime\": 1344902400, \"reviewTime\": \"08 14, 2012\"}");
    }
}
