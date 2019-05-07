package AliceWi.com;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NumberPicker.OnValueChangeListener {
    private TextView mTimeSetTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Setted time text*/
        mTimeSetTextView = findViewById(R.id.time_setting_text);
    }

    public void timeSetButtonClicked(View view) {
        /* This is Showing NumberPicker Dialog*/
        TimeSettingDialog timeSettingDialog = new TimeSettingDialog();
        timeSettingDialog.setValueChangeListener(this);
        timeSettingDialog.show(getSupportFragmentManager() , "NumberPicker");
    }

    @Override
    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
        mTimeSetTextView.setText(newVal + " seconds");
    }

    public void soundSetButtonClicked(View view) {

    }
}
