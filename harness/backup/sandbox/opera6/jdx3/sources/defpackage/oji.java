package defpackage;

import J.N;
import ads_mobile_sdk.wl3;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.util.ArrayMap;
import android.util.Base64;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.internal.j;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.leanplum.internal.Constants;
import com.leanplum.internal.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* loaded from: classes.dex */
public final class oji implements iyg, tri, hti, w9m, f94, la, mgd, inh, htd, uom, mf1, WebMessageListenerBoundaryInterface {
    public static oji b;
    public static oji c;
    public Object a;

    public oji(Context context, byte b2) {
        switch (b2) {
            case 8:
                this.a = w1h.l(context, vml.d, "stats", new bg1[0]);
                break;
            default:
                this.a = new xcj(context);
                break;
        }
    }

    public oji(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.a = new rii((Object) view, (byte) 5);
            return;
        }
        mvj mvjVar = new mvj(view, (byte) 5);
        mvjVar.c = view;
        this.a = mvjVar;
    }

    public oji(azl azlVar) {
        go5 ec3Var = new ec3(azlVar.b, (byte) 0);
        go5 ec3Var2 = new ec3(azlVar.c, (byte) 1);
        go5 ec3Var3 = new ec3(azlVar.e, (byte) 4);
        uoe uoeVar = azlVar.d;
        go5 ec3Var4 = new ec3(uoeVar, (byte) 2);
        go5 ec3Var5 = new ec3(uoeVar, (byte) 3);
        go5 foeVar = new foe(uoeVar);
        go5 aoeVar = new aoe(uoeVar);
        Context context = azlVar.a;
        int i = q4o.a;
        this.a = e82.p(new go5[]{ec3Var, ec3Var2, ec3Var3, ec3Var4, ec3Var5, foeVar, aoeVar, new moe((ConnectivityManager) context.getSystemService("connectivity"))});
    }

    public /* synthetic */ oji(Object obj) {
        this.a = obj;
    }

    public oji(n27 n27Var) {
        float f = m0k.a;
        f82 f82Var = new f82();
        f82Var.a = f;
        f82Var.b = n27Var.b() * 386.0878f * 160.0f * 0.84f;
        this.a = f82Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] n(java.io.InputStream r5) throws java.lang.Throwable {
        /*
            r0 = 0
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L23
            r2.<init>()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L23
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
        Lb:
            int r3 = r5.read(r1)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            r4 = -1
            if (r3 == r4) goto L24
            r2.write(r1, r0, r3)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L19
            goto Lb
        L16:
            r0 = move-exception
            r1 = r2
            goto L1c
        L19:
            r1 = r2
            goto L23
        L1b:
            r0 = move-exception
        L1c:
            r9h.l(r1)
            r9h.l(r5)
            throw r0
        L23:
            r2 = r1
        L24:
            r9h.l(r2)
            r9h.l(r5)
            if (r2 == 0) goto L31
            byte[] r5 = r2.toByteArray()
            return r5
        L31:
            byte[] r5 = new byte[r0]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oji.n(java.io.InputStream):byte[]");
    }

    public static ContentValues t(String str, double d, long j) {
        ContentValues contentValues = new ContentValues();
        if (str != null) {
            contentValues.put("target", str);
        }
        contentValues.put("priority", Double.valueOf(d));
        contentValues.put(Constants.Params.TIME, Long.valueOf(j));
        contentValues.put("version", (Integer) 3);
        return contentValues;
    }

    public static oji y(Context context) {
        oji ojiVar = b;
        if (ojiVar != null) {
            return ojiVar;
        }
        oji ojiVar2 = new oji(context, (byte) 8);
        b = ojiVar2;
        return ojiVar2;
    }

    public final PublicKey A() {
        bf9 bf9Var = (bf9) this.a;
        String string = ((SharedPreferences) bf9Var.d.get()).getString("pub", null);
        if (string != null) {
            PublicKey publicKeyC = p36.c(Base64.decode(string, 0));
            if (publicKeyC != null) {
                return publicKeyC;
            }
            bf9Var.k();
        }
        KeyPair keyPairM = bf9Var.m();
        if (keyPairM == null) {
            return null;
        }
        return keyPairM.getPublic();
    }

    public final ytm B(Class cls) {
        o();
        return (ytm) cls.cast(((ArrayMap) this.a).get(cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(nt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.hpn
            if (r0 == 0) goto L13
            r0 = r5
            hpn r0 = (defpackage.hpn) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            hpn r0 = new hpn
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ybh.y(r5)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            ybh.y(r5)
            r0.v = r3
            java.lang.Object r5 = r4.w(r0)
            if (r5 != r1) goto L3a
            return r1
        L3a:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.a
            j4c r4 = (defpackage.j4c) r4
            java.lang.Object r4 = r4.get()
            m9c r4 = (defpackage.m9c) r4
            java.lang.String r4 = r4.b()
            bum r0 = new bum
            r0.<init>(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oji.C(nt5):java.lang.Object");
    }

    public final void D(vyi vyiVar) {
        int i;
        SelectionPopupControllerImpl selectionPopupControllerImpl = (SelectionPopupControllerImpl) this.a;
        if (!selectionPopupControllerImpl.D) {
            selectionPopupControllerImpl.L = null;
            return;
        }
        int i2 = vyiVar.d;
        if (i2 > 0 || (i = vyiVar.e) < 0) {
            selectionPopupControllerImpl.L = null;
            selectionPopupControllerImpl.J();
            return;
        }
        selectionPopupControllerImpl.L = vyiVar;
        if (i2 != 0 || i != 0) {
            N.MjgOFo_o(selectionPopupControllerImpl.e.b, i2, i, true);
            return;
        }
        shf shfVar = selectionPopupControllerImpl.J;
        if (shfVar != null) {
            shfVar.E(selectionPopupControllerImpl.z, selectionPopupControllerImpl.A, vyiVar);
        }
        selectionPopupControllerImpl.J();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(com.opera.android.suggestion.Suggestion r7) {
        /*
            r6 = this;
            java.lang.Object r6 = r6.a
            mrk r6 = (defpackage.mrk) r6
            boolean r0 = r6.c()
            r1 = 0
            if (r0 == 0) goto L4b
            hqk r6 = r6.C
            r0 = 0
            r2 = 5
            r3 = 4
            if (r7 != 0) goto L1f
            r6.getClass()
            xpk r7 = defpackage.xpk.d
            r6.I(r0, r3, r7)
            r6.I(r0, r2, r7)
        L1d:
            r6 = r1
            goto L47
        L1f:
            int r4 = r7.a
            r5 = 12
            if (r4 != r5) goto L32
            r6.getClass()
            xpk r4 = defpackage.xpk.d
            r6.I(r0, r2, r4)
            boolean r6 = r6.I(r7, r3, r4)
            goto L47
        L32:
            r5 = 13
            if (r4 != r5) goto L43
            r6.getClass()
            xpk r4 = defpackage.xpk.d
            r6.I(r0, r3, r4)
            boolean r6 = r6.I(r7, r2, r4)
            goto L47
        L43:
            r6.getClass()
            goto L1d
        L47:
            if (r6 == 0) goto L4b
            r6 = 1
            return r6
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oji.E(com.opera.android.suggestion.Suggestion):boolean");
    }

    public final ArrayList F(HashMap map, String str, String str2, boolean z) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = ((xcj) this.a).h().query("targets", new String[]{"target", "version"}, str2, null, null, null, str);
        int columnIndex = cursorQuery.getColumnIndex("target");
        int columnIndex2 = cursorQuery.getColumnIndex("version");
        if (cursorQuery.moveToFirst()) {
            HashMap map2 = null;
            do {
                String string = cursorQuery.getString(columnIndex);
                long j = cursorQuery.getLong(columnIndex2);
                wcj wcjVar = (wcj) map.get(string);
                if (wcjVar != null) {
                    arrayList.add(wcjVar);
                    hashSet.add(wcjVar);
                } else if (j < 3) {
                    if (map2 == null) {
                        map2 = new HashMap(map.size());
                        for (Map.Entry entry : map.entrySet()) {
                            Pair pairA = zcj.a((String) entry.getKey());
                            if (pairA != null) {
                                String str3 = (String) pairA.second;
                                List arrayList2 = (List) map2.get(str3);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    map2.put(str3, arrayList2);
                                }
                                arrayList2.add((wcj) entry.getValue());
                            }
                        }
                    }
                    List<wcj> list = (List) map2.get(string);
                    if (list != null) {
                        for (wcj wcjVar2 : list) {
                            arrayList.add(wcjVar2);
                            hashSet.add(wcjVar2);
                        }
                    }
                }
            } while (cursorQuery.moveToNext());
        }
        cursorQuery.close();
        if (z) {
            for (wcj wcjVar3 : map.values()) {
                if (!hashSet.contains(wcjVar3)) {
                    arrayList.add(wcjVar3);
                    hashSet.add(wcjVar3);
                }
            }
        }
        return arrayList;
    }

    public final void G(int i) {
        String strT = fki.t(i);
        b59 b59Var = (b59) this.a;
        j.b((SharedPreferences) b59Var.get(), strT, ((SharedPreferences) b59Var.get()).getInt(strT, 0) + 1);
    }

    public final void a(int i, d36 d36Var, long j, int i2) throws MediaCodec.CryptoException {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, d36Var.i, j, i2);
    }

    public final void b(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    public final void c(int i, int i2, int i3, long j) throws MediaCodec.CryptoException {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.w9m
    public final Object create(String str) {
        List list = (List) ((Map) this.a).get(str);
        if (list == null) {
            return null;
        }
        return new gjk(str, list);
    }

    @Override // defpackage.tri
    public final void d(View view) {
        Object tag = view.getTag();
        if (tag instanceof eri) {
            ((mri) this.a).k.n((eri) tag);
        }
    }

    @Override // defpackage.w9m
    public final Object e(int i, String str) {
        String str2 = str + i;
        List list = (List) ((Map) this.a).get(str2);
        if (list == null) {
            return null;
        }
        return new gjk(str2, list);
    }

    public final boolean f(String str, PrintDocumentAdapter printDocumentAdapter) {
        qji qjiVar = (qji) this.a;
        qjiVar.a();
        PrintAttributes printAttributesC = qjiVar.c();
        qjiVar.f = null;
        qjiVar.g = new CancellationSignal();
        qjiVar.j = printDocumentAdapter;
        printDocumentAdapter.onStart();
        qjiVar.g(printAttributesC);
        return true;
    }

    public final void flush() {
    }

    @Override // defpackage.inh
    public final boolean g() {
        return true;
    }

    public final n89 get(int i) {
        return (w89) this.a;
    }

    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public final FileChannel h() {
        return new FileInputStream((File) this.a).getChannel();
    }

    public final void i() {
    }

    @Override // defpackage.inh
    public final b2l j() {
        r9l r9lVar = (r9l) this.a;
        b2l b2lVarA = r9lVar.c.A();
        int iOrdinal = ((b3c) r9lVar.y.g()).ordinal();
        byte b2 = 3;
        if (iOrdinal == 0) {
            z5l z5lVarF = r9lVar.f();
            x2l x2lVar = z5lVarF.v;
            RecyclerView recyclerView = z5lVarF.f;
            x2lVar.getClass();
            b2l b2lVar = (b2l) nxg.n(recyclerView, new bvk(b2));
            if (b2lVar == null) {
                b2lVar = (b2l) x2lVar.o.e.getValue();
            }
            if (b2lVar != null) {
                return b2lVar;
            }
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            b2l b2lVarG = r9lVar.g(r9lVar.t.e);
            if (b2lVarG != null) {
                return b2lVarG;
            }
        } else if (iOrdinal != 3) {
            h9o.p();
            return null;
        }
        return b2lVarA;
    }

    public final boolean k(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.a;
        if (!swipeDismissBehavior.x(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        byte b2 = swipeDismissBehavior.e;
        int width = (!(b2 == 0 && z) && (b2 != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = r5n.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        tw2 tw2Var = swipeDismissBehavior.b;
        if (tw2Var != null) {
            tw2Var.s(view);
        }
        return true;
    }

    @Override // defpackage.tri
    public final void l(View view) {
        int positionForView;
        r9i r9iVarF = ((mri) this.a).f();
        im7 im7Var = null;
        if (r9iVarF != null) {
            l56 l56Var = ((o66) r9iVarF.d).f;
            im7 im7Var2 = l56Var == null ? null : ((ListPopupWindow) l56Var).c;
            if (im7Var2 != null) {
                im7Var = im7Var2;
            }
        }
        if (im7Var == null || (positionForView = im7Var.getPositionForView(view)) == -1) {
            return;
        }
        im7Var.performItemClick(view, positionForView, im7Var.getItemIdAtPosition(positionForView));
    }

    public final void m(URLConnection uRLConnection, final iro iroVar) {
        Handler handler = (Handler) this.a;
        InputStream inputStream = null;
        try {
            try {
                ((HttpURLConnection) uRLConnection).setRequestMethod(RequestBuilder.GET);
                final byte b2 = 1;
                uRLConnection.setDoInput(true);
                uRLConnection.setConnectTimeout(10000);
                uRLConnection.setReadTimeout(10000);
                inputStream = uRLConnection.getInputStream();
                final int responseCode = ((HttpURLConnection) uRLConnection).getResponseCode();
                handler.post(responseCode == 200 ? new fmn((Object) iroVar, (Object) n(inputStream), (byte) 10) : new Runnable() { // from class: okp
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        Object obj = iroVar;
                        switch (b3) {
                            case 0:
                                ((wl3) obj).c(responseCode + 1);
                                break;
                            default:
                                yhp yhpVar = (yhp) ((iro) obj).b.b;
                                aip aipVar = yhpVar.a;
                                aipVar.e = 7;
                                aipVar.i++;
                                yhpVar.a();
                                break;
                        }
                    }
                });
                hn9.f(uRLConnection);
                r9h.l(inputStream);
            } catch (IOException e) {
                handler.post(new fmn((Object) iroVar, (Object) e, (byte) 12));
                if (uRLConnection != null) {
                    hn9.f(uRLConnection);
                }
                r9h.l(inputStream);
            }
        } catch (Throwable th) {
            if (uRLConnection != null) {
                hn9.f(uRLConnection);
            }
            r9h.l(inputStream);
            throw th;
        }
    }

    public final void o() {
        if (((ArrayMap) this.a) != null) {
            return;
        }
        qp2.n("Operation is not allowed after destroy().");
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        b94 b94Var = (b94) this.a;
        iOException.getMessage();
        b94Var.run(new dk8(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPostMessage(android.webkit.WebView r9, java.lang.reflect.InvocationHandler r10, android.net.Uri r11, boolean r12, java.lang.reflect.InvocationHandler r13) {
        /*
            r8 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r10 = fr3.m(r0, r10)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r10 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r10
            java.lang.reflect.InvocationHandler[] r0 = r10.getPorts()
            int r1 = r0.length
            lun[] r1 = new lun[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L29
            mun r3 = new mun
            r4 = r0[r2]
            r3.<init>()
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r5 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r4 = fr3.m(r5, r4)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r4 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r4
            r3.b = r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L29:
            li1 r0 = axn.e
            boolean r0 = r0.a()
            if (r0 == 0) goto L5e
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r10 = r10.getMessagePayload()
            java.lang.Object r10 = fr3.m(r0, r10)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r10 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r10
            int r0 = r10.getType()
            if (r0 == 0) goto L54
            r2 = 1
            if (r0 == r2) goto L49
            r10 = 0
            r4 = r10
            goto L68
        L49:
            jun r0 = new jun
            byte[] r10 = r10.getAsArrayBuffer()
            r0.<init>(r10, r1)
        L52:
            r4 = r0
            goto L68
        L54:
            jun r0 = new jun
            java.lang.String r10 = r10.getAsString()
            r0.<init>(r10, r1)
            goto L52
        L5e:
            jun r0 = new jun
            java.lang.String r10 = r10.getData()
            r0.<init>(r10, r1)
            goto L52
        L68:
            if (r4 == 0) goto L8a
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r10 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r10 = fr3.m(r10, r13)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r10 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r10
            ce2 r13 = new ce2
            r0 = 3
            r13.<init>(r10, r0)
            java.lang.Object r10 = r10.getOrCreatePeer(r13)
            r7 = r10
            ymb r7 = (defpackage.ymb) r7
            java.lang.Object r8 = r8.a
            r2 = r8
            uwn r2 = (defpackage.uwn) r2
            r3 = r9
            r5 = r11
            r6 = r12
            r2.onPostMessage(r3, r4, r5, r6, r7)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oji.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        b94 b94Var = (b94) this.a;
        try {
            if (pzhVar.q) {
                b94Var.run(ek8.a);
            } else {
                b94Var.run(new dk8(pzhVar.d == 404 ? 0 : 1));
            }
        } finally {
            pzhVar.close();
        }
    }

    public final void p(String str) {
        uoj uojVar = (uoj) this.a;
        uojVar.w.H(str);
        uojVar.G0(true);
    }

    @Override // defpackage.w9m
    public final Object q(Integer num, Object obj) {
        return new fjk((hjk) obj, num);
    }

    public final String r() {
        return ((SharedPreferences) ((bf9) this.a).d.get()).getString("device_auth_token", null);
    }

    public final void s(itd itdVar) {
        Toolbar toolbar = (Toolbar) this.a;
        ne neVar = toolbar.a.t;
        if (neVar == null || !neVar.k()) {
            Iterator it = toolbar.F.b.iterator();
            while (it.hasNext()) {
                ((mud) it.next()).b(itdVar);
            }
        }
        dcl dclVar = toolbar.N;
        if (dclVar != null) {
            dclVar.s(itdVar);
        }
    }

    public final void shutdown() {
    }

    public final void start() {
    }

    public final String u() {
        return ((SharedPreferences) ((bf9) this.a).d.get()).getString("device_id", null);
    }

    public final void v(String str) {
        uoj uojVar = (uoj) this.a;
        uojVar.w.H(str);
        uojVar.G0(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.gpn
            if (r0 == 0) goto L13
            r0 = r7
            gpn r0 = (defpackage.gpn) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            gpn r0 = new gpn
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r6 = r0.t
            px5 r7 = px5.a
            int r1 = r0.v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ybh.y(r6)
            return r6
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r2
        L2e:
            ybh.y(r6)
            cv6 r6 = bb7.a
            d7a r6 = s6d.a
            d7a r6 = r6.e
            rz1 r1 = new rz1
            r4 = 2
            r5 = 5
            r1.<init>(r4, r2, r5)
            r0.v = r3
            java.lang.Object r6 = na2.Z(r6, r1, r0)
            if (r6 != r7) goto L47
            return r7
        L47:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oji.w(nt5):java.lang.Object");
    }

    public final boolean x(itd itdVar, MenuItem menuItem) {
        return false;
    }

    public final PrivateKey z() throws InvalidKeySpecException {
        PrivateKey privateKeyGeneratePrivate;
        bf9 bf9Var = (bf9) this.a;
        String string = ((SharedPreferences) bf9Var.d.get()).getString("priv", null);
        if (string != null) {
            byte[] bArrB = ((c36) bf9Var.f.a.get()).b(Base64.decode(string, 0));
            if (bArrB != null) {
                ii iiVar = p36.a;
                try {
                    privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArrB));
                } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
                    privateKeyGeneratePrivate = null;
                }
                if (privateKeyGeneratePrivate != null) {
                    return privateKeyGeneratePrivate;
                }
            }
            bf9Var.k();
        }
        KeyPair keyPairM = bf9Var.m();
        if (keyPairM == null) {
            return null;
        }
        return keyPairM.getPrivate();
    }
}
