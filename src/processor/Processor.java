package processor;

import java.util.ArrayList;
import java.util.List;

import operations.Operation;
import operations.Sum;

public class Processor {
    private List<Operation> operation = new ArrayList<Operation>();
    
    public Processor(Operation ... operation){
        for(Operation oper: operation){
            this.operation.add(oper);
        }
    }
    
    public Processor(Sum sum, int b) {
    }

    public void run(){
        for(Operation oper: this.operation){
            oper.Calculate();
        } 
    }

    public Operation getOperation(int index){
        return this.operation.get(index);
    }   
}