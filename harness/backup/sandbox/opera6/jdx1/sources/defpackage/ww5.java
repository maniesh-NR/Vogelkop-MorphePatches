package defpackage;

import android.view.autofill.AutofillValue;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class ww5 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xw5 b;

    public /* synthetic */ ww5(xw5 xw5Var, byte b) {
        this.a = b;
        this.b = xw5Var;
    }

    public /* synthetic */ ww5(xw5 xw5Var, q0j q0jVar) {
        this.a = (byte) 3;
        this.b = xw5Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        xw5 xw5Var = this.b;
        switch (b) {
            case 0:
                t0g t0gVar = xw5Var.s.t;
                Boolean bool = Boolean.TRUE;
                t0gVar.setValue(bool);
                xw5Var.s.s.setValue(bool);
                gbc gbcVar = xw5Var.s;
                AutofillValue autofillValue = ((e61) obj).a;
                xw5.W0(gbcVar, (String) (autofillValue.isText() ? autofillValue.getTextValue() : null), xw5Var.t, xw5Var.u);
                return bool;
            case 1:
                List list = (List) obj;
                if (xw5Var.s.d() != null) {
                    list.add(xw5Var.s.d().a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                xw5.W0(xw5Var.s, ((sf1) obj).b, xw5Var.t, xw5Var.u);
                return Boolean.TRUE;
            default:
                sf1 sf1Var = (sf1) obj;
                if (!xw5Var.t && xw5Var.u) {
                    djl djlVar = xw5Var.s.e;
                    if (djlVar != null) {
                        List listAsList = Arrays.asList(new e49(), new yb5(sf1Var, 1));
                        gbc gbcVar2 = xw5Var.s;
                        c37 c37Var = gbcVar2.d;
                        lw5 lw5Var = gbcVar2.v;
                        mil milVarB = c37Var.b(listAsList);
                        djlVar.a(null, milVarB);
                        lw5Var.invoke(milVarB);
                    } else {
                        mil milVar = xw5Var.r;
                        String str = milVar.a.b;
                        long j = milVar.b;
                        int i = xjl.c;
                        String string = StringsKt.W((int) (j >> 32), (int) (j & 4294967295L), str, sf1Var).toString();
                        int length = sf1Var.b.length() + ((int) (xw5Var.r.b >> 32));
                        xw5Var.s.v.invoke(new mil(4, upj.c(length, length), string));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
