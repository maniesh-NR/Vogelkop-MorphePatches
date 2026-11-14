package com.opera.android.pushmessaging;

import android.app.IntentService;
import android.content.Intent;
import defpackage.rqd;
import defpackage.wu5;
import defpackage.zr9;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.chromium.base.task.PostTask;

/* loaded from: classes.dex */
public class GCMBackgroundService extends IntentService {
    public static final /* synthetic */ int a = 0;

    public GCMBackgroundService() {
        super("GCMBackgroundService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) throws ExecutionException, InterruptedException {
        es9 es9VarA;
        if (sfe.g0(this) || (es9VarA = es9.a(intent.getExtras(), new wu5())) == null) {
            return;
        }
        zr9 zr9Var = new zr9((Object) this, (Object) es9VarA, (byte) 0);
        Object obj = PostTask.a;
        FutureTask futureTask = new FutureTask(zr9Var, null);
        PostTask.d(7, futureTask);
        try {
            futureTask.get();
        } catch (Exception e) {
            rqd.p(e.getCause());
        }
    }
}
