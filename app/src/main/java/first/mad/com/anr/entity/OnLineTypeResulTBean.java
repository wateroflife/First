package first.mad.com.anr.entity;

import java.util.List;

/**
 * Created by XiaoBao on 2016/8/3.
 * Description
 */
public class OnLineTypeResulTBean {

    public String paramType;

    public List<ParamList> paramLists;


    @Override
    public String toString() {
        return "OnLineTypeResulTBean{" +
                "paramType='" + paramType + '\'' +
                ", paramLists=" + paramLists +
                '}';
    }
}
