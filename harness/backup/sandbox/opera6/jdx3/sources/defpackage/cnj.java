package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final /* synthetic */ class cnj implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vnj b;
    public final /* synthetic */ lnj c;

    public /* synthetic */ cnj(vnj vnjVar, lnj lnjVar, byte b) {
        this.a = b;
        this.b = vnjVar;
        this.c = lnjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lnj lnjVar = this.c;
        vnj vnjVar = this.b;
        switch (b) {
            case 0:
                vnjVar.n(v08.a, Collections.singleton(lnjVar));
                break;
            case 1:
                vnjVar.n(v08.a, Collections.singleton(lnjVar));
                break;
            default:
                vnjVar.k(lnjVar);
                break;
        }
    }
}
