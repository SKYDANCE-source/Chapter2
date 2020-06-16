package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ItemNum extends AppCompatActivity {
    private int itemNum;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        itemNum = intent.getIntExtra("itemNum",0);
        setContentView(R.layout.activity_itemnum);
        TextView view = findViewById(R.id.Text3);
        view.setText("我是列表中第"+itemNum+"个");
    }
}
