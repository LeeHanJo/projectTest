package org.zerock.api01;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.api01.util.JWTUtil;

import java.util.Map;

@SpringBootTest
@Log4j2
public class JWTUtilTests {

    @Autowired
    private JWTUtil jwtUtil;

    @Test
    public void testGenerate() {

        Map<String, Object> claimMap = Map.of("mid", "ABCDE");

        String jwtStr = jwtUtil.generateToken(claimMap, 1);

        log.info(jwtStr);
    }

    @Test
    public void testValidate() {

        //유효 시간이 지난 토큰
        String jwtStr = "eyJ0eXAiOiJqd3QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE3MDczNjUxMTAsIm1pZCI6IkFCQ0RFIiwiaWF0IjoxNzA3MzY1MDUwfQ.si3-U7FaNPjODhPfELIThMPhzeFtR5gW7xcFzIh_Uvs111";

        Map<String, Object> claim = jwtUtil.validateToken(jwtStr);

        log.info(claim);
    }

    @Test
    public void testAll() {
        String jwtStr = jwtUtil.generateToken(Map.of("mid", "AAAA", "email", "aaaa@bbb.com"), 1);

        log.info(jwtStr);
        Map<String, Object> claim = jwtUtil.validateToken(jwtStr);
        log.info("MID:" + claim.get("mid"));
        log.info("EMAIL:" + claim.get("email"));
    }

}
