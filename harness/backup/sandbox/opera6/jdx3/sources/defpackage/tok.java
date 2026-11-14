package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface tok {
    public static final y0b a;

    static {
        y0b y0bVar = y0b.c;
        int[] iArr = new int[11];
        iArr[0] = 1;
        System.arraycopy(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, 0, iArr, 1, 10);
        a = new y0b(iArr);
    }
}
