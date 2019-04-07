/*Created by Eric Colbert-Carr*/
public class ExamClass1 {
    
    int userID;
    String examTitle;
    
    
    int createID(){
        
    userID++;
    return userID;    
        
    }
    
    ExamClass1(){
        
    this("Customer Exam");
        
    }
    ExamClass1(String titleofExam){
        
    userID=0;
    examTitle= titleofExam;
    }
    
    
}
