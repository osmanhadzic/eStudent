package dao;

import models.Referent;

public interface ReferentDao extends Dao<Referent> {
    long addNewStudent(Object stud);
    long editStudent(Long studID);
}
