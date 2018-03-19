package com.example.demo.controller;

public class Ai1{

    public String show(String[] str) {
        if(str!=null&&str.length>0){
            if(str[0].equalsIgnoreCase("hah")){
                System.out.println("数组第一个元素和haha相同");
            }else{
                System.out.println("数组第一个元素和haha不相同");
            }
            for (int i =1;i<str.length;i++){
                System.out.println("第"+i+"个元素是:"+str[i]);
            }
        }
        return "我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国我爱中华人民共和国";
    }
}
