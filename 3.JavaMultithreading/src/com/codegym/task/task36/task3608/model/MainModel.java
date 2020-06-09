package com.codegym.task.task36.task3608.model;

import com.codegym.task.task36.task3608.bean.User;
import com.codegym.task.task36.task3608.model.service.UserService;
import com.codegym.task.task36.task3608.model.service.UserServiceImpl;

import java.util.List;


public class MainModel implements Model {

    private DataModel dataModel = new DataModel();
    private UserService userService = new UserServiceImpl();

    @Override
    public DataModel getDataModel() {
        return dataModel;
    }

    @Override
    public void loadUsers() {
        dataModel.setDisplayDeletedUserList(false);
        dataModel.setUsers(getAllUsers());
        // dataModel.setUsers(userService.getUsersBetweenLevels(1, 100));

    }

    public void loadDeletedUsers() {
        dataModel.setDisplayDeletedUserList(true);
        List<User> users = userService.getAllDeletedUsers();
        dataModel.setUsers(users);
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

    private List<User> getAllUsers(){
        dataModel.setUsers(userService.getUsersBetweenLevels(1,100));
        return userService.filterOnlyActiveUsers(dataModel.getUsers());
    }


}
