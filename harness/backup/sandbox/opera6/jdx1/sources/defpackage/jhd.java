package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class jhd extends Binder implements osa {
    public final WeakReference a;

    public jhd(wmd wmdVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(wmdVar);
    }

    @Override // defpackage.osa
    public final void N0(PlaybackStateCompat playbackStateCompat) {
        wmd wmdVar = (wmd) this.a.get();
        if (wmdVar != null) {
            wmdVar.e(2, playbackStateCompat, null);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                String string = parcel.readString();
                Bundle bundle = (Bundle) i41.e0(parcel, Bundle.CREATOR);
                wmd wmdVar = (wmd) this.a.get();
                if (wmdVar != null) {
                    wmdVar.e(1, string, bundle);
                }
                return true;
            case 2:
                t40.h();
                return false;
            case 3:
                N0((PlaybackStateCompat) i41.e0(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                t40.h();
                return false;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
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
                int i3 = parcel.readInt();
                wmd wmdVar2 = (wmd) this.a.get();
                if (wmdVar2 != null) {
                    wmdVar2.e(9, Integer.valueOf(i3), null);
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z = parcel.readInt() != 0;
                wmd wmdVar3 = (wmd) this.a.get();
                if (wmdVar3 != null) {
                    wmdVar3.e(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                int i4 = parcel.readInt();
                wmd wmdVar4 = (wmd) this.a.get();
                if (wmdVar4 != null) {
                    wmdVar4.e(12, Integer.valueOf(i4), null);
                }
                return true;
            case 13:
                wmd wmdVar5 = (wmd) this.a.get();
                if (wmdVar5 != null) {
                    wmdVar5.e(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
