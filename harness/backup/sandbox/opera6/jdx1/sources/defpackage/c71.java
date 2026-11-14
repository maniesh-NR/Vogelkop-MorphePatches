package defpackage;

import ads_mobile_sdk.a2;
import ads_mobile_sdk.ae1;
import ads_mobile_sdk.af;
import ads_mobile_sdk.b42;
import ads_mobile_sdk.bw2;
import ads_mobile_sdk.cd3;
import ads_mobile_sdk.dv0;
import ads_mobile_sdk.gn1;
import ads_mobile_sdk.ho3;
import ads_mobile_sdk.i03;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.j42;
import ads_mobile_sdk.jq0;
import ads_mobile_sdk.jx1;
import ads_mobile_sdk.ko1;
import ads_mobile_sdk.ly2;
import ads_mobile_sdk.o03;
import ads_mobile_sdk.os;
import ads_mobile_sdk.tv0;
import ads_mobile_sdk.w8;
import ads_mobile_sdk.wf1;
import ads_mobile_sdk.wt1;
import ads_mobile_sdk.yq3;
import ads_mobile_sdk.z42;
import ads_mobile_sdk.zj;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import androidx.webkit.Profile;
import com.google.android.gms.ads.AdError;
import com.usercentrics.sdk.services.deviceStorage.models.StorageSessionEntry;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.serialization.KSerializer;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class c71 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c71(it1 it1Var, wt1 wt1Var, prb prbVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 18;
        this.u = wt1Var;
        this.v = prbVar;
        this.w = it1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c71(Object obj, Object obj2, Object obj3, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c71(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c71(Object obj, Object obj2, mt5 mt5Var, byte b, boolean z) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj2;
        this.w = obj;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.w;
        Object obj3 = this.v;
        switch (b) {
            case 0:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 0);
            case 1:
                c71 c71Var = new c71(obj3, obj2, mt5Var, (byte) 1);
                c71Var.u = obj;
                return c71Var;
            case 2:
                c71 c71Var2 = new c71(obj3, obj2, mt5Var, (byte) 2);
                c71Var2.u = obj;
                return c71Var2;
            case 3:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 3);
            case 4:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 4);
            case 5:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 5);
            case 6:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 6);
            case 7:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 7);
            case 8:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 8);
            case 9:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 9);
            case 10:
                c71 c71Var3 = new c71(obj3, obj2, mt5Var, (byte) 10);
                c71Var3.u = obj;
                return c71Var3;
            case 11:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 11);
            case 12:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 12);
            case 13:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 13);
            case 14:
                c71 c71Var4 = new c71(obj3, obj2, mt5Var, (byte) 14);
                c71Var4.u = obj;
                return c71Var4;
            case 15:
                c71 c71Var5 = new c71(obj2, obj3, mt5Var, (byte) 15, false);
                c71Var5.u = obj;
                return c71Var5;
            case 16:
                c71 c71Var6 = new c71(obj3, obj2, mt5Var, (byte) 16);
                c71Var6.u = obj;
                return c71Var6;
            case 17:
                c71 c71Var7 = new c71(obj2, obj3, mt5Var, (byte) 17, false);
                c71Var7.u = obj;
                return c71Var7;
            case 18:
                return new c71((it1) obj2, (wt1) this.u, (prb) obj3, mt5Var);
            case 19:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 19);
            case 20:
                c71 c71Var8 = new c71(obj3, obj2, mt5Var, (byte) 20);
                c71Var8.u = obj;
                return c71Var8;
            case 21:
                c71 c71Var9 = new c71(obj3, obj2, mt5Var, (byte) 21);
                c71Var9.u = obj;
                return c71Var9;
            default:
                return new c71(this.u, obj3, obj2, mt5Var, (byte) 22);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((xa7) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((hsn) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((hsn) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((xa7) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 5:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 6:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 7:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 8:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 9:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 10:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 11:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 12:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 13:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 14:
                return create((af) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 15:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 16:
                return create((SQLiteDatabase) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 17:
                return create((i03) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 18:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 19:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 20:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 21:
                return create((jq0) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) throws o2j, IOException {
        fj6 fj6Var;
        drb erbVar;
        BufferedInputStream bufferedInputStream;
        pqh pqhVar;
        pqh pqhVar2;
        ArrayList arrayList;
        prb prbVarW;
        prb prbVarW2;
        wpb wpbVarE;
        String strA;
        String strA2;
        byte b = this.t;
        byte b2 = 13;
        byte b3 = 2;
        wf1 wf1Var = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean zCompress = false;
        Object obj2 = this.v;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                dqa dqaVar = (dqa) this.u;
                ((d71) obj2).getClass();
                dqaVar.invoke(d71.d((HttpURLConnection) obj3));
                return Unit.a;
            case 1:
                hsn hsnVar = (hsn) this.u;
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                ((b22) obj2).f((vsn) obj3, hsnVar);
                return Unit.a;
            case 2:
                hsn hsnVar2 = (hsn) this.u;
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                ((t42) obj2).f((vsn) obj3, hsnVar2);
                return Unit.a;
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                rf3 rf3Var = (rf3) this.u;
                cwm cwmVar = rf3Var.b;
                StorageSessionEntry storageSessionEntry = (StorageSessionEntry) obj2;
                int i4 = storageSessionEntry.d;
                StorageSessionEntry storageSessionEntry2 = new StorageSessionEntry(storageSessionEntry.b, storageSessionEntry.c, storageSessionEntry.a, i4 + 1);
                cwm cwmVar2 = cwmVar;
                LinkedHashSet linkedHashSetM0 = CollectionsKt.m0(cwmVar2.h());
                linkedHashSetM0.add(storageSessionEntry2);
                cwmVar2.m(linkedHashSetM0);
                owm owmVar = rf3Var.d;
                StringBuilder sbN = z1m.n("Failed to replay buffered session for settingsId: ", storageSessionEntry.a, ", error: ", ((Throwable) obj3).getMessage(), ". Session re-added to buffer (retry ");
                sbN.append(i4 + 1);
                sbN.append(").");
                owmVar.d(sbN.toString(), (Throwable) null);
                return Unit.a;
            case 4:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                Context context = (Context) obj2;
                ((z1h) this.u).b(context.getResources().getConfiguration());
                context.registerComponentCallbacks((it5) obj3);
                return Unit.a;
            case 5:
                px5 px5Var6 = px5.a;
                ybh.y(obj);
                ey5 ey5Var = ky5.a;
                if (((Boolean) ((afe) obj2).getValue()).booleanValue()) {
                    kg9.a((kg9) this.u);
                } else {
                    ((afe) obj3).setValue(Boolean.FALSE);
                }
                return Unit.a;
            case 6:
                px5 px5Var7 = px5.a;
                ybh.y(obj);
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = ((ContentResolver) this.u).openFileDescriptor((Uri) obj2, "r");
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                try {
                    gh8 gh8Var = new gh8(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    String[] strArr = pjn.c;
                    for (int i5 = 0; i5 < 2; i5++) {
                        String str = strArr[i5];
                        String strC = gh8Var.c(str);
                        if (strC != null && !StringsKt.N(strC)) {
                            linkedHashMap.put(str, strC);
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return Unit.a;
                } finally {
                }
            case 7:
                px5 px5Var8 = px5.a;
                ybh.y(obj);
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = ((ContentResolver) this.u).openFileDescriptor((Uri) obj2, "rw");
                if (parcelFileDescriptorOpenFileDescriptor2 != null) {
                    Map map = (Map) obj3;
                    try {
                        gh8 gh8Var2 = new gh8(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor());
                        for (Map.Entry entry : map.entrySet()) {
                            gh8Var2.F((String) entry.getKey(), (String) entry.getValue());
                        }
                        gh8Var2.B();
                        parcelFileDescriptorOpenFileDescriptor2.close();
                    } finally {
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                px5 px5Var9 = px5.a;
                ybh.y(obj);
                tza tzaVar = (tza) obj2;
                OutputStream outputStreamOpenOutputStream = ((ContentResolver) this.u).openOutputStream(tzaVar.c);
                if (outputStreamOpenOutputStream != null) {
                    Bitmap bitmap = (Bitmap) obj3;
                    try {
                        Bitmap.CompressFormat compressFormat = tzaVar.d;
                        if (compressFormat == null) {
                            compressFormat = tza.h;
                        }
                        zCompress = bitmap.compress(compressFormat, tzaVar.e, outputStreamOpenOutputStream);
                        outputStreamOpenOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            vtp.v(outputStreamOpenOutputStream, th);
                            throw th2;
                        }
                    }
                }
                return Boolean.valueOf(zCompress);
            case 9:
                px5 px5Var10 = px5.a;
                ybh.y(obj);
                jk3 jk3Var = new jk3((gwj) this.u, (byte) 0);
                cam camVar = ((KTypeProjection) ((x9m) obj2).b.b.get(0)).b;
                rpb rpbVar = (rpb) obj3;
                KSerializer kSerializerC = bwg.C(rpbVar.b, new x9m(camVar.a, camVar));
                fj6 fj6Var2 = fj6.a;
                s04 s04Var = new s04(new bxk(jk3Var), new char[16384], rpbVar.a);
                if (s04Var.x() == 8) {
                    s04Var.h((byte) 8);
                    fj6Var = fj6.b;
                } else {
                    fj6Var = fj6.a;
                }
                int iOrdinal = fj6Var.ordinal();
                if (iOrdinal == 0) {
                    erbVar = new erb(rpbVar, s04Var, kSerializerC);
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            h9o.p();
                            return null;
                        }
                        qp2.n("AbstractJsonLexer.determineFormat must be called beforehand.");
                        return null;
                    }
                    erbVar = new drb(rpbVar, s04Var, kSerializerC);
                }
                return new do5(new isb(erbVar, (byte) 0));
            case 10:
                px5 px5Var11 = px5.a;
                ybh.y(obj);
                nx5 nx5Var = (nx5) this.u;
                rx5 rx5Var = rx5.d;
                pmg pmgVar = (pmg) obj2;
                mgl mglVar = (mgl) obj3;
                na2.B(nx5Var, null, rx5Var, new tw5(pmgVar, mglVar, wf1Var, 1 == true ? 1 : 0), 1);
                return na2.B(nx5Var, null, rx5Var, new tw5(pmgVar, mglVar, wf1Var, b3), 1);
            case 11:
                px5 px5Var12 = px5.a;
                ybh.y(obj);
                for (h3d h3dVar : ((p2d) this.u).d.values()) {
                    Bitmap bitmap2 = h3dVar.d;
                    String str2 = h3dVar.c;
                    if (bitmap2 == null && c.q(str2, "data:", false) && StringsKt.L(str2, "base64,", 0, false, 6) > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str2.substring(StringsKt.K(str2, ',', 0, 6) + 1), 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            h3dVar.d = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException unused) {
                            izc.c("data URL did not have correct base64 format.");
                        }
                    }
                    Context context2 = (Context) obj2;
                    String str3 = (String) obj3;
                    if (h3dVar.d == null && str3 != null) {
                        try {
                            InputStream inputStreamOpen = context2.getAssets().open(str3 + str2);
                            try {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inScaled = true;
                                options2.inDensity = 160;
                                h3dVar.d = dzm.e(BitmapFactory.decodeStream(inputStreamOpen, null, options2), h3dVar.a, h3dVar.b);
                            } catch (IllegalArgumentException unused2) {
                                izc.c("Unable to decode image.");
                            }
                        } catch (IOException unused3) {
                            izc.c("Unable to open asset.");
                        }
                    }
                }
                return Unit.a;
            case 12:
                kt5 kt5Var = (kt5) this.u;
                px5 px5Var13 = px5.a;
                ybh.y(obj);
                try {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream((File) kt5Var.g.getValue()));
                    pqhVar = (pqh) obj2;
                    pqhVar2 = (pqh) obj3;
                } catch (FileNotFoundException | IOException | JSONException unused4) {
                }
                try {
                    orb orbVar = new orb(xvg.z(bufferedInputStream));
                    jth jthVar = new jth(orbVar.e("language"), orbVar.a.getLong("timestamp"), orbVar.l("max-age"), orbVar.c("prompts"));
                    pqhVar.a = jthVar;
                    pqhVar2.a = kt5Var.b(jthVar.d);
                    bufferedInputStream.close();
                    return Unit.a;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        vtp.v(bufferedInputStream, th3);
                        throw th4;
                    }
                }
            case 13:
                px5 px5Var14 = px5.a;
                ybh.y(obj);
                pqh pqhVar3 = (pqh) this.u;
                Context context3 = (Context) ((m91) obj2).b;
                pqhVar3.a = i0l.d(context3);
                ((pqh) obj3).a = i0l.e(context3);
                return Unit.a;
            case 14:
                px5 px5Var15 = px5.a;
                ybh.y(obj);
                String str4 = (String) obj2;
                tv0 tv0Var = (tv0) obj3;
                ump umpVar = (ump) ((af) this.u).n();
                Collections.unmodifiableMap(Collections.unmodifiableMap(((af) umpVar.b).logs_));
                umpVar.b$1();
                af afVar = (af) umpVar.b;
                gn1 gn1Var = afVar.logs_;
                if (!gn1Var.a) {
                    afVar.logs_ = gn1Var.b();
                }
                afVar.logs_.put(str4, tv0Var);
                return (af) umpVar.a();
            case 15:
                px5 px5Var16 = px5.a;
                ybh.y(obj);
                nx5 nx5Var2 = (nx5) this.u;
                wpb wpbVar = (wpb) obj2;
                jx1 jx1Var = (jx1) obj3;
                ArrayList arrayList2 = new ArrayList(k95.o(wpbVar, 10));
                ArrayList arrayList3 = wpbVar.a;
                int size = arrayList3.size();
                while (i3 < size) {
                    Object obj4 = arrayList3.get(i3);
                    i3++;
                    arrayList2.add(na2.g(nx5Var2, null, null, new hkm(jx1Var, (pqb) obj4, wf1Var, b2), 3));
                }
                return arrayList2;
            case 16:
                px5 px5Var17 = px5.a;
                ybh.y(obj);
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.u;
                j42 j42Var = (j42) obj2;
                String str5 = j42.f;
                j42Var.getClass();
                ContentValues contentValues = new ContentValues();
                b42 b42Var = b42.a;
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{(String) obj3});
                j42.a(j42Var, sQLiteDatabase);
                return Unit.a;
            case 17:
                px5 px5Var18 = px5.a;
                ybh.y(obj);
                s2p s2pVar = (s2p) ((i03) this.u).n();
                s2pVar.b$1();
                ((i03) s2pVar.b).b((String) obj2);
                ((o03) obj3).c.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                s2pVar.b$1();
                i03 i03Var = (i03) s2pVar.b;
                i03Var.bitField0_ |= 2;
                i03Var.lastUpdateTimeMs_ = jCurrentTimeMillis;
                return (i03) s2pVar.a();
            case 18:
                it1 it1Var = (it1) obj3;
                px5 px5Var19 = px5.a;
                ybh.y(obj);
                w8 w8Var = ((wt1) this.u).d;
                prb prbVar = (prb) obj2;
                w8Var.getClass();
                prb prbVarA = bw2.a(prbVar, "mute", (prb) null);
                if (prbVarA == null || (wpbVarE = bw2.e(prbVarA, "reasons")) == null) {
                    arrayList = l08.a;
                } else {
                    arrayList = new ArrayList();
                    ArrayList arrayList4 = wpbVarE.a;
                    int size2 = arrayList4.size();
                    while (i2 < size2) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        try {
                            prb prbVarH = ((pqb) obj5).h();
                            strA = bw2.a(prbVarH, "reason", "");
                            strA2 = bw2.a(prbVarH, "ping_url", "");
                        } catch (Exception unused5) {
                        }
                        wf1 wf1Var2 = (StringsKt.N(strA) || StringsKt.N(strA2)) ? null : new wf1(strA, strA2);
                        if (wf1Var2 != null) {
                            arrayList.add(wf1Var2);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it1Var.p.add((wf1) it.next());
                }
                w8Var.getClass();
                if (prbVar != null) {
                    try {
                        prbVarW = prbVar.w("mute");
                    } catch (Exception unused6) {
                    }
                } else {
                    prbVarW = null;
                }
                if (prbVarW != null) {
                    try {
                        prbVarW2 = prbVarW.w("default_reason");
                    } catch (Exception unused7) {
                        prbVarW2 = null;
                    }
                    if (prbVarW2 != null) {
                        String strA3 = bw2.a(prbVarW2, "reason", "");
                        String strA4 = bw2.a(prbVarW2, "ping_url", "");
                        if (!StringsKt.N(strA3) && !StringsKt.N(strA4)) {
                            wf1Var = new wf1(strA3, strA4);
                        }
                    }
                }
                it1Var.q = wf1Var;
                return Unit.a;
            case 19:
                px5 px5Var20 = px5.a;
                ybh.y(obj);
                AtomicBoolean atomicBoolean = ho3.a;
                Profile profile = (Profile) this.u;
                String str6 = (String) obj2;
                s9e s9eVar = ((yq3) obj3).g.d;
                if (ho3.d.get()) {
                    try {
                        profile.prefetchUrlAsync(str6, null, s9eVar, new ftj((byte) 13));
                    } catch (Throwable unused8) {
                        ho3.d.set(false);
                    }
                }
                return Unit.a;
            case 20:
                px5 px5Var21 = px5.a;
                ybh.y(obj);
                nx5 nx5Var3 = (nx5) this.u;
                wpb wpbVar2 = (wpb) obj2;
                w8 w8Var2 = (w8) obj3;
                ArrayList arrayList5 = new ArrayList(k95.o(wpbVar2, 10));
                ArrayList arrayList6 = wpbVar2.a;
                int size3 = arrayList6.size();
                while (i < size3) {
                    Object obj6 = arrayList6.get(i);
                    i++;
                    arrayList5.add(na2.g(nx5Var3, null, null, new zj(obj6, (Object) w8Var2, (mt5) wf1Var, (byte) 5), 3));
                }
                return arrayList5;
            case 21:
                px5 px5Var22 = px5.a;
                ybh.y(obj);
                String str7 = (String) obj2;
                String str8 = (String) obj3;
                i6p i6pVar = (i6p) ((jq0) this.u).n();
                if (str7 == null || str7.length() == 0) {
                    Collections.unmodifiableMap(Collections.unmodifiableMap(((jq0) i6pVar.b).storedSdkCoreData_));
                    Objects.requireNonNull(str8);
                    i6pVar.b$1();
                    jq0 jq0Var = (jq0) i6pVar.b;
                    gn1 gn1Var2 = jq0Var.storedSdkCoreData_;
                    if (!gn1Var2.a) {
                        jq0Var.storedSdkCoreData_ = gn1Var2.b();
                    }
                    jq0Var.storedSdkCoreData_.remove(str8);
                } else {
                    Collections.unmodifiableMap(Collections.unmodifiableMap(((jq0) i6pVar.b).storedSdkCoreData_));
                    Objects.requireNonNull(str8);
                    i6pVar.b$1();
                    jq0 jq0Var2 = (jq0) i6pVar.b;
                    gn1 gn1Var3 = jq0Var2.storedSdkCoreData_;
                    if (!gn1Var3.a) {
                        jq0Var2.storedSdkCoreData_ = gn1Var3.b();
                    }
                    jq0Var2.storedSdkCoreData_.put(str8, str7);
                }
                return (jq0) i6pVar.a();
            default:
                ejp ejpVar = (ejp) this.u;
                nh4 nh4Var = (nh4) obj3;
                cd3 cd3Var = (cd3) obj2;
                a2 a2Var = cd3Var.f;
                px5 px5Var23 = px5.a;
                ybh.y(obj);
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                try {
                    if (ejpVar instanceof ko1) {
                        cd3Var.l.a(a2Var, ejpVar, new os(cd3Var, atomicBoolean2, nh4Var));
                    } else if (ejpVar instanceof ly2) {
                        cd3Var.m.a(a2Var, ejpVar, new os(cd3Var, atomicBoolean2, nh4Var));
                    } else if (ejpVar instanceof z42) {
                        ((gso) cd3Var.n.get()).a(a2Var, ejpVar, new os(cd3Var, atomicBoolean2, nh4Var));
                    }
                } catch (Throwable th5) {
                    if (atomicBoolean2.getAndSet(true)) {
                        return Unit.a;
                    }
                    byte b4 = ae1.a.a().a;
                    String message = th5.getMessage();
                    if (message == null) {
                        message = th5.toString();
                    }
                    dv0 dv0Var = new dv0(new nsd(b4, message, AdError.GOOGLE_MOBILE_ADS_DOMAIN));
                    p0i p0iVar = t0i.b;
                    nh4Var.resumeWith(dv0Var);
                }
                return Unit.a;
        }
    }
}
