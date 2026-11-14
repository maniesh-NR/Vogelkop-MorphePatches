package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class w0i implements Parcelable {
    public static final Parcelable.Creator<w0i> CREATOR = new zug((byte) 16);
    public eta a;

    public void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            eta v0iVar = this.a;
            if (v0iVar == null) {
                v0iVar = new v0i(this);
                this.a = v0iVar;
            }
            parcel.writeStrongBinder(v0iVar.asBinder());
        }
    }
}
