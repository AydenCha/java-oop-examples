package com.codeit.lecture.p53.ex05;

// 파일 이름: Main.java
import java.sql.SQLException;

class DataAccessException extends RuntimeException {
    DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }
}

class Dao {
    void save(String data) throws SQLException {
        throw new SQLException("연결 시간이 초과되었습니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dao dao = new Dao();
        String data = "주문 데이터";

        try {
            try {
                dao.save(data);
            } catch (SQLException e) {
                throw new DataAccessException("DB 저장 중 오류 발생", e); // 원인 예외 포함
            }
        } catch (DataAccessException e) {
            System.out.println(e.getMessage()); // DB 저장 중 오류 발생
            System.out.println(e.getCause().getMessage());
        }
    }
}
