package com.example.canvas;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Создаем экземпляр CustomView
        CustomView customView = new CustomView(this, null);

        // Устанавливаем CustomView как основное представление
        setContentView(customView);
    }
}
