package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import defpackage.a26;
import defpackage.qzk;
import defpackage.udc;
import defpackage.vr9;
import defpackage.x4o;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends udc {
    public boolean b;
    public qzk c;
    public NotificationManager d;

    static {
        qs7.B("SystemFgService");
    }

    public final void a() {
        this.d = (NotificationManager) getApplicationContext().getSystemService("notification");
        qzk qzkVar = new qzk(getApplicationContext());
        this.c = qzkVar;
        if (qzkVar.j != null) {
            qs7.x().getClass();
        } else {
            qzkVar.j = this;
        }
    }

    @Override // defpackage.udc, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.udc, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = false;
        if (this.b) {
            qs7.x().getClass();
            this.c.c();
            a();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        qzk qzkVar = this.c;
        qzkVar.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            qs7 qs7VarX = qs7.x();
            Objects.toString(intent);
            qs7VarX.getClass();
            qzkVar.c.a(new vr9((byte) 21, (Object) qzkVar, (Object) intent.getStringExtra("KEY_WORKSPEC_ID"), z));
            qzkVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            qzkVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            qs7.x().getClass();
            SystemForegroundService systemForegroundService = qzkVar.j;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.b = true;
            qs7.x().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        qs7 qs7VarX2 = qs7.x();
        Objects.toString(intent);
        qs7VarX2.getClass();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        x4o x4oVar = qzkVar.b;
        UUID uuidFromString = UUID.fromString(stringExtra);
        x4oVar.getClass();
        a26.O(x4oVar.b.j, "CancelWorkById", x4oVar.d.a, new m53(x4oVar, uuidFromString, (byte) 1));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.e(2048);
    }

    public final void onTimeout(int i, int i2) {
        this.c.e(i2);
    }
}
