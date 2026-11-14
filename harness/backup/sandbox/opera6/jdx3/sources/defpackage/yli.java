package defpackage;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yli {
    public final tli a;
    public final tli b;
    public final View.OnClickListener c;
    public final View.OnClickListener d;
    public final a4h e;
    public final boolean f;

    public yli(tli tliVar, tli tliVar2, h4i h4iVar, j5g j5gVar, a4h a4hVar, int i) {
        tliVar = (i & 1) != 0 ? null : tliVar;
        tliVar2 = (i & 2) != 0 ? null : tliVar2;
        h4iVar = (i & 4) != 0 ? null : h4iVar;
        j5gVar = (i & 8) != 0 ? null : j5gVar;
        a4hVar = (i & 16) != 0 ? vli.b : a4hVar;
        boolean z = (i & 32) == 0;
        this.a = tliVar;
        this.b = tliVar2;
        this.c = h4iVar;
        this.d = j5gVar;
        this.e = a4hVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yli)) {
            return false;
        }
        yli yliVar = (yli) obj;
        return Intrinsics.a(this.a, yliVar.a) && Intrinsics.a(this.b, yliVar.b) && Intrinsics.a(this.c, yliVar.c) && Intrinsics.a(this.d, yliVar.d) && this.e.equals(yliVar.e) && this.f == yliVar.f;
    }

    public final int hashCode() {
        tli tliVar = this.a;
        int iHashCode = (tliVar == null ? 0 : tliVar.hashCode()) * 31;
        tli tliVar2 = this.b;
        int iHashCode2 = (iHashCode + (tliVar2 == null ? 0 : tliVar2.hashCode())) * 31;
        View.OnClickListener onClickListener = this.c;
        int iHashCode3 = (iHashCode2 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        View.OnClickListener onClickListener2 = this.d;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((iHashCode3 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
