package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.f;

/* loaded from: classes.dex */
public final class qph extends g3 {
    public static final Parcelable.Creator<qph> CREATOR = new s0g((byte) 6);
    public Parcelable c;

    public qph(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? f.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.g3, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, 0);
    }
}
