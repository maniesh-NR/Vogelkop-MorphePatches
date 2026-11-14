package defpackage;

import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.Charsets;
import okhttp3.internal._CacheControlCommonKt;

/* loaded from: classes.dex */
public final class vqi {
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final shf a;
    public final sqi b;
    public final pqi c;
    public final ghf d;
    public final uqi e;
    public final ode f = new ode();

    static {
        on7 on7Var = pn7.b;
        g = cs5.x0(24, un7.g);
    }

    public vqi(shf shfVar, sqi sqiVar, pqi pqiVar, final ghf ghfVar, uqi uqiVar) {
        this.a = shfVar;
        this.b = sqiVar;
        this.c = pqiVar;
        this.d = ghfVar;
        this.e = uqiVar;
        final byte b = 0;
        ((qie) ghfVar.d).n(((umi) ghfVar.c).e(new n5o() { // from class: hqi
            public final Object g(Object obj) {
                byte b2 = b;
                ghf ghfVar2 = ghfVar;
                switch (b2) {
                    case 0:
                        try {
                            return new String(s29.h(new File((File) ghfVar2.b, "sdx_json_data")), Charsets.UTF_8);
                        } catch (IOException unused) {
                            return null;
                        }
                    default:
                        File file = new File((File) ghfVar2.b, "sdx_json_data");
                        if (file.exists()) {
                            file.delete();
                        }
                        return Unit.a;
                }
            }
        }).c(new r9g((Object) new rii(new tu(this, (byte) 8), this), (byte) 28)), null);
    }

    public final void a(jqi jqiVar, iqi iqiVar, String str, eof eofVar, mni mniVar, q2g q2gVar) {
        xbf xbfVar = new xbf((Object) eofVar, (Object) this, (Object) jqiVar, (Object) mniVar, (Object) str, (Object) q2gVar, (byte) 10);
        shf shfVar = this.a;
        na2.B((nx5) shfVar.a, (CoroutineContext) null, (rx5) null, new r71(shfVar, jqiVar, iqiVar, str, xbfVar, (mt5) null, (byte) 10), 3);
    }

    public final void b(jqi jqiVar, e74 e74Var, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = jqiVar.a();
        uqi uqiVar = this.e;
        j.c((SharedPreferences) uqiVar.a.get(), "cashed_request_hash", strA);
        b59 b59Var = uqiVar.a;
        j.c((SharedPreferences) b59Var.get(), "etag", str);
        if (e74Var.b) {
            ((SharedPreferences) b59Var.get()).edit().putString("cache_control", null).putLong("cache_control_time", jCurrentTimeMillis).apply();
        } else {
            ((SharedPreferences) b59Var.get()).edit().putString("cache_control", _CacheControlCommonKt.commonToString(e74Var)).putLong("cache_control_time", jCurrentTimeMillis).apply();
        }
    }
}
