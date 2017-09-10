package com.google.android.gms.samples.vision.barcodereader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScanResultActivity extends AppCompatActivity {

    public static final String PARAM_CODE = "code";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_result);

        String code = getIntent().getStringExtra(PARAM_CODE);
        if (code==null) code = "test123";

        //Toast.makeText(this, code, Toast.LENGTH_LONG).show();
        TextView tvCode = (TextView) findViewById(R.id.tvCode);
        tvCode.setText(code);

    }
}
