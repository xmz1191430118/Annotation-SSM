package com.xue.ssm.pojo;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.ConstructorArgs;

/**
 * @author xmz
 * @date 2022/6/25 16:28
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    Integer id;
    String username;
    String password;
}
