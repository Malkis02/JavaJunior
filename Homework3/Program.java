package Homeworks.Homework3;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
* Разработайте класс Student с полями String name, int age, transient double GPA (средний балл).
* Обеспечьте поддержку сериализации для этого класса.
* Создайте объект класса Student и инициализируйте его данными.
* Сериализуйте этот объект в файл.
* Десериализуйте объект обратно в программу из файла.
* Выведите все поля объекта, включая GPA, и ответьте на вопрос,
* почему значение GPA не было сохранено/восстановлено.

* 2. * Выполнить задачу 1 используя другие типы сериализаторов (в xml и json документы).
 */
class Program {
    public static void main(String[] args) {
        List<Student> students;
        File f = new File(SerializationUtil.FILE_JSON);
        if (f.exists() && !f.isDirectory()) {
            students = SerializationUtil.loadStudentsListFromFile(SerializationUtil.FILE_JSON);
        } else {
            students = prepareList();
            SerializationUtil.saveStudentsListToFile(SerializationUtil.FILE_JSON, students);
            SerializationUtil.saveStudentsListToFile(SerializationUtil.FILE_BIN, students);
            SerializationUtil.saveStudentsListToFile(SerializationUtil.FILE_XML, students);
        }

        SerializationUtil.printStudents(students);
    }

    static List<Student> prepareList() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Albert", 45, 4.7));
        list.add(new Student("Jane", 33, 4.1));
        return list;
    }
}