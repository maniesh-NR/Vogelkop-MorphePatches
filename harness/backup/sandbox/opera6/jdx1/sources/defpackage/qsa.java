package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class qsa implements tsa {
    public IBinder a;

    @Override // defpackage.tsa
    public final void J(nsa nsaVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder((hhd) nsaVar);
            this.a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
