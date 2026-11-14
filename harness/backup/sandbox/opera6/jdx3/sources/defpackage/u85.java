package defpackage;

import android.content.Context;
import android.content.IntentSender;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class u85 implements f21 {
    public boolean a;
    public int b;
    public final int c;
    public final Context d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;

    public u85(Context context, View view) {
        this.b = -1;
        j39 j39Var = new j39(context, 2132084390);
        this.d = j39Var;
        this.e = view;
        view.setId(2131362641);
        view.setTag(this);
        ho3 ho3Var = new ho3(this, (byte) 1);
        this.f = ho3Var;
        view.addOnLayoutChangeListener(ho3Var);
        c21 c21Var = new c21(this, (byte) 1);
        ListView listView = new ListView(j39Var);
        this.j = listView;
        q8n q8nVar = new q8n(view);
        vz5 vz5Var = q8nVar.p;
        if (true != vz5Var.c) {
            vz5Var.c = true;
            vz5Var.d(true);
        }
        TypedValue typedValue = new TypedValue();
        j39Var.getTheme().resolveAttribute(2130970556, typedValue, true);
        Drawable drawableF = sgb.F(typedValue.resourceId, j39Var);
        this.k = drawableF;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(na2.u(2130970555, listView.getContext()));
        listView.setBackground(gradientDrawable);
        listView.setClipToOutline(true);
        Rect rect = new Rect();
        drawableF.getPadding(rect);
        Rect rect2 = new Rect(0, rect.bottom, 0, rect.top);
        Rect rect3 = (Rect) vz5Var.h;
        if (!rect3.equals(rect2)) {
            rect3.set(rect2);
            vz5Var.d(true);
        }
        this.c = rect.right + rect.left;
        e21 e21Var = new e21(j39Var, view, drawableF, new mv1(this, (byte) 4), q8nVar);
        e21Var.f = c21Var;
        e21Var.g = this;
        e21Var.j = j39Var.getResources().getDimensionPixelSize(2131165624);
        e21Var.h = true;
        e21Var.i = true;
        e21Var.k = true;
        e21Var.l = true;
        this.h = new i21(e21Var);
    }

    public u85(Context context, pde pdeVar, p6l p6lVar, t8k t8kVar, lg lgVar, fd fdVar, hv3 hv3Var, tsd tsdVar, tsd tsdVar2, int i, int i2) {
        this.d = context;
        this.e = p6lVar;
        this.f = t8kVar;
        this.g = lgVar;
        this.h = fdVar;
        this.i = hv3Var;
        this.j = tsdVar;
        this.b = i;
        this.c = i2;
        this.k = new pde(a());
        final byte b = 0;
        a26.U(lgVar, pdeVar, new r85(this, (byte) 0), new Function0(this) { // from class: s85
            public final /* synthetic */ u85 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                u85 u85Var = this.b;
                switch (b2) {
                    case 0:
                        u85Var.g();
                        break;
                    default:
                        u85Var.g();
                        break;
                }
                return Unit.a;
            }
        });
        final byte b2 = 1;
        a26.U(fdVar, pdeVar, new yc(this, (byte) 3), new Function0(this) { // from class: s85
            public final /* synthetic */ u85 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                u85 u85Var = this.b;
                switch (b22) {
                    case 0:
                        u85Var.g();
                        break;
                    default:
                        u85Var.g();
                        break;
                }
                return Unit.a;
            }
        });
        a26.T(tsdVar2, pdeVar, new f7f(this) { // from class: t85
            public final /* synthetic */ u85 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b;
                u85 u85Var = this.b;
                switch (b3) {
                    case 0:
                        u85Var.g();
                        break;
                    default:
                        ((Boolean) obj).getClass();
                        u85Var.g();
                        break;
                }
            }
        });
        a26.T(tsdVar, pdeVar, new f7f(this) { // from class: t85
            public final /* synthetic */ u85 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b2;
                u85 u85Var = this.b;
                switch (b3) {
                    case 0:
                        u85Var.g();
                        break;
                    default:
                        ((Boolean) obj).getClass();
                        u85Var.g();
                        break;
                }
            }
        });
    }

    public u85(Context context, r0k r0kVar, int i, gdb gdbVar, ndc ndcVar, int i2, Runnable runnable, Callback callback) {
        a9e a9eVar = new a9e(this);
        this.f = a9eVar;
        ob obVar = new ob((Object) this, (byte) 8);
        this.g = obVar;
        this.d = context.getApplicationContext();
        this.e = r0kVar;
        this.b = i;
        this.c = i2;
        this.j = gdbVar;
        this.k = ndcVar;
        this.h = runnable;
        this.i = callback;
        if (ndcVar != null) {
            ndcVar.getLifecycle().a(obVar);
        }
        r0kVar.e(a9eVar);
    }

    public static u85 d(Context context, r0k r0kVar, int i, gdb gdbVar, ndc ndcVar, int i2, Runnable runnable, Callback callback) {
        if (i == 0) {
            runnable.run();
            return null;
        }
        u85 u85Var = new u85(context, r0kVar, i, gdbVar, ndcVar, i2, runnable, callback);
        r0kVar.g(i).addOnSuccessListener(new kqd((Object) u85Var, (byte) 3));
        return u85Var;
    }

    public final q85 a() {
        boolean z = this.a;
        eri eriVarB = ((lg) this.g).b();
        pc pcVar = pc.y;
        fd fdVar = (fd) this.h;
        jf jfVarE = fdVar.e(pcVar);
        zm8 zm8Var = null;
        o24 o24Var = jfVarE != null ? new o24(pcVar, jfVarE) : null;
        pc pcVar2 = pc.v;
        jf jfVarE2 = fdVar.e(pcVar2);
        o24 o24Var2 = jfVarE2 != null ? new o24(pcVar2, jfVarE2) : null;
        if (((Boolean) ((tsd) this.j).g()).booleanValue()) {
            Context context = this.d;
            int iOrdinal = ddh.s(r9n.i(context).height(), context).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    h9o.p();
                    return null;
                }
                int iOrdinal2 = ((t8k) this.f).d.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        h9o.p();
                        return null;
                    }
                    if (((p6l) this.e) == p6l.a) {
                        pc pcVar3 = pc.z;
                        if (fdVar.b(pcVar3) || fdVar.b(pc.m)) {
                            pc pcVar4 = pc.A;
                            if (fdVar.b(pcVar4)) {
                                zm8Var = new zm8(fdVar.b(pcVar3) ? e(pcVar3) : e(pc.m), e(pcVar4));
                            }
                        }
                    }
                }
            }
        }
        return new q85(z, eriVarB, o24Var, o24Var2, zm8Var);
    }

    public final void b(Rect rect, boolean z) {
        ((Drawable) this.k).setBounds(rect);
    }

    public final void c() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.j = null;
        ndc ndcVar = (ndc) this.k;
        if (ndcVar != null) {
            ndcVar.getLifecycle().b((ob) this.g);
            this.k = null;
        }
        ((r0k) this.e).f((a9e) this.f);
    }

    public final o24 e(pc pcVar) {
        jf jfVarE = ((fd) this.h).e(pcVar);
        if (jfVarE == null) {
            jf jfVar = fd.e;
            jfVarE = fd.e;
        }
        return new o24(pcVar, jfVarE);
    }

    public final void f() {
        View view = (View) this.e;
        ListView listView = (ListView) this.j;
        i21 i21Var = (i21) this.h;
        boolean zIsShowing = i21Var.h.isShowing();
        i21Var.s = false;
        i21Var.t = true;
        int i = ((j39) this.d).getResources().getDisplayMetrics().widthPixels;
        int i2 = ojm.a((ArrayAdapter) this.i, (ListView) null)[0];
        int i3 = this.c;
        int i4 = i2 + i3;
        if (i < i4) {
            i21Var.o = Math.max(i - i3, i21Var.b());
        } else if (view.getWidth() < i2) {
            i21Var.o = Math.max(i4, i21Var.b());
        } else {
            i21Var.o = Math.max(view.getWidth() + i3, i21Var.b());
        }
        i21Var.d();
        listView.setDividerHeight(0);
        listView.setLayoutDirection(this.a ? 1 : 0);
        if (!zIsShowing) {
            listView.setContentDescription((String) this.g);
            listView.sendAccessibilityEvent(32);
        }
        int i5 = this.b;
        if (i5 >= 0) {
            listView.setSelection(i5);
            this.b = -1;
        }
    }

    public final void g() {
        xf8.F0((pde) this.k, a());
    }

    public final void h(qop qopVar) {
        Runnable runnable = (Runnable) this.h;
        Callback callback = (Callback) this.i;
        r0k r0kVar = (r0k) this.e;
        int i = this.b;
        if (this.a || qopVar.a != i) {
            return;
        }
        int i2 = qopVar.b;
        Context context = this.d;
        if (i2 == 3) {
            c();
            String[] strArr = OperaApplication.K;
            b8h.n((OperaApplication) context.getApplicationContext());
            runnable.run();
            return;
        }
        if (i2 == 5) {
            c();
            String[] strArr2 = OperaApplication.K;
            b8h.n((OperaApplication) context.getApplicationContext());
            runnable.run();
            return;
        }
        if (i2 == 6) {
            String str = "failed: " + qopVar.c;
            c();
            callback.run(str);
            return;
        }
        if (i2 == 7) {
            c();
            callback.run("canceled");
        } else if (i2 == 8) {
            try {
                gdb gdbVar = (gdb) this.j;
                if (gdbVar != null) {
                    if (r0kVar.d(qopVar, gdbVar, this.c)) {
                        return;
                    }
                }
            } catch (IntentSender.SendIntentException unused) {
            }
            if (this.a) {
                return;
            }
            r0kVar.b(i);
        }
    }
}
