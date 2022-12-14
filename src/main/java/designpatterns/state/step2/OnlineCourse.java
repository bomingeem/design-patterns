package designpatterns.state.step2;

import java.util.ArrayList;
import java.util.List;

/**
 * Context
 */
public class OnlineCourse {
    private State state = new Draft(this);
    private List<Student> students = new ArrayList<>();
    private List<String> reviews = new ArrayList<>();

    public void addStudent(Student student) {
        this.state.addStudent(student);
    }

    public void addReview(String review, Student student) {
        this.state.addReview(review, student);
    }

    public State getState() {
        return state;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void changeState(State state) {
        this.state = state;
    }
}
