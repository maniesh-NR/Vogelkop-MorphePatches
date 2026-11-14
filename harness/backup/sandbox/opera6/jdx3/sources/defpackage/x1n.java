package defpackage;

import J.N;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.chromium.OperaBrowserContext;
import java.util.Map;

/* loaded from: classes.dex */
public final class x1n implements w1n {
    public final /* synthetic */ byte a;

    public /* synthetic */ x1n(byte b) {
        this.a = b;
    }

    public x1n(uu1 uu1Var) {
        this.a = (byte) 1;
    }

    @Override // defpackage.w1n
    public final void apply(int i) {
        switch (this.a) {
            case 0:
                if (i > 0 && i < 1904402000) {
                    j4c j4cVar = OperaBrowserContext.b;
                    N.Mq7hzS$4();
                    break;
                }
                break;
            case 1:
                if (i > 0 && i < 1905902000) {
                    int i2 = BrowserActivity.E1;
                    for (Map.Entry entry : s9g.h.c.D().entrySet()) {
                        jag jagVar = (jag) entry.getValue();
                        lag lagVar = lag.b;
                        if (jagVar.a(lagVar, (kag) null) == kag.ASK) {
                            int i3 = BrowserActivity.E1;
                            s9g.h.b(lagVar, (String) entry.getKey(), false);
                        }
                    }
                    break;
                }
                break;
            case 2:
                if (i > 0 && i < 1905608000) {
                    N.MFg$8iJw();
                    break;
                }
                break;
            case 3:
                if (i > 0 && i < 1905800000) {
                    lx3.a("https://www.karaoketexty.cz/", false);
                    lx3.a("https://www.kupi.cz/", false);
                    lx3.a("https://www.novinky.cz/", false);
                    lx3.a("https://www.super.cz/", false);
                    break;
                }
                break;
            default:
                if (i > 0 && i < 1905508000) {
                    lx3.a("https://www.sport.cz/", false);
                    break;
                }
                break;
        }
    }
}
