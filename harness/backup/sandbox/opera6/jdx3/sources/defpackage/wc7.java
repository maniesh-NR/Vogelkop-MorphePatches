package defpackage;

import J.N;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class wc7 implements p5j {
    public final SettingsManager a;
    public final ydn b;
    public final h7f c = new h7f();
    public int d = -1;
    public String e;

    public wc7(SettingsManager settingsManager, ydn ydnVar) {
        this.a = settingsManager;
        settingsManager.F(this);
        this.b = ydnVar;
        ydnVar.F(new vc7(this, (byte) 0));
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("dns_over_https_enabled".equals(str) || "dns_over_https_mode".equals(str) || "dns_over_https_custom_server_template".equals(str)) {
            c();
        }
    }

    public final int a() {
        SettingsManager settingsManager = this.a;
        if (!settingsManager.i("dns_over_https_enabled")) {
            return 0;
        }
        ydn ydnVar = this.b;
        if (ydnVar.d.a && ydnVar.c.isEnabled()) {
            return 0;
        }
        return settingsManager.l() == l7j.DEVICE_DEFAULT ? 1 : 2;
    }

    public final String b() {
        SettingsManager settingsManager = this.a;
        boolean zI = settingsManager.i("dns_over_https_enabled");
        ydn ydnVar = this.b;
        boolean z = ydnVar.d.a && ydnVar.c.isEnabled();
        l7j l7jVarL = settingsManager.l();
        if (z || !zI) {
            return "";
        }
        if (l7jVarL != l7j.CUSTOM) {
            return l7jVarL.a;
        }
        String strZ = settingsManager.z("dns_over_https_custom_server_template");
        return N.MLC1dld3(strZ) ? strZ : "";
    }

    public final void c() {
        int iA = a();
        String strB = b();
        if (iA != this.d || !strB.equals(this.e)) {
            this.d = iA;
            this.e = strB;
            N.MnODEeX4();
        }
        h7f h7fVar = this.c;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            dzg dzgVar = (dzg) g7fVarH.next();
            byte b = dzgVar.a;
            Object obj = dzgVar.b;
            switch (b) {
                case 0:
                    ((hzg) obj).g();
                    break;
                default:
                    ((vzk) obj).h0();
                    break;
            }
        }
    }
}
