package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class urd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vrd b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ urd(vrd vrdVar, Pair pair, byte b) {
        this.a = b;
        this.b = vrdVar;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Pair pair = this.c;
        vrd vrdVar = this.b;
        switch (b) {
            case 0:
                ((el6) vrdVar.b.i).L(((Integer) pair.first).intValue(), (jrd) pair.second);
                break;
            default:
                ((el6) vrdVar.b.i).k(((Integer) pair.first).intValue(), (jrd) pair.second);
                break;
        }
    }
}
