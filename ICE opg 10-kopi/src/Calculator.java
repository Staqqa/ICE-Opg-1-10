public class Calculator {
    int result = 0;

    public Calculator (int result){
    this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void add(double x){
        this.result += x;

        }

        public void subtract (double x){
        this.result -= x;

    }
    public void clear (){
        this.result = 0;
    }
    public void add(double[] numbers) {
        for (double number : numbers) {
            this.result += number;
        }
    }

}

