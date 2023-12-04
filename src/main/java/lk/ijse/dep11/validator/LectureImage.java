package lk.ijse.dep11.validator;

import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LectureImage {
    long maximumFileSize() default 500*1024;
    String message() default "Invalid image type ofr file size exceeds more than {maximumFileSize}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
