package dao;

import models.Referent;

import java.util.List;
import java.util.Optional;

public class ReferentDaoImpl implements ReferentDao {
    @Override
    public long addNewStudent(Object stud) {
        return 0;
    }

    @Override
    public long editStudent(Long studID) {
        return 0;
    }

    @Override
    public Optional<Referent> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Referent> getAll() {
        return null;
    }

    @Override
    public void save(Referent referent) {

    }

    @Override
    public void update(Referent referent, String[] params) {

    }

    @Override
    public void delete(Referent referent) {

    }
}
