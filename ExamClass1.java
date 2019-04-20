
import javax.swing.JOptionPane;

/*Created by Eric Colbert-Carr*/
public class ExamClass1 {
    
    int userID;
    String examTitle;
    int surveyDiagram[][] = new int[10][10];
    String sArray[] = new String[10];
    
    
    int createID(){
        
    userID++;
    return userID;    
        
    }
    //answer the question
    void enterS(int sID){
    
    sArray[sID] = JOptionPane.showInputDialog("Please enter question:("+sID+")");
    }
    //processing the display
    void sDisplay(int sID){
    System.out.println("Question("+sID+") : " + sArray[sID]); 
    }
    
    
    
    //display the question
    void uRes(int sID, int uID, int res){
    surveyDiagram[sID][uID] = res; 
    }
    
    void surveyOutcome(int nI, int nU){
    
    for (int sID =0; sID < nI; sID++){
    for (int uID =0; uID < nU; uID++){
    System.out.print(surveyDiagram[sID][uID] +"      ");
    
    }
    System.out.println();
    
    }
        
        
    }
    
    
    ExamClass1(){
        
    this("Customer Exam");
        
    }
    ExamClass1(String titleofExam){
        
    userID=0;
    examTitle= titleofExam;
    }
    
    
}
