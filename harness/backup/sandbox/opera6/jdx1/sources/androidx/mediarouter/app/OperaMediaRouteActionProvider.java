package androidx.mediarouter.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import defpackage.cnd;
import defpackage.dod;
import defpackage.ff;
import defpackage.lmd;
import defpackage.r16;
import defpackage.vnd;

/* loaded from: classes.dex */
public class OperaMediaRouteActionProvider extends ff {
    public final dod d;
    public final lmd e;
    public vnd f;
    public cnd g;
    public OperaMediaRouteButton h;
    public r16 i;

    public OperaMediaRouteActionProvider(Context context) {
        super(context);
        this.f = vnd.c;
        this.g = cnd.a;
        this.d = dod.d(context);
        this.e = new lmd(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // defpackage.ff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r3 = this;
            r16 r0 = r3.i
            r1 = 1
            if (r0 == 0) goto L1a
            boolean r0 = ipe.G()
            if (r0 == 0) goto L1a
            r16 r0 = r3.i
            r0.getClass()
            java.lang.String r0 = "android.permission.ACCESS_LOCAL_NETWORK"
            android.content.Context r2 = r3.a
            boolean r0 = defpackage.fr3.Q(r2, r0)
            if (r0 == 0) goto L27
        L1a:
            vnd r0 = r3.f
            dod r3 = r3.d
            r3.getClass()
            boolean r3 = defpackage.dod.i(r0, r1)
            if (r3 == 0) goto L28
        L27:
            return r1
        L28:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.OperaMediaRouteActionProvider.b():boolean");
    }

    @Override // defpackage.ff
    public final View c() {
        OperaMediaRouteButton operaMediaRouteButton = new OperaMediaRouteButton(this.a, null);
        this.h = operaMediaRouteButton;
        if (true != operaMediaRouteButton.o) {
            operaMediaRouteButton.o = true;
            operaMediaRouteButton.i();
        }
        this.h.e(this.f);
        this.h.getClass();
        OperaMediaRouteButton operaMediaRouteButton2 = this.h;
        cnd cndVar = this.g;
        if (cndVar == null) {
            operaMediaRouteButton2.getClass();
            qp2.o("factory must not be null");
            return null;
        }
        operaMediaRouteButton2.d = cndVar;
        r16 r16Var = this.i;
        if (r16Var != operaMediaRouteButton2.e) {
            operaMediaRouteButton2.e = r16Var;
            operaMediaRouteButton2.c();
            operaMediaRouteButton2.b();
        }
        this.h.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.h;
    }

    @Override // defpackage.ff
    public final boolean e() {
        OperaMediaRouteButton operaMediaRouteButton = this.h;
        if (operaMediaRouteButton != null) {
            return operaMediaRouteButton.g();
        }
        return false;
    }
}
