package defpackage;

import com.opera.android.browser.chromium.ChromiumContent;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p82 extends jw9 {
    public int a;
    public final /* synthetic */ q82 b;

    public p82(q82 q82Var) {
        this.b = q82Var;
    }

    public final void f(int i, int i2) {
        q82 q82Var = this.b;
        ChromiumContent chromiumContentH = uy3.H(q82Var.j);
        Objects.requireNonNull(chromiumContentH);
        huh huhVar = chromiumContentH.e().g;
        if (huhVar.c() > 0) {
            int iC = huhVar.c();
            int iFloor = (((iC / 2) + (((int) Math.floor(huhVar.a(huhVar.b))) * 10)) / iC) * 10;
            if (iFloor > this.a) {
                this.a = iFloor;
                h7f h7fVar = q82Var.a;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((r82) g7fVarH.next()).c(this.a);
                }
            }
        }
    }
}
