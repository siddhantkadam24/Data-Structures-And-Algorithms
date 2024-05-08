package leetcode;

public class countStepsToZero {
    int steps = 0;
    public int numberOfSteps(int num) {
        
        if(num%2==0 && num!=0)
        {
            steps++;
            return numberOfSteps(num/2);
        }
        else if(num%2==1)
        {
            steps++;
            return numberOfSteps(num-1);
        }
        
        return steps;
    }
}
