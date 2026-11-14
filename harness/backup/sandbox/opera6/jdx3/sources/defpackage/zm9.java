package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class zm9 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public zm9(spi spiVar, Function2 function2, n27 n27Var) {
        this.b = spiVar;
        this.c = function2;
        this.d = n27Var;
        this.e = new pad((byte) 13);
    }

    public zm9(boolean z, pxh pxhVar, dxh dxhVar, psn psnVar, ssn ssnVar) {
        this.a = z;
        this.b = pxhVar;
        this.c = dxhVar;
        this.d = psnVar;
        this.e = ssnVar;
    }

    public static void a(fmg fmgVar) {
        List list = fmgVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((lmg) list.get(i)).a();
        }
    }

    public final void b(boolean z) {
        if (((Runnable) this.d) == null) {
            return;
        }
        if (this.a) {
            View view = (View) this.e;
            if (view != null) {
                view.setVerticalScrollBarEnabled(true);
            }
            r activity = ((Fragment) this.c).getActivity();
            if (activity != null) {
                activity.getWindow().clearFlags(16);
            }
            if (z) {
                c();
            }
        }
        ((Runnable) this.d).run();
        this.d = null;
    }

    public abstract void c();

    public abstract void d();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.jvm.functions.Function2 r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.nze
            if (r0 == 0) goto L13
            r0 = r7
            nze r0 = (defpackage.nze) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            nze r0 = new nze
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            ybh.y(r7)
            goto L43
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L2e:
            ybh.y(r7)
            r5.a = r4
            qmb r7 = new qmb
            r2 = 13
            r7.<init>(r5, r6, r3, r2)
            r0.v = r4
            java.lang.Object r6 = zch.z(r7, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r6 = 0
            r5.a = r6
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm9.e(kotlin.jvm.functions.Function2, nt5):java.lang.Object");
    }
}
