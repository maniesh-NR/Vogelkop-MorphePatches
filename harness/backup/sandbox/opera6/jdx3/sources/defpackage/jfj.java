package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class jfj {

    @NotNull
    public static final ifj Companion = new ifj();
    public static final l4c[] k = {null, null, null, null, null, z4c.a(f7c.b, new gzh(25)), null, null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final tfj h;
    public final String i;
    public final boolean j;

    public /* synthetic */ jfj(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, tfj tfjVar, String str7, boolean z) {
        if (9 != (i & 9)) {
            x7d.I(i, 9, hfj.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            this.h = null;
        } else {
            this.h = tfjVar;
        }
        if ((i & Constants.Crypt.KEY_LENGTH) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfj)) {
            return false;
        }
        jfj jfjVar = (jfj) obj;
        return Intrinsics.a(this.a, jfjVar.a) && Intrinsics.a(this.b, jfjVar.b) && Intrinsics.a(this.c, jfjVar.c) && Intrinsics.a(this.d, jfjVar.d) && Intrinsics.a(this.e, jfjVar.e) && Intrinsics.a(this.f, jfjVar.f) && Intrinsics.a(this.g, jfjVar.g) && Intrinsics.a(this.h, jfjVar.h) && Intrinsics.a(this.i, jfjVar.i) && this.j == jfjVar.j;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iF = z1m.f((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int iHashCode3 = (iF + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        tfj tfjVar = this.h;
        int iHashCode6 = (iHashCode5 + (tfjVar == null ? 0 : tfjVar.hashCode())) * 31;
        String str5 = this.i;
        return Boolean.hashCode(this.j) + ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }
}
