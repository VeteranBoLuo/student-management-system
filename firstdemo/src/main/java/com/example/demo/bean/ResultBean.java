package com.example.demo.bean;

import java.io.Serializable;
import java.text.MessageFormat;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ResultBean<T> implements Serializable {

	private static final long serialVersionUID = 1L;


	public static final int SUCCESS = 0;

	public static final int FAIL = 1;


	private String msg = "success";

	private int code = SUCCESS;

	private int errorCode;

	private String errorMsg;

	private T data;
	private long totalCount;
	public ResultBean() {
		super();
	}

	public ResultBean(T data) {
		super();
		this.setData(data);
	}


	public ResultBean(Throwable e) {
		super();
		this.msg = e.toString();
		this.code = FAIL;
	}



	public static ResultBean<String> error(String msg){
		return new ResultBean<String>().setCode(FAIL).setMsg(msg);
	}

	public static ResultBean<String> error(int code2, String msg2) {
		return error("fail").setErrorCode(code2).setErrorMsg(msg2);
	}
}
