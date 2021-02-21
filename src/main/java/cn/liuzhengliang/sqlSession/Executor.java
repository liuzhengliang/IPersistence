package cn.liuzhengliang.sqlSession;

import cn.liuzhengliang.pojo.Configuration;
import cn.liuzhengliang.pojo.MappedStatement;

import java.util.List;

public interface Executor {

    public <E> List<E> query(Configuration configuration,MappedStatement mappedStatement,Object... params) throws Exception;

}
