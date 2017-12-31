package spark1;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;



/**
 * @author xueqin
 * @Description: Modified By:
 * Created by xueqin on 17/12/31.
 */
public class SparkSC {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setMaster("local").setAppName("My App");
        JavaSparkContext sc = new JavaSparkContext(conf);
         //读取我们的输入数据
        String inputFile="src/inputFile.txt";
        JavaRDD<String> rdd = sc.textFile(inputFile);
        System.out.println(rdd.count());
        System.out.println(rdd.first());

    }
}
