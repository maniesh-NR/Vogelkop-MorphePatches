package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfr5;", "Lh8e;", "Lgr5;", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class fr5 extends h8e {
    public final bza b;
    public final xxa c;
    public final hd2 d;
    public final td3 e;
    public final kr5 f;
    public final kh3 g;
    public final rd2 h;
    public final String i;

    public fr5(bza bzaVar, xxa xxaVar, hd2 hd2Var, td3 td3Var, kr5 kr5Var, kh3 kh3Var, rd2 rd2Var, String str) {
        this.b = bzaVar;
        this.c = xxaVar;
        this.d = hd2Var;
        this.e = td3Var;
        this.f = kr5Var;
        this.g = kh3Var;
        this.h = rd2Var;
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr5)) {
            return false;
        }
        fr5 fr5Var = (fr5) obj;
        return this.b.equals(fr5Var.b) && Intrinsics.a(this.c, fr5Var.c) && Intrinsics.a(this.d, fr5Var.d) && this.e.equals(fr5Var.e) && this.f.equals(fr5Var.f) && Intrinsics.a(this.g, fr5Var.g) && Intrinsics.a(this.h, fr5Var.h) && Intrinsics.a(this.i, fr5Var.i);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        hd2 hd2Var = this.d;
        xxa xxaVar = this.c;
        bza bzaVar = this.b;
        id2 id2Var = new id2(xxaVar, bzaVar, hd2Var);
        od2 od2Var = new od2(id2Var);
        od2Var.m = od2.u;
        kr5 kr5Var = this.f;
        od2Var.n = kr5Var;
        od2Var.o = true;
        od2Var.p = this.h;
        od2Var.l(id2Var);
        opj opjVar = bzaVar.l;
        return new gr5(od2Var, this.e, kr5Var, this.g, this.i, opjVar instanceof cp5 ? (cp5) opjVar : null);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        gr5 gr5Var = (gr5) b8eVar;
        long jH = gr5Var.v.h();
        cp5 cp5Var = gr5Var.u;
        hd2 hd2Var = this.d;
        xxa xxaVar = this.c;
        bza bzaVar = this.b;
        id2 id2Var = new id2(xxaVar, bzaVar, hd2Var);
        od2 od2Var = gr5Var.v;
        od2Var.m = od2.u;
        kr5 kr5Var = this.f;
        od2Var.n = kr5Var;
        od2Var.o = true;
        od2Var.p = this.h;
        od2Var.l(id2Var);
        boolean zA = bpj.a(jH, od2Var.h());
        gr5Var.o = this.e;
        opj opjVar = bzaVar.l;
        gr5Var.u = opjVar instanceof cp5 ? (cp5) opjVar : null;
        gr5Var.p = kr5Var;
        gr5Var.q = 1.0f;
        gr5Var.r = this.g;
        gr5Var.s = true;
        String str = gr5Var.t;
        String str2 = this.i;
        if (!Intrinsics.a(str, str2)) {
            gr5Var.t = str2;
            aoh.j(gr5Var);
        }
        boolean zA2 = Intrinsics.a(cp5Var, gr5Var.u);
        if (!zA || !zA2) {
            nb6.F(gr5Var);
        }
        c26.y(gr5Var);
    }

    public final int hashCode() {
        int iHashCode = (((this.f.hashCode() + ((this.e.hashCode() + ((((od2.u.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 961) + 1) * 31)) * 31)) * 31) + 1065353216) * 31;
        kh3 kh3Var = this.g;
        int iHashCode2 = (((iHashCode + (kh3Var == null ? 0 : kh3Var.hashCode())) * 31) + 1231) * 31;
        rd2 rd2Var = this.h;
        int iHashCode3 = (iHashCode2 + (rd2Var == null ? 0 : rd2Var.hashCode())) * 31;
        String str = this.i;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.b);
        sb.append(", imageLoader=");
        sb.append(this.c);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.d);
        sb.append(", transform=");
        sb.append(od2.u);
        sb.append(", onState=null, filterQuality=Low, alignment=");
        sb.append(this.e);
        sb.append(", contentScale=");
        sb.append(this.f);
        sb.append(", alpha=1.0, colorFilter=");
        sb.append(this.g);
        sb.append(", clipToBounds=true, previewHandler=");
        sb.append(this.h);
        sb.append(", contentDescription=");
        return z1m.l(sb, this.i, ")");
    }
}
