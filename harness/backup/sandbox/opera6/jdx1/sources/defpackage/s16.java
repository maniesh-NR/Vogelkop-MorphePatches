package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Mac;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class s16 implements v97, u38, en8, jzh, ggd, qvm, i9f, lo7, h4h, o7h {
    public static u1e k(String str) {
        h58 h58Var = u1e.d;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            u1e u1eVar = (u1e) w4VarE.next();
            if (Intrinsics.a(u1eVar.a, str)) {
                return u1eVar;
            }
        }
        h9o.h("Collection contains no element matching the predicate.");
        return null;
    }

    public static String l() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b = bArrArray[0];
        bArrArray[16] = b;
        bArrArray[0] = (byte) ((15 & b) | 112);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }

    public static void m(Object obj, bqb bqbVar) {
        Throwable thD = t0i.d(obj);
        if (thD == null) {
            bqbVar.n(new sw7(obj));
        } else {
            bqbVar.n(new rw7(new dqb(thD)));
        }
    }

    public static Bundle n(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i != 0 && i != -1) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("highlights", CollectionsKt.j0(arrayList));
        bundle.putInt("highlight_scroll_to_view_behavior", 3);
        return bundle;
    }

    public static w6g o(String str, boolean z) {
        g54 g54Var = f.a;
        d04 d04Var = new d04();
        d04Var.d0(str);
        return f.d(d04Var, z);
    }

    public static w6g p(File file) {
        String str = w6g.b;
        return o(file.toString(), false);
    }

    public static w6g q(Path path) {
        String str = w6g.b;
        return o(path.toString(), false);
    }

    public static gk6 t(Context context, int i, Integer num, int i2, int i3, int i4) {
        int i5 = gk6.j;
        if ((i4 & 32) != 0) {
            i3 = f03.t(2130969727, context, 2131101243);
        }
        int i6 = i3;
        gjf gjfVarA = gjf.a(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970235});
        try {
            int i7 = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawableF = sgb.F(i, context);
            if (drawableF != null) {
                int i8 = i2 / 2;
                drawableF.setBounds(0, 0, Math.max(drawableF.getMinimumWidth(), i8), Math.max(drawableF.getMinimumHeight(), i8));
            } else {
                drawableF = null;
            }
            return new gk6(context, drawableF, num, i2, i2, new fk6(gjfVarA, i2, i7, (byte) 0), i6);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static wth u(bp3 bp3Var, xd4 xd4Var) {
        it8 it8VarO;
        tw2 tw2Var = new tw2(xd4Var, (byte) 27);
        Objects.toString(bp3Var);
        xd4Var.j();
        Set set = (Set) bp3Var.f;
        List list = (List) bp3Var.g;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = (List) bp3Var.h;
        if (set.isEmpty() && list.isEmpty()) {
            qp2.o("Must have at least one required or preferred feature");
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                qrm qrmVar = (qrm) it.next();
                dtm.b.getClass();
                if (urj.h(qrmVar) == dtm.UNDEFINED) {
                    it8VarO = new it8(qrmVar);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it8 it8VarQ = tw2.q((h5a) it2.next(), list2);
                        if (it8VarQ != null) {
                            it8VarO = it8VarQ;
                            break;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            jt8 jt8VarQ = tw2.q((h5a) obj, list2);
                            if (jt8VarQ != null) {
                                jt8VarQ.toString();
                            } else {
                                jt8VarQ = null;
                            }
                            if (jt8VarQ == null) {
                                arrayList.add(obj);
                            }
                        }
                        arrayList.toString();
                        it8VarO = tw2Var.o(bp3Var, arrayList, 0, l08.a);
                    }
                }
            }
        }
        if (it8VarO instanceof gt8) {
            wth wthVar = ((gt8) it8VarO).a;
            Objects.toString(wthVar);
            return wthVar;
        }
        if (it8VarO instanceof ht8) {
            qp2.o("Feature group is not supported");
            return null;
        }
        if (it8VarO instanceof it8) {
            throw new IllegalArgumentException(it8VarO.a + " is not supported");
        }
        if (!(it8VarO instanceof jt8)) {
            h9o.p();
            return null;
        }
        jt8 jt8Var = (jt8) it8VarO;
        uac.k(" must be added for ", jt8Var.b, jt8Var.a);
        return null;
    }

    public final void a(pvm pvmVar) {
    }

    @Override // defpackage.h4h
    public final void b(int i, Serializable serializable) {
    }

    @Override // defpackage.v97
    public final File c(hub hubVar) {
        return null;
    }

    @Override // defpackage.u38
    public final Object d(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // defpackage.ggd
    public final long e() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.en8
    public final void endTracks() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ggd
    public final long f() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.i9f
    public final int g(int i) {
        return i;
    }

    public final Object get() {
        tmj tmjVar = new tmj((byte) 9);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            t3p.q("Null flags");
            return null;
        }
        map.put(myg.a, new oo2(30000L, 86400000L, set));
        if (set == null) {
            t3p.q("Null flags");
            return null;
        }
        map.put(myg.c, new oo2(1000L, 86400000L, set));
        if (set == null) {
            t3p.q("Null flags");
            return null;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(wmi.b)));
        if (setUnmodifiableSet == null) {
            t3p.q("Null flags");
            return null;
        }
        map.put(myg.b, new oo2(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() >= myg.values().length) {
            return new no2(tmjVar, map);
        }
        qp2.n("Not all priorities have been configured");
        return null;
    }

    @Override // defpackage.en8
    public final void h(twi twiVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.i9f
    public final int i(int i) {
        return i;
    }

    @Override // defpackage.v97
    public final void j(hub hubVar, l45 l45Var) {
    }

    @Override // defpackage.ggd
    public final boolean next() {
        return false;
    }

    public void r(Rect rect, View view) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // defpackage.jzh
    public final kyh s(kyh kyhVar, trf trfVar) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((rx9) ((kx9) kyhVar.get()).a.b).a.d.asReadOnlyBuffer();
        int i = j34.a;
        m9f m9fVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new m9f(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (m9fVar != null && m9fVar.a == 0 && m9fVar.b == ((byte[]) m9fVar.c).length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.position(0);
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new p54(bArrArray);
    }

    @Override // defpackage.en8
    public final hyl track(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public final no7 x(Context context) {
        return new grf(context, 17, "operator_features");
    }
}
