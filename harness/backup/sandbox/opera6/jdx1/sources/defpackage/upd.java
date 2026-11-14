package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final /* synthetic */ class upd implements Runnable {
    public final /* synthetic */ km5 a;
    public final /* synthetic */ ood b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ nod e;

    public /* synthetic */ upd(km5 km5Var, ood oodVar, boolean z, boolean z2, nod nodVar) {
        this.a = km5Var;
        this.b = oodVar;
        this.c = z;
        this.d = z2;
        this.e = nodVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        npd npdVar = ((aqd) this.a.d).f;
        xkg xkgVar = npdVar.t;
        z5i.n0(xkgVar, this.b);
        int playbackState = xkgVar.getPlaybackState();
        if (this.c) {
            if (playbackState == 1) {
                if (xkgVar.C(2)) {
                    xkgVar.a();
                }
            } else if (playbackState == 4 && xkgVar.C(4)) {
                xkgVar.seekToDefaultPosition();
            }
        }
        boolean z = this.d;
        if (z && xkgVar.C(1)) {
            xkgVar.play();
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i : new int[]{31, 2}) {
            z4o.H(!false);
            sparseBooleanArray.append(i, true);
        }
        if (z) {
            z4o.H(!false);
            sparseBooleanArray.append(1, true);
        }
        z4o.H(!false);
        npdVar.o(this.e);
    }
}
