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
    float rotationAngle = 0;


    public void setRotationAngle(float angle) {
        rotationAngle = angle;
        invalidate(); // onDraw 메서드를 호출하여 뷰를 다시 그리도록 합니다.
    }

    public myPictureView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        if (imagePath != null) {
            Bitmap bitmap = BitmapFactory.decodeFile(imagePath);

            int picX = (this.getWidth() - bitmap.getWidth()) / 2;
            int picY = (this.getHeight() - bitmap.getHeight()) / 2;

            /*canvas.drawBitmap(bitmap, picX, picY, null);
            bitmap.recycle();*/

            canvas.save();
            canvas.rotate(rotationAngle, this.getWidth() / 2, this.getHeight() / 2);
            canvas.drawBitmap(bitmap, picX, picY, null);
            //canvas.restore();

            bitmap.recycle();
        }
    }
}

