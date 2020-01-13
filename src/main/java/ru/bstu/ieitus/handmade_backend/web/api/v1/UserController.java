package ru.bstu.ieitus.handmade_backend.web.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.bstu.ieitus.handmade_backend.entity.domain.User;
import ru.bstu.ieitus.handmade_backend.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public User get(@RequestParam Long id){
        return userService.getUserById(id);
    }

    @PostMapping(path = "/signup")
    public User SignUp(@RequestBody User user)
    {
        return userService.signUpUser(user);
    }

    @PutMapping
    public User update(@RequestBody User user)
    {
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id)
    {
        userService.deleteUser(id);
    }
}
