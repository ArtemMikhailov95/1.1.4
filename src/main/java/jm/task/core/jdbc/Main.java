package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {

    public static void main(String[] args) {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("Роман", "Домбуев", (byte) 28);
        userDaoHibernate.saveUser("Артём", "Михайлов", (byte) 27);
        userDaoHibernate.saveUser("Артур", "Кубанов", (byte) 25);
        userDaoHibernate.saveUser("Виктор", "Алейников", (byte) 24);
        System.out.println(userDaoHibernate.getAllUsers());
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();

    }
}









