package ads_mobile_sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class eu0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<eu0> CREATOR = new yzo((byte) 0);
    public final int a;
    public pd b = null;
    public byte[] c;

    public eu0(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        a();
    }

    public final void a() {
        pd pdVar = this.b;
        byte[] bArr = this.c;
        if (pdVar == null) {
            if (bArr != null) {
                return;
            }
            if (bArr == null) {
                qp2.n("Invalid internal representation - empty");
                return;
            }
        } else {
            if (bArr == null) {
                return;
            }
            if (bArr != null) {
                qp2.n("Invalid internal representation - full");
                return;
            }
        }
        qp2.n("Impossible");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        byte[] bArrA = this.c;
        if (bArrA == null) {
            bArrA = this.b.a();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArrA, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
