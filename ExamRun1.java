
public class ExamRun1 {

   
    public static void main(String[] args) {
      
        ExamClass1 poll = new ExamClass1("Customer Satisfaction Survey");
        
        System.out.println("Exam Title" +poll.examTitle);
        
        
        for(int i =0; i<10; i++)
            
            
        System.out.println("User ID:"+ (poll.createID()-1));
        
    }
    
}
