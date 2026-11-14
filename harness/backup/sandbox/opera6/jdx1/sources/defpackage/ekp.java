package defpackage;

import ads_mobile_sdk.ts1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ekp implements d3p {
    public final d3p a;
    public final d3p b;
    public final Function1 c;

    public ekp(d3p d3pVar, d3p d3pVar2, Function1 function1) {
        this.a = d3pVar;
        this.b = d3pVar2;
        this.c = function1;
    }

    @Override // defpackage.d3p
    public final yno a(String str) {
        yno ynoVarA = this.b.a(str);
        if (ynoVarA != null) {
            return new ts1(ynoVarA, this);
        }
        d3p d3pVar = this.a;
        if (d3pVar.a(str) != null) {
            return d3pVar.a(str);
        }
        return null;
    }
}
