package defpackage;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.Lazy;
import com.opera.android.custom_views.OperaEditText;
import com.opera.android.custom_views.StylingEditText;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageCheckableWithText;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mrn {
    public static final long A;
    public final Lazy a;
    public final View b;
    public final View c;
    public final ThemeableLottieAnimationView d;
    public final StylingImageButton e;
    public final View f;
    public final Barrier g;
    public final Barrier h;
    public final View i;
    public final OperaEditText j;
    public final View k;
    public final ConstraintLayout l;
    public final View m;
    public final RecyclerView n;
    public final crn o;
    public final krn p;
    public final View q;
    public final StylingImageCheckableWithText r;
    public final brn s;
    public final yqn t;
    public final xbf u;
    public final yw v;
    public final mj2 w;
    public Boolean x;
    public Boolean y;
    public ndc z;

    static {
        on7 on7Var = pn7.b;
        A = cs5.x0(150, un7.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.view.View, android.widget.TextView, com.opera.android.custom_views.OperaEditText, com.opera.android.custom_views.StylingEditText, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, com.opera.android.widget.ThemeableLottieAnimationView] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, com.opera.android.custom_views.StylingImageButton] */
    public mrn(Lazy lazy, rvg rvgVar, crn crnVar, krn krnVar, esk eskVar) {
        AppCompatImageView appCompatImageView = (StylingImageButton) rvgVar.o;
        AppCompatImageView appCompatImageView2 = (StylingImageButton) rvgVar.m;
        ?? r5 = (ThemeableLottieAnimationView) rvgVar.l;
        ?? r6 = (StylingImageButton) rvgVar.j;
        AppCompatImageView appCompatImageView3 = (StylingImageButton) rvgVar.f;
        Barrier barrier = rvgVar.n;
        Barrier barrier2 = (Barrier) rvgVar.g;
        LinearLayout linearLayout = (LinearLayout) rvgVar.p;
        ?? r11 = (StylingEditText) rvgVar.i;
        View view = rvgVar.c;
        View view2 = (ConstraintLayout) rvgVar.k;
        FrameLayout frameLayout = (FrameLayout) rvgVar.b;
        RecyclerView recyclerView = rvgVar.h;
        LinearLayout linearLayout2 = (LinearLayout) rvgVar.e;
        StylingImageCheckableWithText stylingImageCheckableWithText = (StylingImageCheckableWithText) rvgVar.d;
        this.a = lazy;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = r5;
        this.e = r6;
        this.f = appCompatImageView3;
        this.g = barrier;
        this.h = barrier2;
        this.i = linearLayout;
        this.j = r11;
        this.k = view;
        this.l = view2;
        this.m = frameLayout;
        this.n = recyclerView;
        this.o = crnVar;
        this.p = krnVar;
        this.q = linearLayout2;
        this.r = stylingImageCheckableWithText;
        this.s = new brn(Arrays.asList(r6, appCompatImageView2, r5, appCompatImageView));
        yqn yqnVar = new yqn(this, (byte) 0);
        this.t = yqnVar;
        this.u = new xbf((ThemeableLottieAnimationView) r5);
        yw ywVar = new yw(new z4k((Object) this, (byte) 15), eskVar);
        this.v = ywVar;
        mj2 mj2Var = new mj2(this, (byte) 13);
        this.w = mj2Var;
        appCompatImageView2.postOnAnimationDelayed(yqnVar, 500L);
        final byte b = 2;
        appCompatImageView2.setOnClickListener(new ic(new View.OnClickListener(this) { // from class: zqn
            public final /* synthetic */ mrn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b2 = b;
                mrn mrnVar = this.b;
                switch (b2) {
                    case 0:
                        mrnVar.p.f(drn.i);
                        break;
                    case 1:
                        mrnVar.p.f(drn.c);
                        new xw((byte) 13, view3, mrnVar, false).p(view3);
                        break;
                    case 2:
                        q9n.u(mrnVar.j);
                        mrnVar.p.f(drn.g);
                        break;
                    case 3:
                        mrnVar.p.f(drn.b);
                        break;
                    default:
                        mrnVar.p.f(drn.j);
                        break;
                }
            }
        }, (byte) 6));
        final byte b2 = 3;
        r5.setOnClickListener(new ic(new View.OnClickListener(this) { // from class: zqn
            public final /* synthetic */ mrn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b2;
                mrn mrnVar = this.b;
                switch (b22) {
                    case 0:
                        mrnVar.p.f(drn.i);
                        break;
                    case 1:
                        mrnVar.p.f(drn.c);
                        new xw((byte) 13, view3, mrnVar, false).p(view3);
                        break;
                    case 2:
                        q9n.u(mrnVar.j);
                        mrnVar.p.f(drn.g);
                        break;
                    case 3:
                        mrnVar.p.f(drn.b);
                        break;
                    default:
                        mrnVar.p.f(drn.j);
                        break;
                }
            }
        }, (byte) 6));
        final byte b3 = 0;
        appCompatImageView2.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: arn
            public final /* synthetic */ mrn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) {
                byte b4 = b3;
                mrn mrnVar = this.b;
                switch (b4) {
                    case 0:
                        mrnVar.p.f(drn.h);
                        new xw(view3.getContext(), (jbn) mrnVar.a.get()).p(view3);
                        return true;
                    default:
                        mrnVar.p.f(drn.k);
                        return false;
                }
            }
        });
        r11.setHorizontallyScrolling(false);
        r11.setOnFocusChangeListener(new up2(r11, this, (byte) 3));
        final byte b4 = 1;
        r11.setOnEditorActionListener(new ys7(new yqn(this, (byte) 2), (byte) 1));
        r11.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: arn
            public final /* synthetic */ mrn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) {
                byte b42 = b4;
                mrn mrnVar = this.b;
                switch (b42) {
                    case 0:
                        mrnVar.p.f(drn.h);
                        new xw(view3.getContext(), (jbn) mrnVar.a.get()).p(view3);
                        return true;
                    default:
                        mrnVar.p.f(drn.k);
                        return false;
                }
            }
        });
        r11.addTextChangedListener(mj2Var);
        r11.addOnAttachStateChangeListener(new z61(this, (byte) 28));
        new h5k((TextView) r11, view);
        krnVar.f(new jrn(r11.getEditableText().toString()));
        final byte b5 = 4;
        r6.setOnClickListener(new ic(new View.OnClickListener(this) { // from class: zqn
            public final /* synthetic */ mrn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b5;
                mrn mrnVar = this.b;
                switch (b22) {
                    case 0:
                        mrnVar.p.f(drn.i);
                        break;
                    case 1:
                        mrnVar.p.f(drn.c);
                        new xw((byte) 13, view3, mrnVar, false).p(view3);
                        break;
                    case 2:
                        q9n.u(mrnVar.j);
                        mrnVar.p.f(drn.g);
                        break;
                    case 3:
                        mrnVar.p.f(drn.b);
                        break;
                    default:
                        mrnVar.p.f(drn.j);
                        break;
                }
            }
        }, (byte) 6));
        final byte b6 = 0;
        appCompatImageView.setOnClickListener(new ic(new View.OnClickListener(this) { // from class: zqn
            public final /* synthetic */ mrn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b6;
                mrn mrnVar = this.b;
                switch (b22) {
                    case 0:
                        mrnVar.p.f(drn.i);
                        break;
                    case 1:
                        mrnVar.p.f(drn.c);
                        new xw((byte) 13, view3, mrnVar, false).p(view3);
                        break;
                    case 2:
                        q9n.u(mrnVar.j);
                        mrnVar.p.f(drn.g);
                        break;
                    case 3:
                        mrnVar.p.f(drn.b);
                        break;
                    default:
                        mrnVar.p.f(drn.j);
                        break;
                }
            }
        }, (byte) 6));
        final byte b7 = 1;
        appCompatImageView3.setOnClickListener(new View.OnClickListener(this) { // from class: zqn
            public final /* synthetic */ mrn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b22 = b7;
                mrn mrnVar = this.b;
                switch (b22) {
                    case 0:
                        mrnVar.p.f(drn.i);
                        break;
                    case 1:
                        mrnVar.p.f(drn.c);
                        new xw((byte) 13, view3, mrnVar, false).p(view3);
                        break;
                    case 2:
                        q9n.u(mrnVar.j);
                        mrnVar.p.f(drn.g);
                        break;
                    case 3:
                        mrnVar.p.f(drn.b);
                        break;
                    default:
                        mrnVar.p.f(drn.j);
                        break;
                }
            }
        });
        recyclerView.D0(new ro9((byte) 28));
        frameLayout.getContext();
        recyclerView.C0(new LinearLayoutManager(0, false));
        recyclerView.y0(ywVar);
        ou1 ou1Var = new ou1((byte) 2, 0);
        int iH = z7h.h(recyclerView.getContext(), 8.0f);
        if (iH != ou1Var.b) {
            ou1Var.b = iH;
        }
        recyclerView.m(ou1Var);
        stylingImageCheckableWithText.w = new r2n((Object) this, (byte) 18);
        oon oonVar = new oon(this, (byte) 2);
        q9n.e(view2, oonVar);
        oonVar.a(view2);
    }

    public static final void b(View view, so5 so5Var, int i, mrn mrnVar) {
        so5Var.f(view.getId(), 7, 0, 7, i);
        so5Var.f(view.getId(), 3, mrnVar.j.getId(), 4, 0);
        so5Var.f(view.getId(), 4, 0, 4, i);
    }

    public static final void c(View view, so5 so5Var, int i) {
        so5Var.f(view.getId(), 7, 0, 7, i);
        so5Var.e(view.getId(), 3, 0, 3);
        so5Var.e(view.getId(), 4, 0, 4);
    }

    public static final void d(so5 so5Var, int i) {
        so5Var.c(i, 6);
        so5Var.c(i, 7);
        so5Var.c(i, 3);
        so5Var.c(i, 4);
    }

    public static boolean f(View view) {
        return view.isEnabled() && view.isShown() && view.getLocalVisibleRect(new Rect());
    }

    public final void a(boolean z) {
        if (Intrinsics.a(this.y, Boolean.valueOf(z))) {
            return;
        }
        this.y = Boolean.valueOf(z);
        View view = this.m;
        view.animate().cancel();
        if (!z) {
            view.animate().setDuration(pn7.f(A)).setInterpolator(lf1.d).translationY(view.getHeight()).alpha(0.0f).withEndAction(new yqn(this, (byte) 1)).start();
            return;
        }
        view.setAlpha(0.0f);
        view.setVisibility(0);
        kff.a(view, new wr9(view, this, (byte) 23));
    }

    public final boolean e() {
        if (this.o.g()) {
            b59 b59Var = ((jbn) this.a.get()).d.a;
            if (!((SharedPreferences) b59Var.get()).getBoolean("hintShown", false) && ((SharedPreferences) b59Var.get()).getInt("usageCount", 0) > 0) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        bq1 bq1Var = this.j;
        if (f(bq1Var) && bq1Var.requestFocus()) {
            Selection.setSelection(bq1Var.getText(), bq1Var.length());
            l5b l5bVar = q9n.c;
            q9n.G(bq1Var.getContext(), bq1Var);
        }
    }

    public final void h(lsn lsnVar) {
        l08 l08Var;
        coh qqnVar;
        coh rqnVar;
        boolean z;
        View view = this.c;
        Runnable runnable = this.t;
        view.removeCallbacks(runnable);
        int iK = 0;
        if (!lsnVar.isVisible()) {
            a(false);
            return;
        }
        List<jx1> listG = lsnVar.g();
        if (listG.isEmpty()) {
            l08Var = l08.a;
        } else {
            l08 arrayList = new ArrayList();
            for (jx1 jx1Var : listG) {
                if (jx1Var != null) {
                    if (jx1Var instanceof sx1) {
                        qqnVar = new sqn(((sx1) jx1Var).a);
                    } else {
                        if (jx1Var instanceof rx1) {
                            rx1 rx1Var = (rx1) jx1Var;
                            String str = rx1Var.a;
                            wxe wxeVar = rx1Var.b;
                            if (wxeVar != null) {
                                if (wxeVar instanceof qx1) {
                                    qx1 qx1Var = (qx1) wxeVar;
                                    rqnVar = new rqn(str, Uri.fromFile(qx1Var.m), new tqn(qx1Var.o));
                                } else if (wxeVar instanceof tx1) {
                                    rqnVar = new rqn(str, ((tx1) wxeVar).m, uqn.a);
                                }
                                qqnVar = rqnVar;
                            }
                            h9o.p();
                            return;
                        }
                        if (jx1Var instanceof px1) {
                            qqnVar = new qqn(((px1) jx1Var).a);
                        } else if (jx1Var instanceof fz1) {
                            qqnVar = null;
                        }
                    }
                    if (qqnVar != null) {
                        arrayList.add(qqnVar);
                    }
                }
                h9o.p();
                return;
            }
            l08Var = arrayList;
        }
        yw ywVar = this.v;
        ywVar.getClass();
        eme emeVar = new eme(ywVar);
        ArrayList arrayList2 = (ArrayList) ywVar.d;
        j87 j87VarK = uup.k(new ik(arrayList2, l08Var, (byte) 1), false);
        arrayList2.clear();
        arrayList2.addAll((Collection) l08Var);
        j87VarK.a(emeVar);
        this.n.setVisibility(lsnVar.d() ? 0 : 8);
        Boolean boolF = lsnVar.f();
        if (boolF != null) {
            this.r.u(boolF.booleanValue());
        }
        this.i.setEnabled(lsnVar.isEnabled());
        boolean zIsEnabled = lsnVar.isEnabled();
        bq1 bq1Var = this.j;
        bq1Var.setEnabled(zIsEnabled);
        bq1Var.setHint(lsnVar.e().a(bq1Var.getResources()));
        pxh text = lsnVar.getText();
        if (text != null) {
            TextWatcher textWatcher = this.w;
            bq1Var.removeTextChangedListener(textWatcher);
            bq1Var.setText(text.a(bq1Var.getResources()));
            bq1Var.addTextChangedListener(textWatcher);
        }
        int iOrdinal = lsnVar.b().ordinal();
        View view2 = this.b;
        AppCompatImageView appCompatImageView = this.e;
        n2d n2dVar = this.d;
        brn brnVar = this.s;
        if (iOrdinal == 0) {
            brnVar.a(appCompatImageView);
            appCompatImageView.setEnabled(false);
        } else if (iOrdinal == 1) {
            brnVar.a(appCompatImageView);
            appCompatImageView.setEnabled(true);
        } else if (iOrdinal == 2) {
            brnVar.a(view);
            view.setEnabled(false);
        } else if (iOrdinal == 3) {
            brnVar.a(view);
            view.setEnabled(true);
            if (e()) {
                view.postOnAnimationDelayed(runnable, 500L);
            }
        } else if (iOrdinal == 4) {
            brnVar.a(n2dVar);
            if (e()) {
                n2dVar.postOnAnimationDelayed(runnable, 500L);
            }
        } else {
            if (iOrdinal != 5) {
                h9o.p();
                return;
            }
            brnVar.a(view2);
        }
        this.q.setVisibility(!lsnVar.h() ? 0 : 8);
        int i = lsnVar.a() ? 0 : 8;
        View view3 = this.f;
        view3.setVisibility(i);
        view3.setEnabled(lsnVar.c());
        boolean zH = lsnVar.h();
        if (Intrinsics.a(this.x, Boolean.valueOf(zH))) {
            z = true;
        } else {
            this.x = Boolean.valueOf(zH);
            so5 so5Var = new so5();
            ConstraintLayout constraintLayout = this.l;
            so5Var.d(constraintLayout);
            d(so5Var, view3.getId());
            d(so5Var, view.getId());
            d(so5Var, n2dVar.getId());
            d(so5Var, appCompatImageView.getId());
            d(so5Var, view2.getId());
            d(so5Var, bq1Var.getId());
            if (zH) {
                int iK2 = new ixh(4.0f).k(constraintLayout.getContext());
                so5Var.f(view3.getId(), 6, 0, 6, iK2);
                so5Var.e(view3.getId(), 3, 0, 3);
                so5Var.e(view3.getId(), 4, 0, 4);
                c(view, so5Var, iK2);
                c(n2dVar, so5Var, iK2);
                c(appCompatImageView, so5Var, iK2);
                c(view2, so5Var, iK2);
                so5Var.e(bq1Var.getId(), 6, this.g.getId(), 7);
                so5Var.e(bq1Var.getId(), 7, this.h.getId(), 6);
                so5Var.e(bq1Var.getId(), 3, 0, 3);
                so5Var.e(bq1Var.getId(), 4, 0, 4);
            } else {
                int iK3 = new ixh(12.0f).k(constraintLayout.getContext());
                so5Var.f(view3.getId(), 6, 0, 6, iK3);
                so5Var.f(view3.getId(), 3, bq1Var.getId(), 4, 0);
                so5Var.f(view3.getId(), 4, 0, 4, iK3);
                b(view, so5Var, iK3, this);
                b(n2dVar, so5Var, iK3, this);
                b(appCompatImageView, so5Var, iK3, this);
                b(view2, so5Var, iK3, this);
                so5Var.e(bq1Var.getId(), 6, 0, 6);
                so5Var.e(bq1Var.getId(), 7, 0, 7);
                so5Var.e(bq1Var.getId(), 3, 0, 3);
                iK = new ixh(20.0f).k(bq1Var.getContext());
            }
            bq1Var.setPaddingRelative(iK, bq1Var.getPaddingTop(), iK, bq1Var.getPaddingBottom());
            j();
            so5Var.a(constraintLayout);
            z = true;
        }
        a(z);
    }

    public final void i(String str) {
        this.j.setText(str);
    }

    public final void j() {
        m2n m2nVar = new m2n(this, (byte) 8);
        this.f.setBackground((Drawable) m2nVar.invoke());
        this.c.setBackground((Drawable) m2nVar.invoke());
        Drawable drawable = (Drawable) m2nVar.invoke();
        AppCompatImageView appCompatImageView = this.e;
        appCompatImageView.setBackground(drawable);
        cxh fxhVar = Intrinsics.a(this.x, Boolean.FALSE) ? new fxh(2131099716) : new dxh(2130969900);
        ConstraintLayout constraintLayout = this.l;
        appCompatImageView.setImageTintList(fxhVar.b(constraintLayout.getContext()));
        appCompatImageView.setBackgroundTintList(new fxh(2131099715).b(constraintLayout.getContext()));
    }
}
