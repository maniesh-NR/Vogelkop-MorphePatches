package com.opera.android.notifications.channels;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.appsflyer.internal.j;
import defpackage.lb4;
import defpackage.tn;
import defpackage.ws4;
import defpackage.xs4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/opera/android/notifications/channels/ChannelsUpdateWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelsUpdateWorker extends Worker {
    public ChannelsUpdateWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static final void d(Context context) {
        if (((SharedPreferences) xs4.a.b).getInt("channels_version_key", -1) != 18) {
            x4o.c(context).b("CHUP", new tn(ChannelsUpdateWorker.class).j());
        }
    }

    @Override // androidx.work.Worker
    public final zic c() {
        c5o c5oVar = xs4.a;
        if (((SharedPreferences) c5oVar.b).getInt("channels_version_key", -1) != 18) {
            ws4 ws4Var = (ws4) c5oVar.a;
            ws4Var.c.add(new lb4(ws4Var, (byte) 6));
            ws4Var.b();
            try {
                ws4Var.a();
                j.b((SharedPreferences) c5oVar.b, "channels_version_key", 18);
            } catch (IllegalStateException unused) {
            }
        }
        return new yic();
    }
}
