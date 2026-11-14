package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s5h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<s5h> CREATOR = new zug(2);
    public final n8g a;
    public final boolean b;
    public final int c;
    public final nil d;
    public final boolean e;
    public final n8g f;

    public s5h(n8g n8gVar, boolean z, int i, nil nilVar, boolean z2, n8g n8gVar2) {
        this.a = n8gVar;
        this.b = z;
        this.c = i;
        this.d = nilVar;
        this.e = z2;
        this.f = n8gVar2;
    }

    public static s5h a(s5h s5hVar, n8g n8gVar, boolean z, int i, int i2) {
        nil nilVar = nil.b;
        if ((i2 & 1) != 0) {
            n8gVar = s5hVar.a;
        }
        n8g n8gVar2 = n8gVar;
        if ((i2 & 2) != 0) {
            z = s5hVar.b;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i = s5hVar.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            nilVar = s5hVar.d;
        }
        nil nilVar2 = nilVar;
        boolean z3 = (i2 & 16) != 0 ? s5hVar.e : false;
        n8g n8gVar3 = (i2 & 32) != 0 ? s5hVar.f : null;
        s5hVar.getClass();
        return new s5h(n8gVar2, z2, i3, nilVar2, z3, n8gVar3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5h)) {
            return false;
        }
        s5h s5hVar = (s5h) obj;
        return this.a == s5hVar.a && this.b == s5hVar.b && this.c == s5hVar.c && this.d == s5hVar.d && this.e == s5hVar.e && this.f == s5hVar.f;
    }

    public final int hashCode() {
        int iK = fki.k((this.d.hashCode() + rfp.c(this.c, fki.k(this.a.hashCode() * 31, 31, this.b), 31)) * 31, 31, this.e);
        n8g n8gVar = this.f;
        return iK + (n8gVar == null ? 0 : n8gVar.hashCode());
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
        parcel.writeString(this.d.name());
        parcel.writeInt(this.e ? 1 : 0);
        n8g n8gVar = this.f;
        if (n8gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(n8gVar.name());
        }
    }
}
