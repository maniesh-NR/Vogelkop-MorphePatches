package defpackage;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public abstract class gl4 {
    public float a;
    public float b;

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = iArr[i] << 1;
        }
        return iArr2;
    }

    public static float b(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }

    public abstract iwb c(CarouselLayoutManager carouselLayoutManager, View view);

    public abstract boolean d(CarouselLayoutManager carouselLayoutManager, int i);
}
