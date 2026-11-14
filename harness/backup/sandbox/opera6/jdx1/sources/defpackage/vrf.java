package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vrf {
    public final Context a;
    public final apj b;
    public final lli c;
    public final wog d;
    public final g29 e;
    public final j74 f;
    public final j74 g;
    public final j74 h;
    public final hn8 i;

    public vrf(Context context, apj apjVar, lli lliVar, wog wogVar, g29 g29Var, j74 j74Var, j74 j74Var2, j74 j74Var3, hn8 hn8Var) {
        this.a = context;
        this.b = apjVar;
        this.c = lliVar;
        this.d = wogVar;
        this.e = g29Var;
        this.f = j74Var;
        this.g = j74Var2;
        this.h = j74Var3;
        this.i = hn8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrf)) {
            return false;
        }
        vrf vrfVar = (vrf) obj;
        return Intrinsics.a(this.a, vrfVar.a) && Intrinsics.a(this.b, vrfVar.b) && this.c == vrfVar.c && this.d == vrfVar.d && Intrinsics.a(this.e, vrfVar.e) && this.f == vrfVar.f && this.g == vrfVar.g && this.h == vrfVar.h && this.i.equals(vrfVar.i);
    }

    public final int hashCode() {
        return this.i.a.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=null, fileSystem=" + this.e + ", memoryCachePolicy=" + this.f + ", diskCachePolicy=" + this.g + ", networkCachePolicy=" + this.h + ", extras=" + this.i + ")";
    }
}
