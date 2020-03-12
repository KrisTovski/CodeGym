package com.codegym.task.task36.task3608.model;

import com.codegym.task.task36.task3608.bean.User;
import com.codegym.task.task36.task3608.model.service.UserService;
import com.codegym.task.task36.task3608.model.service.UserServiceImpl;

import java.util.List;


public class MainModel implements Model {

    private DataModel dataModel = new DataModel();
    private UserService userService = new UserServiceImpl();

    private List<User> getAllUsers() {
        List<User> userList100 = userService.getUsersBetweenLevels(1, 100);
        return userService.filterOnlyActiveUsers(userList100);
    }

    @Override
    public DataModel getDataModel() {
        return dataModel;
    }

    @Override
    public void loadUsers() {
        dataModel.setDisplayDeletedUserList(false);
        dataModel.setUsers(getAllUsers());

    }

    public void loadDeletedUsers() {
        dataModel.setDisplayDeletedUserList(true);
        dataModel.setUsers(userService.getAllDeletedUsers());
    }

    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId);
        dataModel.setActiveUser(user);

    }

    public void deleteUserById(long id) {
        userService.deleteUser(id);
        dataModel.setDisplayDeletedUserList(false);
        dataModel.setUsers(getAllUsers());
    }
    public void changeUserData(String name, long id, int level){
        userService.createOrUpdateUser(name, id, level);
        dataModel.setDisplayDeletedUserList(false);
        dataModel.setUsers(getAllUsers());
    }


}
