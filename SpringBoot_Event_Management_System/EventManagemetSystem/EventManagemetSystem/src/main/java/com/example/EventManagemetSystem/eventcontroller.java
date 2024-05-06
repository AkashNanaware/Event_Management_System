package com.example.EventManagemetSystem;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/eventdetails")
public class eventcontroller {
    eventservice es;

    public eventcontroller(eventservice es) {
        this.es = es;
    }
    @GetMapping("{eventid}")
    public String geteventdetails(@PathVariable ("eventid") String eventid){
        return es.geteventdetails(eventid);
    }
    @PostMapping
    public String createeventdetails(@RequestBody eventdetails event){
        return es.createevent(event);
    }
    @PutMapping
    public String updateeventdetails(@RequestBody eventdetails event){
        return es.updateevent(event);
    }
    @DeleteMapping("{eventid}")
    public String deleteeventdetails(@PathVariable ("eventid") String eventid){
        return es.deleteevent(eventid);
    }
    @GetMapping
    public List<eventdetails> getalleventdetais(){
        return es.getalleventdetails();
    }
}
