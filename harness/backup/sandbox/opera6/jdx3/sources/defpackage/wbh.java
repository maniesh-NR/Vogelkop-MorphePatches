package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class wbh implements qyl {
    public final Context a;
    public final orm b;
    public final skm c;
    public final s0f d;
    public int e;
    public String f;
    public String g;
    public final byte h;
    public final boolean i;
    public final int j;
    public String k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    public wbh(Context context, orm ormVar, skm skmVar, Bundle bundle, s0f s0fVar) {
        this.a = context;
        this.b = ormVar;
        this.c = skmVar;
        this.d = s0fVar;
        if (s0fVar != null) {
            bundle.putInt("notification_type", v0g.f(p()));
            Bundle bundle2 = s0fVar.b;
            if (bundle2 == null) {
                s0fVar.b = bundle;
            } else {
                bundle2.putAll(bundle);
            }
        }
        if (!bundle.containsKey("origin")) {
            throw new djb("origin");
        }
        int i = bundle.getInt("origin", -1);
        if (i == 1) {
            this.h = (byte) 1;
        } else if (i == 4) {
            this.h = (byte) 4;
        } else if (i == 5) {
            this.h = (byte) 5;
        } else {
            if (i != 6) {
                throw new djb("origin", null);
            }
            this.h = (byte) 6;
        }
        this.e = bundle.getInt("id", (int) SystemClock.uptimeMillis());
        this.f = r(bundle);
        this.g = q(bundle);
        this.j = bundle.getInt("visibility", 1);
        this.m = bundle.getBoolean("enable_sound", false);
        this.n = bundle.getBoolean("enable_vibration", false);
        this.o = bundle.getBoolean("enable_lights", false);
        this.p = bundle.getBoolean("force_heads_up", false);
        int i2 = bundle.getInt("show_state", 0);
        if (i2 == 0) {
            this.i = false;
        } else {
            if (i2 != 1) {
                throw new djb("show_state", null);
            }
            this.i = true;
        }
        this.k = bundle.getString("tracking_id", "");
        this.l = bundle.getString("rule_id", "");
        this.q = bundle.getBoolean("report_stats", true);
    }

    public static int m(Context context, String str) {
        NotificationChannelGroup notificationChannelGroup;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (!notificationManager.areNotificationsEnabled()) {
            return 0;
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel == null) {
            return -1;
        }
        String group = notificationChannel.getGroup();
        if (group != null) {
            try {
                notificationChannelGroup = notificationManager.getNotificationChannelGroup(group);
            } catch (Exception unused) {
            }
            boolean zIsBlocked = notificationChannelGroup != null ? notificationChannelGroup.isBlocked() : false;
            if (zIsBlocked) {
                return 0;
            }
        }
        return notificationChannel.getImportance() == 0 ? 0 : 1;
    }

    public void a() {
    }

    @Override // defpackage.qyl
    public final yn0 c() {
        byte b = this.h;
        return b != 1 ? b != 4 ? b != 5 ? b != 6 ? yn0.h : yn0.o : yn0.n : yn0.m : yn0.f;
    }

    public ua7 d() {
        int i = 2;
        int i2 = (this.m ? 1 : 0) | (this.n ? 2 : 0) | (this.o ? 4 : 0);
        if (this.p) {
            i2 |= 2;
        } else {
            i = 0;
        }
        ua7 ua7VarT = zi4.t(l(), new cm(o(), this.e, (byte) 5));
        l1f l1fVar = (l1f) ua7VarT.b;
        ua7VarT.S(2131231763);
        l1fVar.z = this.j;
        l1fVar.h(8, true);
        l1fVar.d(true);
        l1fVar.g(i2);
        l1fVar.j = i;
        ua7VarT.P(this.f);
        ua7VarT.O(this.g);
        s0f s0fVar = this.d;
        if (s0fVar != null) {
            ua7VarT.N(s0fVar.d(this.a));
        }
        w1f w1fVarN = n();
        if (w1fVarN != null) {
            l1fVar.r = w1fVarN.b;
        }
        return ua7VarT;
    }

    @Override // defpackage.qyl
    public final boolean e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof wbh) && ((wbh) obj).e == this.e;
    }

    @Override // defpackage.qyl
    public final String f() {
        return this.k;
    }

    @Override // defpackage.qyl
    public final boolean g() {
        return this.o;
    }

    @Override // defpackage.qyl
    public final boolean h() {
        return this.m;
    }

    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.qyl
    public final boolean j() {
        return this.p;
    }

    public i16 k() {
        return d().l();
    }

    public String l() {
        return "livescore";
    }

    public w1f n() {
        return null;
    }

    public String o() {
        return "live_score";
    }

    public int p() {
        return 3;
    }

    public String q(Bundle bundle) {
        return bundle.getString("text", "");
    }

    public String r(Bundle bundle) {
        return bundle.getString("title", "");
    }

    public void s(long j, boolean z) {
        Uri uriF;
        if (this.q) {
            ((x5f) this.b).q0(this, z, j);
            s0f s0fVar = this.d;
            if (s0fVar == null || (uriF = s0fVar.f(this.a)) == null) {
                return;
            }
            ((x5f) this.c).o0(f(), uriF, sj0.b, xn0.b);
        }
    }

    public final void t(vn0 vn0Var) {
        if (this.q) {
            ((x5f) this.b).r0(this, vn0Var);
        }
    }

    public void u() {
        Uri uriF;
        if (this.q) {
            x5f x5fVar = (x5f) this.b;
            boolean z = x5fVar.h;
            xn0 xn0Var = xn0.d;
            if (z) {
                x5fVar.V0(x5fVar.b(this, xn0Var, true));
            }
            s0f s0fVar = this.d;
            if (s0fVar == null || (uriF = s0fVar.f(this.a)) == null) {
                return;
            }
            ((x5f) this.c).o0(f(), uriF, sj0.b, xn0Var);
        }
    }

    public void v(boolean z) {
        Uri uriF;
        if (this.q) {
            ((x5f) this.b).s0(this, z);
            s0f s0fVar = this.d;
            if (s0fVar == null || (uriF = s0fVar.f(this.a)) == null) {
                return;
            }
            ((x5f) this.c).o0(f(), uriF, sj0.b, xn0.f);
        }
    }

    public abstract boolean w();
}
