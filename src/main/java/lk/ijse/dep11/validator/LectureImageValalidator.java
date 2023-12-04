package lk.ijse.dep11.validator;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LectureImageValalidator implements ConstraintValidator<LectureImage, MultipartFile> {
    long maximumFileSize;
    @Override
    public void initialize(LectureImage constraintAnnotation) {
        maximumFileSize= constraintAnnotation.maximumFileSize();
    }

    @Override
    public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext constraintValidatorContext) {
       if(!multipartFile.isEmpty()) return false;
       if(multipartFile.getSize()>maximumFileSize) return  false;
       return true;


    }
}
