package defpackage;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.custom_views.StylingImageView;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class at5 extends q73 {
    public final ChromiumContent c;
    public final qs5 d;
    public final k73 e;
    public final d5o f;
    public final b2l g;
    public final byte h;
    public final Callback i;
    public final x5f j;
    public final ru9 k;
    public boolean l;

    /* JADX WARN: Multi-variable type inference failed */
    public at5(mej mejVar, ChromiumContent chromiumContent, qs5 qs5Var, k73 k73Var, b2l b2lVar, int i, Callback callback, x5f x5fVar, ru9 ru9Var) {
        super(mejVar);
        this.c = chromiumContent;
        this.d = qs5Var;
        this.e = k73Var;
        this.f = new d5o(this.b.getContext(), (gjm) q9n.p(this.b.getContext()).s().b().get(), k73Var);
        this.g = b2lVar;
        this.h = i;
        this.i = callback;
        this.j = x5fVar;
        this.k = ru9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(StylingImageView stylingImageView) {
        Drawable drawableF = sgb.F(2131231296, stylingImageView.getContext());
        j14.n0(drawableF, f03.t(2130969315, stylingImageView.getContext(), 2131101243));
        stylingImageView.setBackground(drawableF);
        stylingImageView.c(f03.W(2130969279, stylingImageView.getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015c  */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView, java.lang.Object] */
    @Override // defpackage.q73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View d(android.widget.FrameLayout r21) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at5.d(android.widget.FrameLayout):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if ((r5 == null ? false : r5.startsWith("sms:")) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    @Override // defpackage.q73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.qb7 r15) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at5.e(qb7):void");
    }

    public final void f(qb7 qb7Var) {
        qs5 qs5Var = this.d;
        String str = qs5Var.b;
        String str2 = qs5Var.c;
        String[] strArr = aik.a;
        if (str2 == null) {
            str2 = "";
        }
        i4d i4dVar = new i4d(new e5f(str, str2, (byte) 10));
        final ImageView imageView = (ImageView) qb7Var.m(2132018442, new nf(this, i4dVar, (byte) 27)).findViewById(2131364416);
        final byte b = 0;
        rmh.a(imageView).b(i4dVar, this.g, new Callback(this) { // from class: xs5
            public final /* synthetic */ at5 b;

            {
                this.b = this;
            }

            @Override // com.opera.api.Callback
            public final void run(Object obj) {
                byte b2 = b;
                ImageView imageView2 = imageView;
                final at5 at5Var = this.b;
                final byte b3 = 0;
                final wcj wcjVar = (wcj) obj;
                switch (b2) {
                    case 0:
                        Context context = imageView2.getContext();
                        CharSequence charSequenceD = wcjVar.d(context);
                        imageView2.setContentDescription(charSequenceD);
                        n1h.o(imageView2, charSequenceD, 0);
                        imageView2.setImageDrawable(wcjVar.b(context));
                        imageView2.setVisibility(0);
                        final byte b4 = 1;
                        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ss5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b5 = b4;
                                wcj wcjVar2 = wcjVar;
                                at5 at5Var2 = at5Var;
                                switch (b5) {
                                    case 0:
                                        at5Var2.b();
                                        d5o d5oVar = at5Var2.f;
                                        ((k73) d5oVar.c).t(new ge5(d5oVar, new ge5(wcjVar2, view, (byte) 4), (byte) 1));
                                        break;
                                    default:
                                        at5Var2.b();
                                        wcjVar2.a(view.getContext());
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        Context context2 = imageView2.getContext();
                        CharSequence charSequenceD2 = wcjVar.d(context2);
                        imageView2.setContentDescription(charSequenceD2);
                        n1h.o(imageView2, charSequenceD2, 0);
                        imageView2.setImageDrawable(wcjVar.b(context2));
                        imageView2.setVisibility(0);
                        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ss5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b5 = b3;
                                wcj wcjVar2 = wcjVar;
                                at5 at5Var2 = at5Var;
                                switch (b5) {
                                    case 0:
                                        at5Var2.b();
                                        d5o d5oVar = at5Var2.f;
                                        ((k73) d5oVar.c).t(new ge5(d5oVar, new ge5(wcjVar2, view, (byte) 4), (byte) 1));
                                        break;
                                    default:
                                        at5Var2.b();
                                        wcjVar2.a(view.getContext());
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
    }

    public final void h(qb7 qb7Var) {
        final g1j g1jVar = (g1j) this.e.d;
        if (g1jVar.isEnabled()) {
            qs5 qs5Var = this.d;
            if (qs5Var.t) {
                final byte b = 0;
                qb7Var.k(2131232088, 2132021043, new View.OnClickListener(this) { // from class: ws5
                    public final /* synthetic */ at5 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b2 = b;
                        g1j g1jVar2 = g1jVar;
                        at5 at5Var = this.b;
                        switch (b2) {
                            case 0:
                                String str = at5Var.d.e;
                                String str2 = (String) N.MSVMeBmV(str);
                                if (!str.startsWith("blob:")) {
                                    g1jVar2.n(str, str2);
                                    break;
                                } else {
                                    at5Var.e.v(2048, ks5.PNG, new ge5(g1jVar2, str2, (byte) 6));
                                    break;
                                }
                            default:
                                qs5 qs5Var2 = at5Var.d;
                                g1jVar2.n(qs5Var2.b, qs5Var2.c);
                                break;
                        }
                    }
                });
            } else if (qs5Var.s) {
                final byte b2 = 1;
                qb7Var.k(2131232088, 2132021043, new View.OnClickListener(this) { // from class: ws5
                    public final /* synthetic */ at5 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b22 = b2;
                        g1j g1jVar2 = g1jVar;
                        at5 at5Var = this.b;
                        switch (b22) {
                            case 0:
                                String str = at5Var.d.e;
                                String str2 = (String) N.MSVMeBmV(str);
                                if (!str.startsWith("blob:")) {
                                    g1jVar2.n(str, str2);
                                    break;
                                } else {
                                    at5Var.e.v(2048, ks5.PNG, new ge5(g1jVar2, str2, (byte) 6));
                                    break;
                                }
                            default:
                                qs5 qs5Var2 = at5Var.d;
                                g1jVar2.n(qs5Var2.b, qs5Var2.c);
                                break;
                        }
                    }
                });
            }
        }
    }

    public final boolean j(int i) {
        return (this.h & i) != 0;
    }

    public final void k(qb7 qb7Var, boolean z) {
        q73 q73Var = (q73) qb7Var.c;
        qs5 qs5Var = this.d;
        boolean z2 = qs5Var.t;
        String str = qs5Var.e;
        if (z2) {
            if (z) {
                LayoutInflater layoutInflater = (LayoutInflater) qb7Var.b;
                LinearLayout linearLayout = (LinearLayout) qb7Var.a;
                linearLayout.addView(layoutInflater.inflate(2131558670, (ViewGroup) linearLayout, false));
            }
            boolean zJ = j(4);
            mej mejVar = this.b;
            if (zJ && wqm.t(str)) {
                Context context = mejVar.getContext();
                String[] strArr = OperaApplication.K;
                final eri eriVarB = ((OperaApplication) context.getApplicationContext()).I().b();
                if (eriVarB.c()) {
                    q6e q6eVar = eti.a;
                    final boolean z3 = eriVarB instanceof f1a;
                    final boolean z4 = this.k.a.getBoolean("browser.context_menu.used_google_lens", false);
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ys5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            at5 at5Var = this.a;
                            at5Var.j.S(29);
                            if (z3 && !z4) {
                                nv6 nv6VarB = at5Var.k.b();
                                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("browser.context_menu.used_google_lens", true);
                                nv6VarB.w();
                            }
                            k73 k73Var = at5Var.e;
                            eri eriVar = eriVarB;
                            k73Var.v(eriVar.m(), ks5.JPEG, new ge5(at5Var, eriVar, (byte) 7));
                        }
                    };
                    if (z3) {
                        mej mejVar2 = q73Var.b;
                        qb7Var.j(sgb.F(2131231702, mejVar2.getContext()), false, mejVar2.getContext().getResources().getString(2132018437), onClickListener, 2131559325, !z4);
                    } else {
                        View viewJ = qb7Var.j(eti.d(eriVarB, mejVar.getContext(), fan.a(24.0f, mejVar.getContext().getResources())), false, q73Var.b.getContext().getResources().getString(2132018436), onClickListener, 2131559325, false);
                        e73 e73Var = new e73(this, eriVarB, (byte) 3);
                        l5b l5bVar = q9n.c;
                        dll dllVarV = hjf.v(viewJ.getContext());
                        if (dllVarV != null) {
                            u8n.b(dllVarV, viewJ, e73Var);
                        }
                    }
                }
            }
            boolean zJ2 = j(16);
            k73 k73Var = this.e;
            if (zJ2 && wqm.t(str) && ((jv0) k73Var.e).v()) {
                qb7Var.k(2131231724, 2132017628, new us5(this, (byte) 9));
            }
            if (qs5Var.s) {
                qb7Var.k(2131232117, 2132018425, new us5(this, (byte) 3));
            } else {
                ChromiumContent chromiumContent = this.c;
                boolean z5 = chromiumContent.t;
                String[] strArr2 = wqm.a;
                boolean zMnqPXHwj = N.MnqPXHwj(str);
                if (j(1) && zMnqPXHwj) {
                    qb7Var.k(chromiumContent.t ? 2131231300 : 2131231967, 2132018426, new us5(this, (byte) 4));
                }
            }
            if (wqm.t(str)) {
                qb7Var.k(2131232067, 2132018435, new us5(this, (byte) 10));
            }
            k73Var.u(new ge5(this, (ImageView) qb7Var.m(2132018441, new us5(this, (byte) 7)).findViewById(2131364416), (byte) 5));
            h(qb7Var);
            qb7Var.k(2131232051, 2132018418, new us5(this, (byte) 5));
            DisplayMetrics displayMetrics = mejVar.getContext().getResources().getDisplayMetrics();
            if (qs5Var.o <= displayMetrics.widthPixels / 2 || qs5Var.p <= displayMetrics.heightPixels / 2) {
                return;
            }
            qb7Var.k(2131232305, 2132021058, new us5(this, (byte) 8));
        }
    }

    public final void l(vx3 vx3Var, boolean z, boolean z2) {
        Context context = this.b.getContext();
        String[] strArr = OperaApplication.K;
        boolean z3 = ((OperaApplication) context.getApplicationContext()).J().C() == q7j.BACKGROUND;
        b2l b2lVar = this.g;
        if (b2lVar != null) {
            vx3Var.g = ((d7l) b2lVar).j.getId();
        }
        if (z2 || !z3) {
            vx3Var.a(true);
        } else {
            vx3Var.d = 1;
            vx3Var.d(true);
        }
        vx3Var.c(true);
        vx3Var.l = this.d.k;
        vx3Var.e(z || this.c.t);
        this.i.run(new ay3(vx3Var));
    }

    public final void m(Intent intent) {
        intent.setFlags(268435456);
        try {
            this.b.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
