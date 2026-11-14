package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bza {
    public final Context a;
    public final Object b;
    public final yqa c;
    public final Map d;
    public final g29 e;
    public final CoroutineContext f;
    public final CoroutineContext g;
    public final CoroutineContext h;
    public final j74 i;
    public final j74 j;
    public final j74 k;
    public final opj l;
    public final lli m;
    public final wog n;
    public final hn8 o;
    public final aza p;
    public final zya q;

    public bza(Context context, Object obj, yqa yqaVar, Map map, g29 g29Var, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, j74 j74Var, j74 j74Var2, j74 j74Var3, opj opjVar, lli lliVar, wog wogVar, hn8 hn8Var, aza azaVar, zya zyaVar) {
        this.a = context;
        this.b = obj;
        this.c = yqaVar;
        this.d = map;
        this.e = g29Var;
        this.f = coroutineContext;
        this.g = coroutineContext2;
        this.h = coroutineContext3;
        this.i = j74Var;
        this.j = j74Var2;
        this.k = j74Var3;
        this.l = opjVar;
        this.m = lliVar;
        this.n = wogVar;
        this.o = hn8Var;
        this.p = azaVar;
        this.q = zyaVar;
    }

    public static yya a(bza bzaVar) {
        Context context = bzaVar.a;
        bzaVar.getClass();
        return new yya(bzaVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bza)) {
            return false;
        }
        bza bzaVar = (bza) obj;
        return Intrinsics.a(this.a, bzaVar.a) && Intrinsics.a(this.b, bzaVar.b) && Intrinsics.a(this.c, bzaVar.c) && Intrinsics.a(this.d, bzaVar.d) && Intrinsics.a(this.e, bzaVar.e) && Intrinsics.a(this.f, bzaVar.f) && Intrinsics.a(this.g, bzaVar.g) && Intrinsics.a(this.h, bzaVar.h) && this.i == bzaVar.i && this.j == bzaVar.j && this.k == bzaVar.k && Intrinsics.a(this.l, bzaVar.l) && this.m == bzaVar.m && this.n == bzaVar.n && Intrinsics.a(this.o, bzaVar.o) && this.p.equals(bzaVar.p) && Intrinsics.a(this.q, bzaVar.q);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        yqa yqaVar = this.c;
        int iHashCode2 = (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + z1m.h(this.d, (iHashCode + (yqaVar == null ? 0 : yqaVar.hashCode())) * 29791, 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961;
        u91 u91Var = u91.q;
        return this.q.hashCode() + ((this.p.hashCode() + z1m.h(this.o.a, (this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((u91Var.hashCode() + ((u91Var.hashCode() + ((u91Var.hashCode() + iHashCode2) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        u91 u91Var = u91.q;
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=null, memoryCacheKey=null, memoryCacheKeyExtras=" + this.d + ", diskCacheKey=null, fileSystem=" + this.e + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f + ", fetcherCoroutineContext=" + this.g + ", decoderCoroutineContext=" + this.h + ", memoryCachePolicy=" + this.i + ", diskCachePolicy=" + this.j + ", networkCachePolicy=" + this.k + ", placeholderMemoryCacheKey=null, placeholderFactory=" + u91Var + ", errorFactory=" + u91Var + ", fallbackFactory=" + u91Var + ", sizeResolver=" + this.l + ", scale=" + this.m + ", precision=" + this.n + ", extras=" + this.o + ", defined=" + this.p + ", defaults=" + this.q + ")";
    }
}
