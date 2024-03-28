package Arithmetic;

public class Arithmetic {

    private final Number num1;
    private final Number num2;


    Arithmetic(Number num1, Number num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public Number substract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public Number multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public Number divide() throws RuntimeException {
        if(num2.doubleValue() == 0)
        {
            throw new RuntimeException("Cannot divide. Number 2 is 0.");
        }
        return num1.doubleValue() / num2.doubleValue();

    }
    public Number getMin() {
        return Math.min(num1.doubleValue() , num2.doubleValue());
    }

    public Number getMax() {
        return Math.max(num1.doubleValue() , num2.doubleValue());
    }



}