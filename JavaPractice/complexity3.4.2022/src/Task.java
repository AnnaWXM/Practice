public class Task implements Priority,Complexity{
    int complexity=0;
    int priority=0;

    public void setPriority(String pri){
        if(pri.toLowerCase().equals("immediate")) priority=1;
        else 
        {if(pri.toLowerCase().equals("urgent")) priority=2;
        else 
        {if(pri.toLowerCase().equals("high")) priority=3;
        else priority=4;}}
    }

    public int getPriority(){
        return priority;
    }

    public void setComplexity(int level){
        complexity = level;
    }

    public int getComplexity(){
        return complexity;
    }
}
