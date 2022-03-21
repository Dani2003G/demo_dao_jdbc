package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
        
        DepartmentDao depDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department inset ===");
        Department dep = new Department(null, "Food");
        depDao.insert(dep);
        System.out.println("Insert! completed, new id: " + dep.getId());

    }
}