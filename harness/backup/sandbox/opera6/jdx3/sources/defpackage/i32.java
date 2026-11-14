package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ImagesContract;
import com.leanplum.internal.Clock;
import com.leanplum.internal.Constants;
import com.opera.android.Lazy;
import com.opera.api.Callback;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i32 extends ldk {
    public final /* synthetic */ byte j;
    public final Object k;
    public Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(Context context, umi umiVar, String str, o8f o8fVar) {
        super(umiVar);
        this.j = (byte) 9;
        r16 r16Var = ngh.a;
        this.l = o8fVar;
        this.k = w1h.l(context, umiVar, str, new bg1[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(cul culVar, Context context, umi umiVar) {
        super(umiVar);
        this.j = (byte) 12;
        this.l = culVar;
        r16 r16Var = ngh.a;
        this.k = w1h.l(context, umiVar, "top_activated_favorites", new bg1[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(i16 i16Var, Context context, umi umiVar) {
        super(umiVar);
        this.j = (byte) 1;
        this.l = i16Var;
        r16 r16Var = ngh.a;
        this.k = context.getApplicationContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(i9c i9cVar, umi umiVar) {
        super(umiVar);
        this.j = (byte) 6;
        r16 r16Var = ngh.a;
        this.l = i9cVar;
        this.k = z4c.b(new q4b(i9cVar, (byte) 5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(qb7 qb7Var, Context context, umi umiVar) {
        super(umiVar);
        this.j = (byte) 2;
        this.l = qb7Var;
        r16 r16Var = ngh.a;
        this.k = context.getApplicationContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(s6h s6hVar, Context context, umi umiVar) {
        super(umiVar);
        this.j = (byte) 4;
        this.l = s6hVar;
        r16 r16Var = ngh.a;
        this.k = context.getApplicationContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(s9i s9iVar, Context context, umi umiVar) {
        super(umiVar);
        this.j = (byte) 5;
        this.l = s9iVar;
        r16 r16Var = ngh.a;
        this.k = w1h.l(context, umiVar, "ads_first_impressions", new bg1[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(umi umiVar, Lazy lazy, j32 j32Var) {
        super(umiVar);
        this.j = (byte) 0;
        r16 r16Var = ngh.a;
        this.l = j32Var;
        this.k = z4c.b(new x2((Object) lazy, (Object) j32Var, (byte) 20));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(umi umiVar, k32 k32Var, byte b) {
        super(umiVar);
        this.j = b;
        switch (b) {
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                r16 r16Var = ngh.a;
                super(umiVar);
                this.k = k32Var;
                break;
            case 11:
                r16 r16Var2 = ngh.a;
                super(umiVar);
                this.k = k32Var;
                break;
            default:
                r16 r16Var3 = ngh.a;
                this.l = new p2g(Collections.EMPTY_LIST, null);
                this.k = k32Var;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(xqe xqeVar, umi umiVar, kqd kqdVar) {
        super(umiVar);
        this.j = (byte) 7;
        this.l = xqeVar;
        r16 r16Var = ngh.a;
        this.k = kqdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(yqa yqaVar, Context context, umi umiVar) {
        super(umiVar);
        this.j = (byte) 3;
        this.l = yqaVar;
        r16 r16Var = ngh.a;
        this.k = context.getApplicationContext();
    }

    public static ArrayList m(vpb vpbVar, URI uri) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONArray jSONArray = vpbVar.a;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            orb orbVarC = vpbVar.c(i);
            JSONObject jSONObject = orbVarC.a;
            long j = jSONObject.getLong("expires");
            if (j > jCurrentTimeMillis) {
                HttpCookie httpCookie = new HttpCookie(orbVarC.e(Constants.Params.NAME), orbVarC.m(Constants.Params.VALUE, null));
                httpCookie.setComment(orbVarC.m("comment", null));
                httpCookie.setDomain(orbVarC.m("domain", null));
                httpCookie.setPath(orbVarC.m("path", null));
                httpCookie.setPortlist(orbVarC.m("portlist", null));
                httpCookie.setDiscard(jSONObject.getBoolean("discard"));
                httpCookie.setSecure(jSONObject.getBoolean("secure"));
                httpCookie.setVersion(jSONObject.getInt("version"));
                httpCookie.setMaxAge((j - jCurrentTimeMillis) / 1000);
                arrayList.add(new pag(uri, httpCookie));
            }
        }
        return arrayList;
    }

    @Override // defpackage.ldk
    public final Object a() throws JSONException {
        Cursor cursorQuery;
        List list;
        byte b = this.j;
        Object obj = this.k;
        switch (b) {
            case 0:
                return k1g.a0((File) ((zyk) obj).getValue(), ((j32) this.l).d);
            case 1:
                Context context = (Context) obj;
                cursorQuery = context.getContentResolver().query(are.e(context), i16.e, null, null, "user_position");
                ArrayList arrayList = new ArrayList();
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            do {
                                arrayList.add(new op4(new yqe(cursorQuery.getString(0), cursorQuery.getString(1), cursorQuery.getInt(2) == 1), cursorQuery.getInt(3) == 1, cursorQuery.getInt(4) == 1, cursorQuery.getInt(5)));
                            } while (cursorQuery.moveToNext());
                        }
                    } finally {
                    }
                }
                return arrayList;
            case 2:
                Context context2 = (Context) obj;
                cursorQuery = context2.getContentResolver().query(are.a(context2), qb7.d, null, null, "city_index");
                ArrayList arrayList2 = new ArrayList();
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            do {
                                arrayList2.add(new d15(cursorQuery.getInt(0), new bre(cursorQuery.getInt(5), cursorQuery.getString(1), cursorQuery.getString(2), cursorQuery.getString(3), cursorQuery.getString(4)), cursorQuery.getInt(6)));
                            } while (cursorQuery.moveToNext());
                        }
                    } finally {
                    }
                }
                return arrayList2;
            case 3:
                Context context3 = (Context) obj;
                cursorQuery = context3.getContentResolver().query(are.b(context3), yqa.d, null, null, null);
                ArrayList arrayList3 = new ArrayList();
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            do {
                                int i = cursorQuery.getInt(7);
                                arrayList3.add(new g15(new cre(new bre(cursorQuery.getInt(4), cursorQuery.getString(0), cursorQuery.getString(1), cursorQuery.getString(2), cursorQuery.getString(3)), i == 3, cursorQuery.getString(5), cursorQuery.getString(6)), i));
                            } while (cursorQuery.moveToNext());
                        }
                    } finally {
                    }
                }
                return arrayList3;
            case 4:
                Context context4 = (Context) obj;
                return new ux8(s6h.K(context4, "not_interested"), s6h.K(context4, "report"));
            case 5:
                Map<String, ?> all = ((SharedPreferences) ((b59) obj).get()).getAll();
                SparseArray sparseArray = new SparseArray(all.size());
                long jCurrentTimeMillis = System.currentTimeMillis() - Clock.MONTH_MILLIS;
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    try {
                        int iIntValue = Integer.valueOf(entry.getKey()).intValue();
                        long jLongValue = ((Long) entry.getValue()).longValue();
                        if (jLongValue > jCurrentTimeMillis) {
                            sparseArray.put(iIntValue, new r59(jLongValue));
                        }
                    } catch (NumberFormatException e) {
                        t3p.r(e);
                        return null;
                    }
                }
                return sparseArray;
            case 6:
                try {
                    if (new File(j(), Constants.Params.DATA).exists()) {
                        return new kdb(Uri.parse(x29.c(new File(j(), ImagesContract.URL))));
                    }
                    return null;
                } catch (FileNotFoundException unused) {
                    return null;
                }
            case 7:
                xqe xqeVar = (xqe) this.l;
                Context context5 = xqeVar.d;
                qre qreVar = xqeVar.e;
                String[] strArr = xqeVar.f;
                kqd kqdVar = (kqd) obj;
                ArrayList arrayList4 = new ArrayList();
                Cursor cursorQuery2 = context5.getContentResolver().query(are.d(context5), xqe.i, "stream_id=?", strArr, null);
                if (cursorQuery2 != null) {
                    if (cursorQuery2.moveToFirst()) {
                        do {
                            oqe oqeVarM = xqe.m(context5, qreVar, cursorQuery2, kqdVar);
                            if (oqeVarM != null) {
                                arrayList4.add(oqeVarM);
                            }
                        } while (cursorQuery2.moveToNext());
                    }
                    cursorQuery2.close();
                }
                return arrayList4;
            case 8:
                k32 k32Var = (k32) obj;
                return new p2g((List) kfo.Y(((apk) k32Var.get()).a, true, false, new r4k((byte) 13)), (c3g) kfo.Y(((apk) k32Var.get()).a, true, false, new r4k((byte) 12)));
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                String string = ((SharedPreferences) ((b59) obj).get()).getString(Constants.Params.DATA, "");
                if (string.isEmpty()) {
                    list = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("any");
                        vpb vpbVar = jSONArrayOptJSONArray == null ? null : new vpb(jSONArrayOptJSONArray);
                        if (vpbVar != null) {
                            arrayList5.addAll(m(vpbVar, null));
                        }
                        JSONObject jSONObject2 = jSONObject.getJSONObject("uris");
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            arrayList5.addAll(m(new vpb(jSONObject2.getJSONArray(next)), new URI(next)));
                        }
                        list = arrayList5;
                    } catch (URISyntaxException unused2) {
                        list = Collections.EMPTY_LIST;
                    } catch (JSONException unused3) {
                        list = Collections.EMPTY_LIST;
                    }
                }
                ((o8f) this.l).run(list);
                return list;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (List) kfo.Y(((apk) ((k32) obj).get()).a, true, false, new r4k((byte) 16));
            case 11:
                return (List) kfo.Y(((apk) ((k32) obj).get()).a, true, false, new r4k((byte) 17));
            default:
                String string2 = ((SharedPreferences) ((b59) obj).get()).getString("favorites_usage", null);
                ArrayList arrayList6 = new ArrayList();
                if (string2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(string2);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                            arrayList6.add(new bul(jSONObject3.getString("id"), jSONObject3.getInt("activated_count"), jSONObject3.optLong("last_activated_time", -1L)));
                        }
                    } catch (JSONException unused4) {
                    }
                }
                return arrayList6;
        }
    }

    @Override // defpackage.ldk
    public final void b(Object obj) throws JSONException {
        JSONArray jSONArray;
        byte b = this.j;
        byte b2 = 8;
        int i = 0;
        byte b3 = 1;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                File file = (File) ((zyk) obj2).getValue();
                if (map == null) {
                    file.delete();
                    return;
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                k1g.k0(file, map);
                return;
            case 1:
                List<op4> list = (List) obj;
                Context context = (Context) obj2;
                context.getContentResolver().delete(are.e(context), null, null);
                if (list == null || list.isEmpty()) {
                    return;
                }
                ContentValues[] contentValuesArr = new ContentValues[list.size()];
                for (op4 op4Var : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("code", op4Var.a.a);
                    yqe yqeVar = op4Var.a;
                    contentValues.put(Constants.Params.NAME, yqeVar.b);
                    contentValues.put("subscribed", Integer.valueOf(yqeVar.c ? 1 : 0));
                    contentValues.put("supported", Integer.valueOf(op4Var.b ? 1 : 0));
                    contentValues.put("selected", Integer.valueOf(op4Var.c ? 1 : 0));
                    contentValues.put("user_position", Integer.valueOf(op4Var.d));
                    contentValuesArr[i] = contentValues;
                    i++;
                }
                context.getContentResolver().bulkInsert(are.e(context), contentValuesArr);
                return;
            case 2:
                List<d15> list2 = (List) obj;
                Context context2 = (Context) obj2;
                context2.getContentResolver().delete(are.a(context2), null, null);
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                ContentValues[] contentValuesArr2 = new ContentValues[list2.size()];
                for (d15 d15Var : list2) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("city_index", Integer.valueOf(d15Var.a));
                    bre breVar = d15Var.b;
                    contentValues2.put("city_id", breVar.a);
                    contentValues2.put(Constants.Params.NAME, breVar.b);
                    contentValues2.put(Constants.Params.STATE, breVar.c);
                    contentValues2.put("zip_code", breVar.d);
                    contentValues2.put("origin", Integer.valueOf(breVar.e));
                    contentValues2.put("selected_state", Integer.valueOf(d15Var.c));
                    contentValuesArr2[i] = contentValues2;
                    i++;
                }
                context2.getContentResolver().bulkInsert(are.a(context2), contentValuesArr2);
                return;
            case 3:
                List<g15> list3 = (List) obj;
                Context context3 = (Context) obj2;
                context3.getContentResolver().delete(are.b(context3), null, null);
                if (list3 == null || list3.isEmpty()) {
                    return;
                }
                ContentValues[] contentValuesArr3 = new ContentValues[list3.size()];
                for (g15 g15Var : list3) {
                    ContentValues contentValues3 = new ContentValues();
                    bre breVar2 = g15Var.a.a;
                    contentValues3.put("city_id", breVar2.a);
                    contentValues3.put(Constants.Params.NAME, breVar2.b);
                    contentValues3.put(Constants.Params.STATE, breVar2.c);
                    contentValues3.put("zip_code", breVar2.d);
                    contentValues3.put("origin", Integer.valueOf(breVar2.e));
                    cre creVar = g15Var.a;
                    contentValues3.put("country_code", creVar.c);
                    contentValues3.put("language_code", creVar.d);
                    contentValues3.put("selected_state", Integer.valueOf(g15Var.b));
                    contentValuesArr3[i] = contentValues3;
                    i++;
                }
                context3.getContentResolver().bulkInsert(are.b(context3), contentValuesArr3);
                return;
            case 4:
                ux8 ux8Var = (ux8) obj;
                Context context4 = (Context) obj2;
                context4.getContentResolver().delete(are.f(context4), null, null);
                if (ux8Var != null) {
                    ArrayList arrayList = new ArrayList();
                    Map map2 = ux8Var.a;
                    if (map2 != null) {
                        arrayList.add(s6h.R("not_interested", map2));
                    }
                    Map map3 = ux8Var.b;
                    if (map3 != null) {
                        arrayList.add(s6h.R("report", map3));
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    context4.getContentResolver().bulkInsert(are.f(context4), (ContentValues[]) arrayList.toArray(new ContentValues[arrayList.size()]));
                    return;
                }
                return;
            case 5:
                SparseArray sparseArray = (SparseArray) obj;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) ((b59) obj2).get()).edit();
                editorEdit.clear();
                while (i < sparseArray.size()) {
                    editorEdit.putLong(String.valueOf(sparseArray.keyAt(i)), ((r59) sparseArray.valueAt(i)).a);
                    i++;
                }
                editorEdit.apply();
                return;
            case 6:
                ldb ldbVar = (ldb) obj;
                i9c i9cVar = (i9c) this.l;
                if (ldbVar == null) {
                    new File(j(), ImagesContract.URL).delete();
                    new File(j(), Constants.Params.DATA).delete();
                } else {
                    j().mkdirs();
                    File file2 = new File(j(), ".data");
                    File file3 = new File(j(), ".url");
                    try {
                        x29.d(file3, ldbVar.a.toString());
                        byte[] bArr = ldbVar.b;
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            fileOutputStream.write(bArr);
                            fileOutputStream.close();
                            file3.renameTo(new File(j(), ImagesContract.URL));
                            file2.renameTo(new File(j(), Constants.Params.DATA));
                        } finally {
                        }
                    } finally {
                        file2.delete();
                        file3.delete();
                    }
                }
                new rml(Unit.a, (umi) i9cVar.c).c(new gbb(i9cVar, (byte) 8)).l();
                return;
            case 7:
                List<oqe> list4 = (List) obj;
                xqe xqeVar = (xqe) this.l;
                Context context5 = xqeVar.d;
                qre qreVar = xqeVar.e;
                String[] strArr = xqeVar.f;
                ArrayList arrayList2 = new ArrayList(list4.size());
                ArrayList arrayList3 = new ArrayList();
                for (oqe oqeVar : list4) {
                    if (!oqeVar.c.equals("insta_clip")) {
                        if (oqeVar instanceof msh) {
                            arrayList2.add(xqe.p(qreVar, (msh) oqeVar, null, arrayList3));
                        } else if ((oqeVar instanceof ere) && !"publishers".equals(oqeVar.c)) {
                            ere ereVar = (ere) oqeVar;
                            String str = ereVar.c;
                            List list5 = ereVar.f;
                            ArrayList arrayList4 = new ArrayList(list5.size() + 1);
                            ContentValues contentValues4 = new ContentValues();
                            contentValues4.put("title", ereVar.b);
                            String str2 = ereVar.g;
                            contentValues4.put("article_id", str2);
                            contentValues4.put("secondary_id", ereVar.e);
                            contentValues4.put(Constants.Params.TYPE, str);
                            contentValues4.put("stream_id", qreVar.a);
                            contentValues4.put("more_id", ereVar.h);
                            if ("carousel".equals(str)) {
                                nb8 nb8Var = ereVar.i;
                                nb8Var.getClass();
                                qpb qpbVar = rpb.d;
                                qpbVar.getClass();
                                contentValues4.put("event_carousel", qpbVar.b(nb8Var, nb8.Companion.serializer()));
                            }
                            arrayList4.add(contentValues4);
                            Iterator it = list5.iterator();
                            while (it.hasNext()) {
                                arrayList4.add(xqe.p(qreVar, (msh) it.next(), str2, arrayList3));
                            }
                            arrayList2.addAll(arrayList4);
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    context5.getContentResolver().delete(are.d(context5), "stream_id=?", strArr);
                    context5.getContentResolver().bulkInsert(are.d(context5), (ContentValues[]) arrayList2.toArray(new ContentValues[arrayList2.size()]));
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                context5.getContentResolver().delete(are.c(context5), "stream_id=?", strArr);
                context5.getContentResolver().bulkInsert(are.c(context5), (ContentValues[]) arrayList3.toArray(new ContentValues[arrayList3.size()]));
                return;
            case 8:
                p2g p2gVar = (p2g) obj;
                k32 k32Var = (k32) obj2;
                if (p2gVar != null) {
                    c3g c3gVar = p2gVar.b;
                    apk apkVar = (apk) k32Var.get();
                    kfo.Y(apkVar.a, false, true, new yok(apkVar, p2gVar.a, (byte) 2));
                    if (c3gVar != null) {
                        apk apkVar2 = (apk) k32Var.get();
                        kfo.Y(apkVar2.a, false, true, new zok(apkVar2, c3gVar, b3));
                        return;
                    }
                    return;
                }
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                orb orbVar = (orb) obj;
                if (orbVar != null) {
                    SharedPreferences.Editor editorEdit2 = ((SharedPreferences) ((b59) obj2).get()).edit();
                    editorEdit2.putString(Constants.Params.DATA, orbVar.a.toString());
                    editorEdit2.apply();
                    return;
                }
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                r7h r7hVar = (r7h) obj;
                if (r7hVar != null) {
                    apk apkVar3 = (apk) ((k32) obj2).get();
                    apkVar3.getClass();
                    kfo.Y(apkVar3.a, false, true, new d7k(apkVar3, r7hVar, b2));
                    return;
                }
                return;
            case 11:
                nxd nxdVar = (nxd) obj;
                apk apkVar4 = (apk) ((k32) obj2).get();
                apkVar4.getClass();
                nxdVar.getClass();
                kfo.Y(apkVar4.a, false, true, new d7k((Object) apkVar4, (Object) nxdVar, (byte) 9));
                return;
            default:
                List<bul> list6 = (List) obj;
                if (list6 != null) {
                    jSONArray = new JSONArray();
                    try {
                        for (bul bulVar : list6) {
                            bulVar.getClass();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("id", bulVar.a);
                            jSONObject.put("activated_count", bulVar.b.get());
                            jSONObject.put("last_activated_time", bulVar.c.get());
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                } else {
                    jSONArray = null;
                }
                ((SharedPreferences) ((b59) obj2).get()).edit().putString("favorites_usage", jSONArray != null ? jSONArray.toString() : null).apply();
                return;
        }
    }

    @Override // defpackage.ldk
    public final int c() {
        switch (this.j) {
            case 0:
            case 2:
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return 1;
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
            case 11:
            default:
                return 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ldk
    public final void d(Object obj) throws Throwable {
        char c;
        int i = 0;
        switch (this.j) {
            case 0:
                Map map = (Map) obj;
                j32 j32Var = (j32) this.l;
                c32 c32Var = j32Var.h;
                if (map != null) {
                    c32Var.b.putAll(map);
                    j32Var.f = false;
                }
                cv2 cv2Var = j32Var.c;
                if (cv2Var != null) {
                    cv2Var.invoke(Boolean.valueOf(map == null));
                }
                j32Var.c = null;
                j32Var.i(c32Var);
                break;
            case 1:
                List list = (List) obj;
                if (list == null) {
                    list = Collections.EMPTY_LIST;
                }
                ((i16) this.l).c = list;
                break;
            case 2:
                List<d15> list2 = (List) obj;
                qb7 qb7Var = (qb7) this.l;
                if (list2 != null) {
                    for (d15 d15Var : list2) {
                        int i2 = d15Var.c;
                        if (i2 == 2 || i2 == 3) {
                            qb7Var.c = d15Var;
                        }
                    }
                }
                qb7Var.b = list2;
                break;
            case 3:
                List list3 = (List) obj;
                yqa yqaVar = (yqa) this.l;
                if (list3 == null) {
                    list3 = Collections.EMPTY_LIST;
                }
                yqaVar.c = list3;
                break;
            case 4:
                ((s6h) this.l).b = (ux8) obj;
                break;
            case 5:
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                ((s9i) this.l).d = sparseArray;
                break;
            case 6:
                kdb kdbVar = (kdb) obj;
                i9c i9cVar = (i9c) this.l;
                if (kdbVar == null) {
                    kdbVar = new kdb(null);
                }
                i9cVar.f = kdbVar;
                jd7 jd7Var = (jd7) ((hx5) i9cVar.e).g();
                if (jd7Var != null) {
                    i9cVar.b(jd7Var, kdbVar.a);
                    break;
                }
                break;
            case 7:
                List arrayList = (List) obj;
                xqe xqeVar = (xqe) this.l;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                xqeVar.g = arrayList;
                ArrayList arrayList2 = xqeVar.h;
                if (arrayList.addAll(arrayList2)) {
                    g(new ArrayList(xqeVar.g));
                }
                arrayList2.clear();
                break;
            case 8:
                p2g p2gVar = (p2g) obj;
                if (p2gVar != null) {
                    this.l = p2gVar;
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                List<r7h> list4 = (List) obj;
                if (list4 == null) {
                    this.l = new SparseArray();
                    break;
                } else {
                    this.l = new SparseArray(list4.size());
                    for (r7h r7hVar : list4) {
                        ((SparseArray) this.l).put(r7hVar.a, r7hVar);
                    }
                    break;
                }
            case 11:
                List<nxd> list5 = (List) obj;
                if (list5 == null) {
                    this.l = new HashMap();
                    break;
                } else {
                    this.l = new HashMap(list5.size());
                    for (nxd nxdVar : list5) {
                        ((HashMap) this.l).put(new hpk(nxdVar.a, nxdVar.b), nxdVar);
                    }
                    break;
                }
            case 12:
                List<bul> list6 = (List) obj;
                cul culVar = (cul) this.l;
                HashMap map2 = culVar.c;
                ArrayList arrayList3 = culVar.f;
                if (list6 == null || list6.isEmpty()) {
                    culVar.e = null;
                } else {
                    boolean z = false;
                    for (bul bulVar : list6) {
                        HashSet hashSet = culVar.e;
                        if (hashSet == null || !hashSet.contains(bulVar.a)) {
                            String str = bulVar.a;
                            AtomicInteger atomicInteger = bulVar.b;
                            bul bulVar2 = (bul) map2.get(str);
                            atomicInteger.set(atomicInteger.get() + (bulVar2 != null ? bulVar2.b.get() : 0));
                            if (bulVar2 != null) {
                                bulVar.c.set(bulVar2.c.get());
                                c = true;
                            } else {
                                c = false;
                            }
                            z |= c;
                            if (atomicInteger.get() != 0) {
                                map2.put(bulVar.a, bulVar);
                            }
                        }
                        z = true;
                    }
                    culVar.e = null;
                    if (z) {
                        culVar.d();
                    }
                    culVar.e();
                }
                culVar.d = true;
                int size = arrayList3.size();
                while (i < size) {
                    Object obj2 = arrayList3.get(i);
                    i++;
                    ((Callback) obj2).run(null);
                }
                arrayList3.clear();
                break;
        }
    }

    public final File j() {
        return (File) ((zyk) this.k).getValue();
    }

    public final nxd k(int i, String str) {
        String strA = f8a.d.a(str);
        hpk hpkVar = new hpk(strA, i);
        i();
        nxd nxdVar = (nxd) ((HashMap) this.l).get(hpkVar);
        if (nxdVar != null) {
            return nxdVar;
        }
        nxd nxdVar2 = new nxd(strA, i, 0L, 0L, 0L, false);
        ((HashMap) this.l).put(hpkVar, nxdVar2);
        return nxdVar2;
    }

    public final r7h l(int i) {
        i();
        r7h r7hVar = (r7h) ((SparseArray) this.l).get(i);
        if (r7hVar != null) {
            return r7hVar;
        }
        r7h r7hVar2 = new r7h(i, 1.0d);
        ((SparseArray) this.l).put(i, r7hVar2);
        return r7hVar2;
    }
}
