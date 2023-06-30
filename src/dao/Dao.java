package dao;

import model.User;

import java.util.List;

public interface Dao<T> {



    //新增
    public boolean insert( T a);

    public boolean update( T a);
    public boolean delete( int id);
    public User select(int id );
    public List<T> selectAll(int a,int b);




}
