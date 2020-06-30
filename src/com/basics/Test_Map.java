package com.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test_Map {
    public static void main(String[] args) {
        HashMap<String, Teacher> hashMap = new HashMap();
        Teacher teacher1 = new Teacher();
        teacher1.setCourse("语文");
        teacher1.setName("张三");
        Teacher teacher2 = new Teacher();
        teacher2.setCourse("数学");
        teacher2.setName("李四");
        Teacher teacher3 = new Teacher();
        teacher3.setCourse("英语");
        teacher3.setName("王五");
        hashMap.put("一班",teacher1);
        hashMap.put("二班",teacher2);
        hashMap.put("三班",teacher3);

        Set<String> keySet = hashMap.keySet();
        for (String k : keySet) {
            System.out.println("班级是："+k+" 所教科目和名字是"+hashMap.get(k));
        }

        System.out.println("--------------------------");
        Set<Map.Entry<String, Teacher>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Teacher> entry : entrySet) {
            System.out.println("班级是："+entry.getKey()+" 所教科目和名字是"+entry.getValue());
        }

    }
}

class Teacher{
    private String course;
    private String name;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "course='" + course + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
