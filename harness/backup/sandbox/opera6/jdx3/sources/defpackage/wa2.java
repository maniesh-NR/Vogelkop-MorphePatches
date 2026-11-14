package defpackage;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class wa2 {
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public boolean c = true;
    public boolean d;

    public final void a(int i, Rect rect) {
        rect.set(this.a);
        int i2 = rect.left;
        Rect rect2 = this.b;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right += rect2.right;
        int i3 = rect.bottom + rect2.bottom;
        rect.bottom = i3;
        if (this.c) {
            rect.bottom = i3 + i;
        }
    }
}
