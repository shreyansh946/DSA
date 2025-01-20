package DESIGNPAYMENTGATEWAY;

public class UserController {

    UserService userService;

    public UserController()
    {
        userService = new UserService();
    }

    public UserDTO addUser(UserDTO userDTOObj)
    {
        return userService.addUser(userDTOObj);
    }

    public UserDTO getUser(int userID)
    {
        return userService.getUser(userID);
    }
}
