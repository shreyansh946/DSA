package DESIGNPAYMENTGATEWAY;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserService {

    static List<User> userList = new ArrayList<>();

    public UserDTO addUser(UserDTO userDTO)
    {
        User userobj = new User();
        userobj.setUserName(userDTO.getName());
        userobj.setUserID((int) new Random().nextInt(100-10)+10);
        userobj.setEmail(userDTO.getMail());
        userList.add(userobj);
        return ConvertUserDTOtoUser(userobj);
    }

    public UserDTO getUser(int UserID)
    {
        for(User user:userList)
        {
            if(user.getUserID() == UserID)
            {
                return ConvertUserDTOtoUser(user);
            }
        }
        return null;
    }

    private  UserDTO ConvertUserDTOtoUser(User userObj)
    {
       UserDTO userDTO = new UserDTO();
       userDTO.setName(userObj.getUserName());
       userDTO.setMail(userObj.getEmail());
       userDTO.setUserID(userObj.getUserID());
       return userDTO;
    }


}
