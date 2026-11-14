package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.fragment.app.r;
import com.opera.android.osp.OspCollectorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class psf implements ServiceConnection {
    public int a;
    public boolean b;
    public final r c;
    public final AtomicReference d = new AtomicReference();

    public psf(r rVar) {
        this.c = rVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.d.set(iBinder);
        this.a = 10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.d.set(null);
        int i = this.a;
        if (i == 0 || !this.b) {
            return;
        }
        this.a = i - 1;
        this.b = false;
        r rVar = this.c;
        rVar.unbindService(this);
        this.b = true;
        rVar.bindService(new Intent((Context) rVar, (Class<?>) OspCollectorService.class), this, 1);
    }
}
