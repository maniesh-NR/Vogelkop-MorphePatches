package defpackage;

import java.util.List;
import okhttp3.internal.ws.RealWebSocket;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class bnc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hnc b;

    public /* synthetic */ bnc(hnc hncVar, byte b) {
        this.a = b;
        this.b = hncVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        RealWebSocket realWebSocket;
        byte b = this.a;
        hnc hncVar = this.b;
        switch (b) {
            case 0:
                pr prVar = hncVar.m;
                if (prVar != null) {
                    prVar.e("ping", (List) null, hncVar.j);
                    break;
                }
                break;
            case 1:
                if (hncVar.m != null) {
                    ewn ewnVar = hncVar.n;
                    if (ewnVar != null && (realWebSocket = ewnVar.c) != null) {
                        realWebSocket.cancel();
                    }
                    hncVar.a(true);
                    break;
                }
                break;
            default:
                hncVar.o = null;
                hncVar.b();
                break;
        }
    }
}
