package lk.ijse.dep11.api;

import lk.ijse.dep11.to.LecturerRequestTO;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers")
@CrossOrigin
public class LecturerHttpController {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "multipart/form-data",produces = "application/json")
    public void createNewLecture(@ModelAttribute @Validated LecturerRequestTO lecturer){
        System.out.println(lecturer);
        System.out.println("createNewLecture");

    }

    @PatchMapping("/{lecturer-id}")
    public void updateLecturerDetails(){
        System.out.println("updateLecturerDetails");

    }
    @DeleteMapping("/{lecturer-id}")
    public void deleteLecturer(){
        System.out.println("deleteLecturer");
    }
//    @GetMapping
//    public void getAllPartTimeLecturer(){
//        System.out.println("getAllPartTimeLecturer");
//    }
//    @GetMapping
//    public void getAllFullTimeLecturer(){
//        System.out.println("getAllFullTimeLecturer");
//    }
}
