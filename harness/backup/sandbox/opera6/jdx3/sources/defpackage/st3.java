package defpackage;

import android.content.ContextWrapper;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class st3 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserActivity b;

    public /* synthetic */ st3(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.ContextWrapper, com.opera.android.BrowserActivity] */
    public final Object invoke(Object obj) {
        byte b = this.a;
        ?? r4 = this.b;
        switch (b) {
            case 0:
                int i = BrowserActivity.E1;
                r4.h1();
                break;
            case 1:
                int i2 = BrowserActivity.E1;
                r4.h1();
                break;
            case 2:
                Integer num = (Integer) obj;
                c1a c1aVar = r4.e1;
                kze kzeVar = r4.f0;
                if (c1aVar != null) {
                    int iIntValue = num.intValue();
                    kze kzeVar2 = (kze) ((ks3) c1aVar.g).e;
                    kzeVar2.r(new fi7(((fi7) kzeVar2.g()).a, iIntValue));
                }
                xf8.G0(kzeVar, new fi7(((fi7) kzeVar.g()).a, num.intValue()));
                break;
            case 3:
                String str = (String) obj;
                if (str != null) {
                    gbf gbfVar = r4.M;
                    gbf gbfVar2 = gbfVar != null ? gbfVar : null;
                    gbfVar2.k(str);
                    xbf xbfVarG = gbfVar2.t.y().g();
                    xbfVarG.getClass();
                    xbf.F(xbfVarG, tkk.b, 0, 6);
                } else {
                    int i3 = BrowserActivity.E1;
                }
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                c37 c37Var = r4.S;
                if (c37Var == null) {
                    c37Var = null;
                }
                ((nak) c37Var.a).k((Object) null, bool);
                break;
            case 5:
                r9b r9bVar = (r9b) obj;
                tgi tgiVar = (tgi) r4.y.a.j.get();
                if (!Intrinsics.a(r9bVar, tgiVar.c)) {
                    tgiVar.c = r9bVar;
                    Iterator it = CollectionsKt.k0(tgiVar.b).iterator();
                    while (it.hasNext()) {
                        tgiVar.a((ChromiumContent) it.next());
                    }
                }
                break;
            case 6:
                int i4 = BrowserActivity.E1;
                r4.C1();
                break;
            default:
                mlm mlmVarN = w1h.n((ContextWrapper) r4);
                boolean z = mlmVarN.b;
                if (!mlmVarN.a) {
                    if (!z) {
                        break;
                    }
                } else {
                    try {
                        phj.q0((BrowserActivity) r4, Collections.singletonList("uninstall"));
                    } catch (IllegalArgumentException | IllegalStateException unused) {
                    }
                }
                if (z) {
                    phj.N((BrowserActivity) r4, Collections.singletonList("uninstall"));
                }
                break;
        }
        return Unit.a;
    }
}
