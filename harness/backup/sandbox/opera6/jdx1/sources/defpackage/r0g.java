package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r0g extends wak implements Parcelable, guj, iak, afe {

    @NotNull
    public static final Parcelable.Creator<r0g> CREATOR = new kuf((byte) 4);
    public fuj b;

    public r0g(long j) {
        ttj ttjVarH = ytj.h();
        fuj fujVar = new fuj(ttjVarH.g(), j);
        if (!(ttjVarH instanceof lz9)) {
            fujVar.b = new fuj(1L, j);
        }
        this.b = fujVar;
    }

    @Override // defpackage.vak
    public final void b(yak yakVar) {
        this.b = (fuj) yakVar;
    }

    @Override // defpackage.vak
    public final yak c() {
        return this.b;
    }

    @Override // defpackage.vak
    public final yak d(yak yakVar, yak yakVar2, yak yakVar3) {
        if (((fuj) yakVar2).c == ((fuj) yakVar3).c) {
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
        return Long.valueOf(h());
    }

    public final long h() {
        return ((fuj) ytj.s(this.b, this)).c;
    }

    public final void i(long j) {
        ttj ttjVarH;
        fuj fujVar = (fuj) ytj.f(this.b);
        if (fujVar.c != j) {
            fuj fujVar2 = this.b;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                ((fuj) ytj.n(fujVar2, this, ttjVarH, fujVar)).c = j;
            }
            ytj.l(ttjVarH, this);
        }
    }

    @Override // defpackage.afe
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((fuj) ytj.f(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}
