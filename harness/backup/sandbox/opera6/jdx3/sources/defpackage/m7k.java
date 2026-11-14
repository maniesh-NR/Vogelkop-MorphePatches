package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m7k implements n37, pn9 {

    @NotNull
    public static final Parcelable.Creator<m7k> CREATOR = new l7k((byte) 0);
    public final c8j a;
    public final oba b;

    public m7k(c8j c8jVar, oba obaVar) {
        this.a = c8jVar;
        this.b = obaVar;
    }

    @Override // defpackage.pn9
    public final oba a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7k)) {
            return false;
        }
        m7k m7kVar = (m7k) obj;
        return this.a == m7kVar.a && Intrinsics.a(this.b, m7kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        this.b.writeToParcel(parcel, i);
    }
}
