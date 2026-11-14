package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class trd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vrd b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ bsc d;
    public final /* synthetic */ tjd e;

    public /* synthetic */ trd(vrd vrdVar, Pair pair, bsc bscVar, tjd tjdVar, byte b) {
        this.a = b;
        this.b = vrdVar;
        this.c = pair;
        this.d = bscVar;
        this.e = tjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tjd tjdVar = this.e;
        bsc bscVar = this.d;
        Pair pair = this.c;
        vrd vrdVar = this.b;
        switch (b) {
            case 0:
                ((el6) vrdVar.b.i).C(((Integer) pair.first).intValue(), (jrd) pair.second, bscVar, tjdVar);
                break;
            default:
                ((el6) vrdVar.b.i).D(((Integer) pair.first).intValue(), (jrd) pair.second, bscVar, tjdVar);
                break;
        }
    }
}
