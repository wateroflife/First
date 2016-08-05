package first.mad.com.anr;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;

import first.mad.com.anr.entity.OnLineTypeResulTBean;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AssetManager assetManager = getAssets();
        try {
            InputStream inputStream = assetManager.open("study_type.txt");
            int length = inputStream.available();//通过available 获取输入流长度

            byte[] bytes = new byte[length];
            inputStream.read(bytes);
            String result = new String(bytes, "utf-8");
            if (!TextUtils.isEmpty(result) && result.length()>=1000) {
                Log.i("tag", result.substring(0, 1000));
            }

            OnLineTypeResulTBean onLineTypeResulTBean = new Gson().fromJson(result, OnLineTypeResulTBean.class);
//            Log.e("tag", onLineTypeResulTBean.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
