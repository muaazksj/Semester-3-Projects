package Muaaz;

class University {
    String name = "ABC University";
    int ranking = 15;
}

class Faculty extends University {
    String name = "Faculty of Science";

    void Details() {
        System.out.println("Faculty name: " + name);
    }
}

class Department extends Faculty {
    String name = "Computer Science";
    String chairman = "Dr. Sharma";

    void Details() {
        System.out.println("Department name: " + name);
        System.out.println("Chairman: " + chairman);
    }

    void Display() {
        super.Details();
        Details();
    }
}

public class Week10_6_UniversityFacultyDynamic {
    public static void main(String[] args) {
        Department department = new Department();

        department.Display();
        System.out.println("University ranking: " + department.ranking);

        Faculty faculty = new Department();

        System.out.println("Details() called through a Faculty reference:");
        faculty.Details();
    }
}
