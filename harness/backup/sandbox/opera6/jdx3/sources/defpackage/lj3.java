package defpackage;

import android.net.Uri;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class lj3 {
    public static final long f;
    public final tcl a;
    public final tm5 b;
    public final uu1 c;
    public final t9f d;
    public final ArrayList e;

    static {
        on7 on7Var = pn7.b;
        f = cs5.x0(60, un7.e);
    }

    public lj3(tcl tclVar, t9f t9fVar, tm5 tm5Var, uu1 uu1Var) {
        this.a = tclVar;
        this.b = tm5Var;
        this.c = uu1Var;
        s9f s9fVarB = t9fVar.b();
        on7 on7Var = pn7.b;
        un7 un7Var = un7.e;
        long j = f;
        long millis = Duration.ofSeconds(pn7.p(j, un7Var), pn7.h(j)).toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        s9fVarB.a(millis, timeUnit);
        s9fVarB.b(Duration.ofSeconds(pn7.p(j, un7Var), pn7.h(j)).toMillis(), timeUnit);
        this.d = new t9f(s9fVarB);
        this.e = new ArrayList();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lv0 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059 A[Catch: all -> 0x005d, TryCatch #6 {all -> 0x005d, blocks: (B:3:0x0029, B:30:0x0059, B:31:0x005c, B:27:0x0053, B:24:0x004e, B:21:0x004a, B:13:0x003b, B:4:0x002b, B:10:0x0036), top: B:69:0x0029, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #6 {all -> 0x005d, blocks: (B:3:0x0029, B:30:0x0059, B:31:0x005c, B:27:0x0053, B:24:0x004e, B:21:0x004a, B:13:0x003b, B:4:0x002b, B:10:0x0036), top: B:69:0x0029, inners: #0, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File b(java.io.InputStream r8, java.lang.String r9, java.io.File r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj3.b(java.io.InputStream, java.lang.String, java.io.File):java.io.File");
    }

    public final void a(Uri uri, String str, wx wxVar) {
        Unit unit = Unit.a;
        pml pmlVar = new pml(new ra(new f9((Object) this, (Object) uri, (Object) str, (byte) 15), (byte) 17), (byte) 1);
        tcl tclVar = this.a;
        nml nmlVarG = ((umi) tclVar).g(pmlVar);
        new plk(tclVar, nmlVarG, new eyi(unit, nmlVarG), (Object) null).t(new t02(wxVar, (byte) 29)).l();
    }
}
