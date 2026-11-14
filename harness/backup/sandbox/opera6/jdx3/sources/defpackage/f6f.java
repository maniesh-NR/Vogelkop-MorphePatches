package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes.dex */
public final class f6f extends n1 {
    public final /* synthetic */ g6f c;

    public f6f(g6f g6fVar) {
        super((byte) 23, false);
        this.c = g6fVar;
    }

    @Override // defpackage.n1
    public final void run() {
        g6f g6fVar = this.c;
        g6fVar.c = true;
        g6fVar.a.a(new AdvertisingIdClient.Info("", true));
    }
}
