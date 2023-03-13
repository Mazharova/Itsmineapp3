package com.example.itsmineapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("rat","onCreate");
        Log.d("rat","onCreate");
        Log.w("rat","onCreate");
        Log.v("rat","onCreate");
        Log.e("rat","onCreate");
    }
    public void showToast(View view) {
        Toast toast3 = Toast.makeText(getApplicationContext(),
                "Ну и зачем...", Toast.LENGTH_LONG);
        LinearLayout toastContainer = (LinearLayout) toast3.getView();
        ImageView catImageView = new ImageView(getApplicationContext());
        catImageView.setImageResource(R.drawable.icon_warn);
        toast3.show();
    }

}