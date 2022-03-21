package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        DepartmentDao depDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department inset ===");
        Department dep = new Department(null, "Food");
        depDao.insert(dep);
        System.out.println("Insert! completed, new id: " + dep.getId());

        System.out.println("\n=== TEST 2: department delete ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        depDao.deleteById(id);
        System.out.println("Delete completed");



        sc.close();
    }
}
