package com.hipishare.products.dao.mapper;

import org.apache.ibatis.annotations.Param;
import com.hipishare.products.dao.po.Ps_purchasing_list_detailPO;

/**
 * <b>ps_purchasing_list_detail[ps_purchasing_list_detail]数据访问接口</b>
 * 
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:26
 */
public interface Ps_purchasing_list_detailMapper {

	/**
	 * 插入一个数据持久化对象(插入字段为传入PO实体的非空属性)
	 * <p> 防止DB字段缺省值需要程序中再次赋值
	 *
	 * @param ps_purchasing_list_detailPO
	 *            要插入的数据持久化对象
	 * @return 返回影响行数
	 */
	int insert(Ps_purchasing_list_detailPO ps_purchasing_list_detailPO);
	
	/**
	 * 插入一个数据持久化对象(含所有字段)
	 * 
	 * @param ps_purchasing_list_detailPO
	 *            要插入的数据持久化对象
	 * @return 返回影响行数
	 */
	int insertAll(Ps_purchasing_list_detailPO ps_purchasing_list_detailPO);

	/**
	 * 根据主键修改数据持久化对象
	 * 
	 * @param ps_purchasing_list_detailPO
	 *            要修改的数据持久化对象
	 * @return int 返回影响行数
	 */
	int updateByKey(Ps_purchasing_list_detailPO ps_purchasing_list_detailPO);

	/**
	 * 根据主键查询并返回数据持久化对象
	 * 
	 * @return Ps_purchasing_list_detailPO
	 */
	Ps_purchasing_list_detailPO selectByKey(@Param(value = "id") Integer id);

	/**
	 * 根据主键删除数据持久化对象
	 *
	 * @return 影响行数
	 */
	int deleteByKey(@Param(value = "id") Integer id);
	
}
