package com.app.restapp.service;

import com.app.exception.CustomException;
import com.app.restapp.dao.UserRepository;
import com.app.restapp.dto.UserDto;
import com.app.restapp.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User insertNewUser(User user) {
        userRepo.save(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> userList = userRepo.findAll();
        return userList;
    }

    @Override
    public User getByMobileAndPassword(String mobile, String password) {
        return userRepo.findByMobileAndPassword(mobile,password);
    }

    public User getById(int id)
    {
        User user = userRepo.getById(id);
        return user;
    }

	@Override
	public User updateUser(int user_id, User user) throws CustomException {
		User user2 = userRepo.findById(user_id).orElseThrow(()->new CustomException("invalid usere id"));
		System.out.println(user2);
		user2.setAadharcardNumber(user.getAadharcardNumber());
		user2.setAddress(user.getAddress());
		user2.setFirst_name(user.getFirst_name());
		user2.setLast_name(user.getLast_name());
		user2.setGender(user.getGender());
		user2.setMobile(user.getMobile());
		user2.setPassword(user.getPassword());
		return userRepo.save(user2);
	}
	
	public String deleteUser(int user_id)
	{
		userRepo.deleteById(user_id);
		return "user deleted";
	}

//    public UserDto convertUserToUserDto(User user)
//    {
//        UserDto userDto = new UserDto(user.getUser_id(),user.getFirst_name(), user.getLast_name(), user.getEmail(),
//                user.getMobile(),user.getAadharcardNumber(),user.getPassword(),user.getUser_id(),user.getGender(),
//                user.getAddress(),user.getActive());
//        return userDto;
//    }

}
