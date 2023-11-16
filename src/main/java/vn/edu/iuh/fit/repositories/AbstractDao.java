package vn.edu.iuh.fit.repositories;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractDao<T, ID> {

  public abstract void insert(T t);

  public abstract void update(T t);

  public abstract void delete (T t);

  public abstract T findById(ID id);

  public abstract List<T> getAll();

}
