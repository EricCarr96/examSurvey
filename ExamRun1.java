
import javax.swing.JOptionPane;


public class ExamRun1 {

   
    public static void main(String[] args) {
        
        int sID, uID = 0;
        int nI, nU;
        int res;
        nI= Integer.parseInt( JOptionPane.showInputDialog("How many questions do you have for the survey?"));
        nU= Integer.parseInt( JOptionPane.showInputDialog("How many users do you have for the survey?"));
        ExamClass1 poll = new ExamClass1("Customer Satisfaction Survey");
        for (sID= 0; sID < nI; sID++){
        poll.enterS(sID);
        }
        for(int s = 0; s < nU; s++){
        sID = poll.createID()-1;
        System.out.println("User"+sID);
        for(sID=0; sID < nI; sID++){
            
            
        poll.sDisplay(sID);
        res = Integer.parseInt(JOptionPane.showInputDialog("Please provide an answer (1-5)"));
        poll.uRes(sID, uID, res);
        
        }
        
        }
      
     
        
        System.out.println("Exam Title" +poll.examTitle);
        poll.surveyOutcome(nI, nU);
        
       
        
    }
    
}
