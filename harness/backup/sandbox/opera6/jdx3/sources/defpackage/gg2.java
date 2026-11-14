package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.opera.android.custom_views.StylingImageView;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.time.TimeMark;

/* loaded from: classes.dex */
public final class gg2 extends hi7 {
    public static final long F;
    public static Point G;
    public final t02 A;
    public final bqj B;
    public final wl2 C;
    public x79 D;
    public boolean E;
    public final ji v;
    public final sf2 w;
    public final rf2 x;
    public final z8b y;
    public final p12 z;

    static {
        on7 on7Var = pn7.b;
        F = cs5.x0(150, un7.d);
        G = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? new Point(Integer.MAX_VALUE, Integer.MAX_VALUE) : new Point(0, Integer.MAX_VALUE);
    }

    public gg2(zh7 zh7Var, tjg tjgVar, dll dllVar, CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, qim qimVar, orm ormVar, ji jiVar, kze kzeVar, sf2 sf2Var, igi igiVar, rf2 rf2Var, t02 t02Var) {
        super(yh7.a, zh7Var, coordinatorLayout, viewGroup, igiVar, qimVar, kzeVar, G);
        this.v = jiVar;
        this.w = sf2Var;
        this.x = rf2Var;
        ImageView imageView = sf2Var.b;
        kze kzeVar2 = (kze) new z61(imageView).b;
        z8b z8bVar = new z8b();
        z8bVar.a = ormVar;
        byte b = 13;
        kzeVar2.k(new pb(new t02(z8bVar, b), b));
        this.y = z8bVar;
        p12 p12Var = new p12();
        p12Var.a = tjgVar;
        p12Var.b = new kze(vjd.K);
        p12Var.c = new kze(0L);
        p12Var.d = new kze(0L);
        p12Var.e = new kze(zf2.c);
        final byte b2 = 0;
        p12Var.f = new kze(new bg2(false, false, false));
        p12Var.g = new kze(ag2.a);
        p12Var.h = new mig(new ci8(p12Var));
        byte b3 = 7;
        kzeVar2.k(new cl4(new tu7(p12Var, b3), (byte) 17));
        this.z = p12Var;
        this.A = t02Var;
        bqj bqjVar = new bqj(rf2Var, imageView);
        this.B = bqjVar;
        final t59 t59Var = new t59();
        t59Var.c = new w05();
        a26.U(dllVar, kzeVar2, new rw0(t59Var, b3), new d8e(t59Var, (byte) 22));
        a26.T((kze) p12Var.c, kzeVar2, new f7f() { // from class: p4h
            public final void d0(Object obj) {
                byte b4 = b2;
                t59 t59Var2 = t59Var;
                Long l = (Long) obj;
                switch (b4) {
                    case 0:
                        t59Var2.a = l.longValue();
                        t59Var2.a();
                        break;
                    default:
                        t59Var2.b = l.longValue();
                        t59Var2.a();
                        break;
                }
            }
        });
        final byte b4 = 1;
        a26.T((kze) p12Var.d, kzeVar2, new f7f() { // from class: p4h
            public final void d0(Object obj) {
                byte b42 = b4;
                t59 t59Var2 = t59Var;
                Long l = (Long) obj;
                switch (b42) {
                    case 0:
                        t59Var2.a = l.longValue();
                        t59Var2.a();
                        break;
                    default:
                        t59Var2.b = l.longValue();
                        t59Var2.a();
                        break;
                }
            }
        });
        owa owaVar = new owa(viewGroup.getContext(), kzeVar2, p12Var, dllVar);
        w04 w04Var = new w04(viewGroup.getContext(), kzeVar2, p12Var, dllVar);
        this.C = new wl2(new dg2(this, b2));
        this.E = true;
        new tl2(kzeVar2, p12Var, new dg2(this, b4));
        ((StylingImageView) rf2Var.h).setOnClickListener(new View.OnClickListener(this) { // from class: eg2
            public final /* synthetic */ gg2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b2;
                li0 li0Var = li0.f;
                gg2 gg2Var = this.b;
                switch (b5) {
                    case 0:
                        gg2Var.C.a();
                        boolean zE = ((mig) gg2Var.z.h).e();
                        gg2Var.y.M(zE ? li0.d : li0.e);
                        gg2Var.k(zE ? zlg.b : zlg.a);
                        break;
                    case 1:
                        gg2Var.C.a();
                        p12 p12Var2 = gg2Var.z;
                        on7 on7Var = pn7.b;
                        long jX0 = cs5.x0(10, un7.e);
                        mig migVar = (mig) p12Var2.h;
                        long jF = pn7.f(jX0);
                        if (jF == migVar.c().s0()) {
                            migVar.c().p0();
                        } else if (migVar.c().isCurrentWindowSeekable()) {
                            mig.f(migVar.c(), -jF);
                        }
                        gg2Var.y.M(li0.c);
                        gg2Var.k(zlg.d);
                        break;
                    case 2:
                        gg2Var.C.a();
                        p12 p12Var3 = gg2Var.z;
                        on7 on7Var2 = pn7.b;
                        long jX02 = cs5.x0(10, un7.e);
                        mig migVar2 = (mig) p12Var3.h;
                        long jF2 = pn7.f(jX02);
                        if (jF2 == migVar2.c().a0()) {
                            migVar2.c().o0();
                        } else if (migVar2.c().isCurrentWindowSeekable()) {
                            mig.f(migVar2.c(), jF2);
                        }
                        gg2Var.y.M(li0.b);
                        gg2Var.k(zlg.c);
                        break;
                    case 3:
                        gg2Var.h(new x2(gg2Var, ei7.c, (byte) 24));
                        gg2Var.y.M(li0Var);
                        gg2Var.k(zlg.e);
                        break;
                    case 4:
                        gg2Var.h(new x2(gg2Var, ei7.c, (byte) 24));
                        gg2Var.y.M(li0Var);
                        gg2Var.k(zlg.e);
                        break;
                    default:
                        qb7 qb7Var = (qb7) gg2Var.y.b;
                        if (qb7Var != null) {
                            ((ArrayList) qb7Var.a).add(d90.b);
                        }
                        if (!gg2Var.B.a()) {
                            gg2Var.i();
                            break;
                        } else {
                            gg2Var.h(new vk1((byte) 20));
                            break;
                        }
                }
            }
        });
        ((StylingImageView) rf2Var.i).setOnClickListener(new View.OnClickListener(this) { // from class: eg2
            public final /* synthetic */ gg2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b4;
                li0 li0Var = li0.f;
                gg2 gg2Var = this.b;
                switch (b5) {
                    case 0:
                        gg2Var.C.a();
                        boolean zE = ((mig) gg2Var.z.h).e();
                        gg2Var.y.M(zE ? li0.d : li0.e);
                        gg2Var.k(zE ? zlg.b : zlg.a);
                        break;
                    case 1:
                        gg2Var.C.a();
                        p12 p12Var2 = gg2Var.z;
                        on7 on7Var = pn7.b;
                        long jX0 = cs5.x0(10, un7.e);
                        mig migVar = (mig) p12Var2.h;
                        long jF = pn7.f(jX0);
                        if (jF == migVar.c().s0()) {
                            migVar.c().p0();
                        } else if (migVar.c().isCurrentWindowSeekable()) {
                            mig.f(migVar.c(), -jF);
                        }
                        gg2Var.y.M(li0.c);
                        gg2Var.k(zlg.d);
                        break;
                    case 2:
                        gg2Var.C.a();
                        p12 p12Var3 = gg2Var.z;
                        on7 on7Var2 = pn7.b;
                        long jX02 = cs5.x0(10, un7.e);
                        mig migVar2 = (mig) p12Var3.h;
                        long jF2 = pn7.f(jX02);
                        if (jF2 == migVar2.c().a0()) {
                            migVar2.c().o0();
                        } else if (migVar2.c().isCurrentWindowSeekable()) {
                            mig.f(migVar2.c(), jF2);
                        }
                        gg2Var.y.M(li0.b);
                        gg2Var.k(zlg.c);
                        break;
                    case 3:
                        gg2Var.h(new x2(gg2Var, ei7.c, (byte) 24));
                        gg2Var.y.M(li0Var);
                        gg2Var.k(zlg.e);
                        break;
                    case 4:
                        gg2Var.h(new x2(gg2Var, ei7.c, (byte) 24));
                        gg2Var.y.M(li0Var);
                        gg2Var.k(zlg.e);
                        break;
                    default:
                        qb7 qb7Var = (qb7) gg2Var.y.b;
                        if (qb7Var != null) {
                            ((ArrayList) qb7Var.a).add(d90.b);
                        }
                        if (!gg2Var.B.a()) {
                            gg2Var.i();
                            break;
                        } else {
                            gg2Var.h(new vk1((byte) 20));
                            break;
                        }
                }
            }
        });
        final byte b5 = 2;
        ((StylingImageView) rf2Var.g).setOnClickListener(new View.OnClickListener(this) { // from class: eg2
            public final /* synthetic */ gg2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b52 = b5;
                li0 li0Var = li0.f;
                gg2 gg2Var = this.b;
                switch (b52) {
                    case 0:
                        gg2Var.C.a();
                        boolean zE = ((mig) gg2Var.z.h).e();
                        gg2Var.y.M(zE ? li0.d : li0.e);
                        gg2Var.k(zE ? zlg.b : zlg.a);
                        break;
                    case 1:
                        gg2Var.C.a();
                        p12 p12Var2 = gg2Var.z;
                        on7 on7Var = pn7.b;
                        long jX0 = cs5.x0(10, un7.e);
                        mig migVar = (mig) p12Var2.h;
                        long jF = pn7.f(jX0);
                        if (jF == migVar.c().s0()) {
                            migVar.c().p0();
                        } else if (migVar.c().isCurrentWindowSeekable()) {
                            mig.f(migVar.c(), -jF);
                        }
                        gg2Var.y.M(li0.c);
                        gg2Var.k(zlg.d);
                        break;
                    case 2:
                        gg2Var.C.a();
                        p12 p12Var3 = gg2Var.z;
                        on7 on7Var2 = pn7.b;
                        long jX02 = cs5.x0(10, un7.e);
                        mig migVar2 = (mig) p12Var3.h;
                        long jF2 = pn7.f(jX02);
                        if (jF2 == migVar2.c().a0()) {
                            migVar2.c().o0();
                        } else if (migVar2.c().isCurrentWindowSeekable()) {
                            mig.f(migVar2.c(), jF2);
                        }
                        gg2Var.y.M(li0.b);
                        gg2Var.k(zlg.c);
                        break;
                    case 3:
                        gg2Var.h(new x2(gg2Var, ei7.c, (byte) 24));
                        gg2Var.y.M(li0Var);
                        gg2Var.k(zlg.e);
                        break;
                    case 4:
                        gg2Var.h(new x2(gg2Var, ei7.c, (byte) 24));
                        gg2Var.y.M(li0Var);
                        gg2Var.k(zlg.e);
                        break;
                    default:
                        qb7 qb7Var = (qb7) gg2Var.y.b;
                        if (qb7Var != null) {
                            ((ArrayList) qb7Var.a).add(d90.b);
                        }
                        if (!gg2Var.B.a()) {
                            gg2Var.i();
                            break;
                        } else {
                            gg2Var.h(new vk1((byte) 20));
                            break;
                        }
                }
            }
        });
        final byte b6 = 3;
        ((StylingImageView) rf2Var.f).setOnClickListener(new View.OnClickListener(this) { // from class: eg2
            public final /* synthetic */ gg2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b52 = b6;
                li0 li0Var = li0.f;
                gg2 gg2Var = this.b;
                switch (b52) {
                    case 0:
                        gg2Var.C.a();
                        boolean zE = ((mig) gg2Var.z.h).e();
                        gg2Var.y.M(zE ? li0.d : li0.e);
                        gg2Var.k(zE ? zlg.b : zlg.a);
                        break;
                    case 1:
                        gg2Var.C.a();
                        p12 p12Var2 = gg2Var.z;
                        on7 on7Var = pn7.b;
                        long jX0 = cs5.x0(10, un7.e);
                        mig migVar = (mig) p12Var2.h;
                        long jF = pn7.f(jX0);
                        if (jF == migVar.c().s0()) {
                            migVar.c().p0();
                        } else if (migVar.c().isCurrentWindowSeekable()) {
                            mig.f(migVar.c(), -jF);
                        }
                        gg2Var.y.M(li0.c);
                        gg2Var.k(zlg.d);
                        break;
                    case 2:
                        gg2Var.C.a();
                        p12 p12Var3 = gg2Var.z;
                        on7 on7Var2 = pn7.b;
                        long jX02 = cs5.x0(10, un7.e);
                        mig migVar2 = (mig) p12Var3.h;
                        long jF2 = pn7.f(jX02);
                        if (jF2 == migVar2.c().a0()) {
                            migVar2.c().o0();
                        } else if (migVar2.c().isCurrentWindowSeekable()) {
                            mig.f(migVar2.c(), jF2);
                        }
                        gg2Var.y.M(li0.b);
                        gg2Var.k(zlg.c);
                        break;
                    case 3:
                        gg2Var.h(new x2(gg2Var, ei7.c, (byte) 24));
                        gg2Var.y.M(li0Var);
                        gg2Var.k(zlg.e);
                        break;
                    case 4:
                        gg2Var.h(new x2(gg2Var, ei7.c, (byte) 24));
                        gg2Var.y.M(li0Var);
                        gg2Var.k(zlg.e);
                        break;
                    default:
                        qb7 qb7Var = (qb7) gg2Var.y.b;
                        if (qb7Var != null) {
                            ((ArrayList) qb7Var.a).add(d90.b);
                        }
                        if (!gg2Var.B.a()) {
                            gg2Var.i();
                            break;
                        } else {
                            gg2Var.h(new vk1((byte) 20));
                            break;
                        }
                }
            }
        });
        final byte b7 = 4;
        ((StylingImageView) rf2Var.c).setOnClickListener(new View.OnClickListener(this) { // from class: eg2
            public final /* synthetic */ gg2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b52 = b7;
                li0 li0Var = li0.f;
                gg2 gg2Var = this.b;
                switch (b52) {
                    case 0:
                        gg2Var.C.a();
                        boolean zE = ((mig) gg2Var.z.h).e();
                        gg2Var.y.M(zE ? li0.d : li0.e);
                        gg2Var.k(zE ? zlg.b : zlg.a);
                        break;
                    case 1:
                        gg2Var.C.a();
                        p12 p12Var2 = gg2Var.z;
                        on7 on7Var = pn7.b;
                        long jX0 = cs5.x0(10, un7.e);
                        mig migVar = (mig) p12Var2.h;
                        long jF = pn7.f(jX0);
                        if (jF == migVar.c().s0()) {
                            migVar.c().p0();
                        } else if (migVar.c().isCurrentWindowSeekable()) {
                            mig.f(migVar.c(), -jF);
                        }
                        gg2Var.y.M(li0.c);
                        gg2Var.k(zlg.d);
                        break;
                    case 2:
                        gg2Var.C.a();
                        p12 p12Var3 = gg2Var.z;
                        on7 on7Var2 = pn7.b;
                        long jX02 = cs5.x0(10, un7.e);
                        mig migVar2 = (mig) p12Var3.h;
                        long jF2 = pn7.f(jX02);
                        if (jF2 == migVar2.c().a0()) {
                            migVar2.c().o0();
                        } else if (migVar2.c().isCurrentWindowSeekable()) {
                            mig.f(migVar2.c(), jF2);
                        }
                        gg2Var.y.M(li0.b);
                        gg2Var.k(zlg.c);
                        break;
                    case 3:
                        gg2Var.h(new x2(gg2Var, ei7.c, (byte) 24));
                        gg2Var.y.M(li0Var);
                        gg2Var.k(zlg.e);
                        break;
                    case 4:
                        gg2Var.h(new x2(gg2Var, ei7.c, (byte) 24));
                        gg2Var.y.M(li0Var);
                        gg2Var.k(zlg.e);
                        break;
                    default:
                        qb7 qb7Var = (qb7) gg2Var.y.b;
                        if (qb7Var != null) {
                            ((ArrayList) qb7Var.a).add(d90.b);
                        }
                        if (!gg2Var.B.a()) {
                            gg2Var.i();
                            break;
                        } else {
                            gg2Var.h(new vk1((byte) 20));
                            break;
                        }
                }
            }
        });
        final byte b8 = 5;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: eg2
            public final /* synthetic */ gg2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b52 = b8;
                li0 li0Var = li0.f;
                gg2 gg2Var = this.b;
                switch (b52) {
                    case 0:
                        gg2Var.C.a();
                        boolean zE = ((mig) gg2Var.z.h).e();
                        gg2Var.y.M(zE ? li0.d : li0.e);
                        gg2Var.k(zE ? zlg.b : zlg.a);
                        break;
                    case 1:
                        gg2Var.C.a();
                        p12 p12Var2 = gg2Var.z;
                        on7 on7Var = pn7.b;
                        long jX0 = cs5.x0(10, un7.e);
                        mig migVar = (mig) p12Var2.h;
                        long jF = pn7.f(jX0);
                        if (jF == migVar.c().s0()) {
                            migVar.c().p0();
                        } else if (migVar.c().isCurrentWindowSeekable()) {
                            mig.f(migVar.c(), -jF);
                        }
                        gg2Var.y.M(li0.c);
                        gg2Var.k(zlg.d);
                        break;
                    case 2:
                        gg2Var.C.a();
                        p12 p12Var3 = gg2Var.z;
                        on7 on7Var2 = pn7.b;
                        long jX02 = cs5.x0(10, un7.e);
                        mig migVar2 = (mig) p12Var3.h;
                        long jF2 = pn7.f(jX02);
                        if (jF2 == migVar2.c().a0()) {
                            migVar2.c().o0();
                        } else if (migVar2.c().isCurrentWindowSeekable()) {
                            mig.f(migVar2.c(), jF2);
                        }
                        gg2Var.y.M(li0.b);
                        gg2Var.k(zlg.c);
                        break;
                    case 3:
                        gg2Var.h(new x2(gg2Var, ei7.c, (byte) 24));
                        gg2Var.y.M(li0Var);
                        gg2Var.k(zlg.e);
                        break;
                    case 4:
                        gg2Var.h(new x2(gg2Var, ei7.c, (byte) 24));
                        gg2Var.y.M(li0Var);
                        gg2Var.k(zlg.e);
                        break;
                    default:
                        qb7 qb7Var = (qb7) gg2Var.y.b;
                        if (qb7Var != null) {
                            ((ArrayList) qb7Var.a).add(d90.b);
                        }
                        if (!gg2Var.B.a()) {
                            gg2Var.i();
                            break;
                        } else {
                            gg2Var.h(new vk1((byte) 20));
                            break;
                        }
                }
            }
        });
        imageView.setImageDrawable(new LayerDrawable(new Drawable[]{(w05) t59Var.c, w04Var.b, owaVar.d}));
        a26.T((kze) p12Var.e, kzeVar2, new f7f(this) { // from class: fg2
            public final /* synthetic */ gg2 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b9 = b2;
                gg2 gg2Var = this.b;
                switch (b9) {
                    case 0:
                        zf2 zf2Var = (zf2) obj;
                        rf2 rf2Var2 = gg2Var.x;
                        int iOrdinal = zf2Var.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                AppCompatImageView appCompatImageView = (StylingImageView) rf2Var2.h;
                                appCompatImageView.setEnabled(true);
                                n1h.n(appCompatImageView, 2132021933, 0);
                                appCompatImageView.setImageResource(2131232175);
                                break;
                            } else if (iOrdinal != 2) {
                                h9o.p();
                                break;
                            }
                        }
                        AppCompatImageView appCompatImageView2 = (StylingImageView) rf2Var2.h;
                        appCompatImageView2.setEnabled(zf2Var == zf2.a);
                        n1h.n(appCompatImageView2, 2132021934, 0);
                        appCompatImageView2.setImageResource(2131232184);
                        break;
                    default:
                        bg2 bg2Var = (bg2) obj;
                        rf2 rf2Var3 = gg2Var.x;
                        ((StylingImageView) rf2Var3.i).setEnabled(bg2Var.b);
                        ((StylingImageView) rf2Var3.g).setEnabled(bg2Var.c);
                        break;
                }
            }
        });
        a26.T((kze) p12Var.f, kzeVar2, new f7f(this) { // from class: fg2
            public final /* synthetic */ gg2 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b9 = b4;
                gg2 gg2Var = this.b;
                switch (b9) {
                    case 0:
                        zf2 zf2Var = (zf2) obj;
                        rf2 rf2Var2 = gg2Var.x;
                        int iOrdinal = zf2Var.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                AppCompatImageView appCompatImageView = (StylingImageView) rf2Var2.h;
                                appCompatImageView.setEnabled(true);
                                n1h.n(appCompatImageView, 2132021933, 0);
                                appCompatImageView.setImageResource(2131232175);
                                break;
                            } else if (iOrdinal != 2) {
                                h9o.p();
                                break;
                            }
                        }
                        AppCompatImageView appCompatImageView2 = (StylingImageView) rf2Var2.h;
                        appCompatImageView2.setEnabled(zf2Var == zf2.a);
                        n1h.n(appCompatImageView2, 2132021934, 0);
                        appCompatImageView2.setImageResource(2131232184);
                        break;
                    default:
                        bg2 bg2Var = (bg2) obj;
                        rf2 rf2Var3 = gg2Var.x;
                        ((StylingImageView) rf2Var3.i).setEnabled(bg2Var.b);
                        ((StylingImageView) rf2Var3.g).setEnabled(bg2Var.c);
                        break;
                }
            }
        });
        new s14(kzeVar2, tjgVar, bqjVar.c);
    }

    @Override // defpackage.hi7
    public final void c(ei7 ei7Var) {
        int iOrdinal = ei7Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                qb7 qb7Var = (qb7) this.y.b;
                if (qb7Var != null) {
                    ((ArrayList) qb7Var.a).add(d90.d);
                }
            } else if (iOrdinal != 2) {
                h9o.p();
                return;
            }
        }
        this.d.removeView((FrameLayout) this.e.b);
        this.A.invoke(ei7Var);
    }

    @Override // defpackage.hi7
    public final void d() {
        h(new vk1((byte) 20));
        qb7 qb7Var = (qb7) this.y.b;
        if (qb7Var != null) {
            ((ArrayList) qb7Var.a).add(d90.c);
        }
    }

    @Override // defpackage.hi7
    public final void f() {
        this.B.b();
        if (this.E) {
            this.E = false;
            i();
        }
    }

    public final void h(Function0 function0) {
        bqj bqjVar = this.B;
        if (!bqjVar.a()) {
            function0.invoke();
            return;
        }
        this.C.a();
        if (!bqjVar.a()) {
            function0.invoke();
            return;
        }
        bqjVar.c.r(Boolean.FALSE);
        ValueAnimator valueAnimator = bqjVar.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((FrameLayout) bqjVar.a.e).getWidth(), 0);
        valueAnimatorOfInt.setInterpolator(lf1.n);
        valueAnimatorOfInt.setDuration(pn7.f(bqj.h));
        valueAnimatorOfInt.addUpdateListener(new zpj(bqjVar, (byte) 1));
        valueAnimatorOfInt.addListener(new aqj(function0, (byte) 0));
        valueAnimatorOfInt.start();
        bqjVar.e = valueAnimatorOfInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        bqj bqjVar = this.B;
        boolean zA = bqjVar.a();
        Size size = bqjVar.d;
        rf2 rf2Var = bqjVar.a;
        if (zA) {
            return;
        }
        this.C.a();
        ViewGroup.LayoutParams layoutParams = this.w.b.getLayoutParams();
        byte b = 0;
        b = 0;
        b = 0;
        b = 0;
        boolean z = (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & 5) == 5;
        boolean z2 = !z;
        if (!bqjVar.a()) {
            bqjVar.c.r(Boolean.TRUE);
            bqjVar.f = z2;
            ((StylingImageView) rf2Var.f).setVisibility(z ? 0 : 8);
            ((StylingImageView) rf2Var.c).setVisibility(!z ? 0 : 8);
            ((Space) rf2Var.k).setVisibility(!z ? 0 : 8);
            ((Space) rf2Var.j).setVisibility(z ? 0 : 8);
            ValueAnimator valueAnimator = bqjVar.e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((FrameLayout) rf2Var.e).getWidth(), size.getWidth());
            valueAnimatorOfInt.setInterpolator(lf1.n);
            valueAnimatorOfInt.setDuration(pn7.f(bqj.g));
            valueAnimatorOfInt.addUpdateListener(new zpj(bqjVar, b));
            valueAnimatorOfInt.start();
            bqjVar.e = valueAnimatorOfInt;
        }
        ixh ixhVar = bqj.i;
        View view = bqjVar.b;
        FrameLayout frameLayout = (FrameLayout) rf2Var.e;
        Object parent = frameLayout.getParent();
        if ((parent instanceof View) && frameLayout.isLaidOut()) {
            int width = (view.getWidth() / 2) + view.getLeft();
            if (bqjVar.f) {
                int width2 = size.getWidth() + width;
                View view2 = (View) parent;
                int width3 = view2.getWidth() - ixhVar.k(view2.getContext());
                if (width2 > width3) {
                    b = width3 - width2;
                }
            } else {
                int width4 = width - size.getWidth();
                int iK = ixhVar.k(((View) parent).getContext());
                if (width4 < iK) {
                    b = iK - width4;
                }
            }
        }
        if (b != 0) {
            ni7 ni7Var = this.i;
            VelocityTracker velocityTracker = ni7Var.t;
            ji7 ji7Var = ni7Var.x;
            if (velocityTracker == null) {
                ValueAnimator valueAnimator2 = ji7Var.c;
                if (((valueAnimator2 == null || !valueAnimator2.isRunning()) ? mi7.a : ji7Var.b) == mi7.a) {
                    ji7Var.c(ni7Var.c(((int) ((Number) ni7Var.n.invoke()).floatValue()) + b), ni7Var.d((int) ((Number) ni7Var.o.invoke()).floatValue()));
                    ji7.b(ni7Var.x, mi7.d, ni7.B, null, null, null, 28);
                }
            }
        }
    }

    public final void j(phg phgVar, f90 f90Var) {
        z8b z8bVar = this.y;
        qb7 qb7Var = (qb7) z8bVar.b;
        if (qb7Var == null || f90Var != ((f90) qb7Var.b)) {
            z8bVar.F();
            qb7 qb7Var2 = new qb7();
            qb7Var2.b = f90Var;
            qb7Var2.a = new ArrayList();
            qb7Var2.c = new ArrayList();
            z8bVar.b = qb7Var2;
        }
        vjd vjdVar = phgVar.b;
        Bundle bundle = vjdVar.I;
        Bundle bundle2 = vjdVar.I;
        if ((bundle2 != null ? bundle2.getString("com.opera.android.media.AI_POD_ID", null) : null) != null) {
            uqe uqeVar = (uqe) this.v.get();
            String string = bundle != null ? bundle.getString("com.opera.android.media.AI_POD_ID", null) : null;
            if (string == null) {
                string = "";
            }
            String string2 = bundle != null ? bundle.getString("com.opera.android.media.AI_POD_CATEGORY_ID", null) : null;
            if (string2 == null) {
                string2 = "";
            }
            String string3 = bundle != null ? bundle.getString("com.opera.android.media.AI_POD_REQUEST_ID", null) : null;
            this.D = new x79(uqeVar.h, string, string2, string3 != null ? string3 : "");
        } else {
            this.D = null;
        }
        tjg tjgVar = (tjg) this.z.a;
        egd egdVar = phgVar.a;
        Bitmap bitmap = phgVar.c;
        ujc ujcVar = tjgVar.i;
        byte b = 1;
        if (((gk9) ujcVar).b.getShuffleModeEnabled()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < ujcVar.p(); i++) {
                arrayList.add(ujcVar.Q(i));
            }
            ArrayList arrayListC = w7d.C(ujcVar);
            if (ujcVar.getShuffleModeEnabled()) {
                uup.k(new evc(arrayList, arrayListC), true).a(new qie((Object) tjgVar, (byte) 8));
                ujcVar.setShuffleModeEnabled(false);
            }
        }
        tjgVar.v.add(new q2g(tjgVar, new ljg(tjgVar, b), (byte) 3));
        tjgVar.k.a(-1, new mkg[]{new mkg(vjdVar, egdVar, bitmap, null)});
    }

    public final void k(zlg zlgVar) {
        String str;
        x79 x79Var = this.D;
        if (x79Var != null) {
            on7 on7Var = pn7.b;
            p12 p12Var = this.z;
            long jLongValue = ((Number) ((kze) p12Var.c).g()).longValue();
            un7 un7Var = un7.d;
            long jY0 = cs5.y0(jLongValue, un7Var);
            long jY02 = cs5.y0(((Number) ((kze) p12Var.d).g()).longValue(), un7Var);
            uy8 uy8Var = (uy8) x79Var.a;
            int iOrdinal = zlgVar.ordinal();
            if (iOrdinal == 0) {
                str = "audio_pause";
            } else if (iOrdinal == 1) {
                str = "audio_play";
            } else if (iOrdinal == 2) {
                str = "audio_next";
            } else if (iOrdinal == 3) {
                str = "audio_previous";
            } else if (iOrdinal == 4) {
                str = "audio_speed";
            } else {
                if (iOrdinal != 5) {
                    h9o.p();
                    return;
                }
                str = "audio_close";
            }
            String str2 = str;
            long jF = pn7.f(jY0);
            long jF2 = pn7.f(jY02);
            long jF3 = pn7.f(((TimeMark) x79Var.e).a());
            String str3 = (String) x79Var.b;
            String str4 = (String) x79Var.c;
            String str5 = (String) x79Var.d;
            uy8Var.getClass();
            uy8Var.c(new ay8(jF, jF2, str2, jF3, str3, str4, str5));
        }
    }
}
