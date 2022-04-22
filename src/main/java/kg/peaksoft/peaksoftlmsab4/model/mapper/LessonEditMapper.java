package kg.peaksoft.peaksoftlmsab4.model.mapper;

import kg.peaksoft.peaksoftlmsab4.api.payload.LessonRequest;
import kg.peaksoft.peaksoftlmsab4.model.entity.LessonEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class LessonEditMapper {

    public LessonEntity convertToLesson(LessonRequest lessonRequest) {
        if (lessonRequest == null) {
            return null;
        }
        LessonEntity lesson = new LessonEntity();
        lesson.setLessonName(lessonRequest.getLessonName());
        return lesson;
    }

    public void updateLesson(LessonEntity lessonEntity, LessonRequest lessonRequest) {
        lessonEntity.setLessonName(lessonRequest.getLessonName());
    }
}
