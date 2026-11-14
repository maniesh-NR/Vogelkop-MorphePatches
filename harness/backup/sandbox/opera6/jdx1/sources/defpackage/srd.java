package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class srd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vrd b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ tjd d;

    public /* synthetic */ srd(vrd vrdVar, Pair pair, tjd tjdVar, byte b) {
        this.a = b;
        this.b = vrdVar;
        this.c = pair;
        this.d = tjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tjd tjdVar = this.d;
        Pair pair = this.c;
        vrd vrdVar = this.b;
        switch (b) {
            case 0:
                el6 el6Var = (el6) vrdVar.b.i;
                int iIntValue = ((Integer) pair.first).intValue();
                jrd jrdVar = (jrd) pair.second;
                jrdVar.getClass();
                el6Var.e(iIntValue, jrdVar, tjdVar);
                break;
            default:
                ((el6) vrdVar.b.i).u(((Integer) pair.first).intValue(), (jrd) pair.second, tjdVar);
                break;
        }
    }
}
