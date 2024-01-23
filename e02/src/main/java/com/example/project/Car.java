package project;

class Car {

    //parameters
    private String make;
    private String model;
    private int year;
    private int speed;
    private boolean isRunning;

    //constructor
    public Car() {
    }

    public Car(final String brand, String mod, int age) {
        this.make = brand;
        this.model = mod;
        this.year = age;
    }

    //methods
    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public int getSpeed() {
        return this.speed;
    }
    public boolean getisRunning() {
        return this.isRunning;
    }
    public boolean isRunning() {
        return this.isRunning;
    }

    public void setMake(final String m) {
        if (m != null && !m.isEmpty()) {
            this.make = m;
        } else {
            throw new IllegalArgumentException("Invalid input for year. Please provide a valid year value.");
        }
    }

    public void setModel(final String mode) {
        if (mode != null && !mode.isEmpty()) {
            this.model = mode;
        } else {
            throw new IllegalArgumentException("Invalid input for year. Please provide a valid year value.");
        }
    }

    public void setYear(int years) {
        if (years >= 1900 && years <= 2024) {
            this.year = years;
        } else {
            throw new IllegalArgumentException("Invalid input for year. Please provide a valid year value.");
        }
    }

    public void startEngine() {
        if(!isRunning) {
        this.isRunning = true;
        }
    }
    public void stopEngine() {
        if(isRunning) {
            this.isRunning = false;
        }
    }
    public void accelerate() {
        this.speed += 10;
    }
    public void brake() {
        if (speed>0) {
        this.speed -= 10;
        }
        else {
            System.out.println("The car is not moving");
        }
    }
}
