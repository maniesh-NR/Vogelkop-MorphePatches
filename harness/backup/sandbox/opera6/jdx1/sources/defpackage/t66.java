package defpackage;

import ads_mobile_sdk.a90;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class t66 extends Binder implements xra {
    public final Handler a;
    public final /* synthetic */ a90 b;

    public t66(a90 a90Var) {
        this.b = a90Var;
        attachInterface(this, xra.ap);
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = xra.ap;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.a;
        a90 a90Var = this.b;
        switch (i) {
            case 2:
                int i3 = parcel.readInt();
                Bundle bundle = (Bundle) cqp.t0(parcel, Bundle.CREATOR);
                if (a90Var != null) {
                    handler.post(new p94(this, i3, bundle));
                    return true;
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) cqp.t0(parcel, Bundle.CREATOR);
                if (a90Var != null) {
                    handler.post(new s66(this, string, bundle2, (byte) 1));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) cqp.t0(parcel, Bundle.CREATOR);
                if (a90Var != null) {
                    handler.post(new s66(this, bundle3, (byte) 2));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) cqp.t0(parcel, Bundle.CREATOR);
                if (a90Var != null) {
                    handler.post(new s66(this, string2, bundle4, (byte) 3));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i4 = parcel.readInt();
                Uri uri = (Uri) cqp.t0(parcel, Uri.CREATOR);
                boolean z = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) cqp.t0(parcel, Bundle.CREATOR);
                if (a90Var != null) {
                    handler.post(new s66(this, i4, uri, z, bundle5));
                    return true;
                }
                return true;
            case 7:
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 8:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                Bundle bundle6 = (Bundle) cqp.t0(parcel, Bundle.CREATOR);
                if (a90Var != null) {
                    handler.post(new s66(this, i5, i6, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) cqp.t0(parcel, Bundle.CREATOR);
                if (a90Var != null) {
                    handler.post(new s66(this, bundle7, (byte) 6));
                    return true;
                }
                return true;
            case 10:
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                Bundle bundle8 = (Bundle) cqp.t0(parcel, Bundle.CREATOR);
                if (a90Var != null) {
                    handler.post(new s66(this, i7, i8, i9, i10, i11, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) cqp.t0(parcel, Bundle.CREATOR);
                if (a90Var != null) {
                    handler.post(new s66(this, bundle9, (byte) 8));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) cqp.t0(parcel, Bundle.CREATOR);
                if (a90Var != null) {
                    handler.post(new s66(this, bundle10, (byte) 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
