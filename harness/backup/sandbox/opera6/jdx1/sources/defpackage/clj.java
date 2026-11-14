package defpackage;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class clj extends zfh {
    public final int c;
    public final String[] d;
    public final va1 e;
    public final String f;
    public final String g;
    public final String h;

    public clj(int i, String[] strArr, va1 va1Var, String str, String str2, String str3, Function1 function1) {
        super(function1);
        this.c = i;
        this.d = strArr;
        this.e = va1Var;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    @Override // defpackage.cg8
    public final igh f(Function1 function1) {
        return this.e.m(Integer.valueOf(this.c), this.h, function1, 0, null);
    }

    @Override // defpackage.zfh
    public final void h(pd9 pd9Var) {
        String[] strArr = this.d;
        this.e.h((String[]) Arrays.copyOf(strArr, strArr.length), pd9Var);
    }

    @Override // defpackage.zfh
    public final void i(pd9 pd9Var) {
        String[] strArr = this.d;
        this.e.p((String[]) Arrays.copyOf(strArr, strArr.length), pd9Var);
    }

    public final String toString() {
        return this.f + ':' + this.g;
    }
}
