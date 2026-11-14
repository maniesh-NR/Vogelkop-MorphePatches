package defpackage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class a1o extends n1f {
    public final /* synthetic */ b1o e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1o(b1o b1oVar, jg8 jg8Var, jg8 jg8Var2) {
        super(jg8Var, jg8Var2);
        r16 r16Var = ngh.a;
        this.e = b1oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.n1f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(mt5 r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.z0o
            if (r0 == 0) goto L13
            r0 = r9
            z0o r0 = (defpackage.z0o) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L1a
        L13:
            z0o r0 = new z0o
            nt5 r9 = (nt5) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            ybh.y(r9)     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            goto L95
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r4
        L30:
            ybh.y(r9)
            b1o r9 = r8.e     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            android.content.Context r9 = r9.a     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            java.lang.String r2 = "whoami.json"
            java.io.FileInputStream r9 = r9.openFileInput(r2)     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            r5.<init>(r9, r2)     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            r2 = 8192(0x2000, float:1.148E-41)
            r9.<init>(r5, r2)     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            b1o r2 = r8.e     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            qpb r5 = rpb.d     // Catch: java.lang.Throwable -> L85
            java.lang.String r6 = dgh.l(r9)     // Catch: java.lang.Throwable -> L85
            r5.getClass()     // Catch: java.lang.Throwable -> L85
            u0o r7 = defpackage.v0o.Companion     // Catch: java.lang.Throwable -> L85
            kotlinx.serialization.KSerializer r7 = r7.serializer()     // Catch: java.lang.Throwable -> L85
            kotlinx.serialization.KSerializer r7 = f03.B(r7)     // Catch: java.lang.Throwable -> L85
            kotlinx.serialization.KSerializer r7 = (kotlinx.serialization.KSerializer) r7     // Catch: java.lang.Throwable -> L85
            java.lang.Object r5 = r5.a(r6, r7)     // Catch: java.lang.Throwable -> L85
            v0o r5 = (defpackage.v0o) r5     // Catch: java.lang.Throwable -> L85
            r2.j = r5     // Catch: java.lang.Throwable -> L85
            r9.close()     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            b1o r8 = r8.e     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            wjh r9 = r8.b     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            java.lang.Object r9 = r9.d     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            jg8 r9 = (jg8) r9     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            zhl r2 = new zhl     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            r5 = 9
            r2.<init>(r5, r4, r8)     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            r0.v = r3     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            java.lang.Object r8 = na2.Z(r9, r2, r0)     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            if (r8 != r1) goto L95
            return r1
        L85:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            vtp.v(r9, r8)     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
            throw r0     // Catch: java.io.IOException -> L8c java.lang.IllegalArgumentException -> L91 java.io.FileNotFoundException -> L95
        L8c:
            r8 = move-exception
            defpackage.ks3.D(r8)
            goto L95
        L91:
            r8 = move-exception
            defpackage.ks3.D(r8)
        L95:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a1o.f(mt5):java.lang.Object");
    }

    @Override // defpackage.n1f
    public final void i() {
        muk mukVar = muk.a;
    }

    @Override // defpackage.n1f
    public final void n(Object obj) throws IOException {
        String str = (String) obj;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.e.a.openFileOutput("whoami.json", 0), Charsets.UTF_8), 8192);
            try {
                bufferedWriter.write(str);
                bufferedWriter.close();
            } finally {
            }
        } catch (IOException e) {
            ks3.D(e);
        }
    }
}
