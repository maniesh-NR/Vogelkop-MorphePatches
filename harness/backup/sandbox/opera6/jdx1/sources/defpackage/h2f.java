package defpackage;

import android.app.Notification;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class h2f {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public h2f(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final void a(ata ataVar) {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        Notification notification = this.d;
        ysa ysaVar = (ysa) ataVar;
        ysaVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(ata.ep);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            parcelObtain.writeTypedObject(notification, 0);
            if (ysaVar.a.transact(1, parcelObtain, null, 1)) {
            } else {
                throw new RemoteException("Method notify is unimplemented.");
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        sb.append(this.b);
        sb.append(", tag:");
        return z1m.l(sb, this.c, "]");
    }
}
