package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q0g extends wak implements Parcelable, guj, iak, afe {

    @NotNull
    public static final Parcelable.Creator<q0g> CREATOR = new kuf((byte) 3);
    public euj b;

    public q0g(int i) {
        ttj ttjVarH = ytj.h();
        euj eujVar = new euj(ttjVarH.g(), i);
        if (!(ttjVarH instanceof lz9)) {
            eujVar.b = new euj(1L, i);
        }
        this.b = eujVar;
    }

    @Override // defpackage.vak
    public final void b(yak yakVar) {
        this.b = (euj) yakVar;
    }

    @Override // defpackage.vak
    public final yak c() {
        return this.b;
    }

    @Override // defpackage.vak
    public final yak d(yak yakVar, yak yakVar2, yak yakVar3) {
        if (((euj) yakVar2).c == ((euj) yakVar3).c) {
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
        return zpa.k;
    }

    @Override // defpackage.iak
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((euj) ytj.s(this.b, this)).c;
    }

    public final void i(int i) {
        ttj ttjVarH;
        euj eujVar = (euj) ytj.f(this.b);
        if (eujVar.c != i) {
            euj eujVar2 = this.b;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                ((euj) ytj.n(eujVar2, this, ttjVarH, eujVar)).c = i;
            }
            ytj.l(ttjVarH, this);
        }
    }

    @Override // defpackage.afe
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return sko.h(((euj) ytj.f(this.b)).c, hashCode(), "MutableIntState(value=", ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}
