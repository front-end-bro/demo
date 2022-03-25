package com.czm.base;
//JavaDoc是用来生成自己API文档的
/*
* @author czm
* @version 1.0
* @since 1.8
* */
public class Doc {
    String name;//实例变量

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    public String test(String name) throws Exception{
        return name;


    }//方法

    /*参数信息
    @author 作者名
    @version 版本号
    @since 指明需要最早使用的jdk版本
    @param 参数名
    @return 返回值情况
    @throws 异常抛出情况
    */

    //命令行 javadoc 参数 Java文件

    //IDEA 创建doc https://blog.csdn.net/qq_44122193/article/details/114789427

}
