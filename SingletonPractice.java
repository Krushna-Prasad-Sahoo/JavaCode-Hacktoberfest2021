public class SingletonPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal obj=Animal.getInstance();
        
        obj.showMessage();

    }
    
}



class Animal{

           //create object for the class
        private static Animal obj=new Animal();
        
        private Animal(){
        
        }
        public static Animal getInstance(){
            return obj;
        
        }
        
        public void showMessage(){
        
            System.out.println("lion");
        }



}
