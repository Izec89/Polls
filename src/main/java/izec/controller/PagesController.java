package izec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    @GetMapping("/admin/myAdminPage")
    public String getAdminPage() {
        return "myAdminPage";
    }

    @GetMapping("/user/general/myUserPage")
    public String getUserPage() {
        return "myUserPage";
    }

    @GetMapping("/user/private/myPrivateUserPage")
    public String getPrivateUserPage() {
        return "myPrivateUserPage";
    }

    @GetMapping("/guest/myGuestPage")
    public String getGuestPage() {
        return "myGuestPage";
    }

    @GetMapping("/multipleHttpLinks")
    public String getMultipleHttpLinksPage() {
        return "multipleHttpLinks";
    }
}