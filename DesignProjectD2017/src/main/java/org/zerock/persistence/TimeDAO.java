package org.zerock.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;


@Repository
public class TimeDAO {

	@Inject
	private DataSource ds;
	
	
	public String getTime() throws Exception{
		
		Connection conn = ds.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("select now()");
		
		ResultSet rs = pstmt.executeQuery();
		
		rs.next();
		return rs.getString(1);
		
	}// getTime()
	
	
}
