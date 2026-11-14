package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.r;
import androidx.fragment.app.w;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class tcb implements cdb {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ tcb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public tcb(p12 p12Var, s0f s0fVar) {
        this.a = (byte) 0;
        this.b = s0fVar;
        this.c = p12Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, com.opera.android.BrowserActivity] */
    @Override // defpackage.cdb
    public final void execute() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                p12 p12Var = (p12) obj;
                ?? r0 = (BrowserActivity) p12Var.a;
                String[] strArr = OperaApplication.K;
                x5f x5fVar = ((OperaApplication) r0.getApplicationContext()).L().c;
                x5f x5fVar2 = ((OperaApplication) r0.getApplicationContext()).L().d;
                s0f s0fVar = (s0f) obj2;
                umi umiVar = (umi) p12Var.d;
                Bundle bundle = s0fVar.b;
                if (bundle != null && bundle.containsKey("notification_type")) {
                    try {
                        wbh wbhVarA = new nbh(r0, umiVar, x5fVar, x5fVar2).a(r0, s0fVar.b, false);
                        if (wbhVarA.q) {
                            wbhVarA.s(SystemClock.uptimeMillis() - s0fVar.a, !wbhVarA.i);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (s0fVar.g(r0)) {
                    s0fVar.e(r0);
                    break;
                }
                break;
            case 1:
                r rVar = (BrowserActivity) obj2;
                boolean booleanExtra = ((Intent) obj).getBooleanExtra("com.opera.android.EXTRA_ENABLE_COMPRESSION", false);
                w supportFragmentManager = rVar.getSupportFragmentManager();
                tc6 tc6VarO = lcp.o(supportFragmentManager, tc6.class);
                if (tc6VarO == null) {
                    int i = BrowserActivity.E1;
                    rVar.o1(1);
                    wzg wzgVar = new wzg(null, tc6.class, (byte) 4);
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("extra_enable_compression", booleanExtra);
                    bundle2.putBoolean("extra_show_free_data_dialog", true);
                    new zhj(wzgVar, bundle2, 1, 4099, null, false, Arrays.asList(new n6h[0])).c(rVar);
                    break;
                } else {
                    supportFragmentManager.Y(-1, 0, "data-savings");
                    tc6VarO.getLifecycle().a(new y73(tc6VarO, booleanExtra));
                    break;
                }
            case 2:
                ((zhj) obj2).c((Context) obj);
                break;
            case 3:
                ndc ndcVar = (BrowserActivity) obj2;
                String[] strArr2 = OperaApplication.K;
                OperaApplication operaApplication = (OperaApplication) ndcVar.getApplication();
                if (operaApplication.D().d()) {
                    new edb(ndcVar, ndcVar.F0(), operaApplication.M(), (ltg) obj);
                    break;
                }
                break;
            default:
                d7l d7lVar = (d7l) ((k6l) obj2).o;
                d7lVar.getClass();
                d7lVar.Z((lsc) obj);
                break;
        }
    }
}
