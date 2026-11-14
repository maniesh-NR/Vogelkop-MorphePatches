package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class nne {

    @NotNull
    public static final mne Companion = new mne();
    public static final l4c[] k = {null, null, null, z4c.a(f7c.b, new vme(8)), null, null, null, null, null, null};
    public final long a;
    public final String b;
    public final String c;
    public final boc d;
    public final String e;
    public final String f;
    public final String g;
    public final Integer h;
    public final Integer i;
    public final Integer j;

    public /* synthetic */ nne(int i, long j, String str, String str2, boc bocVar, String str3, String str4, String str5, Integer num, Integer num2, Integer num3) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, lne.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bocVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
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
            this.j = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nne)) {
            return false;
        }
        nne nneVar = (nne) obj;
        return this.a == nneVar.a && Intrinsics.a(this.b, nneVar.b) && Intrinsics.a(this.c, nneVar.c) && this.d == nneVar.d && Intrinsics.a(this.e, nneVar.e) && Intrinsics.a(this.f, nneVar.f) && Intrinsics.a(this.g, nneVar.g) && Intrinsics.a(this.h, nneVar.h) && Intrinsics.a(this.i, nneVar.i) && Intrinsics.a(this.j, nneVar.j);
    }

    public final int hashCode() {
        int iF = z1m.f(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        boc bocVar = this.d;
        int iHashCode2 = (iHashCode + (bocVar == null ? 0 : bocVar.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.j;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
