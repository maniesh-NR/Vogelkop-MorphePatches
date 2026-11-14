package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.mediarouter.app.OperaMediaRouteButton;

/* loaded from: classes.dex */
public final class nld extends GestureDetector.SimpleOnGestureListener {
    public final nrl a;
    public final qe6 b;
    public final lld c;
    public final wub d;
    public final bp e;
    public final nv6 f;
    public final qfb g;
    public final pld h;
    public final old i;
    public final pgh j;
    public final mld k = new mld(this, (byte) 0);
    public boolean l = true;
    public boolean m;
    public boolean n;

    public nld(hld hldVar, mig migVar, a0n a0nVar, eme emeVar, boolean z) {
        byte b = 0;
        nrl nrlVar = new nrl();
        nrlVar.b = hldVar;
        nrlVar.a = z;
        if (z) {
            OperaMediaRouteButton operaMediaRouteButton = hldVar.d;
            operaMediaRouteButton.d = new ao4();
            r16 r16Var = new r16();
            if (r16Var != operaMediaRouteButton.e) {
                operaMediaRouteButton.e = r16Var;
                operaMediaRouteButton.c();
                operaMediaRouteButton.b();
            }
        } else {
            hldVar.d.setVisibility(8);
        }
        this.a = nrlVar;
        qe6 qe6Var = new qe6(hldVar, (byte) 29);
        this.b = qe6Var;
        this.c = new lld(hldVar, b);
        this.d = new wub(hldVar);
        bp bpVar = new bp(hldVar);
        this.e = bpVar;
        nv6 nv6Var = new nv6(hldVar);
        this.f = nv6Var;
        qfb qfbVar = new qfb((Object) hldVar, (byte) 9);
        this.g = qfbVar;
        this.h = new pld(migVar, bpVar, hldVar.a, qe6Var);
        this.i = new old(a0nVar, emeVar, bpVar, nv6Var, qfbVar, hldVar.a, new mld(this, (byte) 1));
        this.j = new pgh(new rgh(hldVar.p), migVar, hldVar.e, new ild(this));
        c();
    }

    public final void a() {
        this.j.e = 0;
        b();
        ((hld) this.e.b).t.setVisibility(8);
        this.f.d();
        this.g.d();
    }

    public final void b() {
        nrl nrlVar = this.a;
        int alpha = (int) (((hld) nrlVar.b).i.getAlpha() * 150.0f);
        hld hldVar = (hld) nrlVar.b;
        nrlVar.e(alpha, hldVar.i);
        nrlVar.e(alpha, hldVar.h);
        if (nrlVar.a) {
            nrlVar.e(alpha, hldVar.d);
        }
        qe6 qe6Var = this.b;
        qe6Var.M((int) (((hld) qe6Var.b).l.getAlpha() * 150.0f));
        lld lldVar = this.c;
        hld hldVar2 = (hld) lldVar.b;
        int alpha2 = (int) (hldVar2.j.getAlpha() * 150.0f);
        lldVar.a0(alpha2, hldVar2.j);
        lldVar.a0(alpha2, hldVar2.k);
        lldVar.a0(alpha2, hldVar2.s);
        lldVar.a0(alpha2, hldVar2.f);
        lldVar.a0(alpha2, hldVar2.g);
        hld hldVar3 = (hld) this.d.a;
        int alpha3 = (int) (hldVar3.e.getAlpha() * 150.0f);
        View view = hldVar3.e;
        if (view.isLaidOut()) {
            view.animate().alpha(0.0f).setDuration(alpha3).setInterpolator(lf1.a);
        } else {
            view.setAlpha(0.0f);
        }
        this.l = false;
    }

    public final void c() {
        if (this.j.e > 0) {
            return;
        }
        mld mldVar = this.k;
        vml.a(mldVar);
        if (!this.m || this.n) {
            return;
        }
        vml.d(mldVar, 3000L);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        pgh pghVar = this.j;
        pghVar.getClass();
        boolean z = motionEvent.getX() < ((float) pghVar.c.getWidth()) / 2.0f;
        if (!(pghVar.i && z) && (!pghVar.j || z)) {
            return false;
        }
        pghVar.b(z);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        pld pldVar = this.h;
        boolean z = pldVar.f && pldVar.i > 0;
        pldVar.g = z;
        pldVar.h = false;
        old oldVar = this.i;
        eme emeVar = oldVar.g;
        a0n a0nVar = oldVar.f;
        int width = oldVar.d.getWidth();
        if (width > 0) {
            if (motionEvent.getX() <= width / 2.0f) {
                a0nVar.getClass();
                oldVar.h = a0nVar;
                oldVar.k = 2131232296;
                oldVar.l = 2131232299;
                oldVar.j = oldVar.b;
            } else {
                oldVar.h = emeVar;
                oldVar.k = 2131232008;
                oldVar.l = 2131232008;
                oldVar.j = oldVar.c;
            }
        }
        oldVar.i = null;
        return z || (oldVar.h != null);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        boolean z2;
        int height;
        int width;
        pld pldVar = this.h;
        mig migVar = pldVar.b;
        if (pldVar.g) {
            pldVar.g = false;
            if (Math.abs(f) > Math.abs(f2) && (width = pldVar.d.getWidth()) > 0) {
                qe6 qe6Var = pldVar.e;
                qe6Var.M((int) (((hld) qe6Var.b).l.getAlpha() * 150.0f));
                pldVar.h = true;
                pldVar.j = migVar.c().getCurrentPosition();
                pldVar.k = 120000.0f / width;
            }
        }
        if (pldVar.h) {
            float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
            long j = pldVar.j;
            long j2 = ((long) (pldVar.k * rawX)) + j;
            long j3 = pldVar.i;
            if (j2 < 0) {
                j2 = 0;
            } else if (j2 > j3) {
                j2 = j3;
            }
            int i = j2 - j >= 0 ? 2131232097 : 2131232226;
            bp bpVar = pldVar.c;
            CharSequence charSequenceT = pldVar.a.t(j2);
            hld hldVar = (hld) bpVar.b;
            if (i != bpVar.a) {
                bpVar.a = i;
                hldVar.u.setImageResource(i);
            }
            hldVar.v.setText(charSequenceT);
            hldVar.t.setVisibility(0);
            migVar.c().seekTo(migVar.c().getCurrentWindowIndex(), j2);
            z = true;
        } else {
            z = false;
        }
        old oldVar = this.i;
        a0n a0nVar = oldVar.h;
        if (a0nVar != null) {
            oldVar.h = null;
            if (Math.abs(f2) > Math.abs(f) && (height = oldVar.d.getHeight()) > 0) {
                oldVar.e.run();
                oldVar.i = a0nVar;
                oldVar.m = a0nVar.i();
                oldVar.n = 120.0f / height;
            }
        }
        if (oldVar.i != null) {
            int iJ = nb6.j(oldVar.m + ((int) (oldVar.n * (motionEvent.getRawY() - motionEvent2.getRawY()))), 0, 100);
            bp bpVar2 = oldVar.a;
            int i2 = iJ > 0 ? oldVar.k : oldVar.l;
            CharSequence charSequenceValueOf = String.valueOf(iJ);
            hld hldVar2 = (hld) bpVar2.b;
            if (i2 != bpVar2.a) {
                bpVar2.a = i2;
                hldVar2.u.setImageResource(i2);
            }
            hldVar2.v.setText(charSequenceValueOf);
            hldVar2.t.setVisibility(0);
            oldVar.j.show(iJ);
            oldVar.i.G(iJ);
            z2 = true;
        } else {
            z2 = false;
        }
        return z || z2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        pgh pghVar = this.j;
        if (pghVar.e > 0) {
            return false;
        }
        if (this.l) {
            a();
            return true;
        }
        nrl nrlVar = this.a;
        hld hldVar = (hld) nrlVar.b;
        int alpha = (int) ((1.0f - hldVar.i.getAlpha()) * 150.0f);
        nrlVar.f(alpha, hldVar.i);
        nrlVar.f(alpha, hldVar.h);
        if (nrlVar.a) {
            nrlVar.f(alpha, hldVar.d);
        }
        qe6 qe6Var = this.b;
        hld hldVar2 = (hld) qe6Var.b;
        int alpha2 = (int) ((1.0f - hldVar2.l.getAlpha()) * 150.0f);
        LinearLayout linearLayout = hldVar2.l;
        linearLayout.animate().alpha(1.0f).setDuration(alpha2).setInterpolator(lf1.a).setListener(new c48(qe6Var, linearLayout));
        this.c.p0();
        this.d.P();
        this.l = true;
        pghVar.e = 0;
        c();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.j.a(motionEvent);
    }
}
