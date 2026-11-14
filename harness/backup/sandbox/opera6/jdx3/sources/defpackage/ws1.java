package defpackage;

import J.N;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.blockstore.BlockstoreClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.leanplum.ActionContext;
import com.leanplum.messagetemplates.OperaConfigBundleSheet;
import com.leanplum.messagetemplates.ResourceWrapper;
import com.opera.android.BrowserActivity;
import com.opera.api.Callback;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class ws1 implements n5o, bqb, m9n, OnSuccessListener, gx6, dkj, swl, OnFailureListener, yjj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ws1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.dkj
    public final void a() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 5:
                final dx3 dx3Var = (dx3) obj4;
                final re7 re7Var = (re7) obj3;
                final Runnable runnable = (Runnable) obj2;
                final ue7 ue7Var = (ue7) obj;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                mdb.i(intent, re7Var.g());
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
                String str = re7Var.m;
                if (TextUtils.isEmpty(str)) {
                    str = "*/*";
                }
                intent.setType(str);
                dx3Var.j.t(intent, new r1o() { // from class: se7
                    @Override // defpackage.r1o
                    public final void a(int i, Intent intent2) {
                        Uri data;
                        if (i != -1 || intent2 == null || (data = intent2.getData()) == null) {
                            return;
                        }
                        if ((intent2.getFlags() & 3) == 3) {
                            fp1 fp1Var = dx3Var;
                            fp1Var.getContentResolver().takePersistableUriPermission(data, 3);
                            String strG = dd7.e(fp1Var, data).g();
                            re7 re7Var2 = re7Var;
                            if (strG.equals(re7Var2.f())) {
                                String string = data.toString();
                                re7Var2.t.d(string);
                                re7Var2.e = Uri.parse(string);
                                re7Var2.z(false);
                                runnable.run();
                                return;
                            }
                        }
                        ue7Var.a(data, intent2.getType());
                    }
                }, (Integer) null);
                break;
            case 6:
                jg7 jg7Var = (jg7) obj4;
                jg7Var.b.c((re7) obj3, jg7Var.j);
                jg7Var.e((re7) obj2, (String) obj);
                break;
            default:
                s9g.h.o(false, (String) obj3, lag.g, kag.GRANTED, true);
                ((pgf) obj4).c(nl0.c);
                ((dx3) obj2).startActivity((Intent) obj);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb A[PHI: r4
      0x00fb: PHI (r4v6 int) = (r4v2 int), (r4v8 int) binds: [B:18:0x0092, B:26:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0221 A[PHI: r2
      0x0221: PHI (r2v8 int) = (r2v7 int), (r2v11 int) binds: [B:67:0x01ad, B:75:0x01d2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.yjj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.i c(android.view.ViewGroup r33) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws1.c(android.view.ViewGroup):androidx.recyclerview.widget.i");
    }

    public final Object g(Object obj) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        Uri uriD;
        byte b = this.a;
        Cursor cursor = null;
        Uri uriCreateDocument = null;
        boolean zEquals = false;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                at1 at1Var = (at1) obj5;
                ndc ndcVar = (ndc) obj4;
                Context context = (Context) obj3;
                qs1 qs1Var = (qs1) obj2;
                if (((List) obj).isEmpty()) {
                    at1Var.h(context, qs1Var);
                } else {
                    at1Var.e.c(new ft1(), ndcVar, new ug(new f9((Object) at1Var, (Object) context, (Object) qs1Var, (byte) 4), (byte) 2));
                }
                return Unit.a;
            case 12:
                return OperaConfigBundleSheet.initializeSheetRequest$lambda$1((qln) obj5, (orm) obj4, (ActionContext) obj3, (ok5) obj2, (ResourceWrapper) obj);
            case 13:
                fp1 fp1Var = (BrowserActivity) obj4;
                Uri uriT = ((olh) obj5).b.t(true);
                String strD = lg7.d(fp1Var, uriT, (String) N.MHVVbhjw((String) obj3, (String) obj2, "multipart/related"));
                if ("file".equals(uriT.getScheme())) {
                    File file = new File(uriT.getPath());
                    if (!file.exists()) {
                        HashSet hashSet = s29.a;
                        file.mkdirs();
                    }
                    return uriT.buildUpon().appendPath(strD).build();
                }
                Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uriT, DocumentsContract.getTreeDocumentId(uriT));
                try {
                    cursorQuery = fp1Var.getContentResolver().query(uriBuildDocumentUriUsingTree, new String[]{"mime_type"}, null, null, null);
                } catch (Exception unused) {
                    cursorQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                        zEquals = "vnd.android.document/directory".equals(cursorQuery.getString(0));
                    }
                } catch (Exception unused2) {
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorQuery;
                    xvg.l(cursor);
                    throw th;
                }
                xvg.l(cursorQuery);
                if (!zEquals && (uriD = v61.d(fp1Var, uriT)) != null) {
                    File file2 = new File(uriD.getPath());
                    HashSet hashSet2 = s29.a;
                    file2.mkdirs();
                }
                try {
                    uriCreateDocument = DocumentsContract.createDocument(fp1Var.getContentResolver(), uriBuildDocumentUriUsingTree, "multipart/related", strD);
                } catch (FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException unused3) {
                }
                return uriCreateDocument;
            default:
                final s14 s14Var = (s14) obj5;
                List list = (List) obj4;
                ilm ilmVar = (ilm) obj3;
                final ContentResolver contentResolver = (ContentResolver) obj2;
                File file3 = (File) s14Var.c;
                if (file3.exists() || file3.mkdirs()) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (int i = 0; i < list.size(); i++) {
                        arrayList.add(null);
                    }
                    vr9 vr9Var = new vr9(new h4m(s14Var, ilmVar, arrayList), list.size());
                    for (final int i2 = 0; i2 < list.size(); i2++) {
                        final Uri uri = (Uri) list.get(i2);
                        final lt2 lt2Var = new lt2((Object) arrayList, i2, (Object) vr9Var, (byte) 5);
                        ((umi) s14Var.d).e(new n5o() { // from class: jln
                            public final Object g(Object obj6) throws IOException, cam {
                                lt2Var.run(s14Var.H(contentResolver, uri, i2, false));
                                return null;
                            }
                        }).a(null);
                    }
                }
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final csh h(int r17, eyl r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws1.h(int, eyl, int[]):csh");
    }

    @Override // defpackage.m9n
    public final void j() {
        gyf gyfVar = (gyf) this.b;
        RecyclerView recyclerView = (RecyclerView) this.c;
        View view = (View) this.d;
        zc3 zc3Var = (zc3) this.e;
        gyfVar.a();
        if (recyclerView.T(view).getBindingAdapterPosition() == -1) {
            return;
        }
        zc3Var.z(view, false);
    }

    @Override // defpackage.bqb
    public final void n(tw7 tw7Var) {
        m62 m62Var = (m62) this.b;
        pqh pqhVar = (pqh) this.c;
        p62 p62Var = (p62) this.d;
        z42 z42Var = (z42) this.e;
        if (tw7Var instanceof rw7) {
        } else {
            if (!(tw7Var instanceof sw7)) {
                h9o.p();
                return;
            }
            long jLongValue = ((Number) ((sw7) tw7Var).a).longValue();
            Object obj = pqhVar.a;
            if (obj != null) {
                w52[] w52VarArr = w52.a;
                p62Var.c(jLongValue, (String) obj, z42Var);
                p62Var.e.a(z42Var);
                p62Var.f.invoke(z42Var);
            }
        }
        if (m62Var != null) {
            m62Var.run();
        }
    }

    public final void onFailure(Exception exc) {
        mab mabVar = (mab) this.b;
        x5f x5fVar = (x5f) this.c;
        r0k r0kVar = (r0k) this.d;
        Locale locale = (Locale) this.e;
        x5fVar.R(4, "Session states: " + exc.getMessage());
        mabVar.f0(r0kVar, locale, x5fVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.auth.blockstore.StoreBytesData$Builder] */
    public final void onSuccess(Object obj) {
        kw3 kw3Var = (kw3) this.b;
        rl rlVar = (rl) this.c;
        BlockstoreClient blockstoreClient = (BlockstoreClient) this.d;
        dg7 dg7Var = (dg7) this.e;
        Boolean bool = (Boolean) obj;
        byte[] bArr = (byte[]) kw3Var.get();
        if (bArr == null || bArr.length > 4096) {
            return;
        }
        blockstoreClient.storeBytes(new Object() { // from class: com.google.android.gms.auth.blockstore.StoreBytesData$Builder
            private byte[] zza;
            private boolean zzb;
            private String zzc = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";

            @NonNull
            public StoreBytesData build() {
                return new StoreBytesData(this.zza, this.zzb, this.zzc);
            }

            @NonNull
            public StoreBytesData$Builder setBytes(@NonNull byte[] bArr2) {
                this.zza = bArr2;
                return this;
            }

            @NonNull
            public StoreBytesData$Builder setKey(@NonNull String str) {
                Preconditions.checkNotEmpty(str, "key cannot be null or empty");
                this.zzc = str;
                return this;
            }

            @NonNull
            public StoreBytesData$Builder setShouldBackupToCloud(boolean z) {
                this.zzb = z;
                return this;
            }
        }.setBytes(bArr).setShouldBackupToCloud(bool.booleanValue()).build()).addOnSuccessListener(new xj(dg7Var, bArr, (byte) 20)).addOnFailureListener(new qp2(rlVar, (byte) 15));
    }

    @Override // defpackage.swl
    public final qwl run() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 7:
                le9 le9Var = (le9) obj4;
                String str = (String) obj3;
                su suVar = (su) obj2;
                ve9 ve9Var = (ve9) obj;
                oji ojiVar = le9Var.d;
                String strR = ojiVar.r();
                PublicKey publicKeyA = ojiVar.A();
                String strU = ojiVar.u();
                if (strR == null || publicKeyA == null || strU == null) {
                    return null;
                }
                return new ae9(le9Var, strR, publicKeyA, strU, (Object) str, (Callback) suVar, (Callback) ve9Var, (byte) 0);
            case 8:
                final le9 le9Var2 = (le9) obj4;
                final Long l = (Long) obj3;
                final hu5 hu5Var = (hu5) obj2;
                final j12 j12Var = (j12) obj;
                final String strR2 = le9Var2.d.r();
                if (strR2 == null) {
                    return null;
                }
                final byte b2 = 0;
                return new qwl() { // from class: yd9
                    @Override // defpackage.qwl
                    public final ih4 run() {
                        byte b3 = b2;
                        Callback callback = j12Var;
                        Object obj5 = hu5Var;
                        Object obj6 = l;
                        switch (b3) {
                            case 0:
                                hu5 hu5Var2 = (hu5) obj5;
                                j12 j12Var2 = (j12) callback;
                                le9 le9Var3 = le9Var2;
                                le9Var3.getClass();
                                return new ee9(le9Var3, j12Var2, (Long) obj6, strR2, hu5Var2);
                            case 1:
                                axl axlVar = (axl) callback;
                                le9 le9Var4 = le9Var2;
                                le9Var4.getClass();
                                return new nwl(le9Var4, axlVar, strR2, (String) obj6, (we9) obj5);
                            case 2:
                                return new nwl(le9Var2, j12Var, strR2, (String) obj6, (Runnable) obj5);
                            default:
                                return new xf1(le9Var2, j12Var, (String) obj6, strR2, (Callback) obj5);
                        }
                    }
                };
            case 16:
                final le9 le9Var3 = (le9) obj4;
                final String str2 = (String) obj3;
                final Runnable runnable = (Runnable) obj2;
                final Callback callback = (Callback) obj;
                final String strR3 = le9Var3.d.r();
                if (strR3 == null) {
                    return null;
                }
                final byte b3 = 2;
                return new qwl() { // from class: yd9
                    @Override // defpackage.qwl
                    public final ih4 run() {
                        byte b32 = b3;
                        Callback callback2 = callback;
                        Object obj5 = runnable;
                        Object obj6 = strR3;
                        switch (b32) {
                            case 0:
                                hu5 hu5Var2 = (hu5) obj5;
                                j12 j12Var2 = (j12) callback2;
                                le9 le9Var32 = le9Var3;
                                le9Var32.getClass();
                                return new ee9(le9Var32, j12Var2, (Long) obj6, str2, hu5Var2);
                            case 1:
                                axl axlVar = (axl) callback2;
                                le9 le9Var4 = le9Var3;
                                le9Var4.getClass();
                                return new nwl(le9Var4, axlVar, str2, (String) obj6, (we9) obj5);
                            case 2:
                                return new nwl(le9Var3, callback, str2, (String) obj6, (Runnable) obj5);
                            default:
                                return new xf1(le9Var3, callback, (String) obj6, str2, (Callback) obj5);
                        }
                    }
                };
            case 17:
                le9 le9Var4 = (le9) obj4;
                vz vzVar = (vz) obj3;
                cxl cxlVar = (cxl) obj2;
                ve9 ve9Var2 = (ve9) obj;
                oji ojiVar2 = le9Var4.d;
                String strR4 = ojiVar2.r();
                PublicKey publicKeyA2 = ojiVar2.A();
                String strU2 = ojiVar2.u();
                if (strR4 == null || publicKeyA2 == null || strU2 == null) {
                    return null;
                }
                return new ae9(le9Var4, strR4, publicKeyA2, strU2, (Object) vzVar, (Callback) cxlVar, (Callback) ve9Var2, (byte) 4);
            default:
                final le9 le9Var5 = (le9) obj4;
                final String str3 = (String) obj3;
                final Callback callback2 = (Callback) obj2;
                final Callback callback3 = (Callback) obj;
                final String strR5 = le9Var5.d.r();
                if (strR5 == null) {
                    return null;
                }
                final byte b4 = 3;
                return new qwl() { // from class: yd9
                    @Override // defpackage.qwl
                    public final ih4 run() {
                        byte b32 = b4;
                        Callback callback22 = callback3;
                        Object obj5 = callback2;
                        Object obj6 = str3;
                        switch (b32) {
                            case 0:
                                hu5 hu5Var2 = (hu5) obj5;
                                j12 j12Var2 = (j12) callback22;
                                le9 le9Var32 = le9Var5;
                                le9Var32.getClass();
                                return new ee9(le9Var32, j12Var2, (Long) obj6, strR5, hu5Var2);
                            case 1:
                                axl axlVar = (axl) callback22;
                                le9 le9Var42 = le9Var5;
                                le9Var42.getClass();
                                return new nwl(le9Var42, axlVar, strR5, (String) obj6, (we9) obj5);
                            case 2:
                                return new nwl(le9Var5, callback3, strR5, (String) obj6, (Runnable) obj5);
                            default:
                                return new xf1(le9Var5, callback3, (String) obj6, strR5, (Callback) obj5);
                        }
                    }
                };
        }
    }
}
