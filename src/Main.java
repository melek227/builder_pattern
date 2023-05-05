// Farklı yapıdaki nesnelerin oluşturulmasında istemci sadece nesne tipini belirtir
//İstemcinin kulllanmak istediği gerçek ürünün birden fazla sunumu vardır
//birden fazla parçadan oluşan komplex yapıdaki nesne oluşturulur
//nesnenin oluşturulma safhaları istemci modulunden gizlenir
//nesnenin yaratılmasıyla ilgili işlemler farklı versiyonlarda değiştirilebilir

// online bir eğitim platformunun ilk defa eğitim alacak olan öğrencilere ilk eğitimini yarı fiyatına verdiği düşünülsün.
public class Main {
    public static void main(String[] args) {

        LessonBuilder lessonBuilder = new NewStudentLessonBuilder();

        LessonDirector lessonDirector = new LessonDirector(lessonBuilder);
        lessonDirector.make();

        Lesson lesson = lessonBuilder.getResult();

        String result = String.format("%s %f %f", lesson.name, lesson.price, lesson.discountedPrice);
        System.out.println(result);
        // output: Artificial Intelligence -  Beginner to Advanced in 10 Minute. 49,990000 24,995000

        }
    }
