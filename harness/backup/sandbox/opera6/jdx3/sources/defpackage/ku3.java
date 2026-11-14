package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.SessionStore;
import java.util.ArrayList;
import org.chromium.base.CommandLine;

/* loaded from: classes.dex */
public final class ku3 extends lim implements c7d, Handler.Callback {
    public final hu3 a = new hu3(this);
    public final iu3 b = new iu3(this);
    public final ju3 c = new ju3(this);
    public final Handler d = new Handler(Looper.getMainLooper(), this);
    public final /* synthetic */ BrowserActivity e;

    public ku3(BrowserActivity browserActivity) {
        this.e = browserActivity;
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        Context applicationContext = this.e.getApplicationContext();
        String[] strArr = OperaApplication.K;
        CommandLine commandLine = ((OperaApplication) applicationContext.getApplicationContext()).n;
        if (commandLine == null) {
            commandLine = null;
        }
        fsp.g(applicationContext, commandLine);
        e7d.a(applicationContext, this);
    }

    @Override // defpackage.c7d
    public final void c(int i) {
        kfo.d0(this.e.Q0.a, vep.A(i) != 2 ? 0 : 1);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            hu3 hu3Var = this.a;
            ku3 ku3Var = (ku3) hu3Var.d;
            fp1 fp1Var = ku3Var.e;
            if (!hu3Var.a || !hu3Var.b || hu3Var.c) {
                return false;
            }
            hu3Var.c = true;
            Context applicationContext = fp1Var.getApplicationContext();
            String[] strArr = OperaApplication.K;
            CommandLine commandLine = ((OperaApplication) applicationContext.getApplicationContext()).n;
            fsp.u(fp1Var, xi5.a(applicationContext));
            ku3Var.b.a = true;
            ku3Var.d.sendEmptyMessage(2);
            return false;
        }
        if (i != 2) {
            return false;
        }
        iu3 iu3Var = this.b;
        if (!iu3Var.a || !iu3Var.b || !iu3Var.c || iu3Var.d) {
            return false;
        }
        iu3Var.d = true;
        ku3 ku3Var2 = iu3Var.e;
        BrowserActivity browserActivity = ku3Var2.e;
        ou3 ou3Var = browserActivity.g1;
        ou3Var.h = ku3Var2.c.d;
        browserActivity.l1(ou3Var);
        browserActivity.l1(browserActivity.x0());
        return false;
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        e7d.c(this);
        ju3 ju3Var = this.c;
        oml omlVar = ju3Var.a;
        if (omlVar != null) {
            omlVar.cancel(false);
        }
        if (ju3Var.c) {
            ju3Var.c = false;
            ArrayList arrayList = (ArrayList) ((vl9) SessionStore.j.e.b).b;
            if (arrayList != null) {
                arrayList.remove(ju3Var);
            }
        }
    }

    @Override // defpackage.c7d
    public final void onSuccess() {
        this.a.a = true;
        ju3 ju3Var = this.c;
        umi umiVar = ju3Var.e.e.x;
        on7 on7Var = pn7.b;
        ju3Var.a = fac.B(umiVar, cs5.x0(3, un7.e), new oc2(ju3Var, (byte) 18));
        ju3Var.b = System.nanoTime();
        ju3Var.c = true;
        SessionStore.j.e.d(ju3Var);
        this.d.sendEmptyMessage(1);
    }
}
