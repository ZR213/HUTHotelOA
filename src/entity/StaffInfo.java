package entity;

/**
 * 员工信息表
 */
public class StaffInfo {
    private int staff_id;
    private String staff_name;
    private String staff_num;//员工身份证号
    private String staff_sex;
    private String dept_name;
    private String staff_job;
    private double staff_salary;
    private String entry_time;
    private String fire_time;
    private String staff_status;
    private String staff_tel;
    private int staff_age;

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStaff_num() {
        return staff_num;
    }

    public void setStaff_num(String staff_num) {
        this.staff_num = staff_num;
    }

    public String getStaff_sex() {
        return staff_sex;
    }

    public void setStaff_sex(String staff_sex) {
        this.staff_sex = staff_sex;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String depr_name) {
        this.dept_name = depr_name;
    }

    public String getStaff_job() {
        return staff_job;
    }

    public void setStaff_job(String staff_job) {
        this.staff_job = staff_job;
    }

    public double getStaff_salary() {
        return staff_salary;
    }

    public void setStaff_salary(double staff_salary) {
        this.staff_salary = staff_salary;
    }

    public String getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(String entry_time) {
        this.entry_time = entry_time;
    }

    public String getFire_time() {
        return fire_time;
    }

    public void setFire_time(String fire_time) {
        this.fire_time = fire_time;
    }

    public String getStaff_status() {
        return staff_status;
    }

    public void setStaff_status(String staff_status) {
        this.staff_status = staff_status;
    }

    public String getStaff_tel() {
        return staff_tel;
    }

    public void setStaff_tel(String staff_tel) {
        this.staff_tel = staff_tel;
    }

    public int getStaff_age() {
        return staff_age;
    }

    public void setStaff_age(int staff_age) {
        this.staff_age = staff_age;
    }

    @Override
    public String toString() {
        return "StaffInfo{" +
                "staff_id=" + staff_id +
                ", staff_name='" + staff_name + '\'' +
                ", staff_num='" + staff_num + '\'' +
                ", staff_sex='" + staff_sex + '\'' +
                ", dept_name='" + dept_name + '\'' +
                ", staff_job='" + staff_job + '\'' +
                ", staff_salary=" + staff_salary +
                ", entry_time='" + entry_time + '\'' +
                ", fire_time='" + fire_time + '\'' +
                ", staff_status='" + staff_status + '\'' +
                ", staff_tel='" + staff_tel + '\'' +
                ", staff_age=" + staff_age +
                '}';
    }
}
