package lap_5;

    class employee
    {
        private String name;
        private double salary;

        employee(){
            name = "abdullah";
            salary = 1000000;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double setPercentage() {
            this.salary += salary*0.1;
            return this.salary;
        }
}
