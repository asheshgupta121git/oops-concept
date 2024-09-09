package oops_revision;

public class op1 {
    //classes in capital and functions in samll leters 
    public static void main(String[] args) {
        // pen p1 = new pen();//created an object p1 with the help of constructor
        // p1.setColor("blue");
        // System.out.println(p1.getColor());
        // p1.setTip(4);
        // System.out.println(p1.getTip());
        // p1.setColor("yellow");
        // System.out.println(p1.getColor());

        //class bank
        // bank myAcc = new bank();
        // myAcc.user = "ashesh gupta";
        // myAcc.setPass("dasaf");

    

    }
}




class bank{
    public String user;
    private String pass;
    //function 
    public void setPass(String pwd){
        pass = pwd;
    }
}

class pen{
    //propreties of pen 
     private String color;
     private int tip;

    //functions of pen
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){ // this is setter
        color= newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

