package defpackage;

import com.opera.android.gcm.NewPushNotificationWorker;

/* loaded from: classes.dex */
public final class upe extends nt5 {
    public /* synthetic */ Object t;
    public final /* synthetic */ NewPushNotificationWorker u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upe(NewPushNotificationWorker newPushNotificationWorker, nt5 nt5Var) {
        super(nt5Var);
        this.u = newPushNotificationWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.c(this);
    }
}
