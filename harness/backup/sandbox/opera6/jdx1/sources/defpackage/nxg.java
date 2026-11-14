package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.util.TypedValue;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.BreakIterator;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public abstract class nxg {
    public static final void a(final myn mynVar, final c8e c8eVar, boolean z, final ayn aynVar, final kxn kxnVar, Function0 function0, Function0 function02, final ihg ihgVar, ih5 ih5Var, final int i) {
        boolean z2;
        Function0 function03;
        Function0 function04;
        final Function0 function05;
        final Function0 function06;
        final boolean z3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1391624406);
        int i2 = i | (vt9Var.h(mynVar) ? 4 : 2) | 384 | (vt9Var.f(aynVar) ? 2048 : 1024) | 1769472 | (vt9Var.f(ihgVar) ? 8388608 : 4194304);
        if ((4793491 & i2) == 4793490 && vt9Var.z()) {
            vt9Var.Q();
            z3 = z;
            function05 = function0;
            function06 = function02;
        } else {
            vt9Var.S();
            int i3 = i & 1;
            zpa zpaVar = hh5.a;
            if (i3 == 0 || vt9Var.x()) {
                vt9Var.W(1849434622);
                Object objK = vt9Var.K();
                if (objK == zpaVar) {
                    objK = new yam((byte) 10);
                    vt9Var.g0(objK);
                }
                Function0 function07 = (Function0) objK;
                vt9Var.p(false);
                vt9Var.W(1849434622);
                Object objK2 = vt9Var.K();
                if (objK2 == zpaVar) {
                    objK2 = new yam((byte) 11);
                    vt9Var.g0(objK2);
                }
                vt9Var.p(false);
                z2 = true;
                function03 = (Function0) objK2;
                function04 = function07;
            } else {
                vt9Var.Q();
                z2 = z;
                function04 = function0;
                function03 = function02;
            }
            vt9Var.q();
            vt9Var.W(5004770);
            Object objK3 = vt9Var.K();
            if (objK3 == zpaVar) {
                objK3 = new p01(function04, (byte) 16);
                vt9Var.g0(objK3);
            }
            Function1 function1 = (Function1) objK3;
            vt9Var.p(false);
            vt9Var.W(5004770);
            Object objK4 = vt9Var.K();
            if (objK4 == zpaVar) {
                objK4 = new p01(function03, (byte) 17);
                vt9Var.g0(objK4);
            }
            vt9Var.p(false);
            boolean z4 = z2;
            b(mynVar, c8eVar, z4, aynVar, kxnVar, function1, (Function1) objK4, ihgVar, vt9Var, i2 & 29425662);
            function05 = function04;
            function06 = function03;
            z3 = z4;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(mynVar, c8eVar, z3, aynVar, kxnVar, function05, function06, ihgVar, i) { // from class: lxn
                public final /* synthetic */ myn a;
                public final /* synthetic */ c8e b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ ayn d;
                public final /* synthetic */ kxn e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ ihg h;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(24633);
                    nxg.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (ih5) obj, iM);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final myn mynVar, final c8e c8eVar, final boolean z, final ayn aynVar, final kxn kxnVar, final Function1 function1, final Function1 function12, final ihg ihgVar, ih5 ih5Var, final int i) {
        int i2;
        c8e c8eVar2;
        boolean z2;
        Function1 function13;
        Function1 function14;
        ihg ihgVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1567676775);
        if ((i & 6) == 0) {
            i2 = (vt9Var.h(mynVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            c8eVar2 = c8eVar;
            i2 |= vt9Var.f(c8eVar2) ? 32 : 16;
        } else {
            c8eVar2 = c8eVar;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= vt9Var.g(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.f(aynVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.f(kxnVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function13 = function1;
            i2 |= vt9Var.h(function13) ? 131072 : 65536;
        } else {
            function13 = function1;
        }
        if ((1572864 & i) == 0) {
            function14 = function12;
            i2 |= vt9Var.h(function14) ? 1048576 : 524288;
        } else {
            function14 = function12;
        }
        if ((12582912 & i) == 0) {
            ihgVar2 = ihgVar;
            i2 |= vt9Var.f(ihgVar2) ? 8388608 : 4194304;
        } else {
            ihgVar2 = ihgVar;
        }
        int i3 = i2 | 100663296;
        if ((38347923 & i3) == 38347922 && vt9Var.z()) {
            vt9Var.Q();
        } else {
            vt9Var.S();
            if ((i & 1) != 0 && !vt9Var.x()) {
                vt9Var.Q();
            }
            vt9Var.q();
            wc1 wc1Var = (wc1) mynVar.g.getValue();
            vt9Var.W(-996123102);
            zpa zpaVar = hh5.a;
            if (wc1Var == null) {
                z5 = true;
                z6 = false;
            } else {
                vt9Var.W(-1633490746);
                boolean zH = ((((i3 & 7168) ^ 3072) > 2048 && vt9Var.f(aynVar)) || (i3 & 3072) == 2048) | vt9Var.h(wc1Var);
                Object objK = vt9Var.K();
                if (zH || objK == zpaVar) {
                    z3 = false;
                    objK = new nxn(aynVar, wc1Var, (mt5) null, (byte) 0);
                    vt9Var.g0(objK);
                } else {
                    z3 = false;
                }
                vt9Var.p(z3);
                rm5.f(wc1Var, aynVar, (Function2) objK, vt9Var);
                vt9Var.W(-1633490746);
                boolean zH2 = vt9Var.h(mynVar) | vt9Var.h(wc1Var);
                Object objK2 = vt9Var.K();
                if (zH2 || objK2 == zpaVar) {
                    z4 = false;
                    objK2 = new pxn(mynVar, wc1Var, (mt5) null, (byte) 0);
                    vt9Var.g0(objK2);
                } else {
                    z4 = false;
                }
                vt9Var.p(z4);
                rm5.f(wc1Var, mynVar, (Function2) objK2, vt9Var);
                vt9Var.W(-996109592);
                if (kxnVar != null) {
                    vt9Var.W(-1633490746);
                    boolean zH3 = vt9Var.h(mynVar) | vt9Var.h(wc1Var);
                    Object objK3 = vt9Var.K();
                    if (zH3 || objK3 == zpaVar) {
                        z5 = true;
                        objK3 = new pxn(mynVar, wc1Var, (mt5) null, (byte) 1);
                        vt9Var.g0(objK3);
                    } else {
                        z5 = true;
                    }
                    z6 = false;
                    vt9Var.p(false);
                    rm5.f(wc1Var, mynVar, (Function2) objK3, vt9Var);
                } else {
                    z5 = true;
                    z6 = false;
                }
                vt9Var.p(z6);
            }
            vt9Var.p(z6);
            vt9Var.W(-996074935);
            vt9Var.W(1849434622);
            Object objK4 = vt9Var.K();
            if (objK4 == zpaVar) {
                objK4 = sxn.a;
                vt9Var.g0(objK4);
            }
            vt9Var.p(false);
            vt9Var.p(false);
            int i4 = 57344 & i3;
            int i5 = i3 & 33554430;
            boolean z7 = z5;
            qyn.a(mynVar, c8eVar2, z2, aynVar, kxnVar, function13, function14, ihgVar2, (mtb) objK4, vt9Var, i5);
            Unit unit = Unit.a;
            vt9Var.W(5004770);
            boolean z8 = i4 == 16384 ? z7 : false;
            Object objK5 = vt9Var.K();
            if (z8 || objK5 == zpaVar) {
                objK5 = new qfl(kxnVar, (byte) 27);
                vt9Var.g0(objK5);
            }
            vt9Var.p(false);
            rm5.b(unit, (Function1) objK5, vt9Var);
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: mxn
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nxg.b(mynVar, c8eVar, z, aynVar, kxnVar, function1, function12, ihgVar, (ih5) obj, aoh.m(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static int c(int i, List list) {
        return rfp.f(i, 31, list);
    }

    public static final int d(Context context, float f) {
        return zed.b(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    public static final URI e(URI uri) {
        try {
            if (uri.getScheme() == null) {
                return new URI("https://" + uri);
            }
        } catch (URISyntaxException unused) {
        }
        return uri;
    }

    public static final int f(Context context, int i) {
        return zed.b(i / TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
    }

    public static final void g(String str, String str2) {
        Thread.currentThread().getName();
    }

    public static ypl h() {
        boolean zIsFixedOffset;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        if (zoneIdSystemDefault instanceof ZoneOffset) {
            return new h69((ZoneOffset) zoneIdSystemDefault);
        }
        try {
            zIsFixedOffset = zoneIdSystemDefault.getRules().isFixedOffset();
        } catch (ArrayIndexOutOfBoundsException unused) {
            zIsFixedOffset = false;
        }
        if (!zIsFixedOffset) {
            return new ypl(zoneIdSystemDefault);
        }
        return new h69(zoneIdSystemDefault);
    }

    public static final Object i(byte[] bArr, KSerializer kSerializer) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
        try {
            zipInputStream.getNextEntry();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipInputStream, 8192);
            try {
                Object objL = cqp.L(mzm.a, kSerializer, bufferedInputStream);
                bufferedInputStream.close();
                zipInputStream.close();
                return objL;
            } finally {
            }
        } finally {
        }
    }

    public static boolean j(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final void k(osk oskVar, String str) {
        wsk wskVarH = oskVar.h(str);
        try {
            wskVarH.n();
            fr3.t(wskVarH, null);
        } finally {
        }
    }

    public static w4j l(Set set, srg srgVar) {
        if (set instanceof SortedSet) {
            w4j w4jVar = (SortedSet) set;
            if (!(w4jVar instanceof w4j)) {
                return new x4j(w4jVar, srgVar);
            }
            w4j w4jVar2 = w4jVar;
            return new x4j((SortedSet) w4jVar2.a, vtp.n(w4jVar2.b, srgVar));
        }
        if (!(set instanceof w4j)) {
            set.getClass();
            return new w4j(set, srgVar);
        }
        w4j w4jVar3 = (w4j) set;
        return new w4j((Set) w4jVar3.a, vtp.n(w4jVar3.b, srgVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m(int r14, java.lang.String r15) {
        /*
            xx7 r0 = p()
            r1 = 0
            if (r0 == 0) goto L76
            boolean r2 = r0.f()
            java.lang.String r3 = "Not initialized yet"
            jpo.n(r3, r2)
            java.lang.String r2 = "charSequence cannot be null"
            jpo.m(r15, r2)
            sx7 r0 = r0.d
            boolean r2 = r0.d
            r3 = -1
            if (r2 != 0) goto L6b
            g77 r4 = r0.a
            r4.getClass()
            if (r14 < 0) goto L6b
            int r0 = r15.length()
            if (r14 >= r0) goto L6b
            boolean r0 = r15 instanceof android.text.Spanned
            r2 = 0
            if (r0 == 0) goto L47
            r0 = r15
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r5 = r14 + 1
            java.lang.Class<cz7> r6 = defpackage.cz7.class
            java.lang.Object[] r5 = r0.getSpans(r14, r5, r6)
            cz7[] r5 = (defpackage.cz7[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L47
            r2 = r5[r2]
            int r0 = r0.getSpanEnd(r2)
            r11 = r14
            r5 = r15
            goto L6e
        L47:
            int r0 = r14 + (-16)
            int r6 = java.lang.Math.max(r2, r0)
            int r0 = r15.length()
            int r2 = r14 + 16
            int r7 = java.lang.Math.min(r0, r2)
            r12 = 0
            r13 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r10 = 1
            r11 = r14
            r5 = r15
            java.lang.Object r14 = r4.z(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            yy7 r14 = (defpackage.yy7) r14
            if (r14 == 0) goto L6d
            int r0 = r14.b
            goto L6e
        L6b:
            r11 = r14
            r5 = r15
        L6d:
            r0 = r3
        L6e:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            if (r0 == r3) goto L78
            r1 = r14
            goto L78
        L76:
            r11 = r14
            r5 = r15
        L78:
            if (r1 == 0) goto L7f
            int r14 = r1.intValue()
            return r14
        L7f:
            java.text.BreakIterator r14 = java.text.BreakIterator.getCharacterInstance()
            r14.setText(r5)
            int r14 = r14.following(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxg.m(int, java.lang.String):int");
    }

    public static final Object n(RecyclerView recyclerView, Function1 function1) {
        Object objInvoke;
        int width = recyclerView.getWidth() / 2;
        int height = recyclerView.getHeight() / 2;
        Iterator it = new g6n(recyclerView).iterator();
        Object obj = null;
        float f = Float.MAX_VALUE;
        while (true) {
            h6n h6nVar = (h6n) it;
            if (!h6nVar.hasNext()) {
                return obj;
            }
            i iVarT = recyclerView.T((View) h6nVar.next());
            float translationX = (iVarT.itemView.getTranslationX() + ((iVarT.itemView.getWidth() / 2) + iVarT.itemView.getLeft())) - width;
            float translationY = (iVarT.itemView.getTranslationY() + ((iVarT.itemView.getHeight() / 2) + iVarT.itemView.getTop())) - height;
            float fSqrt = (float) Math.sqrt((translationY * translationY) + (translationX * translationX));
            if (fSqrt < f && (objInvoke = function1.invoke(iVarT)) != null) {
                obj = objInvoke;
                f = fSqrt;
            }
        }
    }

    public static final int o(int i, String str) {
        xx7 xx7VarP = p();
        Integer num = null;
        if (xx7VarP != null) {
            Integer numValueOf = Integer.valueOf(xx7VarP.b(Math.max(0, i - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final xx7 p() {
        if (!xx7.e()) {
            return null;
        }
        xx7 xx7VarA = xx7.a();
        if (xx7VarA.c() == 1) {
            return xx7VarA;
        }
        return null;
    }

    public static int q(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static v4j r(u1b u1bVar, u1b u1bVar2) {
        z4o.D(u1bVar, "set1");
        z4o.D(u1bVar2, "set2");
        return new v4j(u1bVar, u1bVar2);
    }

    public static final afe s(Object obj, Object obj2, Object obj3, Function2 function2, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        Object objK = vt9Var.K();
        zpa zpaVar = hh5.a;
        if (objK == zpaVar) {
            objK = hyg.k(obj);
            vt9Var.g0(objK);
        }
        afe afeVar = (afe) objK;
        boolean zH = vt9Var.h(function2);
        Object objK2 = vt9Var.K();
        if (zH || objK2 == zpaVar) {
            objK2 = new muj(function2, afeVar, null, (byte) 2);
            vt9Var.g0(objK2);
        }
        rm5.f(obj2, obj3, (Function2) objK2, vt9Var);
        return afeVar;
    }

    public static final byte[] t(Object obj, KSerializer kSerializer) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
            try {
                zipOutputStream.setLevel(7);
                zipOutputStream.putNextEntry(new ZipEntry("Entry"));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(zipOutputStream, 8192);
                try {
                    cqp.O(mzm.a, kSerializer, obj, bufferedOutputStream);
                    bufferedOutputStream.close();
                    zipOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static final void u(int i, String str) {
        throw new SQLException(sko.i(i, "Error code: ").concat(", message: ".concat(str)));
    }
}
