package defpackage;

import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.r;
import androidx.fragment.app.w;
import com.opera.android.startup.WelcomeActivity;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bl9 implements uya {
    public int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public bl9(r rVar, Fragment fragment) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.d = arrayDeque;
        w supportFragmentManager = rVar.getSupportFragmentManager();
        this.c = supportFragmentManager;
        this.a = 2131363025;
        View viewFindViewById = rVar.findViewById(2131363025);
        this.f = viewFindViewById;
        a aVarF = u35.f(supportFragmentManager, supportFragmentManager);
        aVarF.e(2131363025, fragment, null, 1);
        aVarF.i(true, true);
        arrayDeque.push(fragment);
        ho3 ho3Var = new ho3(this, (byte) 3);
        this.e = ho3Var;
        viewFindViewById.addOnLayoutChangeListener(ho3Var);
    }

    public bl9(bza bzaVar, List list, int i, bza bzaVar2, apj apjVar, y55 y55Var, boolean z) {
        this.c = bzaVar;
        this.d = list;
        this.a = i;
        this.e = bzaVar2;
        this.f = apjVar;
        this.g = y55Var;
        this.b = z;
    }

    public bl9(WelcomeActivity welcomeActivity, Bundle bundle) {
        this.d = new ArrayDeque();
        w supportFragmentManager = welcomeActivity.getSupportFragmentManager();
        this.c = supportFragmentManager;
        this.a = 2131363025;
        this.f = welcomeActivity.findViewById(2131363025);
        a aVarF = u35.f(supportFragmentManager, supportFragmentManager);
        int i = 0;
        boolean z = false;
        while (true) {
            i++;
            String strI = sko.i(i, "f");
            String string = bundle.getString(strI);
            Fragment fragment = null;
            if (string != null) {
                Fragment fragmentB = supportFragmentManager.c.b(string);
                if (fragmentB == null) {
                    supportFragmentManager.n0(new IllegalStateException(p3p.w("Fragment no longer exists for key ", strI, ": unique id ", string)));
                    throw null;
                }
                fragment = fragmentB;
            }
            if (fragment == null) {
                aVarF.h();
                ho3 ho3Var = new ho3(this, (byte) 3);
                this.e = ho3Var;
                ((View) this.f).addOnLayoutChangeListener(ho3Var);
                return;
            }
            ((ArrayDeque) this.d).add(fragment);
            if (z) {
                aVarF.l(fragment);
            } else {
                z = true;
            }
        }
    }

    public bl9(uya uyaVar) {
        this.c = new Object();
        this.a = 0;
        this.b = false;
        this.g = new uva(this, (byte) 1);
        this.d = uyaVar;
        this.e = uyaVar.getSurface();
    }

    public final void a(a aVar) {
        w wVar = (w) this.c;
        if (wVar.L) {
            return;
        }
        aVar.i(true, true);
        wVar.D();
    }

    public final void b(Fragment fragment, Fragment fragment2, zm9 zm9Var, Runnable runnable) {
        zm9 zm9Var2 = (zm9) this.g;
        if (zm9Var2 != null) {
            zm9Var2.b(true);
        }
        this.b = true;
        this.g = zm9Var;
        w wVar = (w) this.c;
        a aVarF = u35.f(wVar, wVar);
        aVarF.e(this.a, fragment, null, 1);
        a(aVarF);
        iv ivVar = new iv(this, zm9Var, runnable, (byte) 5);
        zm9Var.c = fragment;
        zm9Var.b = fragment2;
        zm9Var.d = ivVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nt5 r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = r13.c
            r2 = r0
            bza r2 = (defpackage.bza) r2
            int r0 = r13.a
            boolean r1 = r14 instanceof defpackage.zlh
            if (r1 == 0) goto L1b
            r1 = r14
            zlh r1 = (defpackage.zlh) r1
            int r3 = r1.w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r1.w = r3
        L19:
            r14 = r1
            goto L21
        L1b:
            zlh r1 = new zlh
            r1.<init>(r13, r14)
            goto L19
        L21:
            java.lang.Object r1 = r14.u
            px5 r9 = px5.a
            int r3 = r14.w
            r10 = 0
            r11 = 1
            if (r3 == 0) goto L39
            if (r3 != r11) goto L33
            n38 r13 = r14.t
            defpackage.ybh.y(r1)
            goto L70
        L33:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r13)
            return r10
        L39:
            defpackage.ybh.y(r1)
            java.lang.Object r1 = r13.d
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            r12 = r3
            n38 r12 = (defpackage.n38) r12
            int r4 = r0 + 1
            java.lang.Object r0 = r13.e
            r5 = r0
            bza r5 = (defpackage.bza) r5
            java.lang.Object r0 = r13.f
            r6 = r0
            apj r6 = (defpackage.apj) r6
            r0 = r1
            bl9 r1 = new bl9
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r13.g
            r7 = r0
            y55 r7 = (y55) r7
            boolean r8 = r13.b
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r14.t = r12
            r14.w = r11
            java.lang.Object r1 = r12.d(r1, r14)
            if (r1 != r9) goto L6f
            return r9
        L6f:
            r13 = r12
        L70:
            jza r1 = (defpackage.jza) r1
            bza r14 = r1.getRequest()
            android.content.Context r0 = r14.a
            android.content.Context r3 = r2.a
            java.lang.String r4 = "Interceptor '"
            if (r0 != r3) goto La3
            java.lang.Object r0 = r14.b
            f4f r3 = defpackage.f4f.a
            if (r0 == r3) goto L9d
            yqa r0 = r14.c
            yqa r3 = r2.c
            if (r0 != r3) goto L97
            opj r14 = r14.l
            opj r0 = r2.l
            if (r14 != r0) goto L91
            return r1
        L91:
            java.lang.String r14 = "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead."
            defpackage.kp5.b(r13, r14, r4)
            return r10
        L97:
            java.lang.String r14 = "' cannot modify the request's target."
            defpackage.kp5.b(r13, r14, r4)
            return r10
        L9d:
            java.lang.String r14 = "' cannot set the request's data to null."
            defpackage.kp5.b(r13, r14, r4)
            return r10
        La3:
            java.lang.String r14 = "' cannot modify the request's context."
            defpackage.kp5.b(r13, r14, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl9.c(nt5):java.lang.Object");
    }

    public final void close() {
        synchronized (this.c) {
            Surface surface = (Surface) this.e;
            if (surface != null) {
                surface.release();
            }
            ((uya) this.d).close();
        }
    }

    public final void d() {
        synchronized (this.c) {
            this.b = true;
            ((uya) this.d).l();
            if (this.a == 0) {
                close();
            }
        }
    }

    public final qya e() {
        vva vvaVar;
        synchronized (this.c) {
            qya qyaVarE = ((uya) this.d).e();
            if (qyaVarE != null) {
                this.a++;
                vvaVar = new vva(qyaVarE);
                vvaVar.h((uva) this.g);
            } else {
                vvaVar = null;
            }
        }
        return vvaVar;
    }

    public final int getHeight() {
        int height;
        synchronized (this.c) {
            height = ((uya) this.d).getHeight();
        }
        return height;
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.c) {
            surface = ((uya) this.d).getSurface();
        }
        return surface;
    }

    public final int getWidth() {
        int width;
        synchronized (this.c) {
            width = ((uya) this.d).getWidth();
        }
        return width;
    }

    public final int i() {
        int i;
        synchronized (this.c) {
            i = ((uya) this.d).i();
        }
        return i;
    }

    public final void l() {
        synchronized (this.c) {
            ((uya) this.d).l();
        }
    }

    public final int q() {
        int iQ;
        synchronized (this.c) {
            iQ = ((uya) this.d).q();
        }
        return iQ;
    }

    public final void w(tya tyaVar, Executor executor) {
        synchronized (this.c) {
            ((uya) this.d).w(new mgf(this, tyaVar, (byte) 18), executor);
        }
    }

    public final qya y() {
        vva vvaVar;
        synchronized (this.c) {
            qya qyaVarY = ((uya) this.d).y();
            if (qyaVarY != null) {
                this.a++;
                vvaVar = new vva(qyaVarY);
                vvaVar.h((uva) this.g);
            } else {
                vvaVar = null;
            }
        }
        return vvaVar;
    }
}
