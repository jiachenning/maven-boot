package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Exception;

@RestController
public class OnlineInterviewController {

    @RequestMapping("/online_interview")
	public String onlineInterview() {
        String content;
        try {
		File file = new ClassPathResource("stations_unioned.json").getFile();
            content = new Scanner(file).useDelimiter("\\Z").next();
        } catch (Exception e) {
            e.printStackTrace();
            content = "empty file";
        }
        return content;
    }
}
