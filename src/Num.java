public class Num {

    int num1;
    int num2;
    int result;

    public Num(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int plus() {
        result = num1 + num2;
        return result;
    }

    public int minus() {
        result = num1 - num2;
        return result;
    }

    public int times() {
        result = num1*num2;
        return result;
    }

    public int div() {
        result = num1/num2;
        return result;
    }

    public int getResult() {
        return result;
    }
}