package Task3;

import java.util.ArrayList;

public class Teacher extends Person {

    ArrayList<String> canTeach;
    ArrayList<String>  currentCourses;
    public Teacher(String name,ArrayList<String> canTeach) {
        super(name);
        this.canTeach=canTeach;
    }

    @Override

    public boolean addCourse(String course){

        for(String e:canTeach){
            if(e.equals(course)){
                return true;

            }

        }
        System.out.println(this.name+" dont know how to teach this");
        return false;
    }
}

