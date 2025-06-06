package com.springStudy1.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springStudy1.DTO.School;

import org.springframework.jdbc.core.JdbcTemplate;
@Repository
public class SchoolDAO {
	private final JdbcTemplate jdbc;
	
	@Autowired
	public SchoolDAO( JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	
	// 정보 가져오기
	public List<School> findAllByType(String type){
		List<School> list = new ArrayList<>();
		
		//list = jdbc.query("쿼리문", new SchoolRowMapper()	);
		
		
		
		String sql = "select * from school where diff=?";
		
		list = jdbc.query(sql, new SchoolRowMapper(),type);
		// jdbcTemplate은 Connenction, PreparedStatenment, ResulSet이 
		// 간단하게 사용해서 데이터베이스 이용할 수 있게 메서드로 만들어져있다.
		// 여러 데이터를 조회하는 경우 query 메서드
		// 단일 레코드 조회하는 경우 queryforObject 메서드
		// 데이터 수정하는 경우 Update메서드
		// 삭제하는 경우 update메서드
		// 새로운 데이터 추가 하는경우 update 메서드
		
		
		return list;
	}
	
	// 내부클래스
	public class SchoolRowMapper implements RowMapper<School>{

		@Override
		public School mapRow(ResultSet rs, int rowNum) throws SQLException {
			School school = new School();
			school.setId(rs.getInt("id"));
			school.setAddress(rs.getString("address"));
			school.setHomePage(rs.getString("homepage"));
			school.setSchoolName(rs.getString("school_name"));
			school.setTel(rs.getString("tel"));
			
			return school;
		}
		
		
	}
	
	
}
