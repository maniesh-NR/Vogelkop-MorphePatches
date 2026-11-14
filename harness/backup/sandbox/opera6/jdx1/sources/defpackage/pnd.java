package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class pnd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rnd b;
    public final /* synthetic */ eq6 c;
    public final /* synthetic */ bnd d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ pnd(rnd rndVar, eq6 eq6Var, bnd bndVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = rndVar;
        this.c = eq6Var;
        this.d = bndVar;
        this.e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.e;
        bnd bndVar = this.d;
        eq6 eq6Var = this.c;
        rnd rndVar = this.b;
        switch (b) {
            case 0:
                eq6Var.L(rndVar, bndVar, arrayList);
                break;
            default:
                eq6Var.L(rndVar, bndVar, arrayList);
                break;
        }
    }
}
