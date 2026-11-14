package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class tca implements r37 {

    @NotNull
    public static final Parcelable.Creator<tca> CREATOR = new uz8((byte) 18);
    public final sca a;

    public /* synthetic */ tca(int i) {
        this(sca.a);
    }

    public tca(sca scaVar) {
        this.a = scaVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
