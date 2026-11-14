package defpackage;

import ads_mobile_sdk.rg0;
import ads_mobile_sdk.wi3;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ycp extends ojo implements sep {
    /* JADX WARN: Multi-variable type inference failed */
    public final void S0(rg0 rg0Var, wi3 wi3Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.c);
        int i = a0p.a;
        parcelObtain.writeInt(1);
        rg0Var.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(wi3Var);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.b.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
