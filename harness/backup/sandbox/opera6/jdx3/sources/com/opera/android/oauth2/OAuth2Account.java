package com.opera.android.oauth2;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import com.opera.android.OperaApplication;
import defpackage.ahf;
import defpackage.cb;
import defpackage.db;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.j42;
import defpackage.jh0;
import defpackage.rb;
import defpackage.yqa;
import defpackage.zwk;

/* loaded from: classes.dex */
public final class OAuth2Account {
    public final rb a;
    public final yqa b;
    public final zwk f;
    public boolean h;
    public final OperaAccessTokenProvider c = new OperaAccessTokenProvider("social_accounts", OperaAccessTokenProvider.a(0), null, null, null);
    public final OperaAccessTokenProvider d = new OperaAccessTokenProvider("subscriptions", OperaAccessTokenProvider.a(1), null, null, null);
    public final OperaAccessTokenProvider e = new OperaAccessTokenProvider("ai_assistant", OperaAccessTokenProvider.a(2), null, null, null);
    public long g = N.M6Ded1KR(this);

    public OAuth2Account(rb rbVar, zwk zwkVar, yqa yqaVar) {
        this.a = rbVar;
        this.b = yqaVar;
        this.f = zwkVar;
    }

    public final void a(int i, ahf ahfVar) {
        OperaAccessTokenProvider operaAccessTokenProvider;
        if (!b()) {
            ahfVar.b();
            return;
        }
        if (i == 0) {
            operaAccessTokenProvider = this.c;
        } else if (i == 1) {
            operaAccessTokenProvider = this.d;
        } else {
            if (i != 2) {
                hai.d();
                return;
            }
            operaAccessTokenProvider = this.e;
        }
        operaAccessTokenProvider.b(new j42(this, ahfVar));
    }

    public final boolean b() {
        long j = this.g;
        return j != 0 && N.MXn7xpDo(j);
    }

    public final void c(boolean z) {
        j.d((SharedPreferences) this.a.a.get(), "pending", z);
    }

    public final void d(String str) {
        this.a.c("pun_1", str);
    }

    public final void e(boolean z) {
        j.d((SharedPreferences) this.a.a.get(), "verified", z);
    }

    public final void f(boolean z, boolean z2) {
        if (z) {
            d(null);
            rb rbVar = this.a;
            rbVar.c("full_name", null);
            rbVar.c("display_name", null);
            rbVar.c("profile_picture", null);
            j.d((SharedPreferences) rbVar.a.get(), "has_default_profile_picture", false);
            j.d((SharedPreferences) rbVar.a.get(), "has_2fa", false);
            ((SharedPreferences) rbVar.a.get()).edit().remove("verified").apply();
            c(false);
        }
        if (z2) {
            N.MMjOJmyf((Object) null, new rl(this, (byte) 23));
        }
        if (z) {
            long j = this.g;
            if (j != 0) {
                this.h = true;
                N.MLbdWsOM(j);
                this.h = false;
            }
        }
        this.f.getClass();
        N.M3muZ2vl();
        yqa yqaVar = this.b;
        Context context = (Context) yqaVar.b;
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).L().c.b0(jh0.b);
        db dbVar = (db) yqaVar.c;
        j.a((SharedPreferences) dbVar.b.get(), "account_type");
        h7f h7fVar = dbVar.e;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((cb) g7fVarH.next()).d(z);
        }
    }

    public final void onDestroy() {
        this.g = 0L;
    }

    public final void onSignedOut() {
        if (this.h) {
            return;
        }
        f(false, false);
    }
}
