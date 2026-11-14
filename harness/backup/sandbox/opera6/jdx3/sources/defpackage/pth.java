package defpackage;

import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class pth implements NetworkChangeNotifier.ConnectionTypeObserver {
    public final /* synthetic */ qth a;

    public pth(qth qthVar) {
        this.a = qthVar;
    }

    public final void onConnectionTypeChanged(int i) {
        boolean z = i != 6;
        g7f g7fVar = new g7f(this.a.a);
        while (g7fVar.hasNext()) {
            oth othVar = (oth) g7fVar.next();
            if (z) {
                qth qthVar = (qth) othVar.a;
                h7f h7fVar = qthVar.a;
                h7fVar.c(othVar);
                if (h7fVar.isEmpty()) {
                    NetworkChangeNotifier.removeConnectionTypeObserver(qthVar.b);
                }
                othVar.b.c(othVar.c);
            } else {
                othVar.getClass();
            }
        }
    }
}
