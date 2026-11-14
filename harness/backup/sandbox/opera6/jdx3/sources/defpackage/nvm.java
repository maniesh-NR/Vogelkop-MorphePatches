package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nvm {
    public final String a;
    public final pxh b;
    public final pxh c;
    public final ti3 d;
    public final Uri e;
    public final boolean f;

    public nvm(String str, pxh pxhVar, pxh pxhVar2, ti3 ti3Var, Uri uri, boolean z) {
        this.a = str;
        this.b = pxhVar;
        this.c = pxhVar2;
        this.d = ti3Var;
        this.e = uri;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvm)) {
            return false;
        }
        nvm nvmVar = (nvm) obj;
        return Intrinsics.a(this.a, nvmVar.a) && this.b.equals(nvmVar.b) && Intrinsics.a(this.c, nvmVar.c) && this.d == nvmVar.d && Intrinsics.a(this.e, nvmVar.e) && this.f == nvmVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        pxh pxhVar = this.c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (pxhVar == null ? 0 : pxhVar.hashCode())) * 31)) * 31;
        Uri uri = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (uri != null ? uri.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }
}
