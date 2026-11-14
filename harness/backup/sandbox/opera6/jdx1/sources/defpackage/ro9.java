package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.pdf.PdfRenderer;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.OperaApplication;
import com.opera.android.mainmenu.ToggleAnimationView;
import com.opera.android.ui.catalog.widget.OperaProgressIndicator;
import com.opera.android.view.TouchIgnoringViewPager;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;

/* loaded from: classes.dex */
public class ro9 implements yh8, ax4, b36, qr9, waf {
    public static final s49 e = new s49((byte) 12);
    public static final k2d f = new k2d(0, 71, 0);
    public static final k2d g = new k2d(72, 121, -1);
    public static final k2d h = new k2d(122, 137, 0);
    public static final k2d i = new k2d(137, 137, 0);
    public static final k2d j = new k2d(138, 155, 0);
    public static final k2d k = new k2d(155, 155, 0);
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;

    public ro9(byte b) {
        this.a = b;
        switch (b) {
            case 8:
                this.c = new Object[2];
                this.d = new byte[2];
                break;
            case 21:
                this.c = new dfe(new phb[16]);
                break;
            case 23:
                this.c = new LinkedHashMap();
                this.d = new LinkedHashSet();
                break;
            case 27:
                break;
            case 28:
                this.c = new SparseArray();
                this.b = 0;
                this.d = Collections.newSetFromMap(new IdentityHashMap());
                break;
            default:
                this.c = new WeakHashMap();
                this.d = new BigInteger[8];
                this.b = 0;
                break;
        }
    }

    public ro9(byte b, int i2) {
        this.a = b;
        switch (b) {
            case 25:
                this.b = i2;
                break;
            default:
                this.b = i2;
                int i3 = i2 + 1;
                this.c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 21, i3);
                this.d = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 21, i3);
                break;
        }
    }

    public ro9(ami amiVar, int i2) {
        this.a = (byte) 3;
        Objects.requireNonNull(amiVar);
        this.c = null;
        this.b = i2;
        this.d = null;
    }

    public ro9(ami amiVar, b2l b2lVar) {
        int i2 = 3;
        this.a = (byte) 3;
        Objects.requireNonNull(amiVar);
        this.c = b2lVar;
        if (b2lVar != null) {
            d7l d7lVar = (d7l) b2lVar;
            i2 = (d7lVar.j.c0() || ((knf) d7lVar.e.d) == null) ? 1 : 2;
        }
        this.b = i2;
        if (vep.A(i2) != 1) {
            this.d = null;
        } else {
            this.d = (knf) ((d7l) b2lVar).e.d;
        }
    }

    public ro9(Bitmap bitmap, ewj ewjVar, int i2, int i3) {
        this.a = (byte) 29;
        if ((bitmap != null) == (ewjVar != null)) {
            t40.h();
            throw null;
        }
        this.c = bitmap;
        this.d = ewjVar;
        if (i2 == 0) {
            t3p.q("loadedFrom == null");
        }
        this.b = i2;
    }

    public ro9(PdfRenderer pdfRenderer) {
        this.a = (byte) 26;
        this.c = pdfRenderer;
        this.b = pdfRenderer.getPageCount();
        this.d = Executors.newSingleThreadExecutor();
    }

    public ro9(aqd aqdVar, nod nodVar, int i2) {
        this.a = (byte) 19;
        this.d = aqdVar;
        this.c = nodVar;
        this.b = i2;
    }

    public ro9(TextInputLayout textInputLayout, tj9 tj9Var) {
        this.a = (byte) 15;
        this.c = textInputLayout;
        WeakHashMap weakHashMap = r5n.a;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) ((View) m5n.f(textInputLayout, 2131364529));
        this.d = autoCompleteTextView;
        autoCompleteTextView.setOnItemClickListener(new bo4(this, tj9Var, (byte) 1));
        new ga7(autoCompleteTextView);
    }

    public ro9(ToggleAnimationView toggleAnimationView) {
        this.a = (byte) 1;
        this.b = 1;
        this.c = toggleAnimationView;
        toggleAnimationView.d.b.n = true;
        toggleAnimationView.j(2131951692);
        toggleAnimationView.u(new mrl(this, (byte) 1));
    }

    public ro9(OperaProgressIndicator operaProgressIndicator, TouchIgnoringViewPager touchIgnoringViewPager, Integer num) {
        this.a = (byte) 24;
        this.c = operaProgressIndicator;
        this.b = num.intValue();
        isd isdVar = new isd(this, (byte) 9);
        wwf wwfVar = new wwf(isdVar);
        this.d = wwfVar;
        touchIgnoringViewPager.addOnPageChangeListener(wwfVar);
        touchIgnoringViewPager.getAdapter().registerDataSetObserver(new l46(wwfVar, (byte) 3));
        int currentItem = touchIgnoringViewPager.getCurrentItem();
        wwfVar.b = currentItem;
        wwfVar.c = currentItem;
        isdVar.m();
    }

    public ro9(e38 e38Var) {
        this.a = (byte) 14;
        this.d = zn8.a(150, new nv6(this));
        this.c = e38Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ro9(evd evdVar) {
        this(evdVar, new kj6(evdVar.a.limit(), evdVar.b.size()), 0);
        this.a = (byte) 12;
    }

    public ro9(evd evdVar, kj6 kj6Var, int i2) {
        this.a = (byte) 12;
        this.c = evdVar;
        evdVar.a.order(ByteOrder.LITTLE_ENDIAN);
        this.b = i2;
        this.d = kj6Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ro9(ewj ewjVar, int i2) {
        this((Bitmap) null, ewjVar, i2, 0);
        this.a = (byte) 29;
        StringBuilder sb = zym.a;
        if (ewjVar != null) {
        } else {
            t3p.q("source == null");
            throw null;
        }
    }

    public ro9(ft7 ft7Var) {
        this.a = (byte) 13;
        this.c = ft7Var;
        this.d = new PointF();
        this.b = -1;
    }

    public /* synthetic */ ro9(Object obj, int i2, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i2;
        this.d = obj2;
    }

    public /* synthetic */ ro9(Object obj, Serializable serializable, int i2, byte b) {
        this.a = b;
        this.c = obj;
        this.d = serializable;
        this.b = i2;
    }

    public ro9(ArrayList arrayList, int i2, MotionEvent motionEvent) {
        this.a = (byte) 2;
        this.c = arrayList;
        this.b = i2;
        this.d = motionEvent;
        if (arrayList.isEmpty()) {
            qp2.o("changes cannot be empty");
            throw null;
        }
    }

    public ro9(UUID uuid) {
        this.a = (byte) 0;
        uuid.getClass();
        z4o.v("Use C.CLEARKEY_UUID instead", !q54.b.equals(uuid));
        this.c = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.d = mediaDrm;
        this.b = 1;
        if (q54.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public ro9(CopyOnWriteArrayList copyOnWriteArrayList, int i2, jrd jrdVar) {
        this.a = (byte) 20;
        this.d = copyOnWriteArrayList;
        this.b = i2;
        this.c = jrdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb A[LOOP:1: B:23:0x00c9->B:29:0x00eb, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ro9(kotlin.ranges.IntRange r13, defpackage.w7d r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro9.<init>(kotlin.ranges.IntRange, w7d):void");
    }

    public ro9(u5n u5nVar) {
        this.a = (byte) 10;
        this.c = u5nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ro9(xoi r9, android.widget.FrameLayout r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro9.<init>(xoi, android.widget.FrameLayout):void");
    }

    public ro9(z13 z13Var, u13 u13Var) {
        this.a = (byte) 4;
        this.d = z13Var;
        this.c = u13Var;
    }

    public ro9(zy9 zy9Var, Handler handler) {
        this.a = (byte) 9;
        this.c = zy9Var;
        this.d = handler;
    }

    public final void A(bsc bscVar, int i2, IOException iOException, boolean z) {
        z(bscVar, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public final void B(bsc bscVar, int i2, int i3, oj9 oj9Var, int i4, Object obj, long j2, long j3, int i5) {
        m(new qo4(this, bscVar, new tjd(i2, i3, oj9Var, i4, obj, tym.c0(j2), tym.c0(j3)), i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00af A[SYNTHETIC] */
    @Override // defpackage.yh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final wh8 C(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro9.C(byte[], java.util.List, int, java.util.HashMap):wh8");
    }

    public final void D(k2d k2dVar) {
        this.d = k2dVar;
        ((ToggleAnimationView) this.c).t(k2dVar, new y1n(this, (byte) 17));
    }

    @Override // defpackage.yh8
    public final boolean E(String str, byte[] bArr) throws Throwable {
        MediaCrypto mediaCrypto;
        boolean zEquals;
        MediaDrm mediaDrm = (MediaDrm) this.d;
        UUID uuid = (UUID) this.c;
        if (Build.VERSION.SDK_INT >= 31) {
            if (uuid.equals(q54.d)) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(q54.c);
            }
            if (zEquals) {
                return m41.D(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto(uuid, bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return zRequiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !uuid.equals(q54.c);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    public void F(i iVar) {
        int itemViewType = iVar.getItemViewType();
        ArrayList arrayList = u(itemViewType).a;
        if (((pph) ((SparseArray) this.c).get(itemViewType)).b <= arrayList.size()) {
            z5i.r(iVar.itemView);
            return;
        }
        int[] iArr = RecyclerView.C0;
        iVar.resetInternal();
        arrayList.add(iVar);
    }

    public final bc6 G(bc6[] bc6VarArr) throws m37 {
        bc6 bc6Var;
        bc6 bc6VarJ = J();
        int i2 = bc6VarJ.a;
        int length = bc6VarArr.length - 1;
        int i3 = bc6VarJ.b;
        bc6 bc6Var2 = bc6VarArr[length];
        if (i3 <= bc6Var2.b) {
            while (true) {
                if (length < 0) {
                    bc6Var = null;
                    break;
                }
                bc6Var = bc6VarArr[length];
                if (i3 >= bc6Var.b) {
                    break;
                }
                length--;
            }
            if (bc6Var == null || bc6Var.a != i2) {
                kp5.c("Header doesn't correspond to any known version.");
                return null;
            }
        } else if (i2 < bc6Var2.a) {
            kp5.c("Message newer than the last known version cannot be shorter than required by the last known version.");
            return null;
        }
        return bc6VarJ;
    }

    public final boolean H(int i2, int i3) throws m37 {
        e0(i2, 1);
        e0(i2, 1);
        return (((evd) this.c).a.get(this.b + i2) & (1 << i3)) != 0;
    }

    public final byte[] I(int i2, int i3, int i4) throws m37 {
        ro9 ro9VarV = V(i2, wyh.E(i3));
        if (ro9VarV == null) {
            return null;
        }
        evd evdVar = (evd) ro9VarV.c;
        byte[] bArr = new byte[ro9VarV.L(i4, 1L).b];
        evdVar.a.position(ro9VarV.b + 8);
        evdVar.a.get(bArr);
        return bArr;
    }

    public final bc6 J() throws m37 {
        kj6 kj6Var = (kj6) this.d;
        kj6Var.a(this.b, r1 + 8);
        bc6 bc6VarK = K(0, false);
        kj6Var.a(r1 + 8, r1 + bc6VarK.a);
        return bc6VarK;
    }

    public final bc6 K(int i2, boolean z) throws m37 {
        int iQ = Q(i2);
        int iQ2 = Q(i2 + 4);
        if (iQ < 0) {
            kp5.c("Negative size. Unsigned integers are not valid for java.");
            return null;
        }
        if (iQ2 >= 0 || (z && iQ2 == -1)) {
            return new bc6(iQ, iQ2);
        }
        kp5.c("Negative elements or version. Unsigned integers are not valid for java.");
        return null;
    }

    public final bc6 L(int i2, long j2) throws m37 {
        bc6 bc6VarJ = J();
        int i3 = bc6VarJ.b;
        if (bc6VarJ.a < (j2 * i3) + 8) {
            kp5.c("Array header is incorrect.");
            return null;
        }
        if (i2 == -1 || i3 == i2) {
            return bc6VarJ;
        }
        kp5.c(fki.o(i2, i3, "Incorrect array length. Expected: ", ", but got: ", "."));
        return null;
    }

    public final void M() throws m37 {
        bc6 bc6VarJ = J();
        if (bc6VarJ.a != 24) {
            kp5.c("Incorrect header for map. The size is incorrect.");
        } else {
            if (bc6VarJ.b == 0) {
                return;
            }
            kp5.c("Incorrect header for map. The version is incorrect.");
        }
    }

    public final bc6 N(int i2) throws m37 {
        bc6 bc6VarK = K(i2, true);
        int i3 = bc6VarK.a;
        if (i3 == 0) {
            int i4 = bc6VarK.b;
            if (i4 != 0) {
                kp5.c(sko.i(i4, "Unexpected version tag for a null union. Expecting 0, found: "));
                return null;
            }
        } else if (i3 != 16) {
            kp5.c("Unexpected size of an union. The size must be 0 for a null union, or 16 for a non-null union.");
            return null;
        }
        return bc6VarK;
    }

    public final float O(int i2) throws m37 {
        e0(i2, 4);
        return ((evd) this.c).a.getFloat(this.b + i2);
    }

    public final float[] P(int i2, int i3) throws m37 {
        ro9 ro9VarV = V(i2, wyh.E(1));
        if (ro9VarV == null) {
            return null;
        }
        evd evdVar = (evd) ro9VarV.c;
        float[] fArr = new float[ro9VarV.L(i3, 4L).b];
        evdVar.a.position(ro9VarV.b + 8);
        evdVar.a.asFloatBuffer().get(fArr);
        return fArr;
    }

    public final int Q(int i2) throws m37 {
        e0(i2, 4);
        return ((evd) this.c).a.getInt(this.b + i2);
    }

    public final ueb R(int i2) {
        return new ueb(U(i2, false));
    }

    public final int[] S(int i2, int i3) throws m37 {
        ro9 ro9VarV = V(i2, wyh.E(i3));
        if (ro9VarV == null) {
            return null;
        }
        evd evdVar = (evd) ro9VarV.c;
        int[] iArr = new int[ro9VarV.L(-1, 4L).b];
        evdVar.a.position(ro9VarV.b + 8);
        evdVar.a.asIntBuffer().get(iArr);
        return iArr;
    }

    public final long T(int i2) throws m37 {
        e0(i2, 8);
        return ((evd) this.c).a.getLong(this.b + i2);
    }

    public final kwd U(int i2, boolean z) {
        return Y(i2, z).Q0();
    }

    public final ro9 V(int i2, boolean z) throws m37 {
        int i3 = this.b + i2;
        long jT = T(i2);
        if (jT != 0) {
            return new ro9((evd) this.c, (kj6) this.d, (int) (i3 + jT));
        }
        if (z) {
            return null;
        }
        kp5.c("Trying to decode null pointer for a non-nullable type.");
        return null;
    }

    public final short W(int i2) throws m37 {
        e0(i2, 2);
        return ((evd) this.c).a.getShort(this.b + i2);
    }

    public final String X(int i2, boolean z) throws m37 {
        byte[] bArrI = I(i2, z ? 1 : 0, -1);
        if (bArrI == null) {
            return null;
        }
        return new String(bArrI, Charset.forName("utf8"));
    }

    public final snm Y(int i2, boolean z) throws m37 {
        uib uibVar;
        int iQ = Q(i2);
        if (iQ != -1) {
            kj6 kj6Var = (kj6) this.d;
            if (iQ < kj6Var.a) {
                kp5.c("Trying to access handle out of order.");
                return null;
            }
            if (iQ >= kj6Var.e) {
                kp5.c("Trying to access non present handle.");
                return null;
            }
            kj6Var.a = iQ + 1;
            uibVar = (w6a) ((evd) this.c).b.get(iQ);
        } else {
            if (!z) {
                kp5.c("Trying to decode an invalid handle for a non-nullable type.");
                return null;
            }
            uibVar = uib.a;
        }
        return uibVar.m1();
    }

    public final void Z(vr0 vr0Var) {
        int iA = vep.A(this.b);
        if (iA != 0) {
            if (iA != 1) {
                h9o.p();
                return;
            }
            return;
        }
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((View) this.d).getContext().getApplicationContext().L().c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).b(new t5f(vr0Var, (byte) 0));
            x5fVar.U0(x56VarF);
        }
    }

    public final void a(cm cmVar) {
        z13 z13Var = (z13) this.d;
        int i2 = this.b;
        boolean z = i2 == 0;
        this.b = i2 + 1;
        if (i2 == 0) {
            z13Var.c();
            z13Var.e();
        }
        if (z) {
            z13Var.n = true;
            try {
                u13 u13Var = (u13) this.c;
                if (u13Var != null) {
                    u13Var.g(cmVar);
                }
            } finally {
                z13Var.n = false;
            }
        }
    }

    public final void a0(int i2, CharSequence charSequence) {
        this.b = i2;
        q9n.F((TextInputLayout) this.c, charSequence);
    }

    public final synchronized void b(BigInteger bigInteger) {
        ((WeakHashMap) this.c).put(bigInteger, Boolean.TRUE);
        BigInteger[] bigIntegerArr = (BigInteger[]) this.d;
        int i2 = this.b;
        bigIntegerArr[i2] = bigInteger;
        this.b = (i2 + 1) % bigIntegerArr.length;
    }

    public final byte[] b0() {
        Object[] objArr = (Object[]) this.c;
        byte[] bArr = (byte[]) this.d;
        int length = 0;
        int i2 = 0;
        while (true) {
            Object obj = objArr[i2];
            length += obj != null ? ((byte[]) obj).length : 1;
            if (i2 == 1) {
                break;
            }
            i2++;
        }
        byte[] bArr2 = new byte[length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            Object obj2 = objArr[i3];
            if (obj2 != null) {
                if (i4 < i3) {
                    int i6 = i3 - i4;
                    System.arraycopy(bArr, i4, bArr2, i5, i6);
                    i5 += i6;
                }
                int length2 = ((byte[]) obj2).length;
                System.arraycopy(obj2, 0, bArr2, i5, length2);
                i5 += length2;
                i4 = i3 + 1;
            }
            if (i3 == 1) {
                break;
            }
            i3++;
        }
        if (i4 < 2) {
            System.arraycopy(bArr, i4, bArr2, i5, 2 - i4);
        }
        return bArr2;
    }

    public final void c(int i2, g5c g5cVar) {
        if (i2 < 0) {
            d8b.a("size should be >=0");
        }
        if (i2 == 0) {
            return;
        }
        phb phbVar = new phb(this.b, i2, g5cVar);
        this.b += i2;
        ((dfe) this.c).c(phbVar);
    }

    public final void c0(int i2, int i3, int i4, long j2) {
        char c;
        int i5;
        char c2;
        int i6;
        char c3 = '2';
        if ((((int) (j2 >> 50)) & 1023) > 0) {
            int i7 = 33554431;
            char c4 = 25;
            long j3 = (j2 & xoh.b) | ((i2 & 33554431) << 25);
            long[] jArr = (long[]) this.c;
            long[] jArr2 = (long[]) this.d;
            int i8 = this.b;
            jArr2[0] = j3;
            int i9 = 1;
            while (i9 > 0) {
                i9--;
                long j4 = jArr2[i9];
                int i10 = ((int) j4) & i7;
                int i11 = ((int) (j4 >> c4)) & i7;
                int i12 = ((int) (j4 >> c3)) & 1023;
                int i13 = i12 == 1023 ? i8 : (i12 * 3) + i11;
                if (i11 < 0) {
                    return;
                }
                while (i11 < i8 - 2 && i11 <= i13) {
                    int i14 = i11 + 2;
                    long j5 = jArr[i14];
                    if ((((int) (j5 >> c4)) & i7) == i10) {
                        long j6 = jArr[i11];
                        int i15 = i11 + 1;
                        c = c3;
                        i5 = i7;
                        long j7 = jArr[i15];
                        c2 = c4;
                        i6 = i13;
                        jArr[i11] = ((((int) (j6 >> 32)) + i3) << 32) | ((((int) j6) + i4) & 4294967295L);
                        jArr[i15] = ((((int) (j7 >> 32)) + i3) << 32) | ((((int) j7) + i4) & 4294967295L);
                        jArr[i14] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c)) & 1023) > 0) {
                            jArr2[i9] = (j5 & xoh.b) | (((i11 + 3) & i5) << c2);
                            i9++;
                        }
                    } else {
                        c = c3;
                        i5 = i7;
                        c2 = c4;
                        i6 = i13;
                    }
                    i11 += 3;
                    i13 = i6;
                    c4 = c2;
                    i7 = i5;
                    c3 = c;
                }
                c4 = c4;
                i7 = i7;
                c3 = c3;
            }
        }
    }

    @Override // defpackage.yh8
    public final void closeSession(byte[] bArr) {
        ((MediaDrm) this.d).closeSession(bArr);
    }

    public final void d(Object obj) {
        Object[] objArr = (Object[]) this.c;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr[i2] = obj;
    }

    public final void d0(int i2, long j2, long j3) {
        tjd tjdVar = new tjd(1, i2, null, 3, null, tym.c0(j2), tym.c0(j3));
        jrd jrdVar = (jrd) this.c;
        jrdVar.getClass();
        m(new a32(this, jrdVar, tjdVar, (byte) 19));
    }

    public final void e() {
        if (((ToggleAnimationView) this.c).m != null) {
            int iA = vep.A(this.b);
            if (iA != 0) {
                if (iA == 1) {
                    D(i);
                    return;
                } else if (iA == 2) {
                    D(g);
                    return;
                } else if (iA != 3) {
                    return;
                }
            }
            D(k);
        }
    }

    public final void e0(int i2, int i3) throws m37 {
        if (((evd) this.c).a.limit() >= i2 + i3) {
            return;
        }
        kp5.c("Buffer is smaller than expected.");
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 23:
                return this == obj;
            default:
                return super.equals(obj);
        }
    }

    public void f() {
        SparseArray sparseArray = (SparseArray) this.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            pph pphVar = (pph) sparseArray.valueAt(i2);
            ArrayList arrayList = pphVar.a;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                z5i.r(((i) obj).itemView);
            }
            pphVar.a.clear();
        }
    }

    @Override // defpackage.yh8
    public final void g(final tw2 tw2Var) {
        ((MediaDrm) this.d).setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: qo9
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
                ue2 ue2Var = ((wn6) tw2Var.b).x;
                ue2Var.getClass();
                ue2Var.obtainMessage(i2, bArr).sendToTarget();
            }
        });
    }

    @Override // defpackage.yh8
    public final xh8 getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = ((MediaDrm) this.d).getProvisionRequest();
        return new xh8(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public final void h() {
        ((kj6) this.d).c--;
    }

    public final taf i(vaf vafVar) {
        taf tafVar = (taf) ((LinkedHashMap) this.c).get(vafVar);
        return tafVar == null ? taf.O : tafVar;
    }

    @Override // defpackage.yh8
    public final int j() {
        return 2;
    }

    public final void k() {
        ((zy9) this.c).k();
    }

    @Override // defpackage.yh8
    public final void l(byte[] bArr, fjg fjgVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                m41.I((MediaDrm) this.d, bArr, fjgVar);
            } catch (UnsupportedOperationException unused) {
                w7d.K("setLogSessionId failed.");
            }
        }
    }

    public final void m(op5 op5Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ord ordVar = (ord) it.next();
            tym.S(ordVar.a, new hpd(op5Var, ordVar.b, (byte) 4));
        }
    }

    public final void n(int i2, oj9 oj9Var, int i3, Object obj, long j2) {
        m(new z0c(this, new tjd(1, i2, oj9Var, i3, obj, tym.c0(j2), -9223372036854775807L), (byte) 22));
    }

    public final phb o(int i2) {
        if (i2 < 0 || i2 >= this.b) {
            d8b.e("Index " + i2 + ", size " + this.b);
        }
        phb phbVar = (phb) this.d;
        if (phbVar != null) {
            int i3 = phbVar.a;
            if (i2 < phbVar.b + i3 && i3 <= i2) {
                return phbVar;
            }
        }
        dfe dfeVar = (dfe) this.c;
        phb phbVar2 = (phb) dfeVar.a[c09.c(i2, dfeVar)];
        this.d = phbVar2;
        return phbVar2;
    }

    @Override // defpackage.qr9
    public final void onFailure(Throwable th) {
    }

    @Override // defpackage.qr9
    public final void onSuccess(Object obj) {
        npd npdVar = ((aqd) this.d).f;
        Handler handler = npdVar.l;
        nod nodVar = (nod) this.c;
        tym.S(handler, new zr9(npdVar, nodVar, new sh3(this, this.b, (List) obj, nodVar)));
    }

    @Override // defpackage.yh8
    public final byte[] openSession() {
        return ((MediaDrm) this.d).openSession();
    }

    public final int p(Object obj) {
        zde zdeVar = (zde) this.c;
        int iD = zdeVar.d(obj);
        if (iD >= 0) {
            return zdeVar.c[iD];
        }
        return -1;
    }

    @Override // defpackage.yh8
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        q54.c.equals((UUID) this.c);
        return ((MediaDrm) this.d).provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.yh8
    public final void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        ((MediaDrm) this.d).provideProvisionResponse(bArr);
    }

    public final void q(IBinder iBinder) {
        ((zy9) this.c).q(iBinder);
        Handler handler = (Handler) this.d;
        if (handler.getLooper() != Looper.myLooper()) {
            handler.post(new lb4(this, (byte) 10));
            return;
        }
        int i2 = this.b + 1;
        this.b = i2;
        ioh.w(i2, "Android.ChildProcessConnection.OnServiceConnectedCounts");
    }

    @Override // defpackage.yh8
    public final Map queryKeyStatus(byte[] bArr) {
        return ((MediaDrm) this.d).queryKeyStatus(bArr);
    }

    public final byte[] r(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        int length;
        Cipher cipher = (Cipher) this.c;
        try {
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            int i2 = this.b;
            if (i2 > 255) {
                return null;
            }
            if (iv == null) {
                length = 0;
            } else {
                if (iv.length > 255) {
                    return null;
                }
                length = iv.length;
            }
            byte[] bArr2 = {(byte) length, (byte) i2};
            byte[] bArr3 = (byte[]) this.d;
            return iv != null ? c36.a(new byte[][]{bArr3, bArr2, iv, bArrDoFinal}) : c36.a(new byte[][]{bArr3, bArr2, bArrDoFinal});
        } catch (BadPaddingException | IllegalBlockSizeException unused) {
            return null;
        }
    }

    @Override // defpackage.yh8
    public final synchronized void release() {
        int i2 = this.b - 1;
        this.b = i2;
        if (i2 == 0) {
            ((MediaDrm) this.d).release();
        }
    }

    @Override // defpackage.yh8
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        ((MediaDrm) this.d).restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.yh8
    public final oo9 s(byte[] bArr) {
        return new oo9((UUID) this.c, bArr);
    }

    public i t(int i2) {
        pph pphVar = (pph) ((SparseArray) this.c).get(i2);
        if (pphVar == null) {
            return null;
        }
        ArrayList arrayList = pphVar.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((i) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                return (i) arrayList.remove(size);
            }
        }
        return null;
    }

    public final pph u(int i2) {
        SparseArray sparseArray = (SparseArray) this.c;
        pph pphVar = (pph) sparseArray.get(i2);
        if (pphVar != null) {
            return pphVar;
        }
        pph pphVar2 = new pph();
        sparseArray.put(i2, pphVar2);
        return pphVar2;
    }

    public final void v() {
        kj6 kj6Var = (kj6) this.d;
        long j2 = kj6Var.c + 1;
        kj6Var.c = j2;
        if (j2 < 100) {
            return;
        }
        kp5.c("Recursion depth limit exceeded.");
    }

    public final int w(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3) {
        int i9 = i2 & 33554431;
        long[] jArr = (long[]) this.c;
        int i10 = this.b;
        int i11 = i10 + 3;
        this.b = i11;
        int length = jArr.length;
        if (length <= i11) {
            int iMax = Math.max(length << 1, i11);
            this.c = Arrays.copyOf(jArr, iMax);
            this.d = Arrays.copyOf((long[]) this.d, iMax);
        }
        long[] jArr2 = (long[]) this.c;
        jArr2[i10] = (i3 << 32) | (i4 & 4294967295L);
        jArr2[i10 + 1] = (i5 << 32) | (i6 & 4294967295L);
        int i12 = i7 & 33554431;
        jArr2[i10 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (i12 << 25) | i9;
        if (i7 == -1) {
            return i10;
        }
        if (i8 == -4) {
            a8b.b("Inserted child " + i9 + " without valid parent index");
        }
        int i13 = i8 + 2;
        long j2 = jArr2[i13];
        if ((((int) j2) & 33554431) != i12) {
            a8b.b("Inserted child " + i9 + " without valid parent index or parent " + i12 + " not found");
        }
        jArr2[i13] = (j2 & xoh.a) | (Math.min((i10 - i8) / 3, 1023) << 50);
        return i10;
    }

    public final void x(bsc bscVar, int i2, int i3, oj9 oj9Var, int i4, Object obj, long j2, long j3) {
        m(new mrd(this, bscVar, new tjd(i2, i3, oj9Var, i4, obj, tym.c0(j2), tym.c0(j3)), (byte) 1));
    }

    public final void y(bsc bscVar, int i2, int i3, oj9 oj9Var, int i4, Object obj, long j2, long j3) {
        m(new mrd(this, bscVar, new tjd(i2, i3, oj9Var, i4, obj, tym.c0(j2), tym.c0(j3)), (byte) 0));
    }

    public final void z(bsc bscVar, int i2, int i3, oj9 oj9Var, int i4, Object obj, long j2, long j3, IOException iOException, boolean z) {
        m(new nrd(this, bscVar, new tjd(i2, i3, oj9Var, i4, obj, tym.c0(j2), tym.c0(j3)), iOException, z));
    }
}
