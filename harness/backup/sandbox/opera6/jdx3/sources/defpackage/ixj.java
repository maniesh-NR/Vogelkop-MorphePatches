package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ixj {
    public final int a;
    public final Rect b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final Rect h;

    public ixj(int i, Rect rect, int i2, int i3) {
        this(i, rect, i2, i3, false, 240);
    }

    public ixj(int i, Rect rect, int i2, int i3, int i4, boolean z, boolean z2, Rect rect2) {
        this.a = i;
        this.b = rect;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = z;
        this.g = z2;
        this.h = rect2;
    }

    public /* synthetic */ ixj(int i, Rect rect, int i2, int i3, boolean z, int i4) {
        this(i, rect, i2, i3, (i4 & 16) != 0 ? 3 : 1, (i4 & 32) != 0 ? false : z, false, rect);
    }

    public static final r9b b(View view) {
        WeakHashMap weakHashMap = r5n.a;
        g3o g3oVarA = i5n.a(view);
        if (g3oVarA == null) {
            return r9b.c(0, 0, 0, 0);
        }
        r9b r9bVarI = g3oVarA.a.i(527);
        Rect rectR = q9n.r(view.getRootView());
        int i = rectR.left + r9bVarI.a;
        int i2 = rectR.top + r9bVarI.b;
        int i3 = rectR.right - r9bVarI.c;
        int i4 = rectR.bottom - r9bVarI.d;
        Rect rectR2 = q9n.r(view);
        return r9b.c(Math.max(0, i - rectR2.left), Math.max(0, i2 - rectR2.top), Math.max(0, rectR2.right - i3), Math.max(0, rectR2.bottom - i4));
    }

    public final ixj a(r9b r9bVar) {
        return new ixj(this.a, this.b, Math.max(this.c, r9bVar.b), Math.max(this.d, r9bVar.d), this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixj)) {
            return false;
        }
        ixj ixjVar = (ixj) obj;
        return this.a == ixjVar.a && Intrinsics.a(this.b, ixjVar.b) && this.c == ixjVar.c && this.d == ixjVar.d && this.e == ixjVar.e && this.f == ixjVar.f && this.g == ixjVar.g && Intrinsics.a(this.h, ixjVar.h);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Rect rect = this.b;
        int iK = fki.k(fki.k(rfp.c(this.e, rfp.c(this.d, rfp.c(this.c, (iHashCode + (rect == null ? 0 : rect.hashCode())) * 31, 31), 31), 31), 31, this.f), 31, this.g);
        Rect rect2 = this.h;
        return iK + (rect2 != null ? rect2.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
