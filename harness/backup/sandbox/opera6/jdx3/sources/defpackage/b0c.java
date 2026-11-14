package defpackage;

import com.opera.android.browser.chromium.ChromiumContent;

/* loaded from: classes.dex */
public final class b0c extends n1 {
    public final v3m c;
    public byte d;
    public szb e;
    public szb f;

    public b0c(o4m o4mVar, v3m v3mVar) {
        super((Object) o4mVar, (byte) 24);
        this.d = (byte) 0;
        this.c = v3mVar;
    }

    public final void H0(szb szbVar, boolean z) {
        if (!this.c.h(szbVar)) {
            szbVar = null;
        }
        this.e = szbVar;
        if (this.f != null) {
            return;
        }
        if (szbVar != null) {
            this.d = (byte) 1;
        } else {
            this.d = z ? (byte) 2 : (byte) 0;
        }
        v0();
    }

    public final void I0(b2l b2lVar, String str) {
        yqa yqaVar;
        szb szbVarB;
        szb szbVar = null;
        this.e = null;
        this.f = null;
        this.d = (byte) 0;
        v0();
        if (str != null && (szbVarB = this.c.b(str)) != null) {
            this.f = szbVarB;
            this.d = (byte) 1;
            v0();
        }
        if (b2lVar != null) {
            uy3 uy3VarF = uy3.F(b2lVar);
            ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
            if (chromiumContent != null && (yqaVar = chromiumContent.Q) != null) {
                szbVar = (szb) yqaVar.c;
            }
        }
        H0(szbVar, false);
    }
}
