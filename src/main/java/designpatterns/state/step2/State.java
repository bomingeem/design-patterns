package designpatterns.state.step2;

public interface State {
    void addReview(String review, Student student);
    void addStudent(Student student);
}
