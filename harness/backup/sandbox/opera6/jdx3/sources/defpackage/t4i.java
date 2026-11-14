package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t4i implements r37 {

    @NotNull
    public static final Parcelable.Creator<t4i> CREATOR = new zug((byte) 20);
    public final k15 a;
    public final q4i b;

    static {
        j15 j15Var = k15.Companion;
    }

    public t4i(k15 k15Var, q4i q4iVar) {
        this.a = k15Var;
        this.b = q4iVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b.name());
    }
}
