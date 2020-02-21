package com.ispong.oxygen.flysql;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * sql operations
 *
 * @author ispong
 * @version v0.1.0
 */
public interface SqlOperations {

    /**
     * 查询列表
     *
     * @return 返回List类型数据对象
     * @since 2019-12-26
     */
    <A> List<A> query();

    /**
     * 查询列表
     *
     * @param page 每一页
     * @param size 每页大小
     * @return 返回List类型数据对象
     * @since 2019-12-26
     */
    <A> List<A> query(Integer page, Integer size);

    /**
     * 查询某一个值
     *
     * @return 返回映射对象
     * @since 2019-12-26
     */
    <A> A getOne();

    /**
     * 执行更新
     *
     * @since 2019-12-26
     */
    void doUpdate();

    /**
     * 执行保存
     *
     * @since 2019-12-26
     */
    <A> void save(A obj) throws InvocationTargetException, IllegalAccessException;

    /**
     * 执行删除
     *
     * @since 2019-12-26
     */
    void doDelete();
}
