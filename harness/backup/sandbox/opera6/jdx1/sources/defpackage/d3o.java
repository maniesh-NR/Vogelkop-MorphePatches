package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class d3o {
    public static final g3o b;
    public final g3o a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new t2o() : i >= 35 ? new s2o() : i >= 34 ? new r2o() : i >= 31 ? new q2o() : i >= 30 ? new p2o() : new o2o()).b().a.a().a.b().a.c();
    }

    public d3o(g3o g3oVar) {
        this.a = g3oVar;
    }

    public void A(Rect[][] rectArr) {
    }

    public void B(Rect[][] rectArr) {
    }

    public g3o a() {
        return this.a;
    }

    public g3o b() {
        return this.a;
    }

    public g3o c() {
        return this.a;
    }

    public void d(View view) {
    }

    public void e(g3o g3oVar) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3o)) {
            return false;
        }
        d3o d3oVar = (d3o) obj;
        return t() == d3oVar.t() && s() == d3oVar.s() && Objects.equals(n(), d3oVar.n()) && Objects.equals(l(), d3oVar.l()) && Objects.equals(h(), d3oVar.h());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public jb7 h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public r9b i(int i) {
        return r9b.e;
    }

    public r9b j(int i) {
        if ((i & 8) == 0) {
            return r9b.e;
        }
        qp2.o("Unable to query the maximum insets for IME");
        return null;
    }

    public r9b k() {
        return n();
    }

    public r9b l() {
        return r9b.e;
    }

    public r9b m() {
        return n();
    }

    public r9b n() {
        return r9b.e;
    }

    public r9b o() {
        return n();
    }

    public void p(View view) {
    }

    public void q() {
    }

    public g3o r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void v(mb7 mb7Var) {
    }

    public void w(r9b[] r9bVarArr) {
    }

    public void x(r9b r9bVar) {
    }

    public void y(g3o g3oVar) {
    }

    public void z(int i) {
    }
}
