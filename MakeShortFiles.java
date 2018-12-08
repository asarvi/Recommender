import java.io.*;

public class MakeShortFiles {
    public void shortCopyFileMaker(String fileName) throws IOException {
        InputStream inputFile = this.getClass().getResourceAsStream(fileName);
        BufferedReader readFile = new BufferedReader(new InputStreamReader(inputFile));

        PrintWriter shortCopyFile = null;
        shortCopyFile = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/ati/IdeaProjects/Recommender/src/" + "shortCopy" + fileName)));
        String file_line = "";
        int lineCounter = 0;
        while ((file_line = readFile.readLine()) != null && lineCounter < 50000) {

            lineCounter++;

            shortCopyFile.println(file_line);



        }
        shortCopyFile.close();
    }
    public void reviewDivider(String fileName) throws IOException {
        InputStream inputFile = this.getClass().getResourceAsStream(fileName);
        BufferedReader readFile = new BufferedReader(new InputStreamReader(inputFile));

        PrintWriter shortCopyFile = null;
        shortCopyFile = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/ati/IdeaProjects/Recommender/src/" + "shortCopy1" + fileName)));

        PrintWriter shortCopyFile2 = null;
        shortCopyFile2 = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/ati/IdeaProjects/Recommender/src/" + "shortCopy2" + fileName)));

        PrintWriter shortCopyFile3 = null;
        shortCopyFile3 = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/ati/IdeaProjects/Recommender/src/" + "shortCopy3" + fileName)));

        PrintWriter shortCopyFile4 = null;
        shortCopyFile4 = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/ati/IdeaProjects/Recommender/src/" + "shortCopy4" + fileName)));

        String file_line = "";
        int lineCounter = 0;
        int lineCounter2=0;
        int lineCounter3=0;
        int lineCounter4=0;
        while ((file_line = readFile.readLine()) != null ) {
            if(lineCounter < 861812){

            lineCounter++;

            shortCopyFile.println(file_line);}
            else  if(lineCounter2 <861812 ){

                lineCounter2++;
                shortCopyFile2.println(file_line);
            }
            else  if(lineCounter3 <861812 ){

                lineCounter3++;
                shortCopyFile3.println(file_line);
            }
            else if(lineCounter4< 861812){
                lineCounter4++;
                shortCopyFile4.println(file_line);
            }


        }

        shortCopyFile.close();
        shortCopyFile2.close();
        shortCopyFile3.close();
        shortCopyFile4.close();

      int x = lineCounter3;
      //int x =lineCounter+lineCounter2+lineCounter3+lineCounter4;
        System.out.println( x);
    }
    public static void main(String [] args) throws IOException {
        MakeShortFiles m = new MakeShortFiles();
     m.shortCopyFileMaker("meta.strict");
     m.shortCopyFileMaker("reviewData.strict");
     m.reviewDivider("reviewData.strict");
    }
}