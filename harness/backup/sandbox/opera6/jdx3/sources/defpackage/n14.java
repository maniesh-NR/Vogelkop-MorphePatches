package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.widget.RemoteViews;
import com.opera.api.Callback;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n14 {
    public final int a;
    public final Context b;
    public final ua7 c;
    public final Callback d;
    public RemoteViews e;
    public RemoteViews f;

    public n14(Context context, String str, int i, int i2, Callback callback) {
        this.b = context.getApplicationContext();
        this.d = callback;
        this.a = i;
        ua7 ua7VarT = zi4.t(str, new cm((String) null, i, (byte) 5));
        this.c = ua7VarT;
        ua7VarT.S(i2);
        ((l1f) ua7VarT.b).h(8, true);
    }

    public static void c(RemoteViews remoteViews, String str, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setViewVisibility(2131362869, 8);
            remoteViews.setViewVisibility(2131362594, 8);
            remoteViews.setViewVisibility(2131362404, 8);
        } else {
            remoteViews.setTextViewText(2131362869, str);
            remoteViews.setImageViewResource(2131362594, 2131231164);
            remoteViews.setImageViewResource(2131362404, i);
        }
    }

    public static void d(RemoteViews remoteViews, double d, String str, CharSequence charSequence) {
        remoteViews.setViewVisibility(2131363063, 0);
        remoteViews.setTextViewText(2131363088, str);
        remoteViews.setTextViewText(2131363096, charSequence);
        remoteViews.setProgressBar(2131363061, 100, (int) (100.0d * d), d < 0.0d);
    }

    public final Notification a(List list) throws Resources.NotFoundException {
        Context context = this.b;
        String string = context.getResources().getString(2132017591);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131558493);
        this.e = remoteViews;
        c(remoteViews, string, 2131232027);
        RemoteViews remoteViews2 = this.e;
        ua7 ua7Var = this.c;
        l1f l1fVar = (l1f) ua7Var.b;
        l1fVar.B = remoteViews2;
        RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), 2131558494);
        this.f = remoteViews3;
        c(remoteViews3, string, 2131232033);
        f(list);
        ua7Var.N(b(list.size() == 1 ? ((re7) list.get(0)).o : -1L));
        l1fVar.C = this.f;
        return l1fVar.b();
    }

    public yhe b(long j) {
        Context context = this.b;
        Intent intentB = mdb.b(context);
        intentB.setAction("com.opera.android.action.SHOW_DOWNLOADS");
        intentB.putExtra("download", j);
        intentB.putExtra("com.opera.android.action.EXTRA_FORCE_SHOW_FRAGMENT_IMMEDIATELY", "");
        return yhe.f(context, 0, intentB, 201326592, false);
    }

    public final void e(int i, PendingIntent pendingIntent) {
        this.f.setViewVisibility(2131362056, 0);
        this.f.setTextViewText(2131362050, this.b.getResources().getString(i));
        this.f.setOnClickPendingIntent(2131362050, pendingIntent);
    }

    public abstract void f(List list);
}
