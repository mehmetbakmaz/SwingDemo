
public class officeWorkers {
    private int idOfficeWorkers;
    private String name;
    private String officeCode;
    private int workHours;
    private String insurance;

    public officeWorkers(int idOfficeWorkers, String name, String officeCode, int workHours, String insurance) {
        this.idOfficeWorkers = idOfficeWorkers;
        this.name = name;
        this.officeCode = officeCode;
        this.workHours = workHours;
        this.insurance = insurance;
    }

    public int getIdOfficeWorkers() {
        return idOfficeWorkers;
    }

    public void setIdOfficeWorkers(int idOfficeWorkers) {
        this.idOfficeWorkers = idOfficeWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }
                            
    
}
