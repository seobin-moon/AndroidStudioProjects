package com.example.j202046198_1108;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class myPictureView extends View {
    String imagePath = null;
    public myPictureView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }
    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        if (imagePath != null) {
            Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
            canvas.drawBitmap(bitmap, 0, 0, null);
            bitmap.recycle();
            Matrix matrix = new Matrix();
            matrix.postRotate(degree);
            return Bitmap.createBitmap(src, 0, 0, src.getWidth(), src.getHeight(), matrix, true);

        }
    }
}

public class ImageRotateActivity extends Activity {
    ImageView mImaveView;
    int mDegree = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_rotate);

        Button button = (Button) findViewById(R.id.btn_rotate);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mDegree = mDegree + 90;
                mImaveView = (myPictureView) findViewById(R.id.imgRotate);
                mImaveView.setImageBitmap(rotateImage(
                        BitmapFactory.decodeResource(getResources(),
                                R.drawable.rabbit), mDegree));
            }
        });