package com.example.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //添加组件
        Button button1 = findViewById(R.id.button1);
        final TextView text1= findViewById(R.id.text1);
        final ImageView imageView1 = findViewById(R.id.imageView1);
        final EditText editText1 = findViewById(R.id.editText);
        final CheckBox checkBox1 =findViewById(R.id.checkBox1);
        final CheckBox checkBox2 =findViewById(R.id.checkBox2);
        //获取输入框信息
        final CharSequence charSequence = editText1.getText();
        //触发事件
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked()&&!checkBox2.isChecked()){  //显示输入的文字
                    imageView1.setVisibility(View.INVISIBLE);
                    text1.setVisibility(View.VISIBLE);
                    if(charSequence.length()>0){
                        Log.d(TAG, "Show Text");
                        text1.setText(charSequence);
                    }
                    else{
                        Log.d(TAG, "No Text");
                        text1.setText("You Haven't Input Any Message !");
                    }
                }
                else if(checkBox2.isChecked()&&!checkBox1.isChecked()){ //显示图片
                    Log.d(TAG, "Show Image");
                    text1.setVisibility(View.INVISIBLE);
                    imageView1.setVisibility(View.VISIBLE);
                }
                else if(checkBox1.isChecked() && checkBox2.isChecked()){
                    Log.d(TAG, "Double");
                    imageView1.setVisibility(View.VISIBLE);
                    text1.setVisibility(View.VISIBLE);
                    if(charSequence.length()>0){
                        text1.setText(charSequence);
                    }
                    else{
                        text1.setText("You Haven't Input Any Message !");
                    }
                }
                else{
                    //如果没有选择复选框（需要至少选择一个复选框），就会给出提示
                    Toast toast=Toast.makeText(getApplicationContext(),"You Need Choose One CheckBox At Least !", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
