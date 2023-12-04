package lk.ijse.dep11.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers/part-time")
@CrossOrigin
public class PartTimeLecturerHttpController {
    @PatchMapping("/rank")
    public void arrangePartTimeLecturer(){
        System.out.println("arrangePartTimeLecturer");
    }

    @GetMapping
    public void getAllPartTimeLecturer(){
        System.out.println("getAllPartTimeLecturer");
    }
}
