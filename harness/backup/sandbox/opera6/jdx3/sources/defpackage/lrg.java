package defpackage;

import com.usercentrics.sdk.ui.components.UCToggle;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class lrg implements hpg {
    public static final /* synthetic */ xtb[] d;
    public Function1 a = h50.H;
    public final ArrayList b = new ArrayList();
    public final fz2 c;

    static {
        xtb peeVar = new pee(lrg.class, "currentState", "getCurrentState()Z", 0);
        uqh.a.getClass();
        d = new xtb[]{peeVar};
    }

    public lrg(boolean z) {
        this.c = new fz2(Boolean.valueOf(z), this, (byte) 6);
    }

    @Override // defpackage.hpg
    public final void a(boolean z) {
        this.c.g(d[0], Boolean.valueOf(z));
    }

    @Override // defpackage.hpg
    public final boolean b() {
        xtb xtbVar = d[0];
        return ((Boolean) this.c.b).booleanValue();
    }

    public final void c(UCToggle uCToggle) {
        ArrayList arrayList = this.b;
        if (!arrayList.contains(uCToggle) ? arrayList.add(uCToggle) : false) {
            if (b() != uCToggle.isChecked()) {
                uCToggle.a(b());
            }
            uCToggle.T = new s2e(1, this, lrg.class, "onStateChange", "onStateChange(Z)V", 0, (byte) 28);
        }
    }

    @Override // defpackage.hpg
    public final void dispose() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((hpg) obj).dispose();
        }
        arrayList.clear();
        this.a = h50.G;
    }
}
