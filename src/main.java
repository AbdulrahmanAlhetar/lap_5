
    package lap_5;
    public class Main
    {
        public static void main(String[] args) {
            bank.BankAccount Q_Three = new bank.BankAccount();
           
            bank.BankAccount Q_Four = new bank.BankAccount();
            System.out.println("Q_Four = " + Q_Four.addinterest(50));
           
            bank.BankAccount Q_Five = new bank.BankAccount();
            Q_Five.mystery(Q_Four, 50);
           
            bank.BankAccount Q_Eight = new bank.BankAccount();
            Q_Eight.addinterest(10);
            Q_Eight.addinterest(10);
            System.out.println(Q_Eight.addinterest(10));
            System.out.println(Q_Eight.addinterest(10));
           
            casher.CashRegister Q_Nine = new casher.CashRegister();
            Q_Nine.printReceipt();
           
            Empolyee.Employee Q_Ten = new Employee();
            System.out.println(Q_Ten.setPercentage());
          
        }

        private static class Employee {
        }
    }
