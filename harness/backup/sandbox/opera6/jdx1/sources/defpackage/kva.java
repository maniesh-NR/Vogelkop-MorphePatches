package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class kva implements s3j {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qrm b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kva(qrm qrmVar, Object obj, byte b) {
        this.a = b;
        this.b = qrmVar;
        this.c = obj;
    }

    @Override // defpackage.s3j
    public final void a(u3j u3jVar) {
        byte b = this.a;
        Object obj = this.c;
        qrm qrmVar = this.b;
        switch (b) {
            case 0:
                qva qvaVar = (qva) qrmVar;
                rva rvaVar = (rva) obj;
                if (qvaVar.e() != null) {
                    xug.i();
                    r3j r3jVar = qvaVar.A;
                    if (r3jVar != null) {
                        r3jVar.b();
                        qvaVar.A = null;
                    }
                    s0b s0bVar = qvaVar.z;
                    if (s0bVar != null) {
                        s0bVar.a();
                        qvaVar.z = null;
                    }
                    rvaVar.c();
                    qvaVar.g();
                    tva tvaVar = (tva) qvaVar.h;
                    to2 to2Var = qvaVar.i;
                    to2Var.getClass();
                    q3j q3jVarI = qvaVar.I(tvaVar, to2Var);
                    qvaVar.y = q3jVarI;
                    Object[] objArr = {q3jVarI.b()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    qvaVar.G(Collections.unmodifiableList(arrayList));
                    qvaVar.r();
                    break;
                }
                break;
            default:
                jyd jydVar = (jyd) qrmVar;
                jydVar.G(Collections.singletonList(jydVar.J((Size) obj).b()));
                jydVar.r();
                break;
        }
    }
}
