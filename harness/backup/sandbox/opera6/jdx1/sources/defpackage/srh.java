package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class srh implements IBinder.DeathRecipient {
    public final Messenger a;
    public final xy0 b;
    public final Messenger c;
    public int f;
    public int g;
    public final /* synthetic */ xrh i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public srh(xrh xrhVar, Messenger messenger) {
        this.i = xrhVar;
        this.a = messenger;
        xy0 xy0Var = new xy0(this);
        this.b = xy0Var;
        this.c = new Messenger((Handler) xy0Var);
    }

    public final void a(int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        b(5, i2, i, null, null);
    }

    public final boolean b(int i, int i2, int i3, Object obj, Bundle bundle) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = obj;
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.c;
        try {
            this.a.send(messageObtain);
            return true;
        } catch (DeadObjectException | RemoteException unused) {
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.j.post(new rrh(this, (byte) 1));
    }

    public final void c(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.d;
        this.d = i3 + 1;
        b(7, i3, i, null, bundle);
    }

    public final void d(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.d;
        this.d = i3 + 1;
        b(8, i3, i, null, bundle);
    }
}
