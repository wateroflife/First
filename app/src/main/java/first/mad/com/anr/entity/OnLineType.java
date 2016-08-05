package first.mad.com.anr.entity;

import java.util.List;

import first.mad.com.anr.base.BaseBean;

/**
 * Created by XiaoBao on 2016/8/3.
 * Description
 */
public class OnLineType extends BaseBean {

    public List<OnLineTypeResulTBean>result;


    @Override
    public String  toString() {
        return "OnLineType{" +
                "result=" + result +
                '}';
    }
}
