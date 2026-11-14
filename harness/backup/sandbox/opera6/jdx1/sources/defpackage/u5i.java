package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u5i {
    public final s15 a;
    public final Context b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public Executor f;
    public Executor g;
    public kw0 h;
    public boolean i;
    public final x5i j;
    public final LinkedHashSet k;
    public final LinkedHashSet l;
    public final ArrayList m;
    public boolean n;
    public boolean o;
    public jg8 p;

    public u5i(Context context, Class cls, String str) {
        w5i w5iVar = w5i.a;
        this.j = new x5i((byte) 0);
        this.k = new LinkedHashSet();
        this.l = new LinkedHashSet();
        this.m = new ArrayList();
        this.n = true;
        this.a = uqh.a(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(ryd... rydVarArr) {
        for (ryd rydVar : rydVarArr) {
            Integer numValueOf = Integer.valueOf(rydVar.a);
            LinkedHashSet linkedHashSet = this.l;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(rydVar.b));
        }
        for (ryd rydVar2 : (ryd[]) Arrays.copyOf(rydVarArr, rydVarArr.length)) {
            this.j.a(rydVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c0, code lost:
    
        qp2.o("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.y5i b() {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u5i.b():y5i");
    }
}
