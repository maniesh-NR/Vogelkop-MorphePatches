package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes.dex */
public class mse extends nse {
    public final SharedPreferences d;
    public long e;
    public long f;
    public final String g;

    public mse(SharedPreferences sharedPreferences, String str, int i, lse lseVar) {
        super(i, lseVar);
        this.d = sharedPreferences;
        this.g = str;
        String string = sharedPreferences.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            ((ArrayList) this.b).addAll(b(string));
            a();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.e = jElapsedRealtime;
            this.f = jElapsedRealtime;
        } catch (JSONException unused) {
        }
    }

    public final void e(Object obj) {
        ((ArrayList) this.b).add(obj);
        a();
        this.e = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r6, java.lang.String r8) {
        /*
            r5 = this;
            java.io.Serializable r0 = r5.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L28
            long r1 = r5.e
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L1f
            long r3 = r5.f
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L1f
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 < 0) goto L1f
            r0.clear()
            r6 = 1
            goto L29
        L1f:
            java.util.ArrayList r6 = r5.b(r8)     // Catch: org.json.JSONException -> L28
            boolean r6 = r5.c(r6)     // Catch: org.json.JSONException -> L28
            goto L29
        L28:
            r6 = 0
        L29:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L33
            r7 = 0
            r5.e = r7
        L33:
            if (r6 == 0) goto L38
            r5.g()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mse.f(long, java.lang.String):void");
    }

    public final void g() {
        String string;
        if (((ArrayList) this.b).isEmpty()) {
            string = null;
        } else {
            try {
                string = d().toString();
            } catch (JSONException unused) {
            }
        }
        this.d.edit().putString(this.g, string).apply();
        this.f = SystemClock.elapsedRealtime();
    }
}
