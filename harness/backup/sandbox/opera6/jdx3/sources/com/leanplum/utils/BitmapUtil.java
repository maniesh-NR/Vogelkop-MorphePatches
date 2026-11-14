package com.leanplum.utils;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.leanplum.internal.Log;
import defpackage.sko;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public class BitmapUtil {
    private static final int BIG_PICTURE_MAX_HEIGHT_DP = 192;

    private static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int i6 = i3 / 2;
        int i7 = i4 / 2;
        while (i6 / i5 >= i2 && i7 / i5 >= i) {
            i5 <<= 1;
        }
        return i5;
    }

    private static void closeStream(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.e("IOException during closing of image download stream.", e);
            }
        }
    }

    private static Drawable getBackground(int i, int i2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        float f = SizeUtil.dp10;
        RoundRectShape roundRectShape = new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(roundRectShape);
        shapeDrawable.getPaint().setColor(i2);
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_focused}, shapeDrawable);
        stateListDrawable.addState(new int[]{-16842919, R.attr.state_focused}, shapeDrawable);
        stateListDrawable.addState(new int[]{R.attr.state_pressed, -16842908}, shapeDrawable);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(roundRectShape);
        shapeDrawable2.getPaint().setColor(i);
        stateListDrawable.addState(new int[]{-16842919, -16842908}, shapeDrawable2);
        return stateListDrawable;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0053: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:17:0x0053 */
    private static Bitmap getBitmapFromUrl(String str, int i, int i2) throws Throwable {
        InputStream inputStreamOpenStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            try {
                inputStreamOpenStream = new URL(str).openStream();
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStreamOpenStream, null, options);
                    closeStream(inputStreamOpenStream);
                    inputStreamOpenStream = new URL(str).openStream();
                    options.inSampleSize = calculateInSampleSize(options, i, i2);
                    options.inJustDecodeBounds = false;
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenStream, null, options);
                    closeStream(inputStreamOpenStream);
                    return bitmapDecodeStream;
                } catch (IOException e) {
                    e = e;
                    Log.e("IOException in image download for URL: " + str + ".", e);
                    closeStream(inputStreamOpenStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                closeStream(inputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStreamOpenStream = null;
        } catch (Throwable th2) {
            th = th2;
            closeStream(inputStream2);
            throw th;
        }
    }

    public static int getDarker(int i, int i2) {
        if (i2 < 0 || i2 > 100) {
            i2 = 0;
        }
        double d = (100 - i2) / 100.0d;
        return (((i >> 24) & 255) << 24) | ((((int) (((i >> 16) & 255) * d)) & 255) << 16) | ((((int) (((i >> 8) & 255) * d)) & 255) << 8) | (((int) ((i & 255) * d)) & 255);
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-16777216);
        float f = i;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap getScaledBitmap(Context context, String str) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int iRound = Math.round((displayMetrics.density * 192.0f) + 0.5f);
        return getScaledBitmap(str, Math.min(iRound << 1, displayMetrics.widthPixels), iRound);
    }

    public static Bitmap getScaledBitmap(String str, int i, int i2) throws Throwable {
        Bitmap bitmapFromUrl = getBitmapFromUrl(str, i, i2);
        try {
            return Bitmap.createScaledBitmap(bitmapFromUrl, i, i2, true);
        } catch (Exception e) {
            StringBuilder sbP = sko.p(i, "Failed on scale image ", str, " to (", ", ");
            sbP.append(i2);
            sbP.append(")");
            Log.e(sbP.toString(), e);
            return bitmapFromUrl;
        }
    }

    public static void stateBackground(View view, int i, int i2) {
        view.setBackground(getBackground(i, i2));
    }

    public static void stateBackgroundDarkerByPercentage(View view, int i, int i2) {
        stateBackground(view, i, getDarker(i, i2));
    }
}
