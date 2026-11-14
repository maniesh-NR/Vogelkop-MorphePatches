package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class msh extends oqe {
    public static final List C = Collections.unmodifiableList(Arrays.asList(lsh.LIKE, lsh.LAUGH, lsh.SURPRISE, lsh.SAD, lsh.ANGRY));
    public final km5 A;
    public final nb8 B;
    public final AtomicReference e;
    public final AtomicInteger f;
    public final AtomicInteger g;
    public final String h;
    public final Uri i;
    public final int j;
    public final Uri k;
    public final Uri l;
    public final Uri m;
    public final Uri n;
    public final long o;
    public final long p;
    public final String q;
    public final String r;
    public final String s;
    public final int t;
    public final List u;
    public final p12 v;
    public final List w;
    public final List x;
    public final String y;
    public final xlg z;

    public msh(String str, String str2, String str3, Uri uri, int i, Uri uri2, Uri uri3, Uri uri4, Uri uri5, long j, long j2, String str4, String str5, int i2, int i3, int i4, ArrayList arrayList, String str6, p12 p12Var, List list, List list2, String str7, qre qreVar, xlg xlgVar, nb8 nb8Var) {
        super(str, str2, qreVar);
        this.e = new AtomicReference(lsh.NONE);
        this.A = new km5((byte) 5);
        this.h = str3;
        this.i = uri;
        this.j = i;
        this.k = uri2;
        this.l = uri3;
        this.m = uri4;
        this.n = uri5;
        this.o = j;
        this.p = j2;
        this.q = str4;
        this.r = str5;
        this.t = i2;
        this.f = new AtomicInteger(i3);
        this.g = new AtomicInteger(i4);
        this.s = str6;
        this.v = p12Var;
        this.w = list != null ? Collections.unmodifiableList(list) : null;
        this.x = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.u = arrayList != null ? Collections.unmodifiableList(arrayList) : null;
        this.y = str7;
        this.z = xlgVar;
        this.B = nb8Var;
    }

    public final String b() {
        Uri uri = this.m;
        if (uri == null) {
            return "";
        }
        String path = uri.getPath();
        String[] strArr = aik.a;
        return path == null ? "" : path;
    }

    public final void c(lsh lshVar) {
        int i;
        AtomicReference atomicReference = this.e;
        lsh lshVar2 = (lsh) atomicReference.get();
        if (lshVar2 == lsh.IGNORE || lshVar2 == lshVar) {
            return;
        }
        List list = C;
        int iIndexOf = list.indexOf(lshVar2);
        lsh lshVar3 = lsh.DISLIKE;
        int i2 = 0;
        if (iIndexOf != -1) {
            i = 0;
            i2 = -1;
        } else {
            i = lshVar2 == lshVar3 ? -1 : 0;
        }
        if (list.indexOf(lshVar) != -1) {
            i2++;
        } else if (lshVar == lshVar3) {
            i++;
        }
        atomicReference.set(lshVar);
        this.f.addAndGet(i2);
        this.g.addAndGet(i);
        ac8.a(new vre(this));
    }

    public final void d(uqe uqeVar, ssh sshVar, boolean z) {
        km5 km5Var = this.A;
        HashSet hashSet = (HashSet) km5Var.d;
        if (((List) km5Var.c) != null) {
            sshVar.a();
            return;
        }
        if (km5Var.a) {
            hashSet.add(sshVar);
            return;
        }
        km5Var.a = true;
        hashSet.add(sshVar);
        lld lldVar = new lld(this);
        if (this instanceof dre) {
            uqeVar.getClass();
            lldVar.j0(new ArrayList(0));
            return;
        }
        qsh qshVar = uqeVar.k;
        yqa yqaVar = new yqa(uqeVar, lldVar);
        qtm qtmVar = (qtm) ((c6j) qshVar.c).b;
        if (qtmVar == null) {
            return;
        }
        s9i s9iVar = (s9i) qshVar.b;
        uy8 uy8Var = (uy8) s9iVar.e;
        if (uy8Var == null) {
            h9o.e();
            return;
        }
        Context context = (Context) s9iVar.b;
        vr9 vr9Var = (vr9) s9iVar.d;
        p12 p12Var = this.v;
        new psh(context, vr9Var, qtmVar, (String) p12Var.b, (String) p12Var.a, this.c, this.d, uy8Var, z).U(new qfb(qshVar, yqaVar));
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return ((String) this.v.b).equals((String) ((msh) obj).v.b);
    }

    public int hashCode() {
        return ((String) this.v.b).hashCode();
    }
}
