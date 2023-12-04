package lk.ijse.dep11.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers")
@CrossOrigin
public class LecturerHttpController {

    @PostMapping
    public void createNewLecture(){

    }

    @PatchMapping("/{lecturer-id}")
    public void updateLecturerDetails(){
        System.out.println("updateLecturerDetails");

    }
    @DeleteMapping("/{lecturer-id}")
    public void deleteLecturer(){
        System.out.println("deleteLecturer");
    }
    @GetMapping
    public void getAllPartTimeLecturer(){
        System.out.println("getAllPartTimeLecturer");
    }
    @GetMapping
    public void getAllFullTimeLecturer(){
        System.out.println("getAllFullTimeLecturer");
    }
}
