class Main 
{ 
    public static void main(String args[]) 
    { 
        // Create objects for testing 
        AverageScoreDisplay averageScoreDisplay = 
                                       new AverageScoreDisplay(); 
        CurrentScoreDisplay currentScoreDisplay = 
                                       new CurrentScoreDisplay(); 
  
        // Pass the displays to Cricket data 
        CricketData cricketData = new CricketData(currentScoreDisplay, 
                                                  averageScoreDisplay); 
  
        // In real app you would have some logic to call this 
        // function when data changes 
        cricketData.dataChanged(); 
    } 
} 



class AverageScoreDisplay 
{ 
    private float runRate; 
    private int predictedScore; 
  
    public void update(int runs, int wickets, float overs) 
    { 
        this.runRate = (float)runs/overs; 
        this.predictedScore = (int) (this.runRate * 50); 
        display(); 
    } 
  
    public void display() 
    { 
        System.out.println("\nAverage Score Display:\n" + 
                           "Run Rate: " + runRate + 
                           "\nPredictedScore: " + predictedScore); 
    } 
} 



class CricketData 
{ 
    int runs, wickets; 
    float overs; 
    CurrentScoreDisplay currentScoreDisplay; 
    AverageScoreDisplay averageScoreDisplay; 
  
    // Constructor 
    public CricketData(CurrentScoreDisplay currentScoreDisplay, 
                       AverageScoreDisplay averageScoreDisplay) 
    { 
        this.currentScoreDisplay = currentScoreDisplay; 
        this.averageScoreDisplay = averageScoreDisplay; 
    } 
  
    // Get latest runs from stadium 
    private int getLatestRuns() 
    { 
        // return 90 for simplicity 
        return 90; 
    } 
  
    // Get latest wickets from stadium 
    private int getLatestWickets() 
    { 
        // return 2 for simplicity 
        return 2; 
    } 
  
    // Get latest overs from stadium 
    private float getLatestOvers() 
    { 
        // return 10.2 for simplicity 
        return (float)10.2; 
    } 
   public void dataChanged() 
    { 
        // get latest data 
        runs = getLatestRuns(); 
        wickets = getLatestWickets(); 
        overs = getLatestOvers(); 
  
        currentScoreDisplay.update(runs,wickets,overs); 
        averageScoreDisplay.update(runs,wickets,overs); 
    } 
} 



class CurrentScoreDisplay 
{ 
    private int runs, wickets; 
    private float overs; 
  
    public void update(int runs,int wickets,float overs) 
    { 
        this.runs = runs; 
        this.wickets = wickets; 
        this.overs = overs; 
        display(); 
    } 
  
    public void display() 
    { 
        System.out.println("\nCurrent Score Display: \n" + 
                           "Runs: " + runs +"\nWickets:"
                           + wickets + "\nOvers: " + overs ); 
    } 
} 
  
// Driver class 
