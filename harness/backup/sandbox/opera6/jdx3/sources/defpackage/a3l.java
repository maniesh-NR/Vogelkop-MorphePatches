package defpackage;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a3l extends zwg {
    public final ir a;
    public final Rect b;
    public final View c;
    public final View d;
    public final boolean e;

    public a3l(ir irVar, Rect rect, View view, View view2, boolean z) {
        this.a = irVar;
        this.b = rect;
        this.c = view;
        this.d = view2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a3l) {
            a3l a3lVar = (a3l) obj;
            if (this.a == a3lVar.a && this.b.equals(a3lVar.b) && this.c.equals(a3lVar.c) && Intrinsics.a(this.d, a3lVar.d) && this.e == a3lVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
