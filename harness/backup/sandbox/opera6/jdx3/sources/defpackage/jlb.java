package defpackage;

import android.view.View;
import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jlb {
    public final ial a;
    public final klb b;
    public final View c;
    public final i d;

    public jlb(ial ialVar, klb klbVar, View view, i iVar) {
        this.a = ialVar;
        this.b = klbVar;
        this.c = view;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlb)) {
            return false;
        }
        jlb jlbVar = (jlb) obj;
        return this.a.equals(jlbVar.a) && this.b.equals(jlbVar.b) && this.c.equals(jlbVar.c) && Intrinsics.a(this.d, jlbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
