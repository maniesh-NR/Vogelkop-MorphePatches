package defpackage;

import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetClient;
import com.opera.android.browser.SafeBrowsingBridge;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class vgi extends lim implements p5j, mo7 {
    public final fp1 a;
    public final SettingsManager b;
    public final e3j c;
    public final x5f d;
    public SafetyNetClient e;
    public String f;
    public boolean g;

    public vgi(fp1 fp1Var, SettingsManager settingsManager, e3j e3jVar, x5f x5fVar) {
        this.a = fp1Var;
        this.b = settingsManager;
        this.c = e3jVar;
        this.d = x5fVar;
        fp1Var.getLifecycle().a(this);
        settingsManager.F(this);
        e3jVar.F(this);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("safe_browsing_enabled".equals(str)) {
            R();
        }
    }

    public final void R() {
        if (this.e != null) {
            return;
        }
        String str = this.f;
        x5f x5fVar = this.d;
        if (str != null) {
            vgi vgiVar = SafeBrowsingBridge.a;
            fp1 fp1Var = this.a;
            if (((wnh) xnh.t(fp1Var).i()).b(8192)) {
                if (!this.b.getSafeBrowsingEnabled()) {
                    x5fVar.G0(vd0.c);
                    return;
                }
                SafetyNetClient client = SafetyNet.getClient(fp1Var);
                this.e = client;
                client.initSafeBrowsing().addOnCompleteListener(new r9g((Object) this, (byte) 23));
                return;
            }
        }
        x5fVar.G0(vd0.d);
    }

    public final void S() {
        if (this.e == null) {
            return;
        }
        if (SafeBrowsingBridge.a == this) {
            SafeBrowsingBridge.b = new ArrayDeque();
        }
        this.f = null;
        this.g = false;
        this.e.shutdownSafeBrowsing();
        this.e = null;
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        qsh qshVarB = ((d3j) this.c.i()).b(3);
        if (qshVarB != null) {
            String str = (String) qshVarB.b;
            if (!str.isEmpty()) {
                this.f = str;
            }
        }
        R();
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        S();
        this.c.H(this);
        this.b.H(this);
        if (SafeBrowsingBridge.a == this) {
            SafeBrowsingBridge.a = null;
        }
    }
}
