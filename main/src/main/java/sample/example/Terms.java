package sample.example;

public class Terms extends ExampleSupport {
    
    public String execute(){

        return SUCCESS;

    }
    
    private String term = "This is the terms and conditions.";

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
    
}
