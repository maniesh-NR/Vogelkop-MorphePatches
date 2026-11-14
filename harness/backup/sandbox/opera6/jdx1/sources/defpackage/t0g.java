package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t0g extends wak implements Parcelable, guj {

    @NotNull
    public static final Parcelable.Creator<t0g> CREATOR = new s0g(0);
    public final iuj b;
    public huj c;

    public t0g(Object obj, iuj iujVar) {
        this.b = iujVar;
        ttj ttjVarH = ytj.h();
        huj hujVar = new huj(ttjVarH.g(), obj);
        if (!(ttjVarH instanceof lz9)) {
            hujVar.b = new huj(1L, obj);
        }
        this.c = hujVar;
    }

    @Override // defpackage.vak
    public final void b(yak yakVar) {
        this.c = (huj) yakVar;
    }

    @Override // defpackage.vak
    public final yak c() {
        return this.c;
    }

    @Override // defpackage.vak
    public final yak d(yak yakVar, yak yakVar2, yak yakVar3) {
        if (this.b.o(((huj) yakVar2).c, ((huj) yakVar3).c)) {
            return yakVar2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.guj
    public final iuj e() {
        return this.b;
    }

    @Override // defpackage.iak
    public final Object getValue() {
        return ((huj) ytj.s(this.c, this)).c;
    }

    @Override // defpackage.afe
    public final void setValue(Object obj) {
        ttj ttjVarH;
        huj hujVar = (huj) ytj.f(this.c);
        if (this.b.o(hujVar.c, obj)) {
            return;
        }
        huj hujVar2 = this.c;
        synchronized (ytj.c) {
            ttjVarH = ytj.h();
            ((huj) ytj.n(hujVar2, this, ttjVarH, hujVar)).c = obj;
        }
        ytj.l(ttjVarH, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((huj) ytj.f(this.c)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        qs7 qs7Var = qs7.g;
        iuj iujVar = this.b;
        if (Intrinsics.a(iujVar, qs7Var)) {
            i2 = 0;
        } else if (Intrinsics.a(iujVar, zpa.k)) {
            i2 = 1;
        } else {
            if (!Intrinsics.a(iujVar, ujp.n)) {
                qp2.n("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
