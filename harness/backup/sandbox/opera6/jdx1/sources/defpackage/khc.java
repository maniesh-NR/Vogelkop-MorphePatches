package defpackage;

/* loaded from: classes.dex */
public final class khc {
    public static gfb a(long j, Object obj) {
        gfb gfbVar = (gfb) hnm.i(obj, j);
        if (((o6) gfbVar).a) {
            return gfbVar;
        }
        int size = gfbVar.size();
        b7h b7hVarD = ((b7h) gfbVar).d(size == 0 ? 10 : size << 1);
        hnm.p(obj, j, b7hVarD);
        return b7hVarD;
    }
}
