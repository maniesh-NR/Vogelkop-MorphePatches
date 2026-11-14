package defpackage;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class ljg implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tjg b;

    public /* synthetic */ ljg(tjg tjgVar, byte b) {
        this.a = b;
        this.b = tjgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tjg tjgVar = this.b;
        switch (b) {
            case 0:
                try {
                    ((ghd) tjgVar.m.get()).play();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    return;
                }
            case 1:
                gig gigVar = (gig) ((ode) tjgVar.o.c).g();
                int iC = gigVar.getCurrentTimeline().c(false);
                if (iC != -1) {
                    gigVar.seekToDefaultPosition(iC);
                    break;
                }
                break;
            default:
                tjgVar.l();
                break;
        }
    }
}
