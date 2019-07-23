package coms.slxsm.test.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class UserDao {

    public Integer addUser(Integer len){
        log.info("add User len = " + len);
        if (len == null){
            return 0;
        }
        return 1;
    }
}
