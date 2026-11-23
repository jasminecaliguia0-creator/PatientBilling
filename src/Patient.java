
public class Patient {
    private String name;
    private String diagnosis;
    private String admitDate;
    private double roomRate;
    private double doctorFee;
    private double pharmacyFee;

    public Patient(String name, String diagnosis, String admitDate,
                   double roomRate, double doctorFee, double pharmacyFee) {

        this.name = name;
        this.diagnosis = diagnosis;
        this.admitDate = admitDate;
        this.roomRate = roomRate;
        this.doctorFee = doctorFee;
        this.pharmacyFee = pharmacyFee;
    }

    public String getName() {
        return name;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public double getRoomRate() {
        return roomRate;
    }

    public double getDoctorFee() {
        return doctorFee;
    }

    public double getPharmacyFee() {
        return pharmacyFee;
    }
}  

