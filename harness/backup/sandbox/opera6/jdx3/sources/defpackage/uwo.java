package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class uwo extends kuk implements Function2 {
    public byte A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Context C;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public boolean x;
    public boolean y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwo(Context context, mt5 mt5Var) {
        super(2, mt5Var);
        this.C = context;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        uwo uwoVar = new uwo(this.C, mt5Var);
        uwoVar.B = obj;
        return uwoVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
