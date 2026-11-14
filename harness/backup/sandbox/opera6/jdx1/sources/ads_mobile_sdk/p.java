package ads_mobile_sdk;

import android.webkit.WebView;
import defpackage.puo;
import defpackage.vzo;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p implements vzo {
    public static final p f = new p(new puo((byte) 1));
    public Date b;
    public boolean c;
    public final puo d;
    public boolean e;

    public p(puo puoVar) {
        this.d = puoVar;
    }

    @Override // defpackage.vzo
    public final void a(boolean z) throws JSONException {
        if (!this.e && z) {
            Date date = new Date();
            Date date2 = this.b;
            if (date2 == null || date.after(date2)) {
                this.b = date;
                if (this.c) {
                    Iterator it = Collections.unmodifiableCollection(r6.c.b).iterator();
                    while (it.hasNext()) {
                        s6 s6Var = ((q6) it.next()).d;
                        Date date3 = this.b;
                        Date date4 = date3 != null ? (Date) date3.clone() : null;
                        s6Var.getClass();
                        if (date4 != null) {
                            JSONObject jSONObject = new JSONObject();
                            v62.a(jSONObject, "timestamp", Long.valueOf(date4.getTime()));
                            bw2.a$1.a((WebView) s6Var.b.get(), "setLastActivity", jSONObject);
                        }
                    }
                }
            }
        }
        this.e = z;
    }
}
