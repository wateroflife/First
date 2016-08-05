package first.mad.com.anr.base;

/**
 * Created by XiaoBao on 2016/8/3.
 * Description
 */
public class BaseBean {

    public String resultStatus;//接口返回码，200表示请求成功，其他表示失败

    public String resultMag;//返回msg

    @Override
    public String toString() {
        return "BaseBean{" +
                "resultStatus='" + resultStatus + '\'' +
                ", resultMag='" + resultMag + '\'' +
                '}';
    }
}
