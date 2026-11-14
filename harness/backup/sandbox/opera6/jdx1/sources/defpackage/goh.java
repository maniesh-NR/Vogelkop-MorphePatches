package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class goh extends kuk implements cr9 {
    public tee A;
    public byte B;
    public /* synthetic */ d9e C;
    public final /* synthetic */ hoh D;
    public ArrayList t;
    public ArrayList u;
    public ArrayList v;
    public tee w;
    public tee x;
    public tee y;
    public kmi z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goh(hoh hohVar, mt5 mt5Var) {
        super(3, mt5Var);
        this.D = hohVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(defpackage.hoh r22, java.util.ArrayList r23, java.util.ArrayList r24, java.util.ArrayList r25, defpackage.tee r26, defpackage.tee r27, defpackage.tee r28, defpackage.tee r29) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goh.o(hoh, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, tee, tee, tee, tee):void");
    }

    public static final void p(ArrayList arrayList, hoh hohVar) {
        arrayList.clear();
        synchronized (hohVar.c) {
            ArrayList arrayList2 = hohVar.k;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add((uae) arrayList2.get(i));
            }
            hohVar.k.clear();
        }
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        goh gohVar = new goh(this.D, (mt5) obj3);
        gohVar.C = (d9e) obj2;
        gohVar.invokeSuspend(Unit.a);
        return px5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0096 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x011c -> B:42:0x0124). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0265 -> B:12:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
