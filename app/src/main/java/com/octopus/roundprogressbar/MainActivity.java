package com.octopus.roundprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.octopus.amountview.AmountView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.amountview_1)
    AmountView amountview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void initView() {
//        amountview1.setAmountTextSize(DisplayUtils.sp2px(13));
        amountview1.setOnChangeListener(new AmountView.OnChangeListener() {
            @Override
            public void onChanged(int value) {
                ToastUtils.showToast("--->" + value);
            }
        });
    }

}
