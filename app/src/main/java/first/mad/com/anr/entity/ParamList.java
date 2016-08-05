package first.mad.com.anr.entity;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by XiaoBao on 2016/8/3.
 * Description:区域 ，价格 ，具体信息
 */
public class ParamList {

    public String key;
    public String name;
    public String value;
    public String minValue;
    public String maxValue;
    public List<ParamList>childList;

    @Override
    public String toString() {
        return "ParamList{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", minValue='" + minValue + '\'' +
                ", maxValue='" + maxValue + '\'' +
                ", childList='" + childList + '\'' +
                ", gson=" + gson +
                ", paramList=" + paramList +
                '}';
    }

    Gson gson = new Gson();
    ParamList paramList = gson.fromJson("",ParamList.class);//反射解析


}
