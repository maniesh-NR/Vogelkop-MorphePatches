package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class mme {

    @NotNull
    public static final ime Companion = new ime();
    public static final l4c[] t;
    public final long a;
    public final cpc b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final String g;
    public final Integer h;
    public final Integer i;
    public final jnc j;
    public final String k;
    public final String l;
    public final ene m;
    public final Long n;
    public final nne o;
    public final nne p;
    public final long q;
    public final lme r;
    public final rpc s;

    static {
        f7c f7cVar = f7c.b;
        t = new l4c[]{null, z4c.a(f7cVar, new uuc((byte) 21)), null, null, null, null, null, null, null, z4c.a(f7cVar, new uuc((byte) 22)), null, null, z4c.a(f7cVar, new uuc((byte) 23)), null, null, null, null, null, null};
    }

    public /* synthetic */ mme(int i, long j, cpc cpcVar, long j2, long j3, long j4, boolean z, String str, Integer num, Integer num2, jnc jncVar, String str2, String str3, ene eneVar, Long l, nne nneVar, nne nneVar2, long j5, lme lmeVar, rpc rpcVar) {
        if (245885 != (i & 245885)) {
            x7d.I(i, 245885, hme.a.getDescriptor());
            throw null;
        }
        this.a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = cpcVar;
        }
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = str;
        if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            this.h = null;
        } else {
            this.h = num;
        }
        if ((i & Constants.Crypt.KEY_LENGTH) == 0) {
            this.i = null;
        } else {
            this.i = num2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = jncVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = eneVar;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = l;
        }
        this.o = nneVar;
        this.p = nneVar2;
        this.q = j5;
        this.r = lmeVar;
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = rpcVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mme)) {
            return false;
        }
        mme mmeVar = (mme) obj;
        return this.a == mmeVar.a && this.b == mmeVar.b && this.c == mmeVar.c && this.d == mmeVar.d && this.e == mmeVar.e && this.f == mmeVar.f && Intrinsics.a(this.g, mmeVar.g) && Intrinsics.a(this.h, mmeVar.h) && Intrinsics.a(this.i, mmeVar.i) && this.j == mmeVar.j && Intrinsics.a(this.k, mmeVar.k) && Intrinsics.a(this.l, mmeVar.l) && this.m == mmeVar.m && Intrinsics.a(this.n, mmeVar.n) && Intrinsics.a(this.o, mmeVar.o) && Intrinsics.a(this.p, mmeVar.p) && this.q == mmeVar.q && Intrinsics.a(this.r, mmeVar.r) && Intrinsics.a(this.s, mmeVar.s);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        cpc cpcVar = this.b;
        int iF = z1m.f(fki.k(z1m.e(z1m.e(z1m.e((iHashCode + (cpcVar == null ? 0 : cpcVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        Integer num = this.h;
        int iHashCode2 = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        jnc jncVar = this.j;
        int iHashCode4 = (iHashCode3 + (jncVar == null ? 0 : jncVar.hashCode())) * 31;
        String str = this.k;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ene eneVar = this.m;
        int iHashCode7 = (iHashCode6 + (eneVar == null ? 0 : eneVar.hashCode())) * 31;
        Long l = this.n;
        int iHashCode8 = (this.r.hashCode() + z1m.e((this.p.hashCode() + ((this.o.hashCode() + ((iHashCode7 + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 31, 31, this.q)) * 31;
        rpc rpcVar = this.s;
        return iHashCode8 + (rpcVar != null ? rpcVar.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
