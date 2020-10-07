package dao;

import models.Asistent;

import java.util.List;
import java.util.Optional;

public class AsistantDaoImpl implements AsistantDao {

    @Override
    public Optional<Asistent> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Asistent> getAll() {
        return null;
    }

    @Override
    public void save(Asistent asistent) {

    }

    @Override
    public void update(Asistent asistent, String[] params) {

    }

    @Override
    public void delete(Asistent asistent) {

    }
}
