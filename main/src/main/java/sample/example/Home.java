package sample.example;

public class Home extends ExampleSupport{

    public String execute(){

        String[] sentences = {
            "This is sample sentence 1.",
            "This is sample sentence 2.",
            "This is sample sentence 3.",
            "This is sample sentence 4.",
            "This is sample sentence 5."
        };
        int randomNum = (int) (Math.random() * 5 + 0);
        setSentence(sentences[randomNum]);

        // setName("below. ");
        // setIntroductionMessage(introduction());

        // if(username.equals("regular")){
        //     return "regular";
        // }else if(username.equals("admin")){
        //     return "admin";
        // }else if(username.equals("security")){
        //     return "security";
        // }else

        return SUCCESS;
        }

    private String home= "This is the home page.";
    // private String name;
    // private String introductionMessage;
    // private String username="";
    // private String password="";
    private String sentence;


    // public String introduction(){
    //     return "Please do sign in " + this.name;

    
    public String getHome() {
        return home;
    }
    // public String getPassword() {
    //     return password;
    // }
    public String getSentence() {
        return sentence;
    }
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
    // }
    // public void setPassword(String password) {
    //     this.password = password;
    // }
    // public String getUsername() {
    //     return username;
    // }
    // public void setUsername(String username) {
    //     this.username = username;
    // }
    public void setHome(String home) {
        this.home = home;
    }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    }
    // public String getIntroductionMessage() {
    //     return introductionMessage;
    // }
    // public void setIntroductionMessage(String introductionMessage) {
    //     this.introductionMessage = introductionMessage;
    


