package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class h5f implements Function1 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ short b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ubk d;

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public /* synthetic */ h5f(hd hdVar, long j, boolean z) {
        this.d = hdVar;
        this.b = (int) j;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public /* synthetic */ h5f(hd hdVar, long j, boolean z, byte b) {
        this.d = hdVar;
        this.b = (int) j;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public /* synthetic */ h5f(osf osfVar, long j, boolean z) {
        this.d = osfVar;
        this.b = (int) j;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public /* synthetic */ h5f(wsf wsfVar, long j, boolean z) {
        this.d = wsfVar;
        this.b = (int) j;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public /* synthetic */ h5f(x5f x5fVar, long j, boolean z) {
        this.d = x5fVar;
        this.b = (int) j;
        this.c = z;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        short s = this.b;
        ubk ubkVar = this.d;
        switch (b) {
            case 0:
                ((x5f) ubkVar).g.P(s, z);
                break;
            case 1:
                ((osf) ubkVar).c.P(s, z);
                break;
            case 2:
                ((shf) ((hd) ubkVar).e).P(s, z);
                break;
            case 3:
                ((wsf) ubkVar).c.P(s, z);
                break;
            default:
                ((shf) ((hd) ubkVar).e).P(s, z);
                break;
        }
        return Unit.a;
    }
}
