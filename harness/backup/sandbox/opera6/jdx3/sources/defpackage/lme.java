package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class lme {

    @NotNull
    public static final kme Companion = new kme();
    public final Long a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;

    public /* synthetic */ lme(int i, Long l, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num6;
        }
        if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            this.h = null;
        } else {
            this.h = num7;
        }
        if ((i & Constants.Crypt.KEY_LENGTH) == 0) {
            this.i = null;
        } else {
            this.i = num8;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lme)) {
            return false;
        }
        lme lmeVar = (lme) obj;
        return Intrinsics.a(this.a, lmeVar.a) && Intrinsics.a(this.b, lmeVar.b) && Intrinsics.a(this.c, lmeVar.c) && Intrinsics.a(this.d, lmeVar.d) && Intrinsics.a(this.e, lmeVar.e) && Intrinsics.a(this.f, lmeVar.f) && Intrinsics.a(this.g, lmeVar.g) && Intrinsics.a(this.h, lmeVar.h) && Intrinsics.a(this.i, lmeVar.i) && Intrinsics.a(this.j, lmeVar.j);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.g;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.h;
        int iHashCode8 = (iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.i;
        int iHashCode9 = (iHashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.j;
        return iHashCode9 + (num9 != null ? num9.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
