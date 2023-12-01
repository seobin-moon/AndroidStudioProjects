package com.example.j202046198_report2_2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private MyPaintView myView;
    int count = 0;
    final static int red = 1, green = 2, blue = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단 그림판");
        myView = new MyPaintView(this);

        ((LinearLayout) findViewById(R.id.paintLayout)).addView(myView);
        ((RadioGroup) findViewById(R.id.radioGroup)).setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                        if (checkedId == R.id.btnRed) {
                            myView.mPaint.setColor(Color.RED);
                        }else if (checkedId == R.id.btnGreen) {
                            myView.mPaint.setColor(Color.GREEN);
                        } else if (checkedId == R.id.btnBlue) {
                            myView.mPaint.setColor(Color.BLUE);
                        }
                    }
                });

        Button btnTh = findViewById(R.id.btnTh);
        btnTh.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count % 2 == 1) {
                    btnTh.setText("Thin");
                    myView.mPaint.setStrokeWidth(10);
                    count++;
                } else {
                    btnTh.setText("Thick");
                    myView.mPaint.setStrokeWidth(20);
                    count++;
                }
            }
        }));

        ((Button) findViewById(R.id.btnClear)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myView.mBitmap.eraseColor(Color.TRANSPARENT);
                myView.invalidate();
            }
        });
    }

    private static class MyPaintView extends View {
        private Bitmap mBitmap;
        private Canvas mCanvas;
        private Path mPath;
        private Paint mPaint;

        public MyPaintView(Context context) {
            super(context);
            mPath = new Path();
            mPaint = new Paint();
            mPaint.setColor(Color.RED);
            mPaint.setColor(Color.GREEN);
            mPaint.setColor(Color.BLUE);
            mPaint.setAntiAlias(true);
            mPaint.setStrokeWidth(10);
            mPaint.setStyle(Paint.Style.STROKE);
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);
            mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
            mCanvas = new Canvas(mBitmap);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawBitmap(mBitmap, 0, 0, null);
            canvas.drawPath(mPath, mPaint);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    mPath.reset();
                    mPath.moveTo(x, y);
                    break;
                case MotionEvent.ACTION_MOVE:
                    mPath.lineTo(x, y);
                    break;
                case MotionEvent.ACTION_UP:
                    mPath.lineTo(x, y);
                    mCanvas.drawPath(mPath, mPaint);
                    mPath.reset();
                    break;
            }
            this.invalidate();
            return true;
        }
    }
}