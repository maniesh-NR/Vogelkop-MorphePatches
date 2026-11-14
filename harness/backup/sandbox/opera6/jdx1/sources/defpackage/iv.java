package defpackage;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class iv implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ iv() {
        this.a = (byte) 10;
    }

    public iv(ami amiVar) {
        this.a = (byte) 14;
        this.d = amiVar;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public iv(bl9 bl9Var, mn9 mn9Var, Fragment fragment) {
        this.a = (byte) 6;
        this.b = mn9Var;
        this.c = fragment;
        Objects.requireNonNull(bl9Var);
        this.d = bl9Var;
    }

    public /* synthetic */ iv(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    public /* synthetic */ iv(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ iv(Object obj, Runnable runnable, byte b) {
        this.a = b;
        this.b = obj;
        this.c = runnable;
    }

    public iv(tuj tujVar) {
        this.a = (byte) 15;
        this.d = tujVar;
        this.c = new ArrayList();
        this.b = new ArrayList();
    }

    public iv(tuj tujVar, byte b) {
        this.a = (byte) 16;
        this.d = tujVar;
        this.c = new ArrayList();
        this.b = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0301 A[Catch: Exception -> 0x0307, TRY_LEAVE, TryCatch #16 {Exception -> 0x0307, blocks: (B:125:0x0301, B:122:0x02fc, B:121:0x02f9, B:118:0x02f4), top: B:361:0x017d, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x02f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:457:? A[Catch: Exception -> 0x0307, SYNTHETIC, TryCatch #16 {Exception -> 0x0307, blocks: (B:125:0x0301, B:122:0x02fc, B:121:0x02f9, B:118:0x02f4), top: B:361:0x017d, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:459:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025f  */
    /* JADX WARN: Type inference failed for: r24v0, types: [iv, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v2, types: [int] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv.run():void");
    }
}
