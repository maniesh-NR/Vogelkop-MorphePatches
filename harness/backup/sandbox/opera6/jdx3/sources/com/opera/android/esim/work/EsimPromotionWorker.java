package com.opera.android.esim.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.leanplum.internal.Constants;
import defpackage.gfd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/opera/android/esim/work/EsimPromotionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", Constants.Params.PARAMS, "Lgfd;", "maybePromoteEsim", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgfd;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EsimPromotionWorker extends CoroutineWorker {
    public final gfd g;

    public EsimPromotionWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull gfd gfdVar) {
        super(context, workerParameters);
        this.g = gfdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.o98
            if (r0 == 0) goto L13
            r0 = r5
            o98 r0 = (defpackage.o98) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            o98 r0 = new o98
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ybh.y(r5)
            t0i r5 = (t0i) r5
            java.lang.Object r4 = r5.a
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L32:
            ybh.y(r5)
            r0.v = r3
            gfd r5 = r4.g
            ot6 r5 = (defpackage.ot6) r5
            android.content.Context r4 = r4.a
            java.lang.Object r4 = r5.a(r4, r0)
            if (r4 != r1) goto L44
            return r1
        L44:
            java.lang.Throwable r5 = t0i.d(r4)
            if (r5 != 0) goto L55
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.getClass()
            yic r4 = new yic
            r4.<init>()
            return r4
        L55:
            wic r4 = new wic
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.esim.work.EsimPromotionWorker.c(nt5):java.lang.Object");
    }
}
