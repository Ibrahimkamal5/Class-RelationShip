public class Student {
    private int numbere;
    private String name;

    public Student(){
      numbere = 1;
      name = "Unknown";
    }
    public Student(int numbere , String name){
      setNumbere(numbere);
      setName(name);
    }

    public int getNumbere() {
        return numbere;
    }

    public void setNumbere(int numbere) {
        if (numbere >=1 && numbere<=100){
            this.numbere = numbere;
        }else {
            this.numbere = 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
