package defpackage;

import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.media.PlayerService;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ycb implements cdb {
    public final /* synthetic */ byte a;
    public final BrowserActivity b;
    public final boolean c;

    public /* synthetic */ ycb(BrowserActivity browserActivity, boolean z, byte b) {
        this.a = b;
        this.b = browserActivity;
        this.c = z;
    }

    @Override // defpackage.cdb
    public final void execute() {
        byte b = this.a;
        boolean z = false;
        boolean z2 = this.c;
        r rVar = this.b;
        switch (b) {
            case 0:
                rVar.n0(z2, false);
                ac8.a(new xxh());
                break;
            default:
                if (z2) {
                    String[] strArr = OperaApplication.K;
                    tjg tjgVarX = ((OperaApplication) rVar.getApplication()).x();
                    ujc ujcVar = tjgVarX.i;
                    PlayerService.d(tjgVarX, ujcVar != null ? ((gk9) ujcVar).b.g() : null, yh0.h);
                    cg2 cg2Var = (cg2) rVar.y.k.f();
                    if (cg2Var != null && cg2Var.j != null) {
                    }
                }
                for (Fragment fragment : rVar.getSupportFragmentManager().c.f()) {
                    if (fragment != null) {
                        if (!(fragment instanceof gld)) {
                            if (fragment instanceof rld) {
                                if (Build.VERSION.SDK_INT < 31) {
                                    rVar.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                                }
                            }
                        }
                        z = true;
                    }
                }
                if (!z) {
                    int i = BrowserActivity.E1;
                    rVar.o1(1);
                    qim qimVar = rVar.o;
                    Objects.requireNonNull(qimVar);
                    qimVar.g(zhj.a(new gld(), 4099));
                    break;
                }
                break;
        }
    }
}
