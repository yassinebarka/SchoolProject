package dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> findById(Long id);

    List<T> findAll();

    List<T> findBy(String columnLabel, String columnValue);

    void save(T t);

    void update(T t);

    void delete(Long id);

}
