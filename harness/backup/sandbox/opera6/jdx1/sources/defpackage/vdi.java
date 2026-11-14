package defpackage;

import J.N;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaCodec;
import android.net.Uri;
import android.view.Surface;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.api.Callback;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final /* synthetic */ class vdi implements wdi, n5o, vlf, yjj, swl, yyk, m94, OnSuccessListener, mjo, g94 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vdi(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ vdi(s14 s14Var, ilm ilmVar, ArrayList arrayList) {
        this.a = (byte) 14;
        this.b = s14Var;
        this.d = ilmVar;
        this.c = arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public final Object apply(Object obj) {
        ArrayList arrayList;
        ydi ydiVar;
        ArrayList arrayList2;
        int i;
        byte b = this.a;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        int i6 = 1;
        int i7 = 2;
        Object obj2 = this.d;
        Object obj3 = this.c;
        ydi ydiVar2 = (ydi) this.b;
        switch (b) {
            case 0:
                ArrayList arrayList3 = (ArrayList) obj3;
                dp2 dp2Var = (dp2) obj2;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    int i8 = cursor.getInt(7) != 0 ? i6 : 0;
                    ala alaVar = new ala();
                    alaVar.f = new HashMap();
                    String string = cursor.getString(i6);
                    if (string == null) {
                        t3p.q("Null transportName");
                        return null;
                    }
                    alaVar.a = string;
                    alaVar.d = Long.valueOf(cursor.getLong(i7));
                    alaVar.e = Long.valueOf(cursor.getLong(i5));
                    if (i8 != 0) {
                        String string2 = cursor.getString(4);
                        arrayList = null;
                        alaVar.c = new r18(string2 == null ? ydi.f : new p28(string2), cursor.getBlob(5));
                        ydiVar = ydiVar2;
                    } else {
                        arrayList = null;
                        String string3 = cursor.getString(4);
                        p28 p28Var = string3 == null ? ydi.f : new p28(string3);
                        Cursor cursorQuery = ydiVar2.h().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            Cursor cursor2 = cursorQuery;
                            ArrayList arrayList4 = new ArrayList();
                            int length = 0;
                            while (cursor2.moveToNext()) {
                                byte[] blob = cursor2.getBlob(0);
                                arrayList4.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int i9 = 0;
                            int length2 = 0;
                            while (i9 < arrayList4.size()) {
                                byte[] bArr2 = (byte[]) arrayList4.get(i9);
                                ydi ydiVar3 = ydiVar2;
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                                i9++;
                                ydiVar2 = ydiVar3;
                            }
                            ydiVar = ydiVar2;
                            cursorQuery.close();
                            alaVar.c = new r18(p28Var, bArr);
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        alaVar.b = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        alaVar.g = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        alaVar.h = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        alaVar.i = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        alaVar.j = cursor.getBlob(11);
                    }
                    if (!cursor.isNull(12)) {
                        byte[] blob2 = cursor.getBlob(12);
                        if (blob2 == null || blob2.length == 0) {
                            arrayList2 = arrayList;
                        } else {
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(blob2);
                            arrayList2 = new ArrayList();
                            while (byteBufferWrap.hasRemaining() && (i = byteBufferWrap.getInt()) <= byteBufferWrap.remaining()) {
                                byte[] bArr3 = new byte[i];
                                byteBufferWrap.get(bArr3);
                                arrayList2.add(bArr3);
                            }
                        }
                        alaVar.k = arrayList2;
                    }
                    if (!cursor.isNull(13)) {
                        alaVar.l = cursor.getString(13);
                    }
                    arrayList3.add(new fo2(j, dp2Var, alaVar.f()));
                    ydiVar2 = ydiVar;
                    i5 = 3;
                    i6 = 1;
                    i7 = 2;
                }
                return null;
            default:
                HashMap map = (HashMap) obj3;
                s9i s9iVar = (s9i) obj2;
                ArrayList arrayList5 = (ArrayList) s9iVar.c;
                Cursor cursor3 = (Cursor) obj;
                ydiVar2.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(0);
                    int i10 = cursor3.getInt(1);
                    xyc xycVar = xyc.REASON_UNKNOWN;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            xycVar = xyc.MESSAGE_TOO_OLD;
                        } else if (i10 == 2) {
                            xycVar = xyc.CACHE_FULL;
                        } else if (i10 == 3) {
                            xycVar = xyc.PAYLOAD_TOO_BIG;
                        } else if (i10 == i4) {
                            xycVar = xyc.MAX_RETRIES_REACHED;
                        } else if (i10 == i3) {
                            xycVar = xyc.INVALID_PAYLOD;
                        } else if (i10 == i2) {
                            xycVar = xyc.SERVER_ERROR;
                        } else {
                            mkh.q(Integer.valueOf(i10), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new yyc(j2, xycVar));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                }
                for (Map.Entry entry : map.entrySet()) {
                    int i11 = bzc.c;
                    arrayList5.add(new bzc((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                }
                s9iVar.b = (xpl) ydiVar2.l(new rh2(ydiVar2.b.d()));
                s9iVar.d = new fz9(new ndk(ydiVar2.h().compileStatement("PRAGMA page_size").simpleQueryForLong() * ydiVar2.h().compileStatement("PRAGMA page_count").simpleQueryForLong(), kn2.f.a));
                s9iVar.e = (String) ydiVar2.e.get();
                return new j45((xpl) s9iVar.b, Collections.unmodifiableList(arrayList5), (fz9) s9iVar.d, (String) s9iVar.e);
        }
    }

    @Override // defpackage.m94
    public final Object attachCompleter(l94 l94Var) {
        Surface surfaceCreatePersistentInputSurface;
        cyd cydVar = (cyd) this.b;
        buk bukVar = (buk) this.c;
        ep2 ep2Var = (ep2) this.d;
        try {
            j9h j9hVar = (j9h) cydVar.e;
            Executor executor = (Executor) cydVar.c;
            int i = bukVar.g;
            j9hVar.getClass();
            f28 f28Var = new f28(executor, ep2Var, i);
            cydVar.f = f28Var;
            s18 s18Var = f28Var.e;
            if (s18Var instanceof e28) {
                e28 e28Var = (e28) s18Var;
                synchronized (e28Var.a) {
                    surfaceCreatePersistentInputSurface = e28Var.b;
                    if (surfaceCreatePersistentInputSurface == null) {
                        surfaceCreatePersistentInputSurface = MediaCodec.createPersistentInputSurface();
                        e28Var.b = surfaceCreatePersistentInputSurface;
                    }
                }
                cydVar.g = surfaceCreatePersistentInputSurface;
                Objects.toString(surfaceCreatePersistentInputSurface);
                bukVar.a(surfaceCreatePersistentInputSurface, (b2j) cydVar.d, new ip1(cydVar, (byte) 10));
                cydVar.b = 4;
                l94Var.b((f28) cydVar.f);
            } else {
                l94Var.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (rib e) {
            l94Var.d(e);
        }
        return "ConfigureVideoEncoderFuture " + cydVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0352 A[PHI: r2
      0x0352: PHI (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:96:0x02e3, B:100:0x02f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0231 A[PHI: r15
      0x0231: PHI (r15v4 int) = (r15v0 int), (r15v7 int) binds: [B:52:0x01e7, B:58:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.i c(android.view.ViewGroup r32) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vdi.c(android.view.ViewGroup):androidx.recyclerview.widget.i");
    }

    public final void d(qio qioVar) {
        int i;
        String[] strArr = (String[]) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        if (!(qioVar instanceof lio) || Integer.parseInt(strArr[2]) - 1 <= 0) {
            return;
        }
        sjo.f((Context) phf.a.a, Collections.singletonList(str), str2, i);
    }

    public final Object execute() {
        ks3 ks3Var = (ks3) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        dp2 dp2Var = (dp2) this.d;
        ydi ydiVar = (ydi) ks3Var.c;
        ydiVar.getClass();
        if (arrayList.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(ydi.p(arrayList));
            SQLiteDatabase sQLiteDatabaseH = ydiVar.h();
            sQLiteDatabaseH.beginTransaction();
            try {
                sQLiteDatabaseH.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseH.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = cursorRawQuery;
                    while (cursor.moveToNext()) {
                        ydiVar.n(cursor.getInt(0), xyc.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    cursorRawQuery.close();
                    sQLiteDatabaseH.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseH.setTransactionSuccessful();
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            } finally {
                sQLiteDatabaseH.endTransaction();
            }
        }
        ydiVar.l(new qhd(((t55) ks3Var.g).d(), dp2Var));
        return null;
    }

    @Override // defpackage.n5o
    public final Object g(Object obj) {
        File fileO;
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 2:
                return lg7.d((Context) obj4, (Uri) obj2, (String) obj3);
            case 3:
                vnj vnjVar = (vnj) obj4;
                String str = (String) obj2;
                lnj lnjVar = (lnj) obj3;
                if (((Boolean) obj).booleanValue()) {
                    fnj fnjVar = vnjVar.g;
                    if (fnjVar == null) {
                        fnjVar = null;
                    }
                    ifd ifdVar = (ifd) fnjVar.a.get(str);
                    if (ifdVar != null) {
                        vnjVar.h(lnjVar, str, ifdVar);
                    } else {
                        vnjVar.e.add(new pnj(str, lnjVar, (Function1) null));
                        vnjVar.a();
                    }
                }
                return Unit.a;
            case 4:
                vnj vnjVar2 = (vnj) obj2;
                pnj pnjVar = (pnj) obj3;
                InputStream inputStream = ((inj) ((jnj) obj4)).a;
                try {
                    fileO = vnjVar2.o(inputStream, pnjVar.a);
                } catch (IOException unused) {
                    fileO = null;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vtp.v(inputStream, th);
                        throw th2;
                    }
                }
                vtp.v(inputStream, null);
                return fileO;
            case 5:
                kuj kujVar = (kuj) obj4;
                Uri uri = (Uri) obj2;
                String str2 = (String) obj3;
                dx3 dx3Var = kujVar.A;
                if (((Boolean) obj).booleanValue()) {
                    tl3 tl3Var = new tl3(kujVar, uri);
                    String[] strArr = OperaApplication.K;
                    dx3Var.getApplication().n().b(kujVar.y, uri, "image/png", str2, (byte[]) null, kujVar.C.c, new eof(kujVar, tl3Var, (byte) 18));
                    kujVar.D.run();
                } else {
                    qim qimVar = dx3Var.o;
                    Objects.requireNonNull(qimVar);
                    ysj ysjVar = qimVar.e;
                    ysjVar.b(am2.i(2132021582, 5000, ysjVar), ijm.b);
                }
                return null;
            case 13:
                vq8 vq8Var = (vq8) obj4;
                RealCall realCall = (RealCall) obj2;
                rii riiVar = (rii) obj3;
                List list = (List) obj;
                if (list != null) {
                    ((kze) vq8Var.j).r(list);
                }
                realCall.enqueue(new dln(vq8Var, riiVar, true));
                return null;
            default:
                s14 s14Var = (s14) obj4;
                s14Var.getClass();
                ((ilm) obj3).run((ArrayList) obj2);
                s14Var.G(new rl((byte) 4));
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vdi.l(java.lang.Object):void");
    }

    public final void onSuccess(Object obj) {
        ndc ndcVar;
        int i;
        mhk mhkVar;
        aco acoVar = (aco) this.b;
        r0k r0kVar = (r0k) this.c;
        w7j w7jVar = (w7j) this.d;
        int iIntValue = ((Integer) obj).intValue();
        BrowserActivity browserActivity = ((ydn) acoVar.b.b).i;
        mhk mhkVar2 = browserActivity != null ? new mhk(browserActivity) : null;
        Context context = acoVar.a;
        if (mhkVar2 != null) {
            ndcVar = (BrowserActivity) mhkVar2.c;
            i = mhkVar2.b;
            mhkVar = mhkVar2;
        } else {
            ndcVar = null;
            i = 0;
            mhkVar = null;
        }
        u85.d(context, r0kVar, iIntValue, mhkVar, ndcVar, i, new fmn(acoVar, w7jVar, (byte) 7), new ilm(acoVar, (byte) 19));
    }

    public final qwl run() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 9:
                le9 le9Var = (le9) obj3;
                we9 we9Var = (we9) obj2;
                axl axlVar = (axl) obj;
                oji ojiVar = le9Var.d;
                String strU = ojiVar.u();
                String strR = ojiVar.r();
                if (strU == null || strR == null) {
                    return null;
                }
                return new yd9(le9Var, strU, strR, we9Var, axlVar, (byte) 1);
            default:
                le9 le9Var2 = (le9) obj3;
                Callback callback = (Callback) obj2;
                Callback callback2 = (Callback) obj;
                String strR2 = le9Var2.d.r();
                if (strR2 != null) {
                    return new zd9(le9Var2, strR2, callback, callback2, (byte) 3);
                }
                return null;
        }
    }

    public final void u(OperaListItem operaListItem, boolean z) {
        byte b = this.a;
        ijm ijmVar = ijm.b;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 6:
                oe6 oe6Var = (oe6) obj2;
                xtb[] xtbVarArr = uxk.w;
                dyk dykVarI0 = ((uxk) obj3).I0();
                j31 j31Var = new j31((pqh) obj, (byte) 6);
                zwk zwkVar = dykVarI0.i;
                ne6 ne6Var = oe6Var.a;
                if (ne6Var.a == 3 && dykVarI0.f.b() != jh0.d && z) {
                    zwkVar.getClass();
                    if (!zwk.h() && !zwk.g()) {
                        avj avjVar = cak.d;
                        if (!avj.b(1) ? false : N.MwdTx3oy()) {
                            kxk kxkVar = dykVarI0.j;
                            tmi tmiVar = new tmi(dykVarI0, oe6Var, j31Var, (byte) 8);
                            w wVar = kxkVar.f;
                            db dbVar = (db) kxkVar.a.get();
                            nej nejVar = ((qim) kxkVar.g.get()).d;
                            im6 im6Var = new im6(wVar, dbVar, tmiVar, (byte) 6);
                            nejVar.getClass();
                            nejVar.b(im6Var, ijmVar);
                            break;
                        }
                    }
                }
                h5k h5kVar = dykVarI0.e.g;
                HashSet hashSet = (HashSet) h5kVar.b;
                h5kVar.a = true;
                HashSet hashSet2 = (HashSet) h5kVar.c;
                if (!z) {
                    hashSet2.remove(ne6Var);
                    hashSet.add(ne6Var);
                    break;
                } else {
                    hashSet2.add(ne6Var);
                    hashSet.remove(ne6Var);
                    break;
                }
            default:
                jvg jvgVar = (jvg) obj3;
                q5g q5gVar = (q5g) obj2;
                pk5 pk5Var = (pk5) obj;
                bmn bmnVar = (bmn) jvgVar.c;
                qln qlnVar = bmnVar.b;
                qlnVar.o(z);
                if (z) {
                    orm ormVar = bmnVar.c;
                    eej eejVar = bmnVar.h;
                    if (zg.e == null) {
                        if (((vq8) qlnVar.f.e).i()) {
                            urj urjVar = new urj((byte) 9);
                            eejVar.getClass();
                            og5 og5Var = new og5(new zg(qlnVar), urjVar);
                            nej nejVar2 = eejVar.a;
                            nejVar2.getClass();
                            nejVar2.b(og5Var, ijmVar);
                            zg.e = og5Var;
                        } else {
                            qlnVar.f.r(new h4m(qlnVar, ormVar, eejVar, (byte) 8));
                        }
                    }
                    ((qf) jvgVar.b).b();
                } else {
                    qlnVar.n("most_popular");
                }
                ((RecyclerView) q5gVar.c).invalidate();
                pk5Var.i((OperaListItem) q5gVar.d, z);
                break;
        }
    }
}
