public class Human {
    private int yearOfBirth;
    public String name;
    private String town;
    public String jobTitle;

    Human(String name, String town, String jobTitle, int yearOfBirth) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "Информация не указана";
        }else {
            this.name = name;
        }
        if (town == null || town.isBlank() || town.isEmpty()) {
            this.town = "Информация не указана";
        }else {
            this.town = town;
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        }else{
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (jobTitle == null || jobTitle.isBlank() || jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        }else{
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isBlank() || town.isEmpty()) {
            this.town = "Информация не указана";
        }else {
            this.town = town;
        }
    }

    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s. Я из города %s. Я родился(-ась) в %d году. Я работаю на должности %s. Будем знакомы!", name, town, yearOfBirth, jobTitle);
    }
}
