package defpackage;

import android.content.Intent;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l98 {
    public final BrowserActivity a;
    public final BrowserActivity b;
    public final ot6 c;
    public final gq6 d;
    public final f1p e;
    public final pw3 f;
    public final qv7 g;
    public final jg8 h;
    public final SettingsManager i;
    public final x5f j;
    public final lq6 k;
    public final tw2 l;
    public final sm6 m;
    public final ga6 n;
    public final lq6 o;

    /* JADX WARN: Multi-variable type inference failed */
    public l98(BrowserActivity browserActivity, dp6 dp6Var) {
        ot6 ot6VarC = dp6Var.c();
        gq6 gq6Var = (gq6) dp6Var.u.getValue();
        f1p f1pVar = dp6Var.n;
        Class<BrowserActivity> cls = BrowserActivity.class;
        pw3 pw3Var = new pw3(browserActivity, cls, "sheetQueue", "getSheetQueue()Lcom/opera/android/ui/SheetQueue;", 0, (byte) 3);
        qv7 qv7Var = new qv7(0, browserActivity, cls, "canShowInternalOnboardings", "canShowInternalOnboardings()Z", 0, (byte) 1);
        jg8 jg8Var = (jg8) vml.e.d;
        SettingsManager settingsManagerH0 = browserActivity.H0();
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) browserActivity.getApplication()).L().c;
        lq6 lq6Var = new lq6(dp6Var.d());
        g77 g77Var = dp6Var.c;
        byte b = 28;
        tw2 tw2Var = new tw2(g77Var, b);
        sm6 sm6Var = new sm6(new tw2(g77Var, b));
        ga6 ga6Var = new ga6((Object) new vm6(new tw2(g77Var, b)), (byte) 2);
        lq6 lq6Var2 = new lq6(dp6Var.d());
        this.a = browserActivity;
        this.b = browserActivity;
        this.c = ot6VarC;
        this.d = gq6Var;
        this.e = f1pVar;
        this.f = pw3Var;
        this.g = qv7Var;
        this.h = jg8Var;
        this.i = settingsManagerH0;
        this.j = x5fVar;
        this.k = lq6Var;
        this.l = tw2Var;
        this.m = sm6Var;
        this.n = ga6Var;
        this.o = lq6Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0116, code lost:
    
        if (r10.o.b(r2, r0) != r1) goto L52;
     */
    /* JADX WARN: Path cross not found for [B:33:0x00a1, B:47:0x00e5], limit reached: 54 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00db -> B:45:0x00dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l98.a(nt5):java.lang.Object");
    }

    public final void b(Intent intent) {
        if (intent == null || intent.getAction() == null || Intrinsics.a(intent.getAction(), "android.intent.action.MAIN")) {
            na2.B(cqp.V(this.b.getLifecycle()), (CoroutineContext) null, (rx5) null, new j98(this, null, (byte) 2), 3);
        }
    }
}
