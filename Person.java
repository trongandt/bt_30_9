public class QuanLyNhanSu {


    static class Person {
        String name;
        int birthYear;

        public Person(String name, int birthYear) {
            this.name = name;
            this.birthYear = birthYear;
        }

        public String getInfo() {
            return "Name: " + name + ", Birth Year: " + birthYear;
        }
    }


    static class GiangVien {
        String name;
        int birthYear;

        public GiangVien(String name, int birthYear) {
            this.name = name;
            this.birthYear = birthYear;
        }

        public String getInfo() {
            return "Name: " + name + ", Birth Year: " + birthYear ;
        }
    }


    static class SinhVien {
        String name;
        int birthYear;
        String id;

        public SinhVien(String name, int birthYear, String id) {
            this.name = name;
            this.birthYear = birthYear;
            this.id = id;
        }

        public String getInfo() {
            return "Name: " + name + ", Birth Year: " + birthYear + ", MSSV: " + id;
        }
    }
    public static void main(String[] args) {
        GiangVien gv = new GiangVien("Nguyễn Văn B", 2000);
        SinhVien sv = new SinhVien("Nguyễn Trọng An", 2005, "23020509");
        System.out.println(gv.getInfo());
        System.out.println(sv.getInfo());

    }
}
