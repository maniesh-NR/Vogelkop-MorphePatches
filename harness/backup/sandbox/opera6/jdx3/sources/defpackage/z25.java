package defpackage;

import J.N;
import com.opera.api.Callback;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z25 extends r25 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z25(byte b) {
        super("Tabs", new rxh(2132021331), new rxh(2132021332), 2131232274, a35.c);
        this.f = b;
        switch (b) {
            case 1:
                super("SiteSettings", new rxh(2132021562), new rxh(2132021563), 2131232243, a35.h);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.r25
    public final void a(s25 s25Var, Runnable runnable) {
        switch (this.f) {
            case 0:
                s25Var.d.j();
                runnable.run();
                break;
            default:
                z zVar = new z(runnable);
                j14.t(false, zVar.b());
                j14.t(true, zVar.b());
                N.MgUu3OWK();
                vl8.b.a.clear();
                Iterator it = hj.a(3).iterator();
                while (it.hasNext()) {
                    hj.b(0, 3, (String) it.next(), false);
                }
                N.MqE$051l();
                s25Var.a.getSharedPreferences("open_in_app_count", 0).edit().clear().apply();
                zVar.e();
                break;
        }
    }

    @Override // defpackage.r25
    public final void c(s25 s25Var, Callback callback) {
        switch (this.f) {
            case 0:
                int size = s25Var.d.b.size();
                ((iu2) callback).run(s25Var.a.getResources().getQuantityString(2131886113, size, Integer.valueOf(size)));
                break;
            default:
                HashSet hashSet = new HashSet();
                hashSet.addAll(s9g.h.i(false));
                hashSet.addAll(s9g.h.i(true));
                hashSet.addAll(Arrays.asList((String[]) N.M9qRRZZC()));
                int size2 = hj.a(3).size() + hashSet.size();
                ((iu2) callback).run(size2 == 0 ? s25Var.a.getString(2132021337) : s25Var.a.getResources().getQuantityString(2131886111, size2, Integer.valueOf(size2)));
                break;
        }
    }
}
