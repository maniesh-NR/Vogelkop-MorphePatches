package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class rdn implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ydn b;

    public /* synthetic */ rdn(ydn ydnVar, byte b) {
        this.a = b;
        this.b = ydnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ydn ydnVar = this.b;
        switch (b) {
            case 0:
                ydnVar.v();
                break;
            case 1:
                h7f h7fVar = ydnVar.t;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((tdn) g7fVarH.next()).N();
                }
                break;
            case 2:
                ydnVar.e.I(ydnVar.m(), ydnVar.d.a);
                ydnVar.v();
                break;
            case 3:
                w7j w7jVar = ydnVar.b;
                Context context = ydnVar.l;
                if (ydnVar.f.g() && ydnVar.c.isEnabled()) {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    w7jVar.getClass();
                    notificationManager.notify(420, cgh.l(0, context));
                    break;
                }
                break;
            case 4:
                ydnVar.e();
                break;
            case 5:
                if (ydnVar.O.d == ydnVar.d.b) {
                    h7f h7fVar2 = ydnVar.t;
                    g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
                    while (g7fVarH2.hasNext()) {
                        ((tdn) g7fVarH2.next()).A();
                    }
                    break;
                } else if (ydnVar.G == 2) {
                    ydnVar.g();
                    break;
                }
                break;
            default:
                ydnVar.u();
                break;
        }
    }
}
