package com.codegym.task.task36.task3608.view;

import com.codegym.task.task36.task3608.bean.User;
import com.codegym.task.task36.task3608.controller.Controller;
import com.codegym.task.task36.task3608.model.DataModel;

import java.util.List;

public class UsersView implements View {

    private Controller controller;

    @Override
    public void setController(Controller controller) {
        this.controller = controller;

    }
    @Override
    public void refresh(DataModel dataModel) {
        if (dataModel.isDisplayDeletedUserList()) {
            System.out.println("All deleted users:");
        } else
            System.out.println("All users:");
        List<User> list =  dataModel.getUsers();
        for (User user : list) {
            System.out.println("\t" + user.toString());

        }
        System.out.println("===================================================");

    }

    public void fireShowAllUsersEvent() {
        controller.onShowAllUsers();
    }

    public void fireShowDeletedUsersEvent() {
        controller.onShowAllDeletedUsers();
    }

    public void fireOpenUserEditFormEvent(long id) {
        controller.onOpenUserEditForm(id);
    }






}
