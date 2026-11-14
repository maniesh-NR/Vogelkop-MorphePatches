package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class jkn {
    public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    public static final Bitmap.Config b = Bitmap.Config.RGB_565;

    public static hkn[] a(Bitmap bitmap, int i, int i2, int i3) {
        int i4 = i2 * i3;
        int[] iArr = new int[i4];
        bitmap.getPixels(iArr, 0, i2, 0, i, i2, i3);
        hkn[] hknVarArr = new hkn[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = iArr[i5];
            hknVarArr[i5] = new hkn(i6, p37.t(i6));
        }
        return hknVarArr;
    }

    public static ikn b(Bitmap bitmap) {
        if (bitmap.getWidth() <= 61 && bitmap.getHeight() <= 61) {
            return c(a(bitmap, 0, bitmap.getWidth(), bitmap.getHeight()));
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.min(bitmap.getWidth(), 61), Math.min(bitmap.getHeight(), 61), false);
        ikn iknVarB = b(bitmapCreateScaledBitmap);
        bitmapCreateScaledBitmap.recycle();
        return iknVarB;
    }

    public static ikn c(hkn[] hknVarArr) {
        Arrays.sort(hknVarArr, new omj((byte) 19));
        hkn hknVar = hknVarArr[hknVarArr.length / 2];
        if (hknVar.b > 0.6f) {
            int i = 0;
            while (i < hknVarArr.length && hknVarArr[i].b <= 0.2f) {
                i++;
            }
            if ((i * 100) / hknVarArr.length > 20) {
                hknVar = hknVarArr[i];
            }
        }
        return new ikn(hknVar.a, hknVarArr[0].b, hknVarArr[hknVarArr.length - 1].b);
    }

    public static Bitmap d(Bitmap bitmap, Bitmap.Config config) {
        if (!bitmap.hasAlpha()) {
            return bitmap;
        }
        Bitmap bitmapU = z5i.u(bitmap.getWidth(), bitmap.getHeight(), config);
        if (bitmapU == null) {
            return null;
        }
        bitmapU.eraseColor(-16777216);
        new Canvas(bitmapU).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapU;
    }
}
