import java.lang.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class EmployeeInfo {
    private StringBuilder name;
    private String code;
    private final Scanner scanner = new Scanner(System.in, "UTF-8");
    private String deptId;
    private final Pattern p = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");

    /**
     * constructor for employee
     */
    EmployeeInfo(){
        setName ();
        setDeptId ();
    }

    /**
     *
     * @return - returns the name of the employee
     */
    public StringBuilder getName(){
        return this.name;
    }

    /**
     *
     * @return - returns code of employee which would
     * be the first initial then last name ie:
     * Name = John Doe
     * Code = JDoe
     */
    public String getCode(){
        return this.code;
    }

    /**
     * function that calls all methods that involve
     * employee name and code. If the name is not in the
     * correct format, this method will assign the employee
     * code to guest
     */
    private void setName(){
        StringBuilder inputName = new StringBuilder(inputName());
        if (checkName(inputName)) {
            this.name = inputName;
            createEmployeeCode(inputName);
        } else {
            this.code = "guest";
        }
    }

    /**
     *
     * @param name - employee's name
     * checks if the name input by the user contains a space
     * between the first and last name, then inserts the
     * First name initial into that space and assigns the substring
     * of name from the new initial position to the end of name to
     * the code variable
     */
    private void createEmployeeCode(StringBuilder name){
        this.code = Character.toString(name.charAt(0));
        for(int i = 0; i < name.length(); i++){
            if(Character.isWhitespace(name.charAt ( i ))){
                i++;
                this.code += name.substring ( i, name.length());
            }
        }

    }

    /**
     *
     * @return - returns the next line for user input
     * prompts user for name entry
     */
    private String inputName(){
        System.out.print("Please enter your first and last name: ");
        return scanner.nextLine();
    }

    /**
     *
     * @param name - Employee name
     * @return - returns a boolean that return false if there is
     * no white space between first and last name, or returns
     * true if there is a white space
     */
    private boolean checkName(StringBuilder name){
        for(int i = 0; i < name.length(); i++){
            //System.out.println(i + " " + name.charAt(i));
            if(Character.isWhitespace(name.charAt( i ))){
                break;
            }else if(i == (name.length ()- 1)){
                return false;
            }
        }
        //System.out.println("break");
        return true;
    }

    /**
     *
     * @return - return the next line after prompt to
     * receive user input
     * method prompts user to input the Employee Department
     * ID
     */
    private String getDeptId(){
     System.out.print("Please enter the department ID: ");
     return scanner.nextLine ();
    }

    /**
     * Call methods to get the department ID from user
     * and checks if it is in the correct format. If it is
     * in the wrong format, this method will assign None01
     * to the Employee Department ID
     */
    private void setDeptId(){
        String id = getDeptId ();
        //System.out.println ( id );
        if (validId ( id )){
            this.deptId = id;
        }else{
            this.deptId = "None01";
        }
    }

    /**
     *
     * @return - returns Employee Department ID
     */
    private String getId(){
        return this.deptId;
    }

    /**
     *
     * @param id - employee id
     * @return - return true if id matches the pattern
     * declared in class field. Returns false it does not match
     */
    private boolean validId(String id){
        Matcher matcher = p.matcher(id);
        return matcher.matches();
    }

    /**
     *
     * @return - returns a string that list the Employee's code and
     * Department ID
     */
    public String toString(){
        return String.format("Employee Code : %s%nDepartment Number : %s%n", code, deptId);
    }

    /**
     *
     * @param id - Employee Department ID
     * @return - returns any string in reverse order using
     * recursion
     */
    private String reverseString(String id) {
        if(id.isEmpty()){
            return id;
        }else
        return reverseString(id.substring(1)+id.charAt(0));
    }
}




