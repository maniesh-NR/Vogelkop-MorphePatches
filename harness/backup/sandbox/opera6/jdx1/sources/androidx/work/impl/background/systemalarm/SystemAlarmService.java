package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.ezk;
import defpackage.iin;
import defpackage.jin;
import defpackage.udc;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemAlarmService extends udc {
    public ezk b;
    public boolean c;

    static {
        qs7.B("SystemAlarmService");
    }

    public final void a() {
        this.c = true;
        qs7.x().getClass();
        int i = iin.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (jin.a) {
            linkedHashMap.putAll(jin.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            if (wakeLock != null && wakeLock.isHeld()) {
                qs7.x().getClass();
            }
        }
        stopSelf();
    }

    @Override // defpackage.udc, android.app.Service
    public final void onCreate() {
        super.onCreate();
        ezk ezkVar = new ezk(this);
        this.b = ezkVar;
        if (ezkVar.i != null) {
            qs7.x().getClass();
        } else {
            ezkVar.i = this;
        }
        this.c = false;
    }

    @Override // defpackage.udc, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        ezk ezkVar = this.b;
        ezkVar.getClass();
        qs7.x().getClass();
        ezkVar.d.e(ezkVar);
        ezkVar.i = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            qs7.x().getClass();
            ezk ezkVar = this.b;
            ezkVar.getClass();
            qs7.x().getClass();
            ezkVar.d.e(ezkVar);
            ezkVar.i = null;
            ezk ezkVar2 = new ezk(this);
            this.b = ezkVar2;
            if (ezkVar2.i != null) {
                qs7.x().getClass();
            } else {
                ezkVar2.i = this;
            }
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.b(i2, intent);
        return 3;
    }
}
