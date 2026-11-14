package defpackage;

import android.content.Context;
import com.opera.android.Lazy;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class uw3 extends lim {
    public final Context a;
    public final et3 b;
    public final Lazy c;
    public final lu3 d;
    public final zyk e;
    public final zyk f;
    public final zyk g;
    public final zyk h;
    public final fv2 i = new fv2(this, (byte) 20);

    public uw3(Context context, li liVar, li liVar2, mt3 mt3Var, lu3 lu3Var, et3 et3Var, Lazy lazy, lu3 lu3Var2) {
        this.a = context;
        this.b = et3Var;
        this.c = lazy;
        this.d = lu3Var2;
        this.e = z4c.b(new oc2(liVar, (byte) 21));
        this.f = z4c.b(new oc2(liVar2, (byte) 22));
        this.g = z4c.b(new oc2(mt3Var, (byte) 23));
        this.h = z4c.b(new oc2(lu3Var, (byte) 24));
    }

    public final void R(int i, String str) {
        h7j h7jVarJ = ((SettingsManager) this.g.getValue()).j(str);
        ((x5f) ((orm) this.e.getValue())).M0(i, h7jVarJ.b, h7jVarJ.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw3.S():void");
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        ava.a.c(this.i);
        S();
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        ava.a.a(this.i);
    }
}
