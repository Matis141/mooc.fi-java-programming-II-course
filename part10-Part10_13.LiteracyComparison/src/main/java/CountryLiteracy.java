
public class CountryLiteracy implements Comparable<CountryLiteracy> {
    
    private String gender;
    private String country;
    private String year;
    private double literacyPercent;

    public CountryLiteracy(String gender, String country, String year, double literacyPercent) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getYear() {
        return year;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + ")," + this.gender + ", " + this.literacyPercent;
    }

    
    
    @Override
    public int compareTo(CountryLiteracy countryLiteracy) {
        //return (int) (this.literacyPercent - countryLiteracy.getLiteracyPercent());
        if (this.literacyPercent > countryLiteracy.getLiteracyPercent()) {
            return 1;
        } else if (this.literacyPercent < countryLiteracy.getLiteracyPercent()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    
    
}
