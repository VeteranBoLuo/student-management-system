package com.example.demo.bean;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: ReqBean
 * @Description: 请求Bean
 * @author cys
 * @date 2018年12月12日 上午11:21:36
 * @param <T>
 */
@Data
public class ReqBean<T> implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;

	private T body;



}
