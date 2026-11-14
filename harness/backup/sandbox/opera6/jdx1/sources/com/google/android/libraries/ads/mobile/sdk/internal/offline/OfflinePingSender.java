package com.google.android.libraries.ads.mobile.sdk.internal.offline;

import ads_mobile_sdk.bc;
import ads_mobile_sdk.bt;
import ads_mobile_sdk.h0;
import ads_mobile_sdk.i41;
import ads_mobile_sdk.j42;
import ads_mobile_sdk.l42;
import ads_mobile_sdk.nj0;
import ads_mobile_sdk.ob1;
import ads_mobile_sdk.p30;
import ads_mobile_sdk.q42;
import ads_mobile_sdk.qw;
import ads_mobile_sdk.ru0;
import ads_mobile_sdk.sb0;
import android.content.Context;
import android.os.Bundle;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.cs5;
import defpackage.cwh;
import defpackage.hlo;
import defpackage.na2;
import defpackage.sgb;
import defpackage.tso;
import defpackage.udj;
import defpackage.wic;
import defpackage.x7d;
import defpackage.xgp;
import defpackage.yic;
import defpackage.yvh;
import defpackage.zic;
import defpackage.zvh;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/internal/offline/OfflinePingSender;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OfflinePingSender extends Worker {
    public OfflinePingSender(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zic c() {
        byte b = 20;
        byte b2 = 3;
        mt5 mt5Var = null;
        try {
            xgp.a.getClass();
            j42 j42Var = (j42) ((sb0) ru0.a()).Y2.get();
            j42Var.getClass();
            na2.B(j42Var.a, null, null, new k54(j42Var, new udj(b, mt5Var, j42Var), (mt5) null), 3);
        } catch (Exception unused) {
            Object obj = this.b.b.a.get("OFFLINE_DATABASE_VERSION");
            int iIntValue = ((Number) (obj instanceof Integer ? obj : 1)).intValue();
            Object obj2 = this.b.b.a.get("HTTP_CLIENT_TIMEOUT");
            long jLongValue = ((Number) (obj2 instanceof Long ? obj2 : 20L)).longValue();
            Object obj3 = this.b.b.a.get("USER_AGENT");
            String str = obj3 instanceof String ? (String) obj3 : null;
            if (str == null) {
                return new wic();
            }
            Bundle bundle = new Bundle();
            awh awhVar = awh.a;
            bwh bwhVar = bwh.a;
            x77 x77Var = new x77("offline-ping-sender", new cwh(yvh.b, j95.d(new String[]{"B3EEABB8EE11C2BE770B684D95219ECB"}), zvh.b), bundle, false, (byte) 17);
            i41 i41Var = new i41();
            i41Var.a = x77Var;
            qw qwVar = new qw(i41Var);
            a64 a64VarB = sgb.b(new jg8(qwVar.d));
            q42 q42Var = new q42(str);
            on7 on7Var = pn7.b;
            cs5.y0(jLongValue, un7.d);
            Context context = this.a;
            new jg8(qwVar.d);
            l42 l42Var = new l42(new p30(a64VarB, null, qwVar, q42Var, context, null, null, null));
            Context context2 = this.a;
            context2.getClass();
            Integer numValueOf = Integer.valueOf(iIntValue);
            Long lValueOf = Long.valueOf(jLongValue);
            ob1 ob1VarA = ob1.a(context2);
            ob1 ob1VarA2 = ob1.a(a64VarB);
            ob1 ob1VarA3 = ob1.a(numValueOf);
            j42 j42Var2 = (j42) new nj0(new h0((tso) ob1VarA, (tso) ob1VarA2, (hlo) ob1VarA3, (tso) new nj0(x7d.j), (tso) new nj0(new bt(ob1VarA, ob1VarA3, ob1.a(lValueOf), ob1.a(q42Var))), (tso) new nj0(new bc(ob1VarA2, ob1.a(l42Var), b2)))).get();
            j42Var2.getClass();
            na2.B(j42Var2.a, null, null, new k54(j42Var2, new udj(b, mt5Var, j42Var2), (mt5) null), 3);
        }
        return new yic();
    }
}
