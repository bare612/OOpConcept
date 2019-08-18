package encapsulation;

public class Main {

    public static void main(String[] args) {

        Employee farah = new Employee();

        Employee naaso = new Employee("Naaso", 204, 25, 15000.00);

        Employee ronaldo = new Employee("ronaldo", 205, 26, 18000.00);

        farah.setName("farah");
        farah.setAge(23);
        farah.setId(04);
        farah.setSalary(29000);

        System.out.println(farah.getSalary());
    }

}
