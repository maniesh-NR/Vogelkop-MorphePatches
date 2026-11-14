package ads_mobile_sdk;

import defpackage.cs5;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class qw {
    public static final long j;
    public static final /* synthetic */ int k = 0;
    public final i41 a;
    public final ji b;
    public final s9e c;
    public final s9e d;
    public final ji e;
    public final s9e f;
    public final ji g;
    public final s9e h;
    public final s9e i;

    static {
        on7 on7Var = pn7.b;
        j = cs5.x0(10, un7.e);
    }

    public qw(i41 i41Var) {
        this.a = i41Var;
        int iMax = Math.max(2, Math.min(10, Runtime.getRuntime().availableProcessors()));
        long j2 = j;
        ji jiVarA = nw.a(iMax, j2, "BG");
        this.b = jiVarA;
        s9e s9eVar = new s9e((ThreadPoolExecutor) jiVarA.a);
        this.c = s9eVar;
        this.d = s9eVar;
        ji jiVarA2 = nw.a(Math.max(2, Math.min(5, Runtime.getRuntime().availableProcessors())), j2, "Load");
        this.e = jiVarA2;
        this.f = new s9e((ThreadPoolExecutor) jiVarA2.a);
        ji jiVarA3 = nw.a(Math.max(2, Math.min(5, Runtime.getRuntime().availableProcessors())), j2, "WebViewInit");
        this.g = jiVarA3;
        s9e s9eVar2 = new s9e((ThreadPoolExecutor) jiVarA3.a);
        this.h = s9eVar2;
        this.i = s9eVar2;
    }
}
