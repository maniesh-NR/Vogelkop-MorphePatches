package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosure;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosureObject;
import com.usercentrics.sdk.v2.settings.data.ConsentDisclosureType;
import com.usercentrics.tcf.core.model.gvl.Purpose;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECPoint;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class g77 implements rk8, m94, b5b, ogh {
    public Object a;
    public Object b;
    public Object c;

    public g77(byte b) {
        switch (b) {
            case 10:
                this.a = new see();
                break;
            case 20:
                this.a = "";
                this.c = new LinkedHashSet();
                break;
            case 27:
                this.a = null;
                this.b = new ArrayList();
                this.c = new LinkedHashSet();
                break;
            default:
                this.a = new int[16];
                this.b = new int[16];
                this.c = new int[16];
                break;
        }
    }

    public g77(ez9 ez9Var, cpd cpdVar) {
        this.c = ez9Var;
        this.a = cpdVar;
    }

    public /* synthetic */ g77(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public g77(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.b = arrayDeque;
        this.a = bufferedReader;
    }

    public /* synthetic */ g77(boolean z, Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public static void d(g77 g77Var, String str) {
        if (str.length() == 0) {
            qp2.n("Base URL required");
            return;
        }
        if (!c.l(str, "/", false)) {
            qp2.n("Base URL needs to end with /");
        } else if (c.q(str, "http", false) || c.q(str, "https", false)) {
            g77Var.a = str;
        } else {
            qp2.n("Expected URL scheme 'http' or 'https' was not found");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(android.text.Editable r6, android.view.KeyEvent r7, boolean r8) {
        /*
            int r7 = r7.getMetaState()
            boolean r7 = android.view.KeyEvent.metaStateHasNoModifiers(r7)
            r0 = 0
            if (r7 == 0) goto L48
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            r2 = -1
            if (r7 == r2) goto L48
            if (r1 == r2) goto L48
            if (r7 != r1) goto L48
            java.lang.Class<cz7> r2 = defpackage.cz7.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            cz7[] r1 = (defpackage.cz7[]) r1
            if (r1 == 0) goto L48
            int r2 = r1.length
            if (r2 <= 0) goto L48
            int r2 = r1.length
            r3 = r0
        L29:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L3a
            if (r5 == r7) goto L43
            goto L3c
        L3a:
            if (r4 == r7) goto L43
        L3c:
            if (r7 <= r5) goto L40
            if (r7 < r4) goto L43
        L40:
            int r3 = r3 + 1
            goto L29
        L43:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g77.i(android.text.Editable, android.view.KeyEvent, boolean):boolean");
    }

    public static String l(File file, byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest((file.lastModified() + file.length() + file.getCanonicalPath()).getBytes()), 2);
        } catch (IOException e) {
            yt7.g("Failed to access ", file, e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalArgumentException("Failed to get MessageDigest instance", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0075, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[EDGE_INSN: B:82:0x0091->B:55:0x0091 BREAK  A[LOOP:2: B:38:0x0061->B:48:0x0077], EDGE_INSN: B:83:0x0091->B:55:0x0091 BREAK  A[LOOP:2: B:38:0x0061->B:48:0x0077, LOOP_LABEL: LOOP:2: B:38:0x0061->B:48:0x0077]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m(dy7 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g77.m(dy7, android.text.Editable, int, int, boolean):boolean");
    }

    public static tmm r(tmm tmmVar, CharSequence charSequence, int i, int i2, kam kamVar, r16 r16Var) {
        if ((kamVar.c & 4) > 0) {
            return tmmVar;
        }
        if (tmmVar == null) {
            tmmVar = new tmm(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        r16Var.getClass();
        tmmVar.setSpan(new lam(kamVar), i, i2, 33);
        return tmmVar;
    }

    public final vab A(itb itbVar, rhk rhkVar) {
        rhk rhkVar2 = c37.d;
        StringBuilder sb = new StringBuilder(jtb.a(itbVar));
        sb.append(':');
        sb.append(rhkVar != null ? rhkVar.a : "");
        sb.append(':');
        sb.append(rhkVar2);
        return (vab) ((ConcurrentHashMap) this.b).get(sb.toString());
    }

    public final sff B(z7 z7Var, qff qffVar) {
        Set<sff> set = (Set) this.c;
        if (z7Var.f) {
            for (sff sffVar : set) {
                sffVar.getClass();
                if (z7Var.a.equals(((g3k) sffVar).b) && !sffVar.g && sffVar.h && sffVar.f.g(qffVar)) {
                    return sffVar;
                }
            }
        }
        sff sffVarB = ((tff) this.b).b(z7Var, (t9f) this.a);
        if (sffVarB.g) {
            qffVar.c("The request has already been finalized", true);
        } else if (!sffVarB.f.g(qffVar)) {
            qffVar.c("Could not add listener: either the same listener is added twice or the data has already been handled", true);
        }
        set.add(sffVarB);
        sffVarB.g();
        return sffVarB;
    }

    public final void a(long j) {
        ((View) ((i4d) this.a).b).animate().alpha(1.0f).setDuration((int) ((1.0f - r0.getAlpha()) * 150.0f)).setInterpolator(lf1.a);
        dnb dnbVar = (dnb) this.c;
        vml.a(dnbVar);
        vml.d(dnbVar, j);
    }

    @Override // defpackage.m94
    public final Object attachCompleter(l94 l94Var) {
        l94Var.a(new vl9(this, (byte) 4), n97.a());
        ((f7a) this.c).a.set(l94Var);
        return "HandlerScheduledFuture-" + ((Callable) this.b).toString();
    }

    public final a5b b() {
        return new a5b((x5f) this.b, (String) this.c, (byte) 0);
    }

    public final void c(File file, String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            qp2.o("Name must not be empty");
            return;
        }
        try {
            ((HashMap) this.b).put(str, file.getCanonicalFile());
        } catch (IOException e) {
            yt7.g("Failed to resolve canonical path for ", file, e);
        }
    }

    public final ir7 e() throws GeneralSecurityException {
        m54 m54VarA;
        ar7 ar7Var = (ar7) this.a;
        if (ar7Var == null) {
            t3p.w("Cannot build without parameters");
            return null;
        }
        ECPoint eCPoint = (ECPoint) this.b;
        if (eCPoint == null) {
            t3p.w("Cannot build without public point");
            return null;
        }
        nx7.b(eCPoint, ar7Var.b.b.getCurve());
        if (((ar7) this.a).a() && ((Integer) this.c) == null) {
            t3p.w("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((ar7) this.a).a() && ((Integer) this.c) != null) {
            t3p.w("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        g40 g40Var = ((ar7) this.a).d;
        if (g40Var == g40.i) {
            m54VarA = juf.a;
        } else if (g40Var == g40.h || g40Var == g40.g) {
            m54VarA = juf.a(((Integer) this.c).intValue());
        } else {
            if (g40Var != g40.f) {
                j9h.u(((ar7) this.a).d, "Unknown EcdsaParameters.Variant: ");
                return null;
            }
            m54VarA = juf.b(((Integer) this.c).intValue());
        }
        return new ir7((ar7) this.a, (ECPoint) this.b, m54VarA, (Integer) this.c);
    }

    public final jyb f() {
        String str = (String) this.a;
        pna pnaVar = (pna) this.b;
        if (pnaVar == null) {
            q9f q9fVar = eoa.a;
            vna vnaVar = new vna();
            Function1 function1 = vnaVar.d;
            q9fVar.getClass();
            v9f v9fVar = new v9f();
            v9fVar.b = new w5f((byte) 4);
            v9fVar.d = (byte) 10;
            function1.invoke(v9fVar);
            pnaVar = new pna(new z9f(v9fVar), vnaVar, true);
        }
        return new jyb(str, pnaVar, CollectionsKt.V(Collections.singletonList(new pw6((byte) 0)), CollectionsKt.k0((LinkedHashSet) this.c)));
    }

    public final void g() {
        cpd cpdVar = (cpd) this.a;
        if (cpdVar != null) {
            int i = ((ez9) this.c).o.e;
            yod yodVar = cpdVar.a;
            yodVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            yodVar.a.setPlaybackToLocal(builder.build());
            this.b = null;
        }
    }

    public final int getHeight() {
        int i = ((ExtendedFloatingActionButton) this.c).i0;
        return i == -1 ? ((pad) this.a).getHeight() : (i == 0 || i == -2) ? ((ExtendedFloatingActionButton) ((nv6) this.b).a).getMeasuredHeight() : i;
    }

    public final int getPaddingEnd() {
        return ((ExtendedFloatingActionButton) this.c).c0;
    }

    public final int getPaddingStart() {
        return ((ExtendedFloatingActionButton) this.c).b0;
    }

    public final int getWidth() {
        int i = ((ExtendedFloatingActionButton) this.c).h0;
        return i == -1 ? ((pad) this.a).getWidth() : (i == 0 || i == -2) ? ((nv6) this.b).getWidth() : i;
    }

    public final x4b h(Context context) {
        return new x4b(context.getString(2132020043), (nf) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (r0 != r9) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(swh r14, nt5 r15) {
        /*
            r13 = this;
            java.lang.Object r2 = r13.c
            br6 r2 = (br6) r2
            boolean r3 = r15 instanceof gz8
            if (r3 == 0) goto L18
            r3 = r15
            gz8 r3 = (gz8) r3
            int r4 = r3.y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.y = r4
        L16:
            r8 = r3
            goto L1e
        L18:
            gz8 r3 = new gz8
            r3.<init>(r13, r15)
            goto L16
        L1e:
            java.lang.Object r0 = r8.w
            px5 r9 = px5.a
            int r3 = r8.y
            r10 = 3
            r4 = 2
            r5 = 1
            r11 = 0
            if (r3 == 0) goto L4d
            if (r3 == r5) goto L47
            if (r3 == r4) goto L3b
            if (r3 != r10) goto L35
            defpackage.ybh.y(r0)
            goto La0
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r0)
            return r11
        L3b:
            t9f r2 = r8.v
            jcl r3 = r8.u
            swh r4 = r8.t
            defpackage.ybh.y(r0)
            r5 = r4
            r4 = r3
            goto L7d
        L47:
            swh r3 = r8.t
            defpackage.ybh.y(r0)
            goto L5f
        L4d:
            defpackage.ybh.y(r0)
            java.lang.Object r0 = r13.b
            tze r0 = (tze) r0
            r8.t = r14
            r8.y = r5
            java.lang.Object r0 = r0.invoke(r8)
            if (r0 == r9) goto L9f
            r3 = r14
        L5f:
            jcl r0 = (defpackage.jcl) r0
            esk r5 = r2.b()
            java.lang.Object r5 = r5.get()
            t9f r5 = (t9f) r5
            r8.t = r3
            r8.u = r0
            r8.v = r5
            r8.y = r4
            java.lang.Comparable r2 = br6.d(r2, r8)
            if (r2 == r9) goto L9f
            r4 = r0
            r0 = r2
            r2 = r5
            r5 = r3
        L7d:
            r3 = r0
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r0 = r13.a
            wjh r0 = (wjh) r0
            java.lang.Object r0 = r0.f
            r12 = r0
            jg8 r12 = (jg8) r12
            r71 r0 = new r71
            r6 = 0
            r7 = 4
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.t = r11
            r8.u = r11
            r8.v = r11
            r8.y = r10
            java.lang.Object r0 = defpackage.na2.Z(r12, r0, r8)
            if (r0 != r9) goto La0
        L9f:
            return r9
        La0:
            t0i r0 = (t0i) r0
            java.lang.Object r0 = r0.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g77.j(swh, nt5):java.lang.Object");
    }

    public final File k(Uri uri) throws IOException {
        String encodedPath = uri.getEncodedPath();
        if (encodedPath == null) {
            qp2.o(fki.p(uri, "Empty path for "));
            return null;
        }
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf < 0) {
            qp2.o(fki.p(uri, "Invalid path: "));
            return null;
        }
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) ((HashMap) this.b).get(strDecode);
        if (file == null) {
            qp2.o(fki.p(uri, "Unable to find configured root for "));
            return null;
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (!canonicalFile.getPath().startsWith(file.getPath())) {
                t3p.u("Resolved path jumped beyond configured root");
                return null;
            }
            if (l(canonicalFile, (byte[]) ((k32) this.c).get()).equals(uri.getQueryParameter("hash"))) {
                return canonicalFile;
            }
            t3p.u("Hash is missing or does not match");
            return null;
        } catch (IOException e) {
            yt7.g("Failed to resolve canonical path for ", file2, e);
            return null;
        }
    }

    public final ViewGroup.LayoutParams n() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.c;
        int i = extendedFloatingActionButton.h0;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.i0;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }

    public final x4b o(Context context) {
        return new x4b(context.getString(2132022056), (nf) this.a);
    }

    public final String p(Context context) {
        return context.getString(2132018340);
    }

    public final String q(Context context) {
        return context.getString(2132018339, context.getString(2132017591));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g77.s():boolean");
    }

    public final boolean t(CharSequence charSequence, int i, int i2, kam kamVar) {
        if ((kamVar.c & 3) == 0) {
            mq6 mq6Var = (mq6) this.c;
            vxd vxdVarA = kamVar.a();
            int iA = vxdVarA.a(8);
            if (iA != 0) {
                ((ByteBuffer) ((t9d) vxdVarA).d).getShort(iA + ((t9d) vxdVarA).a);
            }
            mq6Var.getClass();
            ThreadLocal threadLocal = mq6.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = mq6Var.a.hasGlyph(sb.toString());
            int i3 = kamVar.c & 4;
            kamVar.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (kamVar.c & 3) == 2;
    }

    public final boolean u() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (((String) this.c) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.c = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.a).readLine();
                this.c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.c = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public final ArrayList v() {
        spg spgVar = (spg) this.b;
        List<ConsentDisclosure> list = ((ConsentDisclosureObject) this.a).a;
        ArrayList arrayList = new ArrayList(k95.o(list, 10));
        for (ConsentDisclosure consentDisclosure : list) {
            ArrayList arrayList2 = new ArrayList();
            ConsentDisclosureType consentDisclosureType = consentDisclosure.b;
            String str = consentDisclosure.a;
            String str2 = consentDisclosure.g;
            if (consentDisclosureType != null) {
                arrayList2.add(spgVar.y + ": " + consentDisclosureType.name().toLowerCase(Locale.ROOT));
            }
            if (consentDisclosure.b == ConsentDisclosureType.b) {
                Long l = consentDisclosure.d;
                long jLongValue = l != null ? l.longValue() : 0L;
                String strA = jLongValue > 0 ? spgVar.a(jLongValue) : "-";
                arrayList2.add(spgVar.e + ": " + strA);
                String str3 = consentDisclosure.e ? spgVar.B : spgVar.q;
                arrayList2.add(spgVar.E + ": " + str3);
            }
            String str4 = str2 == null ? "" : str2;
            if (!StringsKt.N(str4)) {
                if (Intrinsics.a(str2, "*")) {
                    str4 = spgVar.a;
                } else if (StringsKt.E(str4, "*", false)) {
                    str4 = spgVar.p;
                }
                arrayList2.add(spgVar.d + ": " + str4);
            }
            List list2 = consentDisclosure.f;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Purpose purpose = (Purpose) ((Map) this.c).get(String.valueOf(((Number) it.next()).intValue()));
                String str5 = purpose != null ? purpose.c : null;
                if (str5 != null) {
                    arrayList3.add(str5);
                }
            }
            String strP = CollectionsKt.P(arrayList3, (CharSequence) null, (CharSequence) null, (String) null, 0, h50.s, 31);
            if (!StringsKt.N(strP)) {
                arrayList2.add(spgVar.F + ": " + strP);
            }
            String strP2 = CollectionsKt.P(consentDisclosure.i, (CharSequence) null, (CharSequence) null, (String) null, 0, h50.t, 31);
            if (!StringsKt.N(strP2)) {
                arrayList2.add(spgVar.G + ": " + strP2);
            }
            String str6 = consentDisclosure.h;
            if (str6 != null && !StringsKt.N(str6)) {
                arrayList2.add(spgVar.H + ": " + str6);
            }
            Boolean bool = consentDisclosure.j;
            if (bool != null) {
                String str7 = bool.booleanValue() ? spgVar.B : spgVar.q;
                arrayList2.add(spgVar.I + ": " + str7);
            }
            if ((str == null || StringsKt.N(str)) && (str = consentDisclosure.c) == null) {
                str = "";
            }
            arrayList.add(new eqg(sko.v(spgVar.i, ": ", str), arrayList2));
        }
        return arrayList;
    }

    public final void w(wx wxVar) {
        this.a = wxVar;
        if (((LinkedHashSet) this.c).isEmpty()) {
            wxVar.run((ArrayList) this.b);
        }
    }

    public final String x() {
        if (!u()) {
            t3p.y();
            return null;
        }
        String str = (String) this.c;
        this.c = null;
        return str;
    }

    public final void y(boolean z, boolean z2, boolean z3) {
        Object next;
        vo7 vo7Var = (vo7) this.c;
        x77 x77Var = (x77) this.a;
        GURL gurl = (GURL) this.b;
        kag kagVar = z ? kag.c : kag.b;
        vo7 vo7Var2 = (vo7) x77Var.d;
        Iterator it = ((ro7) vo7Var2.a.get()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (vo7.c((qo7) next, gurl)) {
                    break;
                }
            }
        }
        qo7 qo7Var = (qo7) next;
        if (qo7Var != null) {
            c37 c37Var = vo7Var2.f;
            ((LinkedHashMap) c37Var.b).put(qo7Var.a, new wo7(c37Var, kagVar, z2));
            String strG = gurl.d().g();
            esk eskVar = (esk) c37Var.a;
            lag lagVar = lag.g;
            if (!z2) {
                jag jagVarF = ((s9g) eskVar.get()).f(strG, false);
                if ((jagVarF != null ? jagVarF.a(lagVar, null) : null) == null) {
                    ((s9g) eskVar.get()).o(false, strG, lagVar, ((s9g) eskVar.get()).b.k(lagVar), true);
                }
            }
            ((s9g) eskVar.get()).o(false, strG, lagVar, kagVar, z2);
        }
        if (z) {
            vo7Var.c.invoke(gurl.g());
        }
        yqa yqaVar = vo7Var.d;
        dc0 dc0Var = z3 ? dc0.d : z ? dc0.b : dc0.c;
        x5f x5fVar = (orm) ((esk) yqaVar.b).get();
        if (x5fVar.h) {
            x5fVar.T0(new oz2((byte) 3, dc0Var, z2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.CharSequence r23, int r24, int r25, int r26, boolean r27, int r28, int r29, java.lang.String r30, defpackage.tmm r31) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g77.z(java.lang.CharSequence, int, int, int, boolean, int, int, java.lang.String, tmm):java.lang.Object");
    }
}
