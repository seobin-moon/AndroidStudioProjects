package com.example.j202046198_1108_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    final static Integer LINE = 1, CIRCLE = 2;
    static Integer curShape = LINE;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, "선 그리기");
        menu.add(0, 2, 0, "원 그리기");
        menu.add(0, 2, 0, "색 선택"); //subMenu로 r,g,b 색상 menu
        menu.add(0, 2, 0, "지우기"); //지우기 눌렀을 때만 지울 수 있도록. 지우기 누르기 전까지는 그린 그림들이 남아있도록.
    }
    private static class MyGraphicView extends View {
        public MyGraphicView(Context context) {
            super(context);
        }

        public boolean onTouchEvent(MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                startX = (int)event.getX();
                startY = (int)event.getY();
            }
            else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                stopX = (int)event.getX();
                stapY = (int)event.getY();
                this.invalidate();
            }
            else if (event.getAction() == MotionEvent.ACTION_UP) {
                stopX = (int)event.getX();
                stapY = (int)event.getY();
                this.invalidate();
            }
            return true;

            protected void onDraw(@NonNull Canvas canvas) {
                super.onDraw(canvas);

                Paint paint = new Paint();
                paint.setColor(Color.RED);
                paint.setStrokeWidth(5);

                if (curShape == LINE) {
                    canvas.drawLine(startX, startY, stopX, stopY, paint);
                }
                else if (curShape == CIRCLE) {
                    int radius = (int) Math.sqrt(Math.pow(stopX - startX, 2) +
                            Math.pow(stopY - startY, 2));
                    canvas.drawCircle(startX, startY, radius, paint);
                }
            }
        }
    }
}