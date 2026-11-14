package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.opera.android.custom_views.CircleImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class pxk extends q73 {
    public final byk c;
    public final u7k d;

    public pxk(mej mejVar, byk bykVar, u7k u7kVar) {
        super(mejVar);
        this.c = bykVar;
        this.d = u7kVar;
    }

    @Override // defpackage.q73
    public final View d(FrameLayout frameLayout) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(frameLayout.getContext()).inflate(2131559328, (ViewGroup) frameLayout, false);
        frameLayout.addView(constraintLayoutInflate);
        int i = 2131364628;
        CircleImageView circleImageView = (CircleImageView) w1h.j(2131364628, constraintLayoutInflate);
        if (circleImageView != null) {
            i = 2131364629;
            yq1 yq1Var = (StylingTextView) w1h.j(2131364629, constraintLayoutInflate);
            if (yq1Var != null) {
                i = 2131364630;
                yq1 yq1Var2 = (StylingTextView) w1h.j(2131364630, constraintLayoutInflate);
                if (yq1Var2 != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    byk bykVar = this.c;
                    CharSequence charSequence = bykVar.b;
                    CharSequence charSequence2 = bykVar.a;
                    if (charSequence == null || charSequence2 == null) {
                        constraintLayout.setVisibility(8);
                        return constraintLayout;
                    }
                    yq1Var2.setText(charSequence);
                    yq1Var.setText(charSequence2);
                    circleImageView.setImageDrawable(bykVar.c);
                    return constraintLayout;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.q73
    public final void e(qb7 qb7Var) {
        final byte b = 0;
        qb7Var.k(2131231742, 2132021744, new View.OnClickListener(this) { // from class: oxk
            public final /* synthetic */ pxk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                ijm ijmVar = ijm.b;
                byte b3 = 0;
                pxk pxkVar = this.b;
                switch (b2) {
                    case 0:
                        kxk kxkVar = ((dyk) pxkVar.d.a).j;
                        db dbVar = (db) kxkVar.a.get();
                        ((dpf) ((xb) kxkVar.b.b.get()).e.g()).a(new z8b(kxkVar.e, dbVar));
                        break;
                    case 1:
                        kxk kxkVar2 = ((dyk) pxkVar.d.a).j;
                        db dbVar2 = (db) kxkVar2.a.get();
                        bf9 bf9Var = (bf9) kxkVar2.c.get();
                        z77 z77Var = ((qim) kxkVar2.g.get()).c;
                        hy4 hy4Var = new hy4(dbVar2, bf9Var, new jxk(kxkVar2, b3));
                        z77Var.getClass();
                        z77Var.b(hy4Var, ijmVar);
                        break;
                    default:
                        kxk kxkVar3 = ((dyk) pxkVar.d.a).j;
                        byte b4 = 1;
                        if (!((db) kxkVar3.a.get()).d()) {
                            w wVar = kxkVar3.f;
                            a aVarF = u35.f(wVar, wVar);
                            aVarF.e(0, new c27(), "sync-auth-del", 1);
                            aVarF.h();
                            break;
                        } else {
                            rxh rxhVar = new rxh(2132021738);
                            jxk jxkVar = new jxk(kxkVar3, b4);
                            z77 z77Var2 = ((qim) kxkVar3.g.get()).c;
                            gkj gkjVar = new gkj(false, false);
                            gkjVar.a = null;
                            gkjVar.b = null;
                            gkjVar.c = null;
                            gkjVar.d = null;
                            gkjVar.e = null;
                            gkjVar.f = null;
                            gkjVar.g = null;
                            gkjVar.h = jxkVar;
                            gkjVar.i = null;
                            gkjVar.j = null;
                            gkjVar.k = 2132018535;
                            gkjVar.l = 2132018111;
                            gkjVar.m = 2132021739;
                            gkjVar.n = true;
                            gkjVar.o = rxhVar;
                            z77Var2.getClass();
                            z77Var2.b(gkjVar, ijmVar);
                            break;
                        }
                }
            }
        });
        final byte b2 = 1;
        qb7Var.k(2131232196, 2132021757, new View.OnClickListener(this) { // from class: oxk
            public final /* synthetic */ pxk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                ijm ijmVar = ijm.b;
                byte b3 = 0;
                pxk pxkVar = this.b;
                switch (b22) {
                    case 0:
                        kxk kxkVar = ((dyk) pxkVar.d.a).j;
                        db dbVar = (db) kxkVar.a.get();
                        ((dpf) ((xb) kxkVar.b.b.get()).e.g()).a(new z8b(kxkVar.e, dbVar));
                        break;
                    case 1:
                        kxk kxkVar2 = ((dyk) pxkVar.d.a).j;
                        db dbVar2 = (db) kxkVar2.a.get();
                        bf9 bf9Var = (bf9) kxkVar2.c.get();
                        z77 z77Var = ((qim) kxkVar2.g.get()).c;
                        hy4 hy4Var = new hy4(dbVar2, bf9Var, new jxk(kxkVar2, b3));
                        z77Var.getClass();
                        z77Var.b(hy4Var, ijmVar);
                        break;
                    default:
                        kxk kxkVar3 = ((dyk) pxkVar.d.a).j;
                        byte b4 = 1;
                        if (!((db) kxkVar3.a.get()).d()) {
                            w wVar = kxkVar3.f;
                            a aVarF = u35.f(wVar, wVar);
                            aVarF.e(0, new c27(), "sync-auth-del", 1);
                            aVarF.h();
                            break;
                        } else {
                            rxh rxhVar = new rxh(2132021738);
                            jxk jxkVar = new jxk(kxkVar3, b4);
                            z77 z77Var2 = ((qim) kxkVar3.g.get()).c;
                            gkj gkjVar = new gkj(false, false);
                            gkjVar.a = null;
                            gkjVar.b = null;
                            gkjVar.c = null;
                            gkjVar.d = null;
                            gkjVar.e = null;
                            gkjVar.f = null;
                            gkjVar.g = null;
                            gkjVar.h = jxkVar;
                            gkjVar.i = null;
                            gkjVar.j = null;
                            gkjVar.k = 2132018535;
                            gkjVar.l = 2132018111;
                            gkjVar.m = 2132021739;
                            gkjVar.n = true;
                            gkjVar.o = rxhVar;
                            z77Var2.getClass();
                            z77Var2.b(gkjVar, ijmVar);
                            break;
                        }
                }
            }
        });
        final byte b3 = 2;
        qb7Var.k(2131232064, 2132021741, new View.OnClickListener(this) { // from class: oxk
            public final /* synthetic */ pxk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b3;
                ijm ijmVar = ijm.b;
                byte b32 = 0;
                pxk pxkVar = this.b;
                switch (b22) {
                    case 0:
                        kxk kxkVar = ((dyk) pxkVar.d.a).j;
                        db dbVar = (db) kxkVar.a.get();
                        ((dpf) ((xb) kxkVar.b.b.get()).e.g()).a(new z8b(kxkVar.e, dbVar));
                        break;
                    case 1:
                        kxk kxkVar2 = ((dyk) pxkVar.d.a).j;
                        db dbVar2 = (db) kxkVar2.a.get();
                        bf9 bf9Var = (bf9) kxkVar2.c.get();
                        z77 z77Var = ((qim) kxkVar2.g.get()).c;
                        hy4 hy4Var = new hy4(dbVar2, bf9Var, new jxk(kxkVar2, b32));
                        z77Var.getClass();
                        z77Var.b(hy4Var, ijmVar);
                        break;
                    default:
                        kxk kxkVar3 = ((dyk) pxkVar.d.a).j;
                        byte b4 = 1;
                        if (!((db) kxkVar3.a.get()).d()) {
                            w wVar = kxkVar3.f;
                            a aVarF = u35.f(wVar, wVar);
                            aVarF.e(0, new c27(), "sync-auth-del", 1);
                            aVarF.h();
                            break;
                        } else {
                            rxh rxhVar = new rxh(2132021738);
                            jxk jxkVar = new jxk(kxkVar3, b4);
                            z77 z77Var2 = ((qim) kxkVar3.g.get()).c;
                            gkj gkjVar = new gkj(false, false);
                            gkjVar.a = null;
                            gkjVar.b = null;
                            gkjVar.c = null;
                            gkjVar.d = null;
                            gkjVar.e = null;
                            gkjVar.f = null;
                            gkjVar.g = null;
                            gkjVar.h = jxkVar;
                            gkjVar.i = null;
                            gkjVar.j = null;
                            gkjVar.k = 2132018535;
                            gkjVar.l = 2132018111;
                            gkjVar.m = 2132021739;
                            gkjVar.n = true;
                            gkjVar.o = rxhVar;
                            z77Var2.getClass();
                            z77Var2.b(gkjVar, ijmVar);
                            break;
                        }
                }
            }
        });
    }
}
