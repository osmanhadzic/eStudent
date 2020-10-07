package dao;

import java.util.List;
import java.util.Optional;

public class StudentDaoImpl implements StudentDao {
    @Override
    public Optional<StudentDao> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<StudentDao> getAll() {
        return null;
    }

    @Override
    public void save(StudentDao studentDao) {

    }

    @Override
    public void update(StudentDao studentDao, String[] params) {

    }

    @Override
    public void delete(StudentDao studentDao) {

    }
}
