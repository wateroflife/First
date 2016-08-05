package first.mad.com.anr;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by XiaoBao on 2016/8/2.
 * Description
 */
public class MyFragment extends Fragment {

    private Button bt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bt = (Button) view.findViewById(R.id.bt);
    }

    @Override
    public void onAttach(Context context) {//绑定所在activity
        super.onAttach(context);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDetach() {//解除绑定所在的activity
        super.onDetach();
    }

//    @Override
//    public void change() {
//        bt.setText("被改变了的样子");
//        bt.setTextColor(Color.RED);
//
//    }
}
