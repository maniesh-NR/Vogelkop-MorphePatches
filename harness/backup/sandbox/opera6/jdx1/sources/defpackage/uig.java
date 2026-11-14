package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class uig extends FrameLayout {
    public static final float[] D0;
    public final ImageView A;
    public final boolean[] A0;
    public final ImageView B;
    public long B0;
    public final ImageView C;
    public boolean C0;
    public final ImageView D;
    public final View E;
    public final View F;
    public final View G;
    public final TextView H;
    public final TextView I;
    public final uw6 J;
    public final StringBuilder K;
    public final Formatter L;
    public final dql M;
    public final fql N;
    public final vdf O;
    public final Drawable P;
    public final Drawable Q;
    public final Drawable R;
    public final Drawable S;
    public final Drawable T;
    public final String U;
    public final String V;
    public final String W;
    public final zig a;
    public final Drawable a0;
    public final Resources b;
    public final Drawable b0;
    public final oig c;
    public final float c0;
    public final Class d;
    public final float d0;
    public final Method e;
    public final String e0;
    public final Method f;
    public final String f0;
    public final Class g;
    public final Drawable g0;
    public final Method h;
    public final Drawable h0;
    public final Method i;
    public final String i0;
    public final CopyOnWriteArrayList j;
    public final String j0;
    public final RecyclerView k;
    public final Drawable k0;
    public final qig l;
    public final Drawable l0;
    public final ky7 m;
    public final String m0;
    public final nig n;
    public final String n0;
    public final nig o;
    public gig o0;
    public final vw6 p;
    public boolean p0;
    public final PopupWindow q;
    public boolean q0;
    public final int r;
    public final boolean r0;
    public final ImageView s;
    public boolean s0;
    public final ImageView t;
    public int t0;
    public final ImageView u;
    public final boolean u0;
    public final View v;
    public final int v0;
    public final View w;
    public final int w0;
    public final TextView x;
    public long[] x0;
    public final TextView y;
    public boolean[] y0;
    public final ImageView z;
    public final long[] z0;

    static {
        rjd.a("media3.ui");
        D0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't wrap try/catch for region: R(54:0|2|(4:4|108|5|6)(1:11)|7|12|106|13|(3:112|14|15)|(3:114|16|17)|21|110|22|(5:116|23|24|104|25)|30|(1:32)|33|(1:35)|36|(1:38)|39|(1:41)|42|(1:44)|45|(1:47)|48|(1:50)(1:(1:53)(26:54|(1:56)|57|(1:59)|60|(1:62)|63|(1:65)|66|(1:68)(2:69|(1:71)(1:72))|73|(1:75)|76|(1:78)(2:79|(1:81)(1:82))|83|(1:85)|86|(1:88)|89|(1:91)|92|(1:94)|95|(1:97)(1:98)|99|100))|51|(0)|57|(0)|60|(0)|63|(0)|66|(0)(0)|73|(0)|76|(0)(0)|83|(0)|86|(0)|89|(0)|92|(0)|95|(0)(0)|99|100|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x024f, code lost:
    
        r5 = null;
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0606  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public uig(android.content.Context r38, android.util.AttributeSet r39) throws java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 1557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uig.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        gig gigVar = this.o0;
        if (gigVar == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (gigVar.getPlaybackState() == 4 || !gigVar.C(12)) {
                return true;
            }
            gigVar.o0();
            return true;
        }
        if (keyCode == 89 && gigVar.C(11)) {
            gigVar.p0();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            if (tym.Y(gigVar, this.r0)) {
                tym.F(gigVar);
                return true;
            }
            tym.E(gigVar);
            return true;
        }
        if (keyCode == 87) {
            if (!gigVar.C(9)) {
                return true;
            }
            gigVar.M();
            return true;
        }
        if (keyCode == 88) {
            if (!gigVar.C(7)) {
                return true;
            }
            gigVar.r();
            return true;
        }
        if (keyCode == 126) {
            tym.F(gigVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        tym.E(gigVar);
        return true;
    }

    public final void b(d dVar, View view) {
        this.k.y0(dVar);
        r();
        this.C0 = false;
        PopupWindow popupWindow = this.q;
        popupWindow.dismiss();
        this.C0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.r;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final csh c(defpackage.fzl r22, int r23) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uig.c(fzl, int):csh");
    }

    public final void d() {
        zig zigVar = this.a;
        byte b = zigVar.A;
        if (b == 3 || b == 2) {
            return;
        }
        zigVar.e();
        if (!zigVar.D) {
            zigVar.h(2);
        } else if (zigVar.A == 1) {
            zigVar.n.start();
        } else {
            zigVar.o.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean e(gig gigVar) {
        Class cls;
        return (gigVar == null || (cls = this.g) == null || !cls.isAssignableFrom(gigVar.getClass())) ? false : true;
    }

    public final boolean f(gig gigVar) {
        Class cls;
        return (gigVar == null || (cls = this.d) == null || !cls.isAssignableFrom(gigVar.getClass())) ? false : true;
    }

    public final boolean g() {
        zig zigVar = this.a;
        return zigVar.A == 0 && zigVar.a.i();
    }

    public final boolean h(gig gigVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f(gigVar)) {
                Method method = this.f;
                method.getClass();
                Object objInvoke = method.invoke(gigVar, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (e(gigVar)) {
                Method method2 = this.i;
                method2.getClass();
                Object objInvoke2 = method2.invoke(gigVar, null);
                objInvoke2.getClass();
                if (((Boolean) objInvoke2).booleanValue()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalAccessException | InvocationTargetException e) {
            rqd.p(e);
            return false;
        }
    }

    public final boolean i() {
        return getVisibility() == 0;
    }

    public final void j(gig gigVar, long j) {
        if (gigVar.C(5)) {
            gigVar.seekTo(j);
        }
        p();
    }

    public final void k() {
        n();
        m();
        q();
        s();
        u();
        o();
        t();
    }

    public final void l(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.c0 : this.d0);
    }

    public final void m() {
        boolean zC;
        boolean zC2;
        boolean zC3;
        boolean zC4;
        boolean zC5;
        if (i() && this.q0) {
            gig gigVar = this.o0;
            if (gigVar != null) {
                zC = gigVar.C(5);
                zC3 = gigVar.C(7);
                zC4 = gigVar.C(11);
                zC5 = gigVar.C(12);
                zC2 = gigVar.C(9);
            } else {
                zC = false;
                zC2 = false;
                zC3 = false;
                zC4 = false;
                zC5 = false;
            }
            Resources resources = this.b;
            View view = this.w;
            if (zC4) {
                gig gigVar2 = this.o0;
                int iS0 = (int) ((gigVar2 != null ? gigVar2.s0() : 5000L) / 1000);
                TextView textView = this.y;
                if (textView != null) {
                    textView.setText(String.valueOf(iS0));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(2131886133, iS0, Integer.valueOf(iS0)));
                }
            }
            View view2 = this.v;
            if (zC5) {
                gig gigVar3 = this.o0;
                int iA0 = (int) ((gigVar3 != null ? gigVar3.a0() : 15000L) / 1000);
                TextView textView2 = this.x;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iA0));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(2131886132, iA0, Integer.valueOf(iA0)));
                }
            }
            l(this.s, zC3);
            l(view, zC4);
            l(view2, zC5);
            l(this.t, zC2);
            uw6 uw6Var = this.J;
            if (uw6Var != null) {
                uw6Var.setEnabled(zC);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r4 = this;
            boolean r0 = r4.i()
            if (r0 == 0) goto L50
            boolean r0 = r4.q0
            if (r0 == 0) goto L50
            android.widget.ImageView r0 = r4.u
            if (r0 == 0) goto L50
            gig r1 = r4.o0
            boolean r2 = r4.r0
            boolean r1 = defpackage.tym.Y(r1, r2)
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r4.P
            r2 = 2132018926(0x7f1406ee, float:1.9676172E38)
            goto L23
        L1e:
            android.graphics.drawable.Drawable r1 = r4.Q
            r2 = 2132018925(0x7f1406ed, float:1.967617E38)
        L23:
            r0.setImageDrawable(r1)
            android.content.res.Resources r1 = r4.b
            java.lang.String r1 = r1.getString(r2)
            r0.setContentDescription(r1)
            gig r1 = r4.o0
            if (r1 == 0) goto L4c
            r2 = 1
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L4c
            r3 = 17
            boolean r3 = r1.C(r3)
            if (r3 == 0) goto L4d
            gql r1 = r1.getCurrentTimeline()
            boolean r1 = r1.p()
            if (r1 == 0) goto L4d
        L4c:
            r2 = 0
        L4d:
            r4.l(r0, r2)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uig.n():void");
    }

    public final void o() {
        ky7 ky7Var;
        gig gigVar = this.o0;
        if (gigVar == null) {
            return;
        }
        float f = gigVar.getPlaybackParameters().a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            ky7Var = this.m;
            float[] fArr = (float[]) ky7Var.d;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i2 = i;
                f2 = fAbs;
            }
            i++;
        }
        ky7Var.b = i2;
        String str = ((String[]) ky7Var.c)[i2];
        qig qigVar = this.l;
        qigVar.b[0] = str;
        l(this.E, qigVar.G(1) || qigVar.G(0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zig zigVar = this.a;
        zigVar.a.addOnLayoutChangeListener(zigVar.y);
        this.q0 = true;
        if (g()) {
            zigVar.f();
        }
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zig zigVar = this.a;
        zigVar.a.removeOnLayoutChangeListener(zigVar.y);
        this.q0 = false;
        removeCallbacks(this.O);
        zigVar.e();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uig.p():void");
    }

    public final void q() {
        ImageView imageView;
        if (i() && this.q0 && (imageView = this.z) != null) {
            if (this.w0 == 0) {
                l(imageView, false);
                return;
            }
            gig gigVar = this.o0;
            String str = this.U;
            Drawable drawable = this.R;
            if (gigVar == null || !gigVar.C(15)) {
                l(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            l(imageView, true);
            int repeatMode = gigVar.getRepeatMode();
            if (repeatMode == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (repeatMode == 1) {
                imageView.setImageDrawable(this.S);
                imageView.setContentDescription(this.V);
            } else if (repeatMode == 2) {
                imageView.setImageDrawable(this.T);
                imageView.setContentDescription(this.W);
            }
        }
    }

    public final void r() {
        RecyclerView recyclerView = this.k;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.r;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i << 1));
        PopupWindow popupWindow = this.q;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i << 1), recyclerView.getMeasuredHeight()));
    }

    public final void s() {
        ImageView imageView;
        if (i() && this.q0 && (imageView = this.A) != null) {
            gig gigVar = this.o0;
            if (!this.a.z.contains(imageView)) {
                l(imageView, false);
                return;
            }
            String str = this.f0;
            Drawable drawable = this.b0;
            if (gigVar == null || !gigVar.C(14)) {
                l(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            l(imageView, true);
            if (gigVar.getShuffleModeEnabled()) {
                drawable = this.a0;
            }
            imageView.setImageDrawable(drawable);
            if (gigVar.getShuffleModeEnabled()) {
                str = this.e0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uig.t():void");
    }

    public final void u() {
        nig nigVar = this.n;
        nigVar.getClass();
        List list = Collections.EMPTY_LIST;
        nigVar.a = list;
        nig nigVar2 = this.o;
        nigVar2.getClass();
        nigVar2.a = list;
        gig gigVar = this.o0;
        ImageView imageView = this.B;
        if (gigVar != null && gigVar.C(30) && this.o0.C(29)) {
            fzl fzlVarW = this.o0.w();
            csh cshVarC = c(fzlVarW, 1);
            nigVar2.a = cshVarC;
            uig uigVar = nigVar2.d;
            gig gigVar2 = uigVar.o0;
            qig qigVar = uigVar.l;
            gigVar2.getClass();
            nyl nylVarL = gigVar2.L();
            if (!cshVarC.isEmpty()) {
                if (nigVar2.G(nylVarL)) {
                    int i = 0;
                    while (true) {
                        if (i >= cshVarC.d) {
                            break;
                        }
                        sig sigVar = (sig) cshVarC.get(i);
                        if (sigVar.a.e[sigVar.b]) {
                            qigVar.b[1] = sigVar.c;
                            break;
                        }
                        i++;
                    }
                } else {
                    qigVar.b[1] = uigVar.getResources().getString(2132018958);
                }
            } else {
                qigVar.b[1] = uigVar.getResources().getString(2132018959);
            }
            zig zigVar = this.a;
            if (imageView == null) {
                zigVar.getClass();
            } else if (zigVar.z.contains(imageView)) {
                nigVar.H(c(fzlVarW, 3));
            }
            a1b a1bVar = h1b.b;
            nigVar.H(csh.e);
        }
        l(imageView, nigVar.getItemCount() > 0);
        qig qigVar2 = this.l;
        l(this.E, qigVar2.G(1) || qigVar2.G(0));
    }
}
