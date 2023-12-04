package lk.ijse.dep11.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers/full-time")
@CrossOrigin
public class FullTimeLecturerHttpController {
    @PatchMapping("/rank")
    public void arrangeFullTimeLecturer(){
        System.out.println("arrangeFullTimeLecturer");
    }

    @GetMapping
    public void getAllFullTimeLecturer(){
        System.out.println("getAllFullTimeLecturer");
    }
}
