package dao;

import models.Admin;
import models.Referent;

public interface AdminDao extends Dao<Admin> {
    void addNewRefernt(Referent ref);

}
