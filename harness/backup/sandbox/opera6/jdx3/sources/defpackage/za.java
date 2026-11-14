package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.CancellationSignal;
import com.appsflyer.internal.j;
import com.opera.android.oauth2.OAuth2Account;
import com.opera.api.Callback;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class za implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ za(Object obj, Object obj2, Object obj3, long j, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
        this.f = obj4;
    }

    public /* synthetic */ za(String str, String str2, long j, shf shfVar, eof eofVar) {
        this.a = (byte) 2;
        this.c = str;
        this.d = str2;
        this.b = j;
        this.e = shfVar;
        this.f = eofVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        long j = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                db dbVar = (db) obj5;
                Callback callback = (Callback) obj3;
                Runnable runnable = (Runnable) obj2;
                ehf ehfVar = (ehf) obj;
                if (!((CancellationSignal) obj4).isCanceled()) {
                    if (ehfVar != null) {
                        long j2 = dbVar.c.g;
                        if (!ehfVar.a.equals(j2 == 0 ? null : (String) N.MIPULsoq(j2))) {
                            callback.run("Outdated account info");
                            break;
                        } else if (!ehfVar.d) {
                            boolean z = ehfVar.c;
                            OAuth2Account oAuth2Account = dbVar.c;
                            if (z) {
                                oAuth2Account.d(null);
                                dbVar.c.a.c("full_name", null);
                                dbVar.c.a.c("display_name", null);
                            } else {
                                oAuth2Account.d(ehfVar.b);
                                dbVar.c.a.c("full_name", ehfVar.g);
                                dbVar.c.a.c("display_name", ehfVar.h);
                            }
                            dbVar.c.a.c("profile_picture", ehfVar.i);
                            dbVar.c.e(ehfVar.e);
                            dbVar.c.c(ehfVar.f);
                            j.d((SharedPreferences) dbVar.c.a.a.get(), "has_default_profile_picture", ehfVar.j);
                            j.d((SharedPreferences) dbVar.c.a.a.get(), "has_2fa", ehfVar.k);
                            ((SharedPreferences) dbVar.b.get()).edit().putLong("last_account_update_timestamp", j).apply();
                            h7f h7fVar = dbVar.e;
                            g7f g7fVarH = am2.h(h7fVar, h7fVar);
                            while (g7fVarH.hasNext()) {
                                ((cb) g7fVarH.next()).f();
                            }
                            runnable.run();
                            break;
                        } else {
                            dbVar.j(true);
                            callback.run("Account deleted");
                            break;
                        }
                    } else {
                        callback.run("Account info request failed");
                        break;
                    }
                }
                break;
            case 1:
                ((dnn) obj).a(new ypd((afe) obj5, (Map) obj4, (xkn) obj3, this.b, (Integer) obj2));
                break;
            default:
                String str = (String) obj5;
                String str2 = (String) obj4;
                shf shfVar = (shf) obj3;
                eof eofVar = (eof) obj2;
                fvh fvhVar = new fvh();
                String string = ((Uri) obj).toString();
                rma rmaVar = new rma((byte) 4);
                rmaVar.o(string, null);
                hra hraVarI = rmaVar.d().i("api/v1/vpn/extend/");
                if (hraVarI == null) {
                    qp2.o("Required value was null.");
                    break;
                } else {
                    fvhVar.a = hraVarI;
                    fvhVar.d("Authorization", "Bearer " + str);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("subscription_id", orb.t(str2));
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        try {
                            jSONObject.put("known_expires_at", orb.t(simpleDateFormat.format(new Date(j))));
                            qvh qvhVar = rvh.Companion;
                            String string2 = jSONObject.toString();
                            Regex regex = esd.e;
                            esd esdVarX = wyh.x("application/json");
                            qvhVar.getClass();
                            fvhVar.f(qvh.b(string2, esdVarX));
                            ((t9f) ((ii) shfVar.c).get()).c(new kvh(fvhVar)).enqueue(new oji(new b94((umi) shfVar.b, eofVar, (byte) 0)));
                            break;
                        } catch (JSONException e) {
                            t3p.n(e);
                            return;
                        }
                    } catch (JSONException e2) {
                        t3p.n(e2);
                        return;
                    }
                }
        }
    }
}
