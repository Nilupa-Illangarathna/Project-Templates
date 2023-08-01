// package org.example.testSpringbootBackend;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;

// @Controller
// public class FormController {

//     @GetMapping("/")
//     public String showFormPage() {
//         return "index"; // Returns the index.html page
//     }
// }






// package org.example.testSpringbootBackend;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;

// @Controller
// public class FormController {

//     @GetMapping("/")
//     public String showFormPage() {
//         return "index"; // Returns the index.html page
//     }

//     @PostMapping("/submit")
//     public String submitForm(@RequestParam String field1, @RequestParam String field2,
//                              @RequestParam String field3, @RequestParam String field4) {
//         // Perform any necessary processing with the form data here
//         // For simplicity, we are not doing any processing here, just navigating to the helloworld.html page.
//         return "redirect:/hello";
//     }

//     @GetMapping("/hello")
//     public ModelAndView showHelloWorldPage() {
//         ModelAndView mav = new ModelAndView("helloworld");
//         return mav;
//     }

//     @GetMapping("/error")
//     public ModelAndView handleError() {
//         ModelAndView mav = new ModelAndView("error");
//         return mav;
//     }
// }





package org.example.testSpringbootBackend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

    @GetMapping("/")
    public String showFormPage() {
        return "index"; // Returns the index.html page
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam String field1, @RequestParam String field2,
                             @RequestParam String field3, @RequestParam String field4) {
        // Perform any necessary processing with the form data here
        // For simplicity, we are not doing any processing here, just navigating to the helloworld.html page.
        return "redirect:/hello?field1=" + field1 + "&field2=" + field2 + "&field3=" + field3 + "&field4=" + field4;
    }

    @GetMapping("/hello")
    public ModelAndView showHelloWorldPage(@RequestParam(required = false) String field1,
                                           @RequestParam(required = false) String field2,
                                           @RequestParam(required = false) String field3,
                                           @RequestParam(required = false) String field4) {
        ModelAndView mav = new ModelAndView("helloworld");
        mav.addObject("field1", field1);
        mav.addObject("field2", field2);
        mav.addObject("field3", field3);
        mav.addObject("field4", field4);
        mav.addObject("field5", "Fuck");
        return mav;
    }
}


