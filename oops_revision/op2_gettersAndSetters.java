package oops_revision;

public class op2_gettersAndSetters {
    // GETTERS is used to return the value
    // SETTERS is used to modify the value
    // 'THIS' keyword is used to refer to the current object
    public static void main(String[] args) {
        // this is object of the pen.
        pen pp = new pen();
        pp.setColor("yellow");
        System.out.println(pp.getColor());
        pp.setTip(3);
        System.out.println(pp.getTip());
        pp.setColor("red");
        System.out.println(pp.getColor());

    }

}

/// this is calss of the pen
class pen {
    // property of pen
    private String color;
    private int tip;

    // function of pen
    // this is getter
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // this is setter
    void setColor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newtip) {
        tip = newtip;
    }
}
