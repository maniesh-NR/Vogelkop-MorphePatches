package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import defpackage.cqd;
import defpackage.eqd;
import defpackage.msa;
import defpackage.osa;
import defpackage.t40;
import defpackage.usa;
import defpackage.yod;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class b extends Binder implements usa {
    public static final /* synthetic */ int b = 0;
    public final AtomicReference a;

    public b(yod yodVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(yodVar);
    }

    @Override // defpackage.usa
    public final void D0(osa osaVar) {
        yod yodVar = (yod) this.a.get();
        if (yodVar == null) {
            return;
        }
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        cqd cqdVar = new cqd();
        eqd eqdVar = new eqd();
        eqdVar.a = callingPid;
        eqdVar.b = callingUid;
        new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", callingPid, callingUid);
        cqdVar.a = eqdVar;
        yodVar.f.register(osaVar, cqdVar);
        synchronized (yodVar.d) {
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.usa
    public final PlaybackStateCompat getPlaybackState() {
        yod yodVar = (yod) this.a.get();
        if (yodVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = yodVar.g;
        MediaMetadataCompat mediaMetadataCompat = yodVar.h;
        if (playbackStateCompat != null) {
            float f = playbackStateCompat.d;
            long j = playbackStateCompat.h;
            int i = playbackStateCompat.a;
            long j2 = playbackStateCompat.b;
            long j3 = -1;
            if (j2 != -1 && ((i == 3 || i == 4 || i == 5) && j > 0)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = ((long) (f * (jElapsedRealtime - j))) + j2;
                if (mediaMetadataCompat != null) {
                    Bundle bundle = mediaMetadataCompat.a;
                    if (bundle.containsKey("android.media.metadata.DURATION")) {
                        j3 = bundle.getLong("android.media.metadata.DURATION", 0L);
                    }
                }
                long j5 = (j3 < 0 || j4 <= j3) ? j4 < 0 ? 0L : j4 : j3;
                ArrayList arrayList = new ArrayList();
                long j6 = playbackStateCompat.c;
                long j7 = playbackStateCompat.e;
                int i2 = playbackStateCompat.f;
                CharSequence charSequence = playbackStateCompat.g;
                ArrayList arrayList2 = playbackStateCompat.i;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                return new PlaybackStateCompat(playbackStateCompat.a, j5, j6, playbackStateCompat.d, j7, i2, charSequence, jElapsedRealtime, arrayList, playbackStateCompat.j, playbackStateCompat.k);
            }
        }
        return playbackStateCompat;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        osa osaVar = null;
        bundle = null;
        Bundle bundle = null;
        osa osaVar2 = null;
        AtomicReference atomicReference = this.a;
        switch (i) {
            case 1:
                parcel.readString();
                t40.h();
                return false;
            case 2:
                t40.h();
                return false;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof osa)) {
                        msa msaVar = new msa();
                        msaVar.a = strongBinder;
                        osaVar = msaVar;
                    } else {
                        osaVar = (osa) iInterfaceQueryLocalInterface;
                    }
                }
                D0(osaVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof osa)) {
                        msa msaVar2 = new msa();
                        msaVar2.a = strongBinder2;
                        osaVar2 = msaVar2;
                    } else {
                        osaVar2 = (osa) iInterfaceQueryLocalInterface2;
                    }
                }
                x0(osaVar2);
                parcel2.writeNoException();
                return true;
            case 5:
                t40.h();
                return false;
            case 6:
                t40.h();
                return false;
            case 7:
                t40.h();
                return false;
            case 8:
                t40.h();
                return false;
            case 9:
                t40.h();
                return false;
            case 10:
                t40.h();
                return false;
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                t40.h();
                return false;
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                t40.h();
                return false;
            case 13:
                t40.h();
                return false;
            case 14:
                parcel.readString();
                t40.h();
                return false;
            case 15:
                parcel.readString();
                t40.h();
                return false;
            case 16:
                t40.h();
                return false;
            case 17:
                parcel.readLong();
                t40.h();
                return false;
            case 18:
                t40.h();
                return false;
            case 19:
                t40.h();
                return false;
            case 20:
                t40.h();
                return false;
            case 21:
                t40.h();
                return false;
            case 22:
                t40.h();
                return false;
            case 23:
                t40.h();
                return false;
            case 24:
                parcel.readLong();
                t40.h();
                return false;
            case 25:
                t40.h();
                return false;
            case 26:
                parcel.readString();
                t40.h();
                return false;
            case 27:
                t40.h();
                return false;
            case 28:
                PlaybackStateCompat playbackState = getPlaybackState();
                parcel2.writeNoException();
                if (playbackState == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                playbackState.writeToParcel(parcel2, 1);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                t40.h();
                return false;
            case 31:
                t40.h();
                return false;
            case 32:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                t40.h();
                return false;
            case 34:
                parcel.readString();
                t40.h();
                return false;
            case 35:
                parcel.readString();
                t40.h();
                return false;
            case 36:
                t40.h();
                return false;
            case 37:
                i3 = ((yod) atomicReference.get()) != null ? 0 : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.readInt();
                t40.h();
                return false;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                t40.h();
                return false;
            case 42:
                parcel.readInt();
                t40.h();
                return false;
            case 43:
                t40.h();
                return false;
            case 44:
                parcel.readInt();
                t40.h();
                return false;
            case 45:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                parcel.readInt();
                t40.h();
                return false;
            case 47:
                i3 = ((yod) atomicReference.get()) != null ? 0 : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 48:
                parcel.readInt();
                t40.h();
                return false;
            case 49:
                parcel.readFloat();
                t40.h();
                return false;
            case 50:
                yod yodVar = (yod) atomicReference.get();
                if (yodVar != null && yodVar.e != null) {
                    bundle = new Bundle(yodVar.e);
                }
                parcel2.writeNoException();
                if (bundle == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
                return true;
            case 51:
                t40.h();
                return false;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // defpackage.usa
    public final void x0(osa osaVar) {
        yod yodVar = (yod) this.a.get();
        if (yodVar == null) {
            return;
        }
        yodVar.f.unregister(osaVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (yodVar.d) {
        }
    }
}
