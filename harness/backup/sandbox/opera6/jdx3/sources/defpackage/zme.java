package defpackage;

import com.leanplum.internal.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class zme {

    @NotNull
    public static final ome Companion = new ome();
    public static final crb j = phj.o(rpb.d, new zbe(3));
    public final long a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final ume g;
    public final ume h;
    public final yme i;

    public /* synthetic */ zme(int i, long j2, String str, Long l, String str2, String str3, String str4, ume umeVar, ume umeVar2, yme ymeVar) {
        if (201 != (i & 201)) {
            x7d.I(i, 201, nme.a.getDescriptor());
            throw null;
        }
        this.a = j2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        this.d = str2;
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
        this.g = umeVar;
        this.h = umeVar2;
        if ((i & Constants.Crypt.KEY_LENGTH) == 0) {
            this.i = null;
        } else {
            this.i = ymeVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zme)) {
            return false;
        }
        zme zmeVar = (zme) obj;
        return this.a == zmeVar.a && Intrinsics.a(this.b, zmeVar.b) && Intrinsics.a(this.c, zmeVar.c) && Intrinsics.a(this.d, zmeVar.d) && Intrinsics.a(this.e, zmeVar.e) && Intrinsics.a(this.f, zmeVar.f) && Intrinsics.a(this.g, zmeVar.g) && Intrinsics.a(this.h, zmeVar.h) && Intrinsics.a(this.i, zmeVar.i);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iF = z1m.f((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode3 = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (this.h.hashCode() + ((this.g.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        yme ymeVar = this.i;
        return iHashCode4 + (ymeVar != null ? ymeVar.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
