package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class tbe extends Binder implements xsa {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public tbe(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, xsa.dp);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [wsa] */
    /* JADX WARN: Type inference failed for: r2v7, types: [wsa] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = xsa.dp;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        vsa vsaVar = null;
        vsa vsaVar2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(wsa.cp);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof wsa)) {
                    vsa vsaVar3 = new vsa();
                    vsaVar3.a = strongBinder;
                    vsaVar = vsaVar3;
                } else {
                    vsaVar = (wsa) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
                synchronized (multiInstanceInvalidationService.c) {
                    int i4 = multiInstanceInvalidationService.a + 1;
                    multiInstanceInvalidationService.a = i4;
                    if (multiInstanceInvalidationService.c.register(vsaVar, Integer.valueOf(i4))) {
                        multiInstanceInvalidationService.b.put(Integer.valueOf(i4), string);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService.a--;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(wsa.cp);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof wsa)) {
                    vsa vsaVar4 = new vsa();
                    vsaVar4.a = strongBinder2;
                    vsaVar2 = vsaVar4;
                } else {
                    vsaVar2 = (wsa) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
            synchronized (multiInstanceInvalidationService2.c) {
                multiInstanceInvalidationService2.c.unregister(vsaVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.a;
        synchronized (multiInstanceInvalidationService3.c) {
            String str2 = (String) multiInstanceInvalidationService3.b.get(Integer.valueOf(i6));
            if (str2 != null) {
                int iBeginBroadcast = multiInstanceInvalidationService3.c.beginBroadcast();
                while (i3 < iBeginBroadcast) {
                    try {
                        Integer num = (Integer) multiInstanceInvalidationService3.c.getBroadcastCookie(i3);
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.b.get(num);
                        if (i6 != iIntValue && str2.equals(str3)) {
                            try {
                                ((wsa) multiInstanceInvalidationService3.c.getBroadcastItem(i3)).i(strArrCreateStringArray);
                            } catch (RemoteException unused) {
                            }
                        }
                        i3++;
                    } finally {
                        multiInstanceInvalidationService3.c.finishBroadcast();
                    }
                }
            }
        }
        return true;
    }
}
