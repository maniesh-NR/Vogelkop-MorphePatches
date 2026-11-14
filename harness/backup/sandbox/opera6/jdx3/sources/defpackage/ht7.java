package defpackage;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ht7 {
    public final bfl a;
    public final View b;
    public final gt7 c;

    public ht7(bfl bflVar, View view, gt7 gt7Var) {
        this.a = bflVar;
        this.b = view;
        this.c = gt7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ht7) {
            ht7 ht7Var = (ht7) obj;
            if (this.a == ht7Var.a && Intrinsics.a(this.b, ht7Var.b) && this.c == ht7Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
