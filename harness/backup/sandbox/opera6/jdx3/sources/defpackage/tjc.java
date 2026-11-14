package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import com.leanplum.internal.Constants;
import com.opera.api.Callback;
import java.net.URI;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class tjc implements t3g {
    public final umi a;
    public final fx0 b;
    public final Context c;
    public final n9h d;
    public final ArrayList e;
    public final qie f;
    public boolean g;
    public g0d h;

    public tjc(ContextWrapper contextWrapper, umi umiVar, fx0 fx0Var) {
        this.a = umiVar;
        this.b = fx0Var;
        Context applicationContext = contextWrapper.getApplicationContext();
        this.c = applicationContext;
        n9h n9hVar = new n9h(applicationContext);
        this.d = n9hVar;
        this.e = new ArrayList();
        this.f = new qie((byte) 19);
        na2.g((a64) n9hVar.b, (CoroutineContext) null, (rx5) null, new bz1((byte) 25, null, n9hVar), 3);
        new rml(Unit.a, umiVar).b(new rjc(this, (byte) 0)).t(new rjc(this, (byte) 2)).l();
    }

    @Override // defpackage.t3g
    public final void a(q3g q3gVar, tu tuVar) {
        if (this.g) {
            new rml(Unit.a, this.a).a(new yo7((Object) this, (Object) q3gVar, (Object) tuVar, (byte) 13)).m(this.f);
        } else {
            this.e.add(new hv((Object) this, (Object) q3gVar, (Object) tuVar, (byte) 20));
        }
    }

    @Override // defpackage.t3g
    public final void b(s3g s3gVar, ve9 ve9Var) {
        if (this.g) {
            new rml(Unit.a, this.a).a(new yo7((Object) this, (Object) s3gVar, (Object) ve9Var, (byte) 12)).m(this.f);
        } else {
            this.e.add(new hv((Object) this, (Object) s3gVar, (Object) ve9Var, (byte) 19));
        }
    }

    @Override // defpackage.t3g
    public final void c(s3g s3gVar, su suVar) {
        hv hvVar = new hv((Object) this, (Object) s3gVar, (Object) suVar, (byte) 21);
        if (this.g) {
            new rml(Unit.a, this.a).a(new nna(hvVar, (byte) 26)).m(this.f);
        } else {
            this.e.add(hvVar);
        }
    }

    @Override // defpackage.t3g
    public final void d(r3g r3gVar, hu5 hu5Var) {
        if (this.g) {
            new rml(Unit.a, this.a).a(new yo7((Object) this, (Object) r3gVar, (Object) hu5Var, (byte) 14)).m(this.f);
        } else {
            this.e.add(new hv((Object) this, (Object) r3gVar, (Object) hu5Var, (byte) 22));
        }
    }

    public final void e(String str, String str2, boolean z, Callback callback) {
        v3g v3gVar;
        g0d g0dVar = this.h;
        v3g v3gVar2 = null;
        if (g0dVar != null) {
            if (str == null) {
                str = "";
            }
            SQLiteDatabase sQLiteDatabase = g0dVar.c;
            h58 h58Var = szc.c;
            ArrayList arrayList = new ArrayList(k95.o(h58Var, 10));
            Iterator it = h58Var.iterator();
            while (it.hasNext()) {
                arrayList.add(((szc) it.next()).a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            szc[] szcVarArr = szc.b;
            Cursor cursorQuery = sQLiteDatabase.query("logins", strArr, "signon_realm == ? AND username_value == ? ", new String[]{str2, str}, null, null, null);
            try {
                y9m y9mVarM = g0dVar.m(cursorQuery, z);
                if (y9mVarM instanceof b0d) {
                    ehc ehcVar = ((b0d) y9mVarM).q;
                    v3gVar = (v3g) (ehcVar.size() == 1 ? ehcVar.get(0) : null);
                } else {
                    v3gVar = null;
                }
                vtp.v(cursorQuery, (Throwable) null);
                v3gVar2 = v3gVar;
            } finally {
            }
        }
        new rml(v3gVar2, this.a).c(new ry7(callback, this, (byte) 28)).l();
    }

    public final void f(q3g q3gVar, tu tuVar) {
        ehc<v3g> ehcVar;
        boolean zA;
        String strV;
        String str = q3gVar.c;
        g0d g0dVar = this.h;
        int i = 0;
        if (g0dVar != null) {
            SQLiteDatabase sQLiteDatabase = g0dVar.c;
            h58 h58Var = szc.c;
            ArrayList arrayList = new ArrayList(k95.o(h58Var, 10));
            Iterator it = h58Var.iterator();
            while (it.hasNext()) {
                arrayList.add(((szc) it.next()).a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            szc[] szcVarArr = szc.b;
            Cursor cursorQuery = sQLiteDatabase.query("logins", strArr, "blacklisted_by_user == ?", new String[]{String.valueOf(0)}, null, null, "origin_url");
            try {
                y9m y9mVarM = g0dVar.m(cursorQuery, false);
                ehcVar = y9mVarM instanceof b0d ? ((b0d) y9mVarM).q : null;
                vtp.v(cursorQuery, (Throwable) null);
            } finally {
            }
        } else {
            ehcVar = null;
        }
        if (ehcVar == null) {
            ehcVar = l08.a;
        }
        for (v3g v3gVar : ehcVar) {
            if (c09.m(v3gVar.c).a() && (strV = ui6.v(v3gVar, "opera-app-name")) != null) {
                v3gVar.g = strV;
                String strV2 = ui6.v(v3gVar, "opera-app-icon");
                if (strV2 != null) {
                    v3gVar.h = strV2;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (Iterable) ehcVar) {
            v3g v3gVar2 = (v3g) obj;
            if (str != null || c.q(v3gVar2.c, "android", false)) {
                zA = Intrinsics.a(str, v3gVar2.c);
            } else {
                try {
                    URI uri = c.q(v3gVar2.c, "opera-user", false) ? q3gVar.b : q3gVar.a;
                    zA = Intrinsics.a(URI.create(v3gVar2.c).getAuthority(), uri != null ? uri.getAuthority() : null);
                } catch (IllegalArgumentException unused) {
                    zA = false;
                }
            }
            if (zA) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(k95.o(arrayList2, 10));
        int size = arrayList2.size();
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            arrayList3.add(i((v3g) obj2));
        }
        new rml(arrayList3, this.a).c(new nna(tuVar, (byte) 27)).l();
    }

    public final void g(s3g s3gVar) {
        Object rw7Var;
        Pair pair;
        String str = s3gVar.a;
        String str2 = s3gVar.c;
        if (str == null) {
            new cd6();
            return;
        }
        v3g v3gVar = new v3g(null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, false, null, 0, null, null, null, null, null, false, null, null, null, null, 0L, false, false, -1, 31);
        v3gVar.u = y3g.b;
        v3gVar.c = s3gVar.b;
        if (str2 != null) {
            v3gVar.d = str2;
            if (CollectionsKt.E(e82.E(new String[]{"http", "https"}), Uri.parse(v3gVar.d).getScheme())) {
                v3gVar.e = str2;
            }
        }
        v3gVar.k = str;
        v3gVar.n = s3gVar.e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        v3gVar.s = jCurrentTimeMillis;
        v3gVar.p = jCurrentTimeMillis;
        v3gVar.q = jCurrentTimeMillis;
        v3gVar.r = jCurrentTimeMillis;
        g0d g0dVar = this.h;
        if (g0dVar != null) {
            e0d e0dVarL = g0dVar.l(v3gVar);
            try {
                SQLiteDatabase sQLiteDatabase = g0dVar.c;
                szc[] szcVarArr = szc.b;
                pair = sQLiteDatabase.delete("logins", "origin_url == ? AND username_element == ? AND username_value == ? AND password_element == ? AND signon_realm == ?", new String[]{v3gVar.d, v3gVar.j, v3gVar.k, v3gVar.m, v3gVar.c}) == 0 ? new Pair(l08.a, f0d.b) : new Pair(Collections.singletonList(new d0d(v3g.a(v3gVar, Long.valueOf(e0dVarL.a), -2))), f0d.a);
            } catch (SQLiteException unused) {
                pair = new Pair(l08.a, f0d.c);
            }
            List list = (List) pair.a;
            if (((f0d) pair.b) == f0d.a) {
                boolean z = false;
                if (list.size() == 1 && (list.get(0) instanceof d0d)) {
                    z = true;
                }
                rw7Var = new sw7(Boolean.valueOf(z));
            } else {
                rw7Var = new rw7(new cd6());
            }
        } else {
            rw7Var = new rw7(new cd6());
        }
        new rml(rw7Var, this.a).c(new g8c((byte) 11)).l();
    }

    public final void h(s3g s3gVar, ve9 ve9Var) {
        Object rw7Var;
        Pair pair;
        boolean z;
        Key keyA;
        byte[] bArrU;
        boolean z2;
        boolean z3;
        v3g v3gVar = new v3g(null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, false, null, 0, null, null, null, null, null, false, null, null, null, null, 0L, false, false, -1, 31);
        v3gVar.u = y3g.b;
        v3gVar.c = s3gVar.b;
        String str = s3gVar.c;
        if (str != null) {
            v3gVar.d = str;
            if (CollectionsKt.E(e82.E(new String[]{"http", "https"}), Uri.parse(v3gVar.d).getScheme())) {
                v3gVar.e = str;
            }
        }
        String str2 = s3gVar.d;
        if (str2 != null) {
            v3gVar.k = str2;
        }
        v3gVar.n = s3gVar.e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        v3gVar.s = jCurrentTimeMillis;
        v3gVar.p = jCurrentTimeMillis;
        v3gVar.q = jCurrentTimeMillis;
        v3gVar.r = jCurrentTimeMillis;
        g0d g0dVar = this.h;
        if (g0dVar != null) {
            SQLiteDatabase sQLiteDatabase = g0dVar.c;
            if ((c09.m(v3gVar.c).a() || v3gVar.d.length() != 0) && v3gVar.c.length() != 0 && (v3gVar.d.length() <= 0 || Uri.parse(v3gVar.d).getScheme() != null)) {
                v3g v3gVarA = v3g.a(v3gVar, null, -1);
                String str3 = v3gVarA.n;
                phj zzcVar = yzc.t;
                vzc vzcVar = g0dVar.d;
                if (vzcVar != null && (keyA = vzcVar.get()) != null && (bArrU = wyh.u(str3, keyA)) != null) {
                    zzcVar = new zzc(bArrU);
                }
                if (zzcVar instanceof zzc) {
                    byte[] bArr = ((zzc) zzcVar).t;
                    ArrayList arrayList = new ArrayList();
                    ContentValues contentValues = new ContentValues(szc.c.d());
                    byte[] bArr2 = g0d.h;
                    contentValues.put("origin_url", v3gVarA.d);
                    contentValues.put("action_url", v3gVarA.e);
                    contentValues.put("username_element", v3gVarA.j);
                    contentValues.put("username_value", v3gVarA.k);
                    contentValues.put("password_element", v3gVarA.m);
                    contentValues.put("password_value", bArr);
                    byte[] bArr3 = v3gVarA.o;
                    if (bArr3 == null) {
                        bArr3 = new byte[0];
                    }
                    contentValues.put("keychain_identifier", bArr3);
                    contentValues.put("submit_element", v3gVarA.i);
                    contentValues.put("signon_realm", v3gVarA.c);
                    contentValues.put("date_created", Long.valueOf(v3gVarA.s));
                    contentValues.put("blacklisted_by_user", Boolean.valueOf(v3gVarA.t));
                    contentValues.put("scheme", Integer.valueOf(v3gVarA.b.ordinal()));
                    contentValues.put("password_type", Integer.valueOf(v3gVarA.u.ordinal()));
                    contentValues.put("times_used", Integer.valueOf(v3gVarA.v));
                    byte[] bArr4 = v3gVarA.w;
                    if (bArr4 == null) {
                        bArr4 = g0d.i;
                    }
                    contentValues.put("form_data", bArr4);
                    contentValues.put("display_name", v3gVarA.y);
                    contentValues.put(Constants.Keys.PUSH_MESSAGE_ICON_URL, v3gVarA.z);
                    contentValues.put("federation_url", v3gVarA.A);
                    contentValues.put("skip_zero_click", Boolean.valueOf(v3gVarA.B));
                    contentValues.put("generation_upload_status", Integer.valueOf(v3gVarA.x.ordinal()));
                    byte[] bArr5 = v3gVarA.l;
                    if (bArr5 == null) {
                        bArr5 = bArr2;
                    }
                    contentValues.put("possible_username_pairs", bArr5);
                    contentValues.put("date_last_used", Long.valueOf(v3gVarA.p));
                    byte[] bArr6 = v3gVarA.C;
                    if (bArr6 != null) {
                        bArr2 = bArr6;
                    }
                    contentValues.put("moving_blocked_for", bArr2);
                    contentValues.put("date_password_modified", Long.valueOf(v3gVarA.r));
                    contentValues.put("sender_email", v3gVarA.F);
                    contentValues.put("sender_name", v3gVarA.G);
                    contentValues.put("sender_profile_image_url", v3gVarA.H);
                    contentValues.put("date_received", Long.valueOf(v3gVarA.I));
                    contentValues.put("sharing_notification_displayed", Boolean.valueOf(v3gVarA.J));
                    contentValues.put("date_last_filled", Long.valueOf(v3gVarA.q));
                    contentValues.put("actor_login_approved", Boolean.valueOf(v3gVarA.K));
                    long jInsert = sQLiteDatabase.insert("logins", null, contentValues);
                    if (jInsert != -1) {
                        v3gVarA.a = Long.valueOf(jInsert);
                        g0dVar.n(jInsert, v3gVarA.E);
                        arrayList.add(new c0d(v3gVarA, false, false));
                        pair = new Pair(arrayList, rzc.a);
                    } else {
                        e0d e0dVarL = g0dVar.l(v3gVar);
                        boolean z4 = !Intrinsics.a(v3gVarA.n, e0dVarL.b);
                        long jReplace = sQLiteDatabase.replace("logins", null, contentValues);
                        if (jReplace != -1) {
                            v3g v3gVarA2 = v3g.a(v3gVarA, null, -1);
                            v3gVarA2.a = Long.valueOf(e0dVarL.a);
                            arrayList.add(new d0d(v3gVarA2));
                            v3gVarA.a = Long.valueOf(jReplace);
                            if (v3gVarA.D.isEmpty()) {
                                z = false;
                            } else {
                                Map map = v3gVarA.D;
                                Iterator it = map.entrySet().iterator();
                                z = false;
                                while (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    n9b n9bVar = (n9b) entry.getKey();
                                    o9b o9bVar = (o9b) entry.getValue();
                                    ContentValues contentValues2 = new ContentValues(tzc.c.d());
                                    Iterator it2 = it;
                                    contentValues2.put("parent_id", Long.valueOf(jReplace));
                                    contentValues2.put("insecurity_type", Integer.valueOf(n9bVar.ordinal()));
                                    contentValues2.put("create_time", Long.valueOf(o9bVar.a));
                                    contentValues2.put("is_muted", Boolean.valueOf(o9bVar.b));
                                    contentValues2.put("trigger_notification_from_backend", Boolean.valueOf(o9bVar.c));
                                    long jInsertWithOnConflict = sQLiteDatabase.insertWithOnConflict("insecure_credentials", null, contentValues2, 5);
                                    if (Build.VERSION.SDK_INT >= 35) {
                                        if (kg1.f(sQLiteDatabase) > 0) {
                                            it = it2;
                                            z = true;
                                        } else {
                                            it = it2;
                                        }
                                    } else if (jInsertWithOnConflict != -1) {
                                        it = it2;
                                        z = true;
                                    } else {
                                        it = it2;
                                    }
                                }
                                h58 h58Var = n9b.c;
                                w4 w4VarE = sko.e(h58Var, h58Var);
                                while (w4VarE.hasNext()) {
                                    n9b n9bVar2 = (n9b) w4VarE.next();
                                    if (!map.containsKey(n9bVar2)) {
                                        tzc[] tzcVarArr = tzc.b;
                                        if (sQLiteDatabase.delete("insecure_credentials", "parent_id == ? AND insecurity_type == ?", new String[]{String.valueOf(jReplace), String.valueOf(n9bVar2)}) > 0) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                            g0dVar.n(jReplace, v3gVarA.E);
                            arrayList.add(new c0d(v3gVarA, z4, z));
                            pair = new Pair(arrayList, rzc.a);
                        } else {
                            pair = new Pair(l08.a, rzc.d);
                        }
                    }
                } else {
                    pair = new Pair(l08.a, rzc.c);
                }
            } else {
                pair = new Pair(l08.a, rzc.b);
            }
            List list = (List) pair.a;
            if (((rzc) pair.b) == rzc.a) {
                if (list.size() == 1) {
                    z2 = false;
                    if (list.get(0) instanceof c0d) {
                        z3 = true;
                    }
                    rw7Var = new sw7(Boolean.valueOf(z3));
                } else {
                    z2 = false;
                }
                z3 = z2;
                rw7Var = new sw7(Boolean.valueOf(z3));
            } else {
                rw7Var = new rw7(new cd6());
            }
        } else {
            rw7Var = new rw7(new cd6());
        }
        new rml(rw7Var, this.a).c(new nna(ve9Var, (byte) 25)).l();
    }

    public final sjc i(v3g v3gVar) {
        String strC;
        String str = v3gVar.g;
        String strConcat = v3gVar.d;
        un8 un8VarM = c09.m(v3gVar.c);
        mt5 mt5Var = null;
        if (un8VarM.a()) {
            String str2 = "";
            if (un8VarM.a()) {
                Uri uri = un8VarM.a;
                String host = uri != null ? uri.getHost() : null;
                if (host != null) {
                    str2 = host;
                }
            }
            strConcat = "https://play.google.com/store/apps/details?id=".concat(str2);
        }
        if (c09.m(v3gVar.c).a()) {
            return new sjc(String.valueOf(v3gVar.a), str, v3gVar.c, v3gVar.k, v3gVar.n, v3gVar.d);
        }
        String str3 = v3gVar.c;
        boolean zEquals = str3.length() == 0 ? false : "opera-user".equals(Uri.parse(str3).normalizeScheme().getScheme());
        String strValueOf = String.valueOf(v3gVar.a);
        if (zEquals) {
            strC = z5i.C(v3gVar.c);
        } else {
            n9h n9hVar = this.d;
            i07 i07VarG = na2.g((a64) n9hVar.b, (CoroutineContext) null, (rx5) null, new fb9(n9hVar, strConcat, mt5Var, (byte) 21), 3);
            CompletableFuture completableFuture = new CompletableFuture();
            completableFuture.handle((BiFunction) new t9m(new whf(i07VarG, (byte) 25), (byte) 2));
            i07VarG.s(new ry7(completableFuture, i07VarG, (byte) 13));
            String str4 = (String) completableFuture.get();
            if (str4 != null && str4.length() != 0) {
                strConcat = str4;
            }
            strC = strConcat;
        }
        return new sjc(strValueOf, strC, v3gVar.c, v3gVar.k, v3gVar.n, v3gVar.d);
    }

    @Override // defpackage.t3g
    public final void remove(Object obj) {
        s3g s3gVar = (s3g) obj;
        if (this.g) {
            new rml(Unit.a, this.a).a(new ry7(this, s3gVar, (byte) 29)).m(this.f);
        } else {
            this.e.add(new gv8(this, s3gVar, (byte) 18));
        }
    }
}
