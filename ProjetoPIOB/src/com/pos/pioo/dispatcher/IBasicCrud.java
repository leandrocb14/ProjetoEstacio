package com.pos.pioo.dispatcher;

import java.sql.SQLException;
import java.util.List;

public interface IBasicCrud<T> {
	void Create(T model) throws SQLException;

	void Update(T model) throws SQLException;

	void Delete(int id) throws SQLException;

	T Read(int id) throws SQLException;

	List<T> ReadAll() throws SQLException;
}
