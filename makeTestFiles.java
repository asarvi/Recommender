import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class makeTestFiles
{

    private Vector<String>  products = new Vector<>();
    private Vector<String>  reviewSummery = new Vector<>();
    private  Vector<String[]> recommends = new Vector<>();
    public void makeJsonFile(Vector productID, Vector<String[]> recommended, Vector<String> review) throws IOException {
        PrintWriter pw = null;
              pw=  new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/ati/IdeaProjects/Recommender/src/" + "TestFile.txt")));
              String  recommend="";

        for(int i =0; i<productID.size();i++) {
            for(int j=0; j<recommended.get(i).length;j++) {
                recommend = recommend + recommended.get(i)[j] + "  ";
            }
            pw.println(productID.get(i) +"    "+recommend+"%%&%%"+ review.get(i));
            recommend ="";



        }



        pw.flush();
        pw.close();
    }
    public static void main(String[] args) throws IOException
    {

   makeTestFiles test = new makeTestFiles();
      String[] recs = {"B008A1TR96","B008A1TRPU","B0089V5Z0M","B0089ZSAFU"};
 //  test.makeJsonFile("B008A1U5HY", recs);
        test.products.add("B008A1U5HY");
        test.recommends.add(recs);
          String review ="too big, does not fit";
        test.reviewSummery.add(review);
   //     test.makeJsonFile(test.products,test.recommends,review);

        String[] recs2 = {"1615527621","589105289X"};
        test.products.add("B008A1HCX4");
        test.recommends.add(recs2);
      String  review1 = "too big, not correct size";
        test.reviewSummery.add(review1);
      //  test.makeJsonFile(test.products,test.recommends,test.reviewSummery);

        String[] recs3 = {"B008A27NBE"};
        test.products.add("B008A1NU6C");
        review = "bad material";
        test.recommends.add(recs3);
        test.reviewSummery.add(review);

        String[] recs4 = {"B008A1TEFS",};
        test.products.add("B008A1TY1W");
        review = "cloudy protectors";
        test.recommends.add(recs4);
        test.reviewSummery.add(review);

        String[] recs5 = {"B005GLWG8W","1204013179"};
        test.products.add("B008A1U2M2");
        review = "very thin";
        test.recommends.add(recs5);
        test.reviewSummery.add(review);


        String[] recs6 = {"B008BL8FI4","B008BNA620","B008H7IFDC","B008P2O89E","B008P2TKYW"};
        test.products.add("B008BAU14Q");
        review = "fail receiving calls";
        test.recommends.add(recs6);
        test.reviewSummery.add(review);


        String[] recs7 = {"B008B9P8QS","0594033918","1384095802","5891044358","5891060345"};
        test.products.add("B008BA33Q4");
        review = "doesn't stay on phone secure";
        test.recommends.add(recs7);
        test.reviewSummery.add(review);


        String[] recs8 = {"B008BATJ6W"};
        test.products.add("B008BA33Q4");
        review = "doesn't fit Galaxy s3";
        test.recommends.add(recs8);
        test.reviewSummery.add(review);


        String[] recs9 = {"1204040982","1384095802","1610121155","3283005737","3993854373"};
        test.products.add("B008B9FUZC");
        review = "bad quality";
        test.recommends.add(recs9);
        test.reviewSummery.add(review);


        String[] recs10 = {"7030131746","9989379742","B00004U8JT","B00007FH1R","B0008GQQD6"};
        test.products.add("B008AM4E8O");
        review = "stops working, bad quality";
        test.recommends.add(recs10);
        test.reviewSummery.add(review);


        String[] recs11 = {"B00007FH7L","B0007T27BO","B0008GQQD6","B0009B0IX4"};
        test.products.add("B008AM4E8O");
        review = "weak connection";
        test.recommends.add(recs11);
        test.reviewSummery.add(review);


        String[] recs12 = {"B00004WIO7","B00006JPBU","B00020CU9C","B0000AKAGN","B00005A1OX","B00020CYVQ","B000BYPLVI"};
        test.products.add("B008ALV0V4");
        review = "does not stay , falls off";
        test.recommends.add(recs12);
        test.reviewSummery.add(review);


        String[] recs13 = {"B0000505WT","B000AADO6M","B000EWZBUI"};
        test.products.add("B008ALV0V4");
        review = " falls off";
        test.recommends.add(recs13);
        test.reviewSummery.add(review);

        String[] recs14 = {"1182702589","120401308X","543125894X","7222075410","753844274X"};
        test.products.add("B008ALUQ0A");
        review = "color fades";
        test.recommends.add(recs14);
        test.reviewSummery.add(review);


        String[] recs15 = {"B00004WIO7","B00006JPBU","B00020CU9C","B0000AKAGN","B00005A1OX","B00020CYVQ","B000BYPLVI"};
        test.products.add("B008ALV0V4");
        review = "does not stay , falls off";
        test.recommends.add(recs15);
        test.reviewSummery.add(review);

        String[] recs16 = {"B0051XPIUS", "B0051XPJR0", "B0051XPJR0" ,"B005ZG04Q4" };
        test.products.add("B008ALUNYY");
        review = "cutout for the charger slot in not large enough";
        test.recommends.add(recs16);
        test.reviewSummery.add(review);

        String[] recs17 = {"7030131746","9989379742","B00004U8JT","B00007FH1R","B0008GQQD6" };
        test.products.add("B008ALHEM8");
        review = "losts calls";
        test.recommends.add(recs17);
        test.reviewSummery.add(review);

      /*  String[] recs18 = { };
        test.products.add("B008ALAMFO");
        review = "unable to charge watch ";
        test.recommends.add(recs18);
        test.reviewSummery.add(review);
        */


        String[] recs19 = {"2912010594","9576865107", "B000ENI19A", "B000FIDKEU", "B000FIJJL8", "B000FIMUZU" };
        test.products.add("B008AK862G");
        review = "bad material , weak material ";
        test.recommends.add(recs19);
        test.reviewSummery.add(review);

        String[] recs20 = {"1059274930","1059359189", "1934790613", "956572776X", "956560207X", "9967212381", "9973227255" };
        test.products.add("B008AK7VJK");
        review = " bad quality ";
        test.recommends.add(recs20);
        test.reviewSummery.add(review);

        String[] recs21 = {"B00001W0E5","B000040OEL", "B00004WYQH", "B000055ZON", "B00006I9U2",   };
        test.products.add("B008AIZV1M");
        review = "bad sound quality ";
        test.recommends.add(recs21);
        test.reviewSummery.add(review);

        String[] recs22 = {"B0000633KX", "B0000WYPHM", "B000F51504", "B000ITKU4O", "B000KN3NE2", };
        test.products.add("B008AI8GXW");
        review = "battery does not work ";
        test.recommends.add(recs22);
        test.reviewSummery.add(review);

        test.makeJsonFile(test.products,test.recommends,test.reviewSummery);



    }


}