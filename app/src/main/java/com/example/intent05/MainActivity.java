package com.example.intent05;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.SearchEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tv_keyword;
    EditText et_keyword;
    Button btn_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        tv_keyword = findViewById(R.id.tv_keyword);
        et_keyword = findViewById(R.id.et_keyword);
        btn_search = findViewById(R.id.btn_search);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strKeyword = et_keyword.getText().toString();
                Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
//                i.setAction(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(strKeyword));
                i.putExtra(SearchManager.QUERY,strKeyword);
                startActivity(i);

            }
        });

    }
}