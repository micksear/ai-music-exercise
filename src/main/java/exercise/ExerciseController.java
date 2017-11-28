package exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {

    private ExampleApiService exampleApiService;

    @Autowired
    public ExerciseController(ExampleApiService exampleApiService) {
        this.exampleApiService = exampleApiService;
    }

    @RequestMapping("/simple")
    ForumPosts posts() {
        return exampleApiService.getPosts();
    }

    @RequestMapping("/transformed")
    TransformedForumPosts transformed() {
        return exampleApiService.getTransformedPosts();
    }

}
