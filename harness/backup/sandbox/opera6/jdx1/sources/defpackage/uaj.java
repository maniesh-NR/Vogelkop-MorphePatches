package defpackage;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public final class uaj implements z6g, x63 {
    public final boolean b;
    public final f3d c;
    public final dbj d;
    public boolean e;
    public final Path a = new Path();
    public final d14 f = new d14((byte) 1);

    public uaj(f3d f3dVar, c73 c73Var, nbj nbjVar) {
        this.b = nbjVar.d;
        this.c = f3dVar;
        dbj dbjVar = new dbj((List) ((n1) nbjVar.c).b);
        this.d = dbjVar;
        c73Var.g(dbjVar);
        dbjVar.a(this);
    }

    @Override // defpackage.x63
    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // defpackage.wp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L3b
            java.lang.Object r1 = r1.get(r0)
            wp5 r1 = (defpackage.wp5) r1
            boolean r2 = r1 instanceof defpackage.h7m
            if (r2 == 0) goto L28
            r2 = r1
            h7m r2 = (defpackage.h7m) r2
            int r3 = r2.c
            r4 = 1
            if (r3 != r4) goto L28
            d14 r1 = r5.f
            java.util.ArrayList r1 = r1.a
            r1.add(r2)
            r2.c(r5)
            goto L38
        L28:
            boolean r2 = r1 instanceof defpackage.y8i
            if (r2 == 0) goto L38
            if (r7 != 0) goto L33
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L33:
            y8i r1 = (defpackage.y8i) r1
            r7.add(r1)
        L38:
            int r0 = r0 + 1
            goto L2
        L3b:
            dbj r5 = r5.d
            r5.k = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uaj.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.z6g
    public final Path e() {
        boolean z = this.e;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.b) {
            this.e = true;
            return path;
        }
        Path path2 = (Path) this.d.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.a(path);
        this.e = true;
        return path;
    }
}
