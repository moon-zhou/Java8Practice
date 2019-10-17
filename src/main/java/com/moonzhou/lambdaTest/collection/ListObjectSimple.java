package com.moonzhou.lambdaTest.collection;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author moon-zhou
 * @Date: 2019/10/10 10:23
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ListObjectSimple {
    public static void main(String[] args) {
        testNormalForReference();

        testLamdbaObjReference();

        testForeachBreak();

        objList2String();
    }

    private static void testNormalForReference() {
        List<User> users = initData();

        for (int i = 0; i < users.size(); i++) {
            users.get(i).setAge(28);
        }

        System.out.println(users);
    }

    /**
     * 测试引用对象的值修改
     */
    private static void testLamdbaObjReference() {
        List<User> users = initData();

        users.forEach(user -> {
            if (user.getAge() == 19) {
                user.setAge(user.getAge() + 1);

                return; // break
            }
        });

        System.out.println(users);
    }

    /**
     * 测试引用对象的值修改
     */
    private static void testForeachBreak() {
        List<User> users = initData();

        users.forEach(user -> {
            user.setAge(user.getAge() + 1);
        });

        System.out.println(users);
    }

    private static void objList2String() {
        List<User> users = initData();

        System.out.println(JSONObject.toJSONString(users));
        System.out.println(JSONObject.toJSONString(null));

    }

    private static List<User> initData() {
        List<User> users = new ArrayList<>();

        User user1 = new User("aaa", 18);
        User user2 = new User("aaa", 19);
        User user3 = new User("aaa", 20);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }

    static class User {

        private String name;

        private int age;

        public User() {
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
