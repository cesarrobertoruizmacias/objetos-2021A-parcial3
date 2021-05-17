package examen;

import uaslp.objetos.exams.Group;
import uaslp.objetos.exams.GroupIsFullException;
import uaslp.objetos.exams.Student;

import java.util.List;

public class School {

    private int size= 0 ;

    public void add() throws GroupIsFullException {
        int x = 3;
        Group group = new Group(3);
        if(size < x){
        group.addStudent(new Student("nombre",12346 ));
        }
        else {
            throw new GroupIsFullException();
        }
    }



}
