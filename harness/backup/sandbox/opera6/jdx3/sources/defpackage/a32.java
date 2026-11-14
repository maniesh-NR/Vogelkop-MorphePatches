package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.recyclerview.widget.i;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.autofill.OperaAutofillIntentDispatcherActivity;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.favorites.g;
import com.opera.api.Callback;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import org.chromium.net.UrlResponseInfo;
import org.chromium.ui.base.WindowAndroid;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class a32 implements bcf, yjj, xo4, ls5, yyk, gx6, n5o, mr8, SuccessContinuation, swl, OnSuccessListener, qnb, zpd, op5, dkj, av2, jr9, auk, wdi {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a32(aqd aqdVar, n3j n3jVar, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = (byte) 18;
        this.b = aqdVar;
        this.c = bundle;
        this.d = resultReceiver;
    }

    public /* synthetic */ a32(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.dkj
    public final void a() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case SizeUtil.textSize0 /* 20 */:
                ((pgf) obj3).c(nl0.b);
                ((dx3) obj2).startActivity((Intent) obj);
                break;
            default:
                List list = (List) obj2;
                f03.T((WindowAndroid) obj3, (String[]) list.toArray(new String[list.size()]), (bag) obj, false);
                break;
        }
    }

    public final void accept(Object obj) {
        ro9 ro9Var = (ro9) this.b;
        ((prd) obj).e(ro9Var.b, (jrd) this.c, (tjd) this.d);
    }

    @Override // defpackage.wdi
    public final Object apply(Object obj) {
        long jInsert;
        byte[] bArrArray;
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 25:
                return new bp4((zo4) obj3, (zn4) obj2, ((tjg) obj4).u, (okg) obj);
            default:
                ydi ydiVar = (ydi) obj4;
                jn2 jn2Var = (jn2) obj3;
                r18 r18Var = jn2Var.c;
                String str = jn2Var.a;
                dp2 dp2Var = (dp2) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = ydiVar.h().compileStatement("PRAGMA page_size").simpleQueryForLong() * ydiVar.h().compileStatement("PRAGMA page_count").simpleQueryForLong();
                kn2 kn2Var = ydiVar.d;
                if (jSimpleQueryForLong >= kn2Var.a) {
                    ydiVar.n(1L, xyc.d, str);
                    return -1L;
                }
                Long lK = ydi.k(sQLiteDatabase, dp2Var);
                if (lK != null) {
                    jInsert = lK.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", dp2Var.a);
                    contentValues.put("priority", Integer.valueOf(ryg.a(dp2Var.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = dp2Var.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i = kn2Var.e;
                byte[] bArr2 = r18Var.b;
                boolean z = bArr2.length <= i;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(jn2Var.d));
                contentValues2.put("uptime_ms", Long.valueOf(jn2Var.e));
                contentValues2.put("payload_encoding", r18Var.a.a);
                contentValues2.put("code", jn2Var.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", jn2Var.g);
                contentValues2.put("pseudonymous_id", jn2Var.h);
                contentValues2.put("experiment_ids_clear_blob", jn2Var.i);
                contentValues2.put("experiment_ids_encrypted_blob", jn2Var.j);
                ArrayList arrayList = jn2Var.k;
                if (arrayList == null) {
                    bArrArray = new byte[0];
                } else {
                    byte[][] bArr3 = (byte[][]) arrayList.toArray(new byte[0][]);
                    int length = bArr3.length << 2;
                    int length2 = 0;
                    for (byte[] bArr4 : bArr3) {
                        length2 += bArr4.length;
                    }
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2 + length);
                    for (byte[] bArr5 : bArr3) {
                        byteBufferAllocate.putInt(bArr5.length);
                        byteBufferAllocate.put(bArr5);
                    }
                    bArrArray = byteBufferAllocate.array();
                }
                contentValues2.put("experiment_ids_encrypted_list_blob", bArrArray);
                contentValues2.put("pseudonymous_id_update_receiver_class_name", jn2Var.l);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(bArr2.length / i);
                    for (int i2 = 1; i2 <= iCeil; i2++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i2 - 1) * i, Math.min(i2 * i, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i2));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(jn2Var.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(Constants.Params.NAME, (String) entry.getKey());
                    contentValues4.put(Constants.Params.VALUE, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
        }
    }

    public final void b(nod nodVar) {
        aqd aqdVar = (aqd) this.b;
        Bundle bundle = (Bundle) this.c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        npd npdVar = aqdVar.f;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        r0b r0bVarM = npdVar.m(nodVar);
        if (resultReceiver != null) {
            r0bVarM.addListener(new hpd(r0bVarM, resultReceiver, (byte) 1), m97.a);
        }
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        return new jv2(ov0.a(LayoutInflater.from(viewGroup.getContext()).inflate(2131558561, viewGroup, false)), (xj) this.b, (so3) this.c, (li) this.d);
    }

    @Override // defpackage.mr8
    public final boolean d(hq8 hq8Var) {
        nr8 nr8Var = (nr8) this.b;
        String str = (String) this.c;
        p6l p6lVar = (p6l) this.d;
        nr8Var.getClass();
        return (TextUtils.isEmpty(str) || hq8Var == null || !wqm.J(str, hq8Var.i(p6lVar), false, false) || (hq8Var instanceof g)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, android.widget.ImageView, androidx.appcompat.widget.AppCompatImageView, com.opera.android.custom_views.StylingImageView] */
    @Override // defpackage.ls5
    public final void e(int i, int i2, byte[] bArr, int i3, int i4) {
        Bitmap bitmapDecodeByteArray;
        at5 at5Var = (at5) this.b;
        ?? r3 = (StylingImageView) this.c;
        AppCompatImageView appCompatImageView = (StylingImageView) this.d;
        if (bArr == null || bArr.length == 0 || (bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) == null) {
            return;
        }
        at5Var.l = true;
        r3.setBackgroundResource(2131231332);
        r3.setClipToOutline(true);
        r3.c(null);
        r3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r3.setImageBitmap(bitmapDecodeByteArray);
        if (at5Var.d.s) {
            appCompatImageView.setVisibility(0);
        }
    }

    @Override // defpackage.yyk
    public final Object execute() {
        dv6 dv6Var = (dv6) this.b;
        dp2 dp2Var = (dp2) this.c;
        jn2 jn2Var = (jn2) this.d;
        ydi ydiVar = dv6Var.d;
        ydiVar.getClass();
        myg mygVar = dp2Var.c;
        if (Log.isLoggable("TRuntime.SQLiteEventStore", 3)) {
            new StringBuilder("Storing event with priority=").append(mygVar);
        }
        ((Long) ydiVar.l(new a32((Object) ydiVar, (Object) jn2Var, (Object) dp2Var, (byte) 29))).getClass();
        dv6Var.a.n(dp2Var, 1, false);
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, android.content.Context, com.opera.android.autofill.OperaAutofillIntentDispatcherActivity, java.lang.Object] */
    @Override // defpackage.av2
    public final void f(Integer num) {
        ?? r0 = (OperaAutofillIntentDispatcherActivity) this.b;
        t3g t3gVar = (t3g) this.c;
        s3g s3gVar = (s3g) this.d;
        int i = OperaAutofillIntentDispatcherActivity.i;
        if (num == null || num.intValue() != -1) {
            r0.finish();
        } else {
            r0.C(r0.getString(2132020340), new jbd(r0, t3gVar, s3gVar, (byte) 10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r13) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
        /*
            r12 = this;
            byte r0 = r12.a
            java.lang.Object r1 = r12.d
            java.lang.Object r2 = r12.c
            java.lang.Object r12 = r12.b
            switch(r0) {
                case 7: goto L7f;
                case 21: goto L3a;
                default: goto Lb;
            }
        Lb:
            ueh r12 = (defpackage.ueh) r12
            r5 = r2
            android.net.Uri r5 = (android.net.Uri) r5
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L32
            java.lang.String r13 = "data:text/plain,"
            android.net.Uri r4 = android.net.Uri.parse(r13)
            ag7 r3 = r12.z
            java.lang.String r6 = r12.D
            long r9 = r12.F
            s2g r11 = new s2g
            r13 = 3
            r11.<init>(r12, r5, r7, r13)
            r8 = 0
            r3.b(r4, r5, r6, r7, r8, r9, r11)
            goto L37
        L32:
            j3i r12 = r12.B
            r12.invoke()
        L37:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        L3a:
            java.lang.String r12 = (java.lang.String) r12
            com.opera.api.Callback r2 = (com.opera.api.Callback) r2
            ogf r1 = (defpackage.ogf) r1
            ogf r13 = (defpackage.ogf) r13
            r0 = 0
            if (r13 == 0) goto L5f
            java.lang.String r3 = r13.a
            boolean r4 = r3.equals(r12)
            if (r4 != 0) goto L5b
            java.lang.String r3 = com.opera.android.browser.BrowserUtils.a(r3)
            java.lang.String r4 = com.opera.android.browser.BrowserUtils.a(r12)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5f
        L5b:
            r2.run(r13)
            goto L7e
        L5f:
            if (r1 == 0) goto L7b
            java.lang.String r13 = r1.a
            boolean r3 = r13.equals(r12)
            if (r3 != 0) goto L77
            java.lang.String r13 = com.opera.android.browser.BrowserUtils.a(r13)
            java.lang.String r12 = com.opera.android.browser.BrowserUtils.a(r12)
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L7b
        L77:
            r2.run(r1)
            goto L7e
        L7b:
            r2.run(r0)
        L7e:
            return r0
        L7f:
            re7 r12 = (defpackage.re7) r12
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r1 = (java.lang.String) r1
            xf7 r12 = r12.a
            ag7 r12 = r12.d
            android.content.Context r12 = r12.b
            java.lang.String r12 = defpackage.lg7.d(r12, r2, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a32.g(java.lang.Object):java.lang.Object");
    }

    public final csh h(int i, eyl eylVar, int[] iArr) {
        bx6 bx6Var = (bx6) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        z0b z0bVarP = h1b.p();
        for (int i2 = 0; i2 < eylVar.a; i2++) {
            z0bVarP.c(new fx6(i, eylVar, i2, bx6Var, iArr[i2], str, str2));
        }
        return z0bVarP.g();
    }

    public final void i(boolean z, boolean z2) {
        OperaAutofillIntentDispatcherActivity operaAutofillIntentDispatcherActivity = (OperaAutofillIntentDispatcherActivity) this.b;
        String str = (String) this.c;
        Function1 function1 = (Function1) this.d;
        int i = OperaAutofillIntentDispatcherActivity.i;
        if (z2) {
            ub2 ub2Var = (ub2) operaAutofillIntentDispatcherActivity.c.getValue();
            new rml(new s0o(str), ub2Var.a).a(new t02(ub2Var, (byte) 11)).l();
        }
        function1.invoke(Boolean.valueOf(z));
    }

    public final void j(yo2 yo2Var) {
        n1f n1fVar;
        yhe yheVar = (yhe) this.b;
        zd4 zd4Var = (zd4) this.c;
        buk bukVar = (buk) this.d;
        PreviewView previewView = (PreviewView) yheVar.b;
        Objects.toString(yo2Var);
        boolean z = zd4Var.g().j() == 0;
        ywg ywgVar = previewView.d;
        Size size = bukVar.b;
        ywgVar.getClass();
        Objects.toString(yo2Var);
        Objects.toString(size);
        ywgVar.b = yo2Var.a;
        ywgVar.c = yo2Var.b;
        int i = yo2Var.c;
        ywgVar.e = i;
        ywgVar.a = size;
        ywgVar.f = z;
        ywgVar.g = yo2Var.d;
        ywgVar.d = yo2Var.e;
        if (i == -1 || ((n1fVar = previewView.b) != null && (n1fVar instanceof euk))) {
            previewView.e = true;
        } else {
            previewView.e = false;
        }
        previewView.b();
    }

    public final void k() {
        yhe yheVar = (yhe) this.b;
        xwg xwgVar = (xwg) this.c;
        zd4 zd4Var = (zd4) this.d;
        AtomicReference atomicReference = ((PreviewView) yheVar.b).g;
        while (true) {
            if (atomicReference.compareAndSet(xwgVar, null)) {
                xwgVar.b(axg.a);
                break;
            } else if (atomicReference.get() != xwgVar) {
                break;
            }
        }
        sr9 sr9Var = xwgVar.e;
        if (sr9Var != null) {
            sr9Var.cancel(false);
            xwgVar.e = null;
        }
        zd4Var.b().f(xwgVar);
    }

    public final g3o l0(View view, g3o g3oVar) {
        nrl nrlVar = (nrl) this.b;
        i22 i22Var = (i22) this.c;
        i22 i22Var2 = (i22) this.d;
        nrlVar.a = g3oVar.a.u(8);
        i22Var.invoke();
        i22Var2.invoke();
        return g3oVar;
    }

    @Override // defpackage.xo4
    public final PendingResult m(RemoteMediaClient remoteMediaClient) {
        zo4 zo4Var = (zo4) this.b;
        int[] iArr = (int[]) this.c;
        MediaQueueItem[] mediaQueueItemArr = (MediaQueueItem[]) this.d;
        int i = iArr[0];
        int[] iArr2 = zo4Var.l;
        return remoteMediaClient.queueInsertItems(mediaQueueItemArr, i < iArr2.length ? iArr2[i] : 0, (JSONObject) null);
    }

    public final void onSuccess(Object obj) {
        mab mabVar = (mab) this.b;
        r0k r0kVar = (r0k) this.c;
        x5f x5fVar = (x5f) this.d;
        Integer num = (Integer) obj;
        if (mabVar.getLifecycle().i.d(qcc.c)) {
            byte b = 1;
            mabVar.d = u85.d(mabVar.requireContext(), r0kVar, num.intValue(), new z8e(mabVar, (byte) 1), mabVar, mabVar.e, new kab(mabVar, b), new lab(mabVar, x5fVar, b));
        }
    }

    @Override // defpackage.swl
    public final qwl run() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 11:
                final le9 le9Var = (le9) obj3;
                final ue9 ue9Var = (ue9) obj2;
                final pe9 pe9Var = (pe9) obj;
                final String strR = le9Var.d.r();
                if (strR == null) {
                    return null;
                }
                final byte b2 = 1;
                return new qwl() { // from class: zd9
                    @Override // defpackage.qwl
                    public final ih4 run() {
                        byte b3 = b2;
                        Callback callback = pe9Var;
                        Object obj4 = ue9Var;
                        String str = strR;
                        le9 le9Var2 = le9Var;
                        switch (b3) {
                            case 0:
                                j12 j12Var = (j12) callback;
                                le9Var2.getClass();
                                return new ci2(le9Var2, j12Var, str, (cn7) obj4);
                            case 1:
                                pe9 pe9Var2 = (pe9) callback;
                                le9Var2.getClass();
                                return new ai2(le9Var2, pe9Var2, str, (ue9) obj4);
                            case 2:
                                hu5 hu5Var = (hu5) callback;
                                le9Var2.getClass();
                                return new ee9(le9Var2, hu5Var, str, (hu5) obj4);
                            default:
                                return new ai2(le9Var2, callback, str, (Callback) obj4);
                        }
                    }
                };
            case 12:
                final le9 le9Var2 = (le9) obj3;
                final cn7 cn7Var = (cn7) obj2;
                final j12 j12Var = (j12) obj;
                final String strR2 = le9Var2.d.r();
                if (strR2 == null) {
                    return null;
                }
                final byte b3 = 0;
                return new qwl() { // from class: zd9
                    @Override // defpackage.qwl
                    public final ih4 run() {
                        byte b32 = b3;
                        Callback callback = j12Var;
                        Object obj4 = cn7Var;
                        String str = strR2;
                        le9 le9Var22 = le9Var2;
                        switch (b32) {
                            case 0:
                                j12 j12Var2 = (j12) callback;
                                le9Var22.getClass();
                                return new ci2(le9Var22, j12Var2, str, (cn7) obj4);
                            case 1:
                                pe9 pe9Var2 = (pe9) callback;
                                le9Var22.getClass();
                                return new ai2(le9Var22, pe9Var2, str, (ue9) obj4);
                            case 2:
                                hu5 hu5Var = (hu5) callback;
                                le9Var22.getClass();
                                return new ee9(le9Var22, hu5Var, str, (hu5) obj4);
                            default:
                                return new ai2(le9Var22, callback, str, (Callback) obj4);
                        }
                    }
                };
            default:
                final le9 le9Var3 = (le9) obj3;
                final hu5 hu5Var = (hu5) obj2;
                final hu5 hu5Var2 = (hu5) obj;
                final String strR3 = le9Var3.d.r();
                if (strR3 == null) {
                    return null;
                }
                final byte b4 = 2;
                return new qwl() { // from class: zd9
                    @Override // defpackage.qwl
                    public final ih4 run() {
                        byte b32 = b4;
                        Callback callback = hu5Var2;
                        Object obj4 = hu5Var;
                        String str = strR3;
                        le9 le9Var22 = le9Var3;
                        switch (b32) {
                            case 0:
                                j12 j12Var2 = (j12) callback;
                                le9Var22.getClass();
                                return new ci2(le9Var22, j12Var2, str, (cn7) obj4);
                            case 1:
                                pe9 pe9Var2 = (pe9) callback;
                                le9Var22.getClass();
                                return new ai2(le9Var22, pe9Var2, str, (ue9) obj4);
                            case 2:
                                hu5 hu5Var3 = (hu5) callback;
                                le9Var22.getClass();
                                return new ee9(le9Var22, hu5Var3, str, (hu5) obj4);
                            default:
                                return new ai2(le9Var22, callback, str, (Callback) obj4);
                        }
                    }
                };
        }
    }

    /* renamed from: run, reason: collision with other method in class */
    public final void m0run() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        mnb mnbVar = (mnb) this.b;
        switch (b) {
            case 16:
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) obj2;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                pnb pnbVar = mnbVar.d;
                if (pnbVar.f.compareAndSet(5, 4)) {
                    mnbVar.a.onReadCompleted(pnbVar, urlResponseInfo, byteBuffer);
                    break;
                }
                break;
            default:
                mnbVar.a.onRedirectReceived(mnbVar.d, (qqm) obj2, (String) obj);
                break;
        }
    }

    public final Task then(Object obj) {
        String string;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        hf7 hf7Var = (hf7) this.d;
        String str2 = (String) obj;
        hb6 hb6VarD = FirebaseMessaging.d(firebaseMessaging.b);
        String strE = firebaseMessaging.e();
        String strA = firebaseMessaging.j.a();
        synchronized (hb6VarD) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str2);
                jSONObject.put("appVersion", strA);
                jSONObject.put("timestamp", jCurrentTimeMillis);
                string = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                string = null;
            }
            if (string != null) {
                SharedPreferences.Editor editorEdit = hb6VarD.a.edit();
                editorEdit.putString(hb6.a(strE, str), string);
                editorEdit.commit();
            }
        }
        if (firebaseMessaging.d.J() || hf7Var == null || !str2.equals(hf7Var.a)) {
            r49 r49Var = firebaseMessaging.a;
            r49Var.a();
            if ("[DEFAULT]".equals(r49Var.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    r49Var.a();
                }
                boolean zJ = firebaseMessaging.d.J();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (zJ) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new esg(firebaseMessaging.b).z(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
