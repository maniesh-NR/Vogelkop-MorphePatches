package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class p3o {
    public static final List a;

    static {
        new Size(0, 0);
        a = Collections.EMPTY_LIST;
    }

    public static Rect a(Rect rect, r9b r9bVar) {
        int i;
        Rect rect2 = new Rect(rect);
        int i2 = r9bVar.a;
        if (i2 != 0) {
            rect2.right = rect.left + i2;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = r9bVar.b;
        if (i3 != 0) {
            if (i > 0) {
                return new Rect();
            }
            rect2.bottom = rect.top + i3;
            i++;
        }
        int i4 = r9bVar.c;
        if (i4 != 0) {
            if (i > 0) {
                return new Rect();
            }
            rect2.left = rect.right - i4;
            i++;
        }
        int i5 = r9bVar.d;
        if (i5 != 0) {
            if (i > 0) {
                return new Rect();
            }
            rect2.top = rect.bottom - i5;
            i++;
        }
        return i == 1 ? rect2 : new Rect();
    }
}
