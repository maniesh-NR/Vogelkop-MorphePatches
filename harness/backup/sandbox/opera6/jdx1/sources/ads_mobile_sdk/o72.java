package ads_mobile_sdk;

import defpackage.pqh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o72 extends kuk implements Function2 {
    public Object a;
    public Object b;
    public pfe c;
    public b82 d;
    public byte e;
    public final /* synthetic */ pqh f;
    public final /* synthetic */ b82 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ pqh i;
    public final /* synthetic */ z31 j;
    public final /* synthetic */ pqh k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o72(pqh pqhVar, b82 b82Var, String str, pqh pqhVar2, z31 z31Var, pqh pqhVar3, boolean z, mt5 mt5Var) {
        super(2, mt5Var);
        this.f = pqhVar;
        this.g = b82Var;
        this.h = str;
        this.i = pqhVar2;
        this.j = z31Var;
        this.k = pqhVar3;
        this.l = z;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new o72(this.f, this.g, this.h, this.i, this.j, this.k, this.l, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r10.i(r16) != r11) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.o72.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
