package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class rpc {

    @NotNull
    public static final qpc Companion = new qpc();
    public static final l4c[] j = {null, null, null, null, z4c.a(f7c.b, new fza((byte) 22)), null, null, null, null};
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final boc e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public /* synthetic */ rpc(int i, long j2, long j3, String str, String str2, boc bocVar, String str3, String str4, String str5, String str6) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, ppc.a.getDescriptor());
            throw null;
        }
        this.a = j2;
        this.b = j3;
        this.c = str;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bocVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & Constants.Crypt.KEY_LENGTH) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpc)) {
            return false;
        }
        rpc rpcVar = (rpc) obj;
        return this.a == rpcVar.a && this.b == rpcVar.b && Intrinsics.a(this.c, rpcVar.c) && Intrinsics.a(this.d, rpcVar.d) && this.e == rpcVar.e && Intrinsics.a(this.f, rpcVar.f) && Intrinsics.a(this.g, rpcVar.g) && Intrinsics.a(this.h, rpcVar.h) && Intrinsics.a(this.i, rpcVar.i);
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        boc bocVar = this.e;
        int iHashCode2 = (iHashCode + (bocVar == null ? 0 : bocVar.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
