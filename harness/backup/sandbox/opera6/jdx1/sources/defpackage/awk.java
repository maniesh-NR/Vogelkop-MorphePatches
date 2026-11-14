package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class awk extends View.BaseSavedState {
    public static final Parcelable.Creator<awk> CREATOR = new l7k((byte) 8);
    public final boolean a;

    public awk(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != 0;
    }

    public awk(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.a = z;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }
}
