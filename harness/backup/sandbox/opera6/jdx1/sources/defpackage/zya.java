package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zya {
    public static final zya e;
    public final g29 a;
    public final CoroutineContext b;
    public final opj c;
    public final hn8 d;

    static {
        g29 g29Var = g29.SYSTEM;
        h hVar = h.a;
        cv6 cv6Var = bb7.a;
        mr6 mr6Var = mr6.b;
        j74 j74Var = j74.c;
        bmh bmhVar = opj.a;
        lli lliVar = lli.a;
        wog wogVar = wog.a;
        e = new zya(g29Var, hVar, bmhVar, hn8.b);
    }

    public zya(g29 g29Var, CoroutineContext coroutineContext, opj opjVar, hn8 hn8Var) {
        mr6 mr6Var = mr6.b;
        j74 j74Var = j74.c;
        lli lliVar = lli.a;
        wog wogVar = wog.a;
        this.a = g29Var;
        this.b = coroutineContext;
        this.c = opjVar;
        this.d = hn8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zya)) {
            return false;
        }
        zya zyaVar = (zya) obj;
        if (!Intrinsics.a(this.a, zyaVar.a) || !Intrinsics.a(this.b, zyaVar.b)) {
            return false;
        }
        mr6 mr6Var = mr6.b;
        j74 j74Var = j74.c;
        if (!Intrinsics.a(this.c, zyaVar.c)) {
            return false;
        }
        lli lliVar = lli.a;
        wog wogVar = wog.a;
        return Intrinsics.a(this.d, zyaVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        mr6 mr6Var = mr6.b;
        int iHashCode2 = (mr6Var.hashCode() + ((mr6Var.hashCode() + iHashCode) * 31)) * 31;
        j74 j74Var = j74.c;
        int iHashCode3 = (j74Var.hashCode() + ((j74Var.hashCode() + ((j74Var.hashCode() + iHashCode2) * 31)) * 31)) * 31;
        u91 u91Var = u91.q;
        return this.d.a.hashCode() + ((wog.a.hashCode() + ((lli.b.hashCode() + ((this.c.hashCode() + ((u91Var.hashCode() + ((u91Var.hashCode() + ((u91Var.hashCode() + iHashCode3) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        mr6 mr6Var = mr6.b;
        j74 j74Var = j74.c;
        u91 u91Var = u91.q;
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + mr6Var + ", decoderCoroutineContext=" + mr6Var + ", memoryCachePolicy=" + j74Var + ", diskCachePolicy=" + j74Var + ", networkCachePolicy=" + j74Var + ", placeholderFactory=" + u91Var + ", errorFactory=" + u91Var + ", fallbackFactory=" + u91Var + ", sizeResolver=" + this.c + ", scale=" + lli.b + ", precision=" + wog.a + ", extras=" + this.d + ")";
    }
}
