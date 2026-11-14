package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.opera.android.gcm.NewPushNotificationWorker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ju9 extends o5o {
    public final umi a;
    public final fif b;
    public final fif c;

    public ju9(umi umiVar, fif fifVar, fif fifVar2) {
        this.a = umiVar;
        this.b = fifVar;
        this.c = fifVar2;
    }

    public final ajc a(Context context, String str, WorkerParameters workerParameters) {
        if (!Intrinsics.a(str, NewPushNotificationWorker.class.getName())) {
            return null;
        }
        fif fifVar = this.b;
        return new NewPushNotificationWorker(context, workerParameters, new nbh(context, this.a, (orm) fifVar.get(), (skm) this.c.get()), (orm) fifVar.get());
    }
}
