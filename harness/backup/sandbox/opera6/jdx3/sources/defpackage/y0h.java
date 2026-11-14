package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.r;
import com.opera.android.browser.PrivateTabsBroadcastReceiver;
import com.opera.android.browser.PrivateTabsNotificationService;
import java.util.Random;
import org.chromium.base.TraceEvent;

/* loaded from: classes.dex */
public final class y0h implements j6l {
    public final Context a;
    public final x5f b;
    public boolean c;

    public y0h(r rVar, k6l k6lVar, x5f x5fVar) {
        this.a = rVar.getApplicationContext();
        this.b = x5fVar;
        k6lVar.F(this);
        if (PrivateTabsBroadcastReceiver.a == null) {
            PrivateTabsBroadcastReceiver.a = new Random();
        }
        synchronized (PrivateTabsBroadcastReceiver.b) {
            PrivateTabsBroadcastReceiver.c = true;
        }
        he2.a(new d7d(rVar), new Void[0]);
        if (k6lVar.n > 0) {
            a();
        } else {
            wub.N(TraceEvent.n("NotificationManagerProxyImpl.cancel(id)", (String) null), new br(aib.t(), 2131363801, (byte) 18));
        }
    }

    public final void a() {
        Context context = this.a;
        if (this.c) {
            return;
        }
        Random random = PrivateTabsBroadcastReceiver.a;
        Intent intent = new Intent(context, (Class<?>) PrivateTabsBroadcastReceiver.class);
        intent.setAction("com.opera.android.ACTION_CLOSE_ALL_PRIVATE_TABS");
        synchronized (PrivateTabsBroadcastReceiver.b) {
            if (PrivateTabsBroadcastReceiver.c) {
                PrivateTabsBroadcastReceiver.a(context);
            }
        }
        intent.putExtra("com.opera.android.ARGUMENT", context.getSharedPreferences("private_tabs_receiver", 0).getInt("secret", 0));
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        ua7 ua7VarT = zi4.t("private_tabs", new cm((String) null, 2131363801, (byte) 5));
        l1f l1fVar = (l1f) ua7VarT.b;
        ((l1f) ua7VarT.b).g = broadcast;
        l1fVar.z = -1;
        ua7VarT.R(true);
        ua7VarT.S(2131231300);
        l1fVar.f(context.getString(2132020568));
        l1fVar.e(context.getString(2132020567));
        aib.t().H(ua7VarT.l());
        this.c = true;
        x5f x5fVar = this.b;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            am2.f(zpaVar, x56VarF).b.p(6, 1, 1L);
            x5fVar.U0(x56VarF);
        }
        context.startService(new Intent(context, (Class<?>) PrivateTabsNotificationService.class));
    }

    @Override // defpackage.j6l
    public final void d(int i) {
        if (i > 0) {
            a();
            return;
        }
        if (this.c) {
            Context context = this.a;
            context.stopService(new Intent(context, (Class<?>) PrivateTabsNotificationService.class));
            wub.N(TraceEvent.n("NotificationManagerProxyImpl.cancel(id)", (String) null), new br(aib.t(), 2131363801, (byte) 18));
            this.c = false;
        }
    }

    @Override // defpackage.j6l
    public final void onDestroy() {
        if (this.c) {
            Context context = this.a;
            context.stopService(new Intent(context, (Class<?>) PrivateTabsNotificationService.class));
            wub.N(TraceEvent.n("NotificationManagerProxyImpl.cancel(id)", (String) null), new br(aib.t(), 2131363801, (byte) 18));
            this.c = false;
        }
    }
}
