package defpackage;

import android.net.Uri;
import java.util.Locale;
import java.util.UUID;
import org.chromium.media.MediaDrmBridge;

/* loaded from: classes.dex */
public final /* synthetic */ class rb5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rb5(ivh ivhVar, owh owhVar, long j, inm inmVar, byte b) {
        this.a = b;
        this.b = ivhVar;
        this.c = owhVar;
        this.d = j;
        this.e = inmVar;
    }

    public /* synthetic */ rb5(tid tidVar, zid zidVar, byte[] bArr, long j) {
        this.a = (byte) 2;
        this.b = tidVar;
        this.c = zidVar;
        this.e = bArr;
        this.d = j;
    }

    public /* synthetic */ rb5(wyd wydVar, long j, Uri uri, lq3 lq3Var) {
        this.a = (byte) 3;
        this.b = wydVar;
        this.d = j;
        this.c = uri;
        this.e = lq3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.c;
        long j = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((ivh) obj3).t((owh) obj2, j, (hwh) obj);
                break;
            case 1:
                ((ivh) obj3).n((owh) obj2, j, (x61) obj);
                break;
            case 2:
                tid tidVar = (tid) obj3;
                zid zidVar = (zid) obj2;
                byte[] bArr = (byte[]) obj;
                if (zidVar != null) {
                    String.format(Locale.US, "ExpirationUpdate(%s): %tF %tT", zidVar, Long.valueOf(j), Long.valueOf(j));
                    MediaDrmBridge mediaDrmBridge = tidVar.a;
                    UUID uuid = MediaDrmBridge.n;
                    mediaDrmBridge.m(new pid(zidVar.a, j));
                    break;
                } else {
                    zid.a(bArr);
                    Locale locale = Locale.US;
                    break;
                }
            default:
                wyd wydVar = (wyd) obj3;
                Uri uri = (Uri) obj2;
                lq3 lq3Var = (lq3) obj;
                wydVar.getClass();
                Uri uri2 = (Uri) lq3Var.c;
                byte b2 = lq3Var.b;
                glh glhVar = wydVar.c;
                if (b2 == 0) {
                    wydVar.e.add(Long.valueOf(j));
                    glhVar.f(new tyd(wydVar, (byte) 0));
                    break;
                } else if (b2 == 1) {
                    glhVar.h(new uyd(wydVar, (byte) 0), uri2.toString(), j);
                    break;
                } else if (b2 == 2) {
                    glhVar.h(new hpd(wydVar, uri, (byte) 7), uri2.toString(), j);
                    break;
                }
                break;
        }
    }
}
