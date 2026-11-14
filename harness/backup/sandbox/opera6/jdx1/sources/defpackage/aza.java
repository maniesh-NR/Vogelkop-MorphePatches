package defpackage;

import kotlin.coroutines.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class aza {
    public final h a;
    public final h b;
    public final h c;
    public final opj d;
    public final lli e;
    public final wog f;

    public aza(h hVar, h hVar2, h hVar3, opj opjVar, lli lliVar, wog wogVar) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar3;
        this.d = opjVar;
        this.e = lliVar;
        this.f = wogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aza)) {
            return false;
        }
        aza azaVar = (aza) obj;
        return Intrinsics.a(this.a, azaVar.a) && Intrinsics.a(this.b, azaVar.b) && Intrinsics.a(this.c, azaVar.c) && Intrinsics.a(this.d, azaVar.d) && this.e == azaVar.e && this.f == azaVar.f;
    }

    public final int hashCode() {
        u91 u91Var = u91.q;
        int iHashCode = (u91Var.hashCode() + ((u91Var.hashCode() + (u91Var.hashCode() * 31)) * 31)) * 31;
        opj opjVar = this.d;
        int iHashCode2 = (iHashCode + (opjVar == null ? 0 : opjVar.hashCode())) * 31;
        lli lliVar = this.e;
        int iHashCode3 = (iHashCode2 + (lliVar == null ? 0 : lliVar.hashCode())) * 31;
        wog wogVar = this.f;
        return iHashCode3 + (wogVar != null ? wogVar.hashCode() : 0);
    }

    public final String toString() {
        u91 u91Var = u91.q;
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + u91Var + ", errorFactory=" + u91Var + ", fallbackFactory=" + u91Var + ", sizeResolver=" + this.d + ", scale=" + this.e + ", precision=" + this.f + ")";
    }
}
