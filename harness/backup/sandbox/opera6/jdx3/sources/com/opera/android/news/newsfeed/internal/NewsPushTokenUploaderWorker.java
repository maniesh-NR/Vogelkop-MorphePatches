package com.opera.android.news.newsfeed.internal;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.c3j;
import defpackage.d3j;
import defpackage.e3j;
import defpackage.ese;
import defpackage.hd;
import defpackage.j7c;
import defpackage.tn;
import defpackage.vme;
import defpackage.xic;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/opera/android/news/newsfeed/internal/NewsPushTokenUploaderWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NewsPushTokenUploaderWorker extends Worker {
    public static final esd f;
    public final zyk e;

    static {
        Regex regex = esd.e;
        f = wyh.x("application/json; charset=UTF-8");
    }

    public NewsPushTokenUploaderWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = z4c.b(new vme((byte) 10));
    }

    public static final void d(Context context) {
        x4o x4oVarC = x4o.c(context);
        tn tnVar = new tn(NewsPushTokenUploaderWorker.class);
        ((h5o) tnVar.c).j = new xo5(14);
        tnVar.G();
        x4oVarC.b("NPTO", tnVar.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // androidx.work.Worker
    public final zic c() {
        NewsPushTokenUploaderWorker newsPushTokenUploaderWorker;
        yic yicVar;
        ?? r1;
        pzh pzhVarExecute;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Context context = ((ajc) this).a;
        String string = hd.j(context).getString("npt_unsent_token_track_events", null);
        if (string == null || string.length() == 0) {
            newsPushTokenUploaderWorker = this;
            yicVar = new yic();
        } else {
            fvh fvhVar = new fvh();
            c3j c3jVarD = ((d3j) e3j.t(context).i()).d(8, false);
            fvhVar.h(new Uri.Builder().scheme("https").authority(c3jVarD != null ? (String) c3jVarD.d : "pps-token.op-mobile.opera.com").appendPath("token").build().toString());
            rvh.Companion.getClass();
            fvhVar.f(qvh.b(string, f));
            try {
                pzhVarExecute = j7c.q(fvhVar, (t9f) this.e.getValue()).execute();
                try {
                    r1 = 200;
                    try {
                        if (pzhVarExecute.d == 200) {
                            NewsPushTokenUploaderWorker newsPushTokenUploaderWorker2 = this;
                            ioh.k(new ese(newsPushTokenUploaderWorker2, string, jElapsedRealtime, (byte) 0));
                            yicVar = new yic();
                            r1 = newsPushTokenUploaderWorker2;
                        } else {
                            r1 = this;
                            yicVar = new xic();
                        }
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            vtp.v(pzhVarExecute, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r1 = this;
                }
            } catch (IOException unused) {
                r1 = this;
            }
            try {
                pzhVarExecute.close();
                newsPushTokenUploaderWorker = r1;
            } catch (IOException unused2) {
                yicVar = new xic();
                newsPushTokenUploaderWorker = r1;
                return !yicVar.equals(new xic()) ? yicVar : yicVar;
            }
        }
        if (!yicVar.equals(new xic()) && ((ajc) newsPushTokenUploaderWorker).b.c >= 5) {
            return new wic();
        }
    }
}
