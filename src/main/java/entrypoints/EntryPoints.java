package entrypoints;

import com.application.dto.DepartmentDTO;
import com.application.dto.EmployeeDTO;
import com.application.dto.ManagerDTO;
import com.application.servicies.DepartmentService;
import com.application.servicies.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EntryPoints {


    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    public void fetchAllDepartment() {
        List<DepartmentDTO> departmentDTOList = departmentService.displayAllDepartmentDTO();
        for (DepartmentDTO department : departmentDTOList) {
            System.out.println(department);
        }
    }

    public void fetchAllEmployee() {
        List<EmployeeDTO> employeeDTOList = employeeService.displayAllEmployee();
        for (EmployeeDTO employee : employeeDTOList) {
            System.out.println(employee);
        }
    }


}
