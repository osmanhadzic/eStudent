package dao;

import models.Admin;

public interface AdminDao extends Dao<Admin> {
    long addNewRefernt(Object ref);
    long editRefent(Object ref);
}
