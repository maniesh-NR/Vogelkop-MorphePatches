package defpackage;

import android.os.Handler;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final /* synthetic */ class grl implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wjj b;

    public /* synthetic */ grl(wjj wjjVar, byte b) {
        this.a = b;
        this.b = wjjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wjj wjjVar = this.b;
        switch (b) {
            case 0:
                ((Handler) wjjVar.b).postDelayed(new grl(wjjVar, (byte) 1), 500L);
                break;
            default:
                arl arlVar = (arl) ((PriorityQueue) wjjVar.a).poll();
                wjjVar.d = arlVar;
                if (arlVar != null) {
                    arlVar.a.show();
                    ((hrl) wjjVar.c).a((arl) wjjVar.d);
                    break;
                }
                break;
        }
    }
}
