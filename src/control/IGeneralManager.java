package control;

import java.util.List;

public interface IGeneralManager<T> {
     List<T> findAll();
     void add(T t);
     void edit(int index,T t);
     void remove(int index);
     T searchById(String id);
     int searchIndexById(String  id);
     void showAll();
}
