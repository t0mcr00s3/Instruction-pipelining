package processor;

import java.util.ArrayList;
import java.util.List;

import operations.Operation;

public class Processor {
    private List<Operation> operation = new ArrayList<>();
    
    public Processor(Operation ... operation){
        for(Operation oper: operation){
            this.operation.add(oper);
        }
    }
    
    public void run(){
        for(Operation oper: this.operation){
            oper.start();
        } 
    }

    public Operation getOperation(int index){
        return this.operation.get(index);
    }   
}