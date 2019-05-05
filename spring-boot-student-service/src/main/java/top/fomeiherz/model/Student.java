package top.fomeiherz.model;

public class Student {

    private String name;
    private String address;
    private String cls;

    public Student(String name, String address, String cls) {
        super();
        this.name = name;
        this.address = address;
        this.cls = cls;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCls() {
        return cls;
    }

}