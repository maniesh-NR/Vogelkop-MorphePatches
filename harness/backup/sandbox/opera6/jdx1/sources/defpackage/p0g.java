package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class p0g extends wak implements Parcelable, guj, iak, afe {

    @NotNull
    public static final Parcelable.Creator<p0g> CREATOR = new kuf((byte) 2);
    public duj b;

    public p0g(float f) {
        ttj ttjVarH = ytj.h();
        duj dujVar = new duj(ttjVarH.g(), f);
        if (!(ttjVarH instanceof lz9)) {
            dujVar.b = new duj(1L, f);
        }
        this.b = dujVar;
    }

    @Override // defpackage.vak
    public final void b(yak yakVar) {
        this.b = (duj) yakVar;
    }

    @Override // defpackage.vak
    public final yak c() {
        return this.b;
    }

    @Override // defpackage.vak
    public final yak d(yak yakVar, yak yakVar2, yak yakVar3) {
        if (((duj) yakVar2).c == ((duj) yakVar3).c) {
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
        return Float.valueOf(h());
    }

    public final float h() {
        return ((duj) ytj.s(this.b, this)).c;
    }

    public final void i(float f) {
        ttj ttjVarH;
        duj dujVar = (duj) ytj.f(this.b);
        if (dujVar.c == f) {
            return;
        }
        duj dujVar2 = this.b;
        synchronized (ytj.c) {
            ttjVarH = ytj.h();
            ((duj) ytj.n(dujVar2, this, ttjVarH, dujVar)).c = f;
        }
        ytj.l(ttjVarH, this);
    }

    @Override // defpackage.afe
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((duj) ytj.f(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}
