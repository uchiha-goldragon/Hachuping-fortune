
package com.hachuping.fortune.roulette;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("하츄핑 운세 룰렛 - GitHub 자동 빌드용 버전!");
        setContentView(tv);
    }
}
