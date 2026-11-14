package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wlh {
    public final Context a;
    public final zya b;
    public final zyk c;
    public final zyk d;
    public final zyk e;
    public final ke5 f;

    public wlh(Context context, zya zyaVar, zyk zykVar, zyk zykVar2, zyk zykVar3, ke5 ke5Var) {
        this.a = context;
        this.b = zyaVar;
        this.c = zykVar;
        this.d = zykVar2;
        this.e = zykVar3;
        this.f = ke5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wlh) {
            wlh wlhVar = (wlh) obj;
            if (Intrinsics.a(this.a, wlhVar.a) && this.b.equals(wlhVar.b) && this.c == wlhVar.c && Intrinsics.a(this.d, wlhVar.d) && Intrinsics.a(this.e, wlhVar.e) && Intrinsics.a(this.f, wlhVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f.hashCode() + ((mc8.b.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + mc8.b + ", componentRegistry=" + this.f + ", logger=null)";
    }
}
