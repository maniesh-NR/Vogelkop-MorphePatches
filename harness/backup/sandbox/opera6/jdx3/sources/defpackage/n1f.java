package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.opera.android.feed.SoftwareClipMaskableFrameLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* loaded from: classes.dex */
public abstract class n1f {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public n1f(byte b) {
        switch (b) {
            case 2:
                this.a = false;
                this.c = new RectF();
                this.d = new Path();
                break;
            default:
                this.a = false;
                break;
        }
    }

    public n1f(FrameLayout frameLayout, ywg ywgVar) {
        this.a = false;
        this.c = frameLayout;
        this.d = ywgVar;
    }

    public n1f(jg8 jg8Var, jg8 jg8Var2) {
        r16 r16Var = ngh.a;
        a64 a64VarB = sgb.b(e.a(jg8Var, zch.a()));
        rx5 rx5Var = rx5.b;
        this.b = na2.A(a64VarB, jg8Var2, rx5Var, new p71((byte) 25, (mt5) null, (Object) this));
        this.c = xf8.h(-1, (h04) null, new r4k((byte) 28), 2);
        this.d = na2.B(a64VarB, (CoroutineContext) null, rx5Var, new rf4((byte) 18, (mt5) null, this), 1);
    }

    public abstract void a(s9i s9iVar);

    public String b() {
        return null;
    }

    public abstract View c();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.Throwable r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ouk
            if (r0 == 0) goto L13
            r0 = r6
            ouk r0 = (defpackage.ouk) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ouk r0 = new ouk
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r1 = r0.w
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Throwable r5 = r0.t
            ybh.y(r6)     // Catch: java.lang.Throwable -> L41
            goto L3c
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L30:
            ybh.y(r6)
            r0.t = r5     // Catch: java.lang.Throwable -> L41
            r0.w = r2     // Catch: java.lang.Throwable -> L41
            r4.i()     // Catch: java.lang.Throwable -> L41
            muk r6 = defpackage.muk.a     // Catch: java.lang.Throwable -> L41
        L3c:
            muk r4 = defpackage.muk.a     // Catch: java.lang.Throwable -> L41
            if (r6 != r4) goto L41
            r2 = 0
        L41:
            java.lang.Object r4 = defpackage.y55.h
            monitor-enter(r4)
            vk2 r6 = defpackage.y55.i     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)
            if (r6 == 0) goto L4c
            r6.run(r5)
        L4c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L51:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1f.d(java.lang.Throwable, nt5):java.lang.Object");
    }

    public void e(SoftwareClipMaskableFrameLayout softwareClipMaskableFrameLayout) {
        softwareClipMaskableFrameLayout.setClipToOutline(!this.a);
        if (this.a) {
            softwareClipMaskableFrameLayout.invalidate();
        } else {
            softwareClipMaskableFrameLayout.invalidateOutline();
        }
    }

    public abstract Object f(mt5 mt5Var);

    public void g() {
    }

    public void h() {
    }

    public void i() {
        muk mukVar = muk.a;
    }

    public abstract void j(buk bukVar, a32 a32Var);

    public final void k() {
        FrameLayout frameLayout = (FrameLayout) this.c;
        View viewC = c();
        if (viewC == null || !this.a) {
            return;
        }
        ywg ywgVar = (ywg) this.d;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        ywgVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            return;
        }
        if (ywgVar.d()) {
            if (viewC instanceof TextureView) {
                TextureView textureView = (TextureView) viewC;
                jpo.n((String) null, ywgVar.d());
                RectF rectF = new RectF(0.0f, 0.0f, ywgVar.a.getWidth(), ywgVar.a.getHeight());
                textureView.setTransform(d2m.a(rectF, rectF, !ywgVar.g ? ywgVar.c : -kfo.f0(ywgVar.e), false));
            } else {
                Display display = viewC.getDisplay();
                if (ywgVar.g && display != null) {
                    display.getRotation();
                }
                boolean z = ywgVar.g;
                if (!z && z) {
                    kfo.f0(ywgVar.e);
                }
            }
            jpo.n((String) null, ywgVar.d());
            Matrix matrixC = ywgVar.c(layoutDirection, size);
            RectF rectF2 = new RectF(0.0f, 0.0f, ywgVar.a.getWidth(), ywgVar.a.getHeight());
            matrixC.mapRect(rectF2);
            viewC.setPivotX(0.0f);
            viewC.setPivotY(0.0f);
            viewC.setScaleX(rectF2.width() / ywgVar.a.getWidth());
            viewC.setScaleY(rectF2.height() / ywgVar.a.getHeight());
            viewC.setTranslationX(rectF2.left - viewC.getLeft());
            viewC.setTranslationY(rectF2.top - viewC.getTop());
        }
    }

    public final void l(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        nuk nukVar = new nuk(this);
        Method method = ngh.b;
        if (method != null) {
            try {
                method.invoke(null, nukVar);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        } else {
            ngh.d.add(nukVar);
        }
        ((p04) this.c).b(new Pair(obj, nukVar));
    }

    public boolean m() {
        return this.a;
    }

    public abstract void n(Object obj);

    public final void o() {
        saj sajVar;
        RectF rectF = (RectF) this.c;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (sajVar = (saj) this.b) == null) {
            return;
        }
        taj.a.c(sajVar, (float[]) null, 1.0f, rectF, (ga6) null, (Path) this.d);
    }

    public ListenableFuture p() {
        return q0b.c;
    }
}
