public class Student {
    private String name;
    private int id;
    private char gender;
    private String department;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public char getGender() {
        return gender;
    }
    public String getDepartment() {
        return department;
    }

    public boolean setName(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch == ' ')) {
                return false;
            }
        }
        this.name = name.trim(); // Store the name after trimming any leading or trailing spaces
        return true;
    }

    public boolean setId(int id) {
        if (id >= 100000000 && id <= 999999999) {
            this.id = id;
            return true;
        }
        return false;
    }
    public boolean setGender(char gender) {
        if (gender == 'M' || gender == 'F' || gender == 'm' || gender == 'f') {
            this.gender = gender;
            return true;
        }
        return false;
    }
    public boolean setDepartment(String department) {
        String[] validDepartments = {"BCA", "BBA", "CE", "CSE", "ECE", "EEE", "ECS", "ME", "PE", "MCA"};
        for (String dept : validDepartments) {
            if (department.equalsIgnoreCase(dept)) {
                this.department = dept; // Set department in uppercase as in the valid list
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String s = "".format("ID: %d\nName: %s\nGender: %c\nDepartment: %s", this.getId(), this.getName(), this.getGender(), this.getDepartment());
        return s;
    }
}
