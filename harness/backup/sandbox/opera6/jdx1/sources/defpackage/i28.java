package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class i28 implements h28 {
    public final String c;
    public final ygh d;
    public final boolean e;
    public final int f;
    public final LinkedHashMap g = new LinkedHashMap();

    public i28(String str, ygh yghVar) throws NumberFormatException {
        boolean z;
        int i;
        this.c = str;
        this.d = yghVar;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            z = false;
            i = -1;
        }
        this.e = z;
        this.f = i;
    }

    @Override // defpackage.h28
    public final boolean a(int i) {
        return this.e && b(i) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.h28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.j28 b(int r22) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i28.b(int):j28");
    }
}
