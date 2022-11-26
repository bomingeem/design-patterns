package designpatterns.state.step2;

/**
 * State
 */
public interface State {
    void addReview(String review, Student student);
    void addStudent(Student student);
}
