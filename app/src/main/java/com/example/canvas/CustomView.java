package com.example.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {
    private Paint paint = new Paint();

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Рисуем небо
        paint.setColor(Color.WHITE);
        canvas.drawRect(0, 0, getWidth(), getHeight() / 2, paint);

        // Рисуем траву
        paint.setColor(Color.GREEN);
        canvas.drawRect(0, 550, getWidth(), getHeight(), paint);

        // Рисуем дом
        paint.setColor(Color.rgb(139, 0, 0)); // Темно-красный цвет
        canvas.drawRect(200, 400, 400, 600, paint);

        // Рисуем крышу
        paint.setColor(Color.RED);
        Path roof = new Path();
        roof.moveTo(200, 400);
        roof.lineTo(300, 300);
        roof.lineTo(400, 400);
        roof.close();
        canvas.drawPath(roof, paint);

        // Рисуем окно на доме
        paint.setColor(Color.rgb(100, 106, 135)); // Голубой цвет окна
        canvas.drawRect(250, 450, 350, 550, paint);

        // Рисуем круг на крыше
        paint.setColor(Color.rgb(135, 206, 235)); // Голубой цвет
        canvas.drawCircle(300, 360, 10, paint);

        // Рисуем дерево
        paint.setColor(Color.rgb(139, 69, 19)); // Ствол дерева
        canvas.drawRect(480, 450, 520, 600, paint);
        paint.setColor(Color.GREEN); // Крона дерева
        canvas.drawCircle(500, 450, 100, paint);

        // Рисуем солнце
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(100, 100, 50, paint);

        // Рисуем лучи солнца
        for (int i = 0; i < 360; i += 45) {
            float startX = (float) (100 + 50 * Math.cos(Math.toRadians(i)));
            float startY = (float) (100 + 50 * Math.sin(Math.toRadians(i)));
            float endX = (float) (100 + 100 * Math.cos(Math.toRadians(i)));
            float endY = (float) (100 + 100 * Math.sin(Math.toRadians(i)));
            canvas.drawLine(startX, startY, endX, endY, paint);
        }

        // Рисуем скамейку
        // Сиденье скамейки
        paint.setColor(Color.rgb(139, 69, 19)); // Цвет сиденья
        canvas.drawRect(800, 520, 900, 540, paint); // Горизонтальный прямоугольник

        // Подставки скамейки (вертикальные)
        paint.setColor(Color.rgb(139, 69, 19)); // Цвет подставок
        canvas.drawRect(790, 520, 810, 600, paint); // Левая подставка (вертикальная)
        canvas.drawRect(890, 520, 910, 600, paint); // Правая подставка (вертикальная)
    }
}
