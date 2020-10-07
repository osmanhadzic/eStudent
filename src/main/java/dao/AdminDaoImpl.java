package dao;

import models.Admin;

import java.util.List;
import java.util.Optional;

public class AdminDaoImpl implements AdminDao {
    @Override
    public long addNewRefernt(Object ref) {
        return 0;
    }

    @Override
    public long editRefent(Object ref) {
        return 0;
    }

    @Override
    public Optional<Admin> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Admin> getAll() {
        return null;
    }

    @Override
    public void save(Admin admin) {

    }

    @Override
    public void update(Admin admin, String[] params) {

    }

    @Override
    public void delete(Admin admin) {

    }
}
