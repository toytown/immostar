package com.immostar.service.interfaces;

import com.immostar.domain.User;

public interface UserService {

    public boolean retriveAndSendNewPassword(String userNameOrEmail);
    
    public void save(User user);
    
    public User findUserByUserNameAndPassword(String userName, String password);
    
    public void saveMarkedItems(String realStateId, String userId);
    


}
