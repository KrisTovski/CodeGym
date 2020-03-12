package com.codegym.task.task36.task3608.model;



import com.codegym.task.task36.task3608.bean.User;

import java.util.ArrayList;


public class FakeModel implements Model{

    private DataModel dataModel = new DataModel();

    @Override
    public DataModel getDataModel() {
        return dataModel;
    }

    @Override
    public void loadUsers() {
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("A", 1, 11));
        userList.add(new User("B", 2, 12));
        dataModel.setUsers(userList);



//        modelData.setUsers(new LinkedList<User>() {{
//            add(new User("A", 1l, 1));
//            add(new User("B", 2l, 1));
//        }});
//                      or
//
//        modelData.setUsers(Arrays.asList(new User("A", 1, 1),
//                new User("B", 2, 1)));


        
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();

    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}
