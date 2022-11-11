package lap_5;
public class bank {




        private double Balance;
        private int counter = 4;


        void BankAccount() {
            Balance = 1000;
            Balance -= 500;
            Balance -= 400;
            System.out.println("Q_Three = " + Balance + "\n");
            counter--;
        }

        void BankAccount(int number){
            Balance = number;
            counter--;
        }

        public double addinterest(double Percentage){
            --counter;
            Balance += Balance * (Percentage/100);
            return (counter <= 0) ? Balance-- : Balance;

        }

        public void mystery(BankAccount that, double amount){
            this.Balance = this.Balance - amount;
            that.Balance = that.Balance + amount;
            System.out.println("this = " + this.Balance + " that = " + that.Balance);
        }

    public static class BankAccount {
        public void mystery(BankAccount q_four, int i) {
        }

        public boolean addinterest(int i) {


        }
    }
}
