package defpackage;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public final class k14 extends Binder {
    public static final int b;
    public final h1b a;

    static {
        b = Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public k14(List list) {
        this.a = h1b.s(list);
    }

    public static h1b a(IBinder iBinder) {
        int i;
        if (iBinder instanceof k14) {
            return ((k14) iBinder).a;
        }
        z0b z0bVarP = h1b.p();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            z0bVarP.c(bundle);
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i3 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return z0bVarP.g();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        h1b h1bVar = this.a;
        int size = h1bVar.size();
        int i4 = parcel.readInt();
        while (true) {
            if (i4 < size) {
                if (parcel2.dataSize() >= b) {
                    i3 = 2;
                    break;
                }
                parcel2.writeInt(1);
                parcel2.writeBundle((Bundle) h1bVar.get(i4));
                i4++;
            } else {
                break;
            }
        }
        parcel2.writeInt(i3);
        return true;
    }
}
