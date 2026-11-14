package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vl9 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ vl9() {
        this.a = (byte) 27;
    }

    public vl9(j9i j9iVar) {
        this.a = (byte) 26;
        Objects.requireNonNull(j9iVar);
        this.b = j9iVar;
    }

    public /* synthetic */ vl9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ vl9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public final void a(Runnable runnable) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.b = arrayList;
        }
        arrayList.add(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0238  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl9.run():void");
    }
}
