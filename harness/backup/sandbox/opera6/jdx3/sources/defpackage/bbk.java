package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.opera.android.BrowserActivity;
import com.opera.android.BrowserRestartActivity;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bbk implements Runnable {
    public final Context a;
    public final Intent b;
    public final boolean c;
    public boolean d;
    public final /* synthetic */ cbk e;

    /* JADX WARN: Multi-variable type inference failed */
    public bbk(cbk cbkVar, BrowserActivity browserActivity, Intent intent, boolean z) {
        Objects.requireNonNull(cbkVar);
        this.e = cbkVar;
        this.a = browserActivity.getApplicationContext();
        this.b = intent;
        this.c = z;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        vml.a(this);
        this.d = true;
        if (this.c) {
            int i = BrowserRestartActivity.a;
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            g8.R(activityOptionsMakeBasic);
            Intent intent = this.b;
            Intent intent2 = intent != null ? new Intent(intent) : new Intent();
            Context context = this.a;
            intent2.setClassName(context.getPackageName(), BrowserRestartActivity.class.getName());
            intent2.setFlags(268435456);
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent2, 1140850688, activityOptionsMakeBasic.toBundle());
            ActivityOptions activityOptionsMakeBasic2 = ActivityOptions.makeBasic();
            g8.Q(activityOptionsMakeBasic2);
            try {
                activity.send(null, 0, null, null, null, null, activityOptionsMakeBasic2.toBundle());
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        while (true) {
            Runnable runnable = (Runnable) ngh.d.poll();
            if (runnable == null) {
                Process.killProcess(Process.myPid());
                this.e.e = null;
                return;
            }
            runnable.run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
    }
}
