package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c69 implements e2m {
    public final /* synthetic */ byte a;
    public final int b;
    public final int c;

    public /* synthetic */ c69(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    public final Bitmap a(Bitmap bitmap) {
        Bitmap bitmapCreateScaledBitmap;
        Integer num;
        Bitmap bitmap2 = bitmap;
        byte b = this.a;
        int iB = this.b;
        int iB2 = this.c;
        switch (b) {
            case 0:
                try {
                    if (bitmap2.getWidth() <= bitmap2.getHeight()) {
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, iB, (bitmap2.getHeight() * iB) / bitmap2.getWidth(), true);
                        if (Intrinsics.a(bitmapCreateScaledBitmap, bitmap2)) {
                            return bitmap2;
                        }
                        bitmap2.recycle();
                    } else {
                        if (bitmap2.getHeight() <= iB2) {
                            return bitmap2;
                        }
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, (bitmap2.getWidth() * iB2) / bitmap2.getHeight(), iB2, true);
                        if (Intrinsics.a(bitmapCreateScaledBitmap, bitmap2)) {
                            return bitmap2;
                        }
                        bitmap2.recycle();
                    }
                    bitmap2 = bitmapCreateScaledBitmap;
                    return bitmap2;
                } catch (OutOfMemoryError unused) {
                    return bitmap2;
                }
            default:
                if (bitmap2.getWidth() == iB && bitmap2.getHeight() == iB2) {
                    return bitmap2;
                }
                float f = iB;
                float width = f / bitmap2.getWidth();
                float f2 = iB2;
                float height = f2 / bitmap2.getHeight();
                if (width < height) {
                    int width2 = bitmap2.getWidth() / 4;
                    List listAsList = Arrays.asList(Integer.valueOf(bitmap2.getPixel((bitmap2.getWidth() / 2) - width2, 0)), Integer.valueOf(bitmap2.getPixel((bitmap2.getWidth() / 2) + width2, 0)), Integer.valueOf(bitmap2.getPixel((bitmap2.getWidth() / 2) - width2, bitmap2.getHeight() - 1)), Integer.valueOf(bitmap2.getPixel((bitmap2.getWidth() / 2) + width2, bitmap2.getHeight() - 1)));
                    List list = listAsList;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            int iIntValue2 = ((Number) CollectionsKt.K(listAsList)).intValue();
                            int iRed = Color.red(iIntValue) - Color.red(iIntValue2);
                            int iGreen = Color.green(iIntValue) - Color.green(iIntValue2);
                            int iBlue = Color.blue(iIntValue) - Color.blue(iIntValue2);
                            int iAlpha = Color.alpha(iIntValue) - Color.alpha(iIntValue2);
                            if (Math.sqrt((iAlpha * iAlpha) + (iBlue * iBlue) + (iGreen * iGreen) + (iRed * iRed)) >= 16.0d) {
                                num = null;
                            }
                        }
                    }
                    num = (Integer) CollectionsKt.K(listAsList);
                } else {
                    int height2 = bitmap2.getHeight() / 4;
                    List listAsList2 = Arrays.asList(Integer.valueOf(bitmap2.getPixel(0, (bitmap2.getHeight() / 2) - height2)), Integer.valueOf(bitmap2.getPixel(0, (bitmap2.getHeight() / 2) + height2)), Integer.valueOf(bitmap2.getPixel(bitmap2.getWidth() - 1, (bitmap2.getHeight() / 2) - height2)), Integer.valueOf(bitmap2.getPixel(bitmap2.getWidth() - 1, (bitmap2.getHeight() / 2) + height2)));
                    List list2 = listAsList2;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            int iIntValue3 = ((Number) it2.next()).intValue();
                            int iIntValue4 = ((Number) CollectionsKt.K(listAsList2)).intValue();
                            int iRed2 = Color.red(iIntValue3) - Color.red(iIntValue4);
                            int iGreen2 = Color.green(iIntValue3) - Color.green(iIntValue4);
                            int iBlue2 = Color.blue(iIntValue3) - Color.blue(iIntValue4);
                            int iAlpha2 = Color.alpha(iIntValue3) - Color.alpha(iIntValue4);
                            if (Math.sqrt((iAlpha2 * iAlpha2) + (iBlue2 * iBlue2) + (iGreen2 * iGreen2) + (iRed2 * iRed2)) >= 16.0d) {
                                num = null;
                            }
                        }
                    }
                    num = (Integer) CollectionsKt.K(listAsList2);
                }
                if (bitmap2.hasAlpha() && Color.alpha(bitmap2.getPixel(0, 0)) < 128) {
                    num = -1;
                }
                if (num == null) {
                    return zch.h(bitmap2, (Integer) null, Math.max(width, height), iB, iB2);
                }
                float fMin = Math.min(width, height);
                if (fMin > 1.0f) {
                    iB = zed.b(f / fMin);
                    iB2 = zed.b(f2 / fMin);
                    fMin = 1.0f;
                }
                return zch.h(bitmap2, num, fMin, iB, iB2);
        }
    }

    public final String key() {
        switch (this.a) {
            case 0:
                return fki.o(this.b, this.c, "FitShortSideTransform(", "x", ")");
            default:
                return fki.o(this.b, this.c, "SiteImageScaleAndPrettifyTransform(", "x", ")");
        }
    }
}
