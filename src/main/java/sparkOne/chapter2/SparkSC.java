package sparkOne.chapter2;

/**
 * @author xueqin
 * @Description: Modified By:
 * Created by xueqin on 17/12/31.
 */
public class SparkSC {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setMaster("local").setAppName("My App");
    }
}
