//package com.lgd;
//
//import com.lgd.pojo.*;
//import com.lgd.dao.*;
//import com.lgd.service.ProductService;
//import com.lgd.util.MD5Utils;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.sql.Timestamp;
//import java.util.Date;
//import java.util.List;
//
//@SpringBootTest
//class EsaywebBokeApplicationTests {
//
//    @Autowired
//    ReportYearMapper reportYearMapper;
//    @Autowired
//    CommentDao commentDao;
//    @Autowired
//    BokeDao bokeDao;
//    @Autowired
//    ScoreDao scoreDao;
//    @Autowired
//    ProductDao productDao;
//    @Autowired
//    OrderDao orderDao;
//    @Autowired
//    ProductService service;
//
//    @Test
//    void ProductServiceTest(){
//        int num = service.addToOrder(1,8003,3);
//        System.out.println(num);
//    }
//
//    @Test
//    void orderTest(){
////        List<Order> orders = orderDao.getAllOrder(1,1,5);
////        for (Order order:orders)
////            System.out.println(order);
//        int count = orderDao.getCount(1);
//        System.out.println(count);
////        List<Order> orders = orderDao.findOrder(1,5,"天",1);
////        for(Order order:orders)
////            System.out.println(order);
//    }
//
//    @Test
//    void productTest(){
//        List<Order> orders = productDao.getOrderByUidPid(1,8003);
//        Order product = orders.get(0);
//        System.out.println(product);
//    }
//
//    @Test
//    void MD5Test() throws Exception {
//        String pwd="123456";
//        String newpwd = MD5Utils.md5Password(pwd);
//        System.out.println(newpwd);
//        String pwd2="123456";
//        String newpwd2 = MD5Utils.md5Password(pwd2);
//        System.out.println(newpwd2);
//        System.out.println(newpwd.equals(newpwd2));
//    }
//
//    @Test
//    void getAllScore(){
//        List<Score> scores = scoreDao.getAllScores(1,5);
//        for (Score score:scores)
//            System.out.println(score.getCreate_time());
//    }
//
//    @Test
//    void TestReport(){
//        List<Integer> num = reportYearMapper.reportYearBoke("2021");
//        for(int n: num){
//            System.out.println(n);
//        }
//        List<Count> counts = reportYearMapper.reportByYears();
//        for(Count n: counts){
//            System.out.println(n);
//        }
////        Boke boke = reportYearMapper.selectByid(1);
////        System.out.println(boke);
//    }
//
//    @Test
//    void contextLoads() {
//        Timestamp timeStamp = new Timestamp(new Date().getTime());
//        Comment comment = new Comment(10,"hello","2709296991@qq.com","lgd",timeStamp,2,null);
//        int num = commentDao.updateComment(comment);
//        System.out.println(num);
//    }//测试功能完成
//
//    @Test
//    void CommentAddTest() {
//        Timestamp timeStamp = new Timestamp(new Date().getTime());
//        Comment comment = new Comment(0,"hello","2709296991@qq.com","lgd",timeStamp,2,null);
//        int num = commentDao.addComment(comment);
//        System.out.println(num);
//    }//测试功能完成
//
////    @Test
////    void BokeUpdateTest(){
////        Timestamp timeStamp = new Timestamp(new Date().getTime());
////        Boke boke = new Boke(3,"11","11",timeStamp,1,null);
////        int num = bokeDao.updateBoke(boke);
////        System.out.println(num);
////    }
//
//    @Test
//    void CommentTest(){
//        List<Comment> commentListlist = commentDao.getAllComments(0, 5);
//        for(Comment s:commentListlist){
//            System.out.println(s);
//        }
//    }
//
//    @Test
//    void ScoreTest(){
//        Timestamp timeStamp = new Timestamp(new Date().getTime());
////        int num = scoreDao.addScore(new Score(0,2,2,timeStamp,90,null,null));
//        int num = scoreDao.delScore(2);
//        System.out.println(num);
//    }
//}
