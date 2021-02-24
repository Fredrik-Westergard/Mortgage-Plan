package ax.ha.it.mortgage;

public class Money {
    int euro;
    int cent;

    public Money(double money) {
        this.euro = (int) money;

        double temp = (money-euro)*100;
        int temp2 = (int) temp;
        int temp3 = (int) ((temp-temp2)*10);

        if(temp3 >= 5){
            temp2 += 1;
        }
        this.cent = temp2;
    }

    public int getEuro() {
        return euro;
    }

    public int getCent() {
        return cent;
    }

    public double getMoney(){
        return euro+((double)cent/100);
    }

    @Override
    public String toString() {
        return euro + "." + cent;
    }
}
