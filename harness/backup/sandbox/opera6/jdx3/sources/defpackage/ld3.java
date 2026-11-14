package defpackage;

import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class ld3 {

    @NotNull
    public static final kd3 Companion = new kd3();
    public static final l4c[] i;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final List h;

    static {
        f7c f7cVar = f7c.b;
        i = new l4c[]{null, null, null, null, null, null, z4c.a(f7cVar, new vk1((byte) 28)), z4c.a(f7cVar, new vk1((byte) 29))};
    }

    public ld3(int i2, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2) {
        if (1 != (i2 & 1)) {
            x7d.I(i2, 1, jd3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i2 & 64) == 0) {
            this.g = l08.a;
        } else {
            this.g = list;
        }
        if ((i2 & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            this.h = l08.a;
        } else {
            this.h = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld3)) {
            return false;
        }
        ld3 ld3Var = (ld3) obj;
        return Intrinsics.a(this.a, ld3Var.a) && Intrinsics.a(this.b, ld3Var.b) && Intrinsics.a(this.c, ld3Var.c) && Intrinsics.a(this.d, ld3Var.d) && Intrinsics.a(this.e, ld3Var.e) && Intrinsics.a(this.f, ld3Var.f) && Intrinsics.a(this.g, ld3Var.g) && Intrinsics.a(this.h, ld3Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return this.h.hashCode() + rfp.f((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        return "";
    }
}
