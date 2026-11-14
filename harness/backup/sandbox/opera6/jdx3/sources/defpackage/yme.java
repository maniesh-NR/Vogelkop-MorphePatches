package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class yme {

    @NotNull
    public static final xme Companion = new xme();
    public static final l4c[] k;
    public final ebb a;
    public final ebb b;
    public final ebb c;
    public final ebb d;
    public final ebb e;
    public final ebb f;
    public final ebb g;
    public final ebb h;
    public final ebb i;
    public final ebb j;

    static {
        f7c f7cVar = f7c.b;
        k = new l4c[]{z4c.a(f7cVar, new uuc((byte) 24)), z4c.a(f7cVar, new uuc((byte) 25)), z4c.a(f7cVar, new uuc((byte) 26)), z4c.a(f7cVar, new uuc((byte) 27)), z4c.a(f7cVar, new uuc((byte) 28)), z4c.a(f7cVar, new uuc((byte) 29)), z4c.a(f7cVar, new vme((byte) 0)), z4c.a(f7cVar, new vme((byte) 1)), z4c.a(f7cVar, new vme((byte) 2)), z4c.a(f7cVar, new vme((byte) 3))};
    }

    public /* synthetic */ yme(int i, ebb ebbVar, ebb ebbVar2, ebb ebbVar3, ebb ebbVar4, ebb ebbVar5, ebb ebbVar6, ebb ebbVar7, ebb ebbVar8, ebb ebbVar9, ebb ebbVar10) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = ebbVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ebbVar2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = ebbVar3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = ebbVar4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = ebbVar5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = ebbVar6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = ebbVar7;
        }
        if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            this.h = null;
        } else {
            this.h = ebbVar8;
        }
        if ((i & Constants.Crypt.KEY_LENGTH) == 0) {
            this.i = null;
        } else {
            this.i = ebbVar9;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = ebbVar10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yme)) {
            return false;
        }
        yme ymeVar = (yme) obj;
        return Intrinsics.a(this.a, ymeVar.a) && Intrinsics.a(this.b, ymeVar.b) && Intrinsics.a(this.c, ymeVar.c) && Intrinsics.a(this.d, ymeVar.d) && Intrinsics.a(this.e, ymeVar.e) && Intrinsics.a(this.f, ymeVar.f) && Intrinsics.a(this.g, ymeVar.g) && Intrinsics.a(this.h, ymeVar.h) && Intrinsics.a(this.i, ymeVar.i) && Intrinsics.a(this.j, ymeVar.j);
    }

    public final int hashCode() {
        ebb ebbVar = this.a;
        int iHashCode = (ebbVar == null ? 0 : ebbVar.hashCode()) * 31;
        ebb ebbVar2 = this.b;
        int iHashCode2 = (iHashCode + (ebbVar2 == null ? 0 : ebbVar2.hashCode())) * 31;
        ebb ebbVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (ebbVar3 == null ? 0 : ebbVar3.hashCode())) * 31;
        ebb ebbVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (ebbVar4 == null ? 0 : ebbVar4.hashCode())) * 31;
        ebb ebbVar5 = this.e;
        int iHashCode5 = (iHashCode4 + (ebbVar5 == null ? 0 : ebbVar5.hashCode())) * 31;
        ebb ebbVar6 = this.f;
        int iHashCode6 = (iHashCode5 + (ebbVar6 == null ? 0 : ebbVar6.hashCode())) * 31;
        ebb ebbVar7 = this.g;
        int iHashCode7 = (iHashCode6 + (ebbVar7 == null ? 0 : ebbVar7.hashCode())) * 31;
        ebb ebbVar8 = this.h;
        int iHashCode8 = (iHashCode7 + (ebbVar8 == null ? 0 : ebbVar8.hashCode())) * 31;
        ebb ebbVar9 = this.i;
        int iHashCode9 = (iHashCode8 + (ebbVar9 == null ? 0 : ebbVar9.hashCode())) * 31;
        ebb ebbVar10 = this.j;
        return iHashCode9 + (ebbVar10 != null ? ebbVar10.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
