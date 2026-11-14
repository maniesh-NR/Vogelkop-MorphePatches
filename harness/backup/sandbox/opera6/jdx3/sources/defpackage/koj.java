package defpackage;

import J.N;
import android.app.NotificationChannel;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class koj implements Runnable {
    public final /* synthetic */ byte a;

    public /* synthetic */ koj(byte b) {
        this.a = b;
    }

    public /* synthetic */ koj(bp2 bp2Var, Object obj, byte b) {
        this.a = b;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        String[] list;
        switch (this.a) {
            case 0:
                N.MZdYbHPD();
                return;
            case 1:
                xbf.h = null;
                return;
            case 2:
                return;
            case 3:
                n9h n9hVar = rmj.a;
                synchronized (n9hVar.c) {
                    Iterator it = ((wub) n9hVar.b).F().iterator();
                    while (it.hasNext()) {
                        String id = ((NotificationChannel) it.next()).getId();
                        if (n9h.n(id)) {
                            ((wub) n9hVar.b).A(id);
                        }
                    }
                }
                return;
            case 4:
                throw null;
            case 5:
            case 6:
                return;
            case 7:
                boolean zMnfJQqTB = N.MnfJQqTB();
                if (yxl.b == null) {
                    if (zMnfJQqTB) {
                        yxl.b = new yxl();
                        Looper.myQueue().addIdleHandler(yxl.b);
                        return;
                    }
                    return;
                }
                if (zMnfJQqTB) {
                    return;
                }
                Looper.myQueue().removeIdleHandler(yxl.b);
                yxl.b = null;
                return;
            case 8:
                Object objF = xne.b.f();
                if (objF != null) {
                    ((t9f) objF).E.a.evictAll();
                    return;
                }
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                try {
                    CookieManager.getInstance();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                File fileB = sjo.b(1);
                if (fileB != null) {
                    sjo.g(fileB);
                    File fileB2 = sjo.b(1);
                    if (fileB2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(fileB2);
                        try {
                            new File(z1m.l(sb, File.separator, ".nomedia")).createNewFile();
                            return;
                        } catch (IOException unused2) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                h9o h9oVar = new h9o((byte) 21);
                String str = "https://res.adx.opera.com/om/omjs/Service/omsdk-v2.js";
                h9o h9oVar2 = new h9o((byte) 23);
                if (URLUtil.isNetworkUrl("https://res.adx.opera.com/om/omjs/Service/omsdk-v2.js")) {
                    gxo.c.b(new h4m((Object) str, (Object) h9oVar2, (Object) h9oVar, (byte) 13));
                    return;
                }
                return;
            case 12:
                List list2 = ezo.a;
                tyo tyoVar = new tyo(new xyo());
                if (URLUtil.isNetworkUrl("https://res.adx.opera.com/om/omjs/Service/omsdk-v2.js")) {
                    hyg.c(new jro("https://res.adx.opera.com/om/omjs/Service/omsdk-v2.js", tyoVar, 1, 4));
                    return;
                } else {
                    hyg.b(tyoVar);
                    return;
                }
            case 13:
                return;
            case 14:
                File fileT = vtp.t("StoredCPDAds.txt");
                if (fileT != null && fileT.exists()) {
                    sjo.g(fileT);
                }
                File fileB3 = sjo.b(3);
                if (fileB3 == null || (list = fileB3.list(new o3b((byte) 2))) == null) {
                    return;
                }
                for (String str2 : list) {
                    File fileT2 = vtp.t(str2);
                    if (fileT2 != null && fileT2.exists()) {
                        gxo.a(new fmn((Object) str2, (Object) new t3p((byte) 2), (byte) 19));
                    }
                }
                return;
            default:
                fip.f = false;
                fip.e();
                return;
        }
    }
}
