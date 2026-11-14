package defpackage;

/* loaded from: classes.dex */
public final class q3c {
    public final m3c a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public u1d q;
    public i3c d = i3c.e;
    public final sfd p = new sfd(this);

    public q3c(m3c m3cVar) {
        this.a = m3cVar;
    }

    public final wye a() {
        return (wye) this.a.F.e;
    }

    public final void b() {
        i3c i3cVar = this.a.G.d;
        if (i3cVar == i3c.c || i3cVar == i3c.d) {
            if (this.p.A) {
                g(true);
            } else {
                f(true);
            }
        }
        if (i3cVar == i3c.d) {
            u1d u1dVar = this.q;
            if (u1dVar == null || !u1dVar.u) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        u1d u1dVar = this.q;
        if (u1dVar != null) {
            i3c i3cVar = i3c.b;
            q3c q3cVar = u1dVar.f;
            q3cVar.d = i3cVar;
            m3c m3cVar = q3cVar.a;
            q3cVar.e = false;
            u1dVar.y = j;
            p12 p12Var = p3c.a(m3cVar).K;
            s1d s1dVar = u1dVar.z;
            ((tuj) p12Var.a).e(m3cVar, (w5f) p12Var.b, s1dVar);
            q3cVar.f = true;
            q3cVar.g = true;
            boolean zM = ui6.M(m3cVar);
            sfd sfdVar = q3cVar.p;
            if (zM) {
                sfdVar.v = true;
                sfdVar.w = true;
            } else {
                sfdVar.u = true;
            }
            q3cVar.d = i3c.e;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            m3c m3cVarU = this.a.u();
            q3c q3cVar = m3cVarU != null ? m3cVarU.G : null;
            if (q3cVar != null) {
                int i3 = q3cVar.l;
                if (i == 0) {
                    q3cVar.d(i3 - 1);
                } else {
                    q3cVar.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            m3c m3cVarU = this.a.u();
            q3c q3cVar = m3cVarU != null ? m3cVarU.G : null;
            if (q3cVar != null) {
                int i3 = q3cVar.o;
                if (i == 0) {
                    q3cVar.e(i3 - 1);
                } else {
                    q3cVar.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            boolean z2 = this.j;
            if (z) {
                if (z2) {
                    return;
                }
                d(this.l + 1);
            } else {
                if (z2) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            boolean z2 = this.k;
            if (z) {
                if (z2) {
                    return;
                }
                d(this.l + 1);
            } else {
                if (z2) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            boolean z2 = this.m;
            if (z) {
                if (z2) {
                    return;
                }
                e(this.o + 1);
            } else {
                if (z2) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            boolean z2 = this.n;
            if (z) {
                if (z2) {
                    return;
                }
                e(this.o + 1);
            } else {
                if (z2) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        sfd sfdVar = this.p;
        q3c q3cVar = sfdVar.f;
        Object obj = sfdVar.r;
        m3c m3cVar = this.a;
        if ((obj != null || q3cVar.a().p() != null) && sfdVar.q) {
            sfdVar.q = false;
            sfdVar.r = q3cVar.a().p();
            m3c m3cVarU = m3cVar.u();
            if (m3cVarU != null) {
                m3c.V(m3cVarU, false, 7);
            }
        }
        u1d u1dVar = this.q;
        if (u1dVar != null) {
            q3c q3cVar2 = u1dVar.f;
            if (!(u1dVar.x == null && q3cVar2.a().X0().u.p() == null) && u1dVar.w) {
                u1dVar.w = false;
                u1dVar.x = q3cVar2.a().X0().u.p();
                if (ui6.M(m3cVar)) {
                    m3c m3cVarU2 = m3cVar.u();
                    if (m3cVarU2 != null) {
                        m3c.V(m3cVarU2, false, 7);
                        return;
                    }
                    return;
                }
                m3c m3cVarU3 = m3cVar.u();
                if (m3cVarU3 != null) {
                    m3c.T(m3cVarU3, false, 7);
                }
            }
        }
    }
}
