package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class wod extends Binder implements tsa {
    public static final /* synthetic */ int b = 0;
    public final WeakReference a;

    public wod(xod xodVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new WeakReference(xodVar);
    }

    @Override // defpackage.tsa
    public final void J(nsa nsaVar) {
        xod xodVar = (xod) this.a.get();
        if (xodVar == null || nsaVar == null) {
            return;
        }
        xodVar.f.register(nsaVar, new bqd("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (xodVar.d) {
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [nsa] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        Bundle bundle;
        nsa nsaVar = null;
        bundle = null;
        Bundle bundle2 = null;
        vhg vhgVar = null;
        lsa lsaVar = null;
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof nsa)) {
                    lsa lsaVar2 = new lsa();
                    lsaVar2.a = strongBinder;
                    nsaVar = lsaVar2;
                } else {
                    nsaVar = (nsa) iInterfaceQueryLocalInterface;
                }
            }
            J(nsaVar);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof nsa)) {
                    lsa lsaVar3 = new lsa();
                    lsaVar3.a = strongBinder2;
                    lsaVar = lsaVar3;
                } else {
                    lsaVar = (nsa) iInterfaceQueryLocalInterface2;
                }
            }
            xod xodVar = (xod) this.a.get();
            if (xodVar != null && lsaVar != null) {
                xodVar.f.unregister(lsaVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (xodVar.d) {
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 28) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            xod xodVar2 = (xod) this.a.get();
            if (xodVar2 != null) {
                vhgVar = xodVar2.g;
                xjd xjdVar = xodVar2.i;
                if (vhgVar != null) {
                    float f = vhgVar.d;
                    long j = vhgVar.h;
                    int i4 = vhgVar.a;
                    long j2 = vhgVar.b;
                    long j3 = -1;
                    if (j2 != -1 && ((i4 == 3 || i4 == 4 || i4 == 5) && j > 0)) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        long j4 = ((long) (f * (jElapsedRealtime - j))) + j2;
                        if (xjdVar != null) {
                            Bundle bundle3 = xjdVar.a;
                            if (bundle3.containsKey("android.media.metadata.DURATION")) {
                                j3 = bundle3.getLong("android.media.metadata.DURATION", 0L);
                            }
                        }
                        long j5 = (j3 < 0 || j4 <= j3) ? j4 < 0 ? 0L : j4 : j3;
                        ArrayList arrayList = new ArrayList();
                        long j6 = vhgVar.c;
                        long j7 = vhgVar.e;
                        int i5 = vhgVar.f;
                        CharSequence charSequence = vhgVar.g;
                        List list = vhgVar.i;
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        vhgVar = new vhg(vhgVar.a, j5, j6, vhgVar.d, j7, i5, charSequence, jElapsedRealtime, arrayList, vhgVar.j, vhgVar.k);
                    }
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            if (vhgVar == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            vhgVar.writeToParcel(parcel2, 1);
            return true;
        }
        if (i == 37) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            xod xodVar3 = (xod) this.a.get();
            i3 = xodVar3 != null ? xodVar3.j : -1;
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 45) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(0);
            return true;
        }
        if (i == 47) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            xod xodVar4 = (xod) this.a.get();
            i3 = xodVar4 != null ? xodVar4.k : -1;
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i != 50) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        xod xodVar5 = (xod) this.a.get();
        if (xodVar5 != null && (bundle = xodVar5.e) != null) {
            bundle2 = new Bundle(bundle);
        }
        parcel2.getClass();
        parcel2.writeNoException();
        if (bundle2 == null) {
            parcel2.writeInt(0);
            return true;
        }
        parcel2.writeInt(1);
        bundle2.writeToParcel(parcel2, 1);
        return true;
    }
}
