package com.codegym.task.task36.task3608.view;

import com.codegym.task.task36.task3608.bean.User;
import com.codegym.task.task36.task3608.controller.Controller;
import com.codegym.task.task36.task3608.model.DataModel;

public class EditUserView implements View{

    private Controller controller;
    private EditUserView editUserView;

    @Override
    public void refresh(DataModel dataModel) {

        System.out.println("User to be edited:");
        System.out.println("\t" + dataModel.getActiveUser());
        System.out.print("===================================================");

    }

    public void fireUserDeletedEvent(long id) {
        controller.onDeleteUser(id);
    }


    @Override
    public void setController(Controller controller) {
        this.controller = controller;

    }
}
