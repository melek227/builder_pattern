// Builder arayüzünü kullanarak nesne örneklemesi yapar.
// UML diyagramındaki Director'a denk gelmektedir.
//Director:Builder arayüzünü kullanarak nesne örneklemesi yapar

public class LessonDirector {
    private LessonBuilder lessonBuilder;

    public LessonDirector(LessonBuilder lessonBuilder) {
        this.lessonBuilder = lessonBuilder;
    }

    public void make() {
        lessonBuilder.getLesson();
        lessonBuilder.applyDiscount();
        lessonBuilder.addLessonNote();
    }

}
