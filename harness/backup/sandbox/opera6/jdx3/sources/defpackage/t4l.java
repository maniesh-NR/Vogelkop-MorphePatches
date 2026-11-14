package defpackage;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class t4l extends ldk {
    public final lrk j;
    public final crb k;
    public final zyk l;
    public final s4l m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4l(umi umiVar, lrk lrkVar) {
        super(umiVar);
        r16 r16Var = ngh.a;
        this.j = lrkVar;
        this.k = phj.o(rpb.d, new bvk((byte) 5));
        this.l = z4c.b(new thk((byte) 8));
        this.m = new s4l(l08.a, 0);
    }

    @Override // defpackage.ldk
    public final Object a() {
        try {
            String strI = s29.i((File) this.l.getValue());
            if (strI != null && strI.length() != 0) {
                crb crbVar = this.k;
                crbVar.getClass();
                return (s4l) crbVar.a(strI, s4l.Companion.serializer());
            }
        } catch (o2j | IOException unused) {
        }
        return this.m;
    }

    @Override // defpackage.ldk
    public final void b(Object obj) throws Throwable {
        s4l s4lVar = (s4l) obj;
        try {
            crb crbVar = this.k;
            crbVar.getClass();
            s29.k(new ByteArrayInputStream(crbVar.b(s4lVar, f03.B(s4l.Companion.serializer())).getBytes(StandardCharsets.UTF_8)), (File) this.l.getValue());
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.ldk
    public final int c() {
        return 1;
    }

    @Override // defpackage.ldk
    public final void d(Object obj) {
        s4l s4lVar = (s4l) obj;
        if (s4lVar == null) {
            s4lVar = this.m;
        }
        this.j.invoke(s4lVar);
    }
}
