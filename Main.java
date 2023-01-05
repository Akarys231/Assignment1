public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("87896541212","Xiaomi",0.28);
        Phone phone2 = new Phone("87779877889","Huawei",0.26);
        Phone phone3 = new Phone("87777777777","Iphone",0.25);
        System.out.println(phone1.getNumber() + " " + phone1.getModel() + " " + phone1.getWeight());
        System.out.println(phone2.getNumber() + " " + phone2.getModel() + " " + phone2.getWeight());
        System.out.println(phone3.getNumber() + " " + phone3.getModel() + " " + phone3.getWeight());
        phone1.receiveCall("Daniyar", "87794561010");
        phone1.sendMessage("87794561010");
        phone1.sendMessage("89562314774");
        Person person1 = new Person();
        Person person2 = new Person("Olzhas",17);
        System.out.println(person1.getFullName() +" "+ person1.getAge());
        System.out.println(person2.getFullName() +" "+ person2.getAge());
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix(3,4);
        matrix1.add(matrix2.getNumbers());
        matrix2.multiply(8);
        matrix2.printout();
        LibReaders reader1 = new LibReaders("N.N. Daniyal", 1, "SE", "02.01.2003", "87798796545");
        LibReaders reader2 = new LibReaders("B.B. Beibarys", 2, "BD", "02.01.2004", "87874596585");
        reader1.takeBook("Author1", "Book 1");
        reader1.takeBook("Author2", "Book 2");
        reader2.takeBook("Author3", "Book 3");
        reader1.returnBook("Author1", "Book 1");
    }
}