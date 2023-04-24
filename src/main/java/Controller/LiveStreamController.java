package Controller;

import model.LiveStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    private List<LiveStream> streams = new ArrayList<>();


    //GET http://localhost: 8080/streams
    @GetMapping
    public List<LiveStream> findAll(){
        return null;
    }
}
