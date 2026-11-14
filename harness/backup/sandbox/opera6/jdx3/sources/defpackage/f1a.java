package defpackage;

import android.net.Uri;
import android.util.Size;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes.dex */
public final class f1a extends l6e {
    public final i6e l;
    public final i6e m;

    public f1a(String str, String str2, String str3, String str4, int i, i6e i6eVar, i6e i6eVar2) {
        super(i, str, str2, str3, str4);
        this.l = i6eVar;
        this.m = i6eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    @Override // defpackage.l6e, defpackage.eri
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(int r4, defpackage.p6l r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r6 = super.a(r4, r5, r6)
            java.lang.String r0 = "#{OPRClient}"
            int r0 = r6.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L9f
            i6e r3 = r3.m
            java.lang.Object r3 = r3.get()
            h1a r3 = (defpackage.h1a) r3
            int r4 = vep.A(r4)
            java.lang.String r1 = "android-ofa-ntp-re"
            if (r4 == 0) goto L7c
            r2 = 2
            if (r4 == r2) goto L84
            switch(r4) {
                case 4: goto L64;
                case 5: goto L64;
                case 6: goto L7c;
                case 7: goto L4a;
                case 8: goto L2f;
                case 9: goto L24;
                default: goto L23;
            }
        L23:
            goto L84
        L24:
            java.lang.String r3 = r3.k()
            java.lang.String r4 = "android-ofa-msw-re"
            java.lang.String r1 = defpackage.aik.b(r3, r4)
            goto L84
        L2f:
            p6l r4 = defpackage.p6l.b
            if (r5 != r4) goto L3f
            java.lang.String r3 = r3.d()
            java.lang.String r4 = "android-ofa-nep-pr"
            java.lang.String r3 = defpackage.aik.b(r3, r4)
        L3d:
            r1 = r3
            goto L84
        L3f:
            java.lang.String r3 = r3.e()
            java.lang.String r4 = "android-ofa-nep-re"
            java.lang.String r3 = defpackage.aik.b(r3, r4)
            goto L3d
        L4a:
            p6l r4 = defpackage.p6l.b
            if (r5 != r4) goto L59
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "android-ofa-cm-pr"
            java.lang.String r3 = defpackage.aik.b(r3, r4)
            goto L3d
        L59:
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "android-ofa-cm-re"
            java.lang.String r3 = defpackage.aik.b(r3, r4)
            goto L3d
        L64:
            p6l r4 = defpackage.p6l.b
            if (r5 != r4) goto L73
            java.lang.String r3 = r3.g()
            java.lang.String r4 = "android-ofa-ntp-pr"
            java.lang.String r3 = defpackage.aik.b(r3, r4)
            goto L3d
        L73:
            java.lang.String r3 = r3.h()
            java.lang.String r3 = defpackage.aik.b(r3, r1)
            goto L3d
        L7c:
            java.lang.String r3 = r3.f()
            java.lang.String r1 = defpackage.aik.b(r3, r1)
        L84:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 0
            java.lang.String r4 = r6.substring(r4, r0)
            r3.<init>(r4)
            r3.append(r1)
            int r0 = r0 + 12
            java.lang.String r4 = r6.substring(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            return r3
        L9f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1a.a(int, p6l, java.lang.String):java.lang.String");
    }

    @Override // defpackage.l6e, defpackage.eri
    public final boolean c() {
        return ((Boolean) this.l.get()).booleanValue();
    }

    @Override // defpackage.l6e, defpackage.eri
    public final lsc g(byte[] bArr, Size size, Size size2, String str) {
        Uri.Builder builderBuildUpon = Uri.parse("https://lens.google.com/upload").buildUpon();
        builderBuildUpon.appendQueryParameter("ep", "ocm");
        builderBuildUpon.appendQueryParameter("hl", sfe.b0(Locale.getDefault()));
        builderBuildUpon.appendQueryParameter("vpw", String.valueOf(size2.getWidth()));
        builderBuildUpon.appendQueryParameter("vph", String.valueOf(size2.getHeight()));
        builderBuildUpon.appendQueryParameter("st", String.valueOf(System.currentTimeMillis()));
        String string = UUID.randomUUID().toString();
        g54 g54Var = new g54(string.getBytes(Charsets.UTF_8));
        g54Var.c = string;
        esd esdVar = sce.e;
        ArrayList arrayList = new ArrayList();
        esd esdVar2 = sce.e;
        if (!Intrinsics.a(esdVar2.b, "multipart")) {
            odf.i(esdVar2, "multipart != ");
            return null;
        }
        qvh qvhVar = rvh.Companion;
        Regex regex = esd.e;
        arrayList.add(w7d.l("encoded_image", (String) null, qvh.d(qvhVar, bArr, wyh.x("image/jpeg"), 0, 6)));
        String str2 = size.getWidth() + "," + size.getHeight();
        qvhVar.getClass();
        arrayList.add(w7d.l("processed_image_dimensions", (String) null, qvh.b(str2, (esd) null)));
        Uri uriBuild = builderBuildUpon.build();
        if (arrayList.isEmpty()) {
            qp2.n("Multipart body must have at least one part.");
            return null;
        }
        return l6e.o(new lsc(uriBuild.toString(), 0), new sce(g54Var, esdVar2, _UtilJvmKt.toImmutableList(arrayList)));
    }

    @Override // defpackage.l6e, defpackage.eri
    public final int m() {
        return 1000;
    }

    @Override // defpackage.l6e
    public final h6e n(pqk pqkVar) {
        byte b = 0;
        e1a e1aVar = new e1a(pqkVar, 2, b);
        d1a d1aVar = new d1a(this, pqkVar);
        d1aVar.b = new e1a(pqkVar, b, (byte) 1);
        e1aVar.b = d1aVar;
        return e1aVar;
    }
}
