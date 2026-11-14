package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.leanplum.internal.Constants;
import com.opera.android.browser.external.ExternalAppService;

/* loaded from: classes.dex */
public abstract class xl8 implements as6 {
    public final PendingIntent a;
    public final Context b;
    public boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public xl8(dx3 dx3Var, PendingIntent pendingIntent) {
        this.a = pendingIntent;
        this.b = dx3Var.getApplicationContext();
    }

    public final void a(sxh sxhVar) {
        this.c = true;
        boolean z = ExternalAppService.b;
        Context context = this.b;
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) ExternalAppService.class);
        intent.putExtra(Constants.Params.MESSAGE, sxhVar.a(context.getResources()).toString());
        intent.putExtra("intent", this.a);
        context.startService(intent);
    }

    public final void b(tcc tccVar) {
        tccVar.b(this);
        if (this.c) {
            boolean z = ExternalAppService.b;
            Context context = this.b;
            context.stopService(new Intent(context.getApplicationContext(), (Class<?>) ExternalAppService.class));
        }
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        b(ndcVar.getLifecycle());
    }
}
