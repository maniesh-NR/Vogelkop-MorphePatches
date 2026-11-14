package defpackage;

import android.net.Uri;
import com.opera.api.Callback;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class iy1 {
    public final umi a;
    public final cy1 b;
    public final dz1 c;
    public final q32 d;
    public final x12 e;
    public final ny1 f;
    public final qy1 g;
    public final gy1 h;
    public final i52 i;
    public final a52 j;
    public final jy1 k;
    public final jy1 l;
    public final qde m;
    public final ArrayList n;
    public final LinkedHashSet o;

    public iy1(ndc ndcVar, umi umiVar, cy1 cy1Var, dz1 dz1Var, q32 q32Var, x12 x12Var, ny1 ny1Var, qy1 qy1Var, gy1 gy1Var, i52 i52Var, a52 a52Var, jy1 jy1Var, jy1 jy1Var2) {
        this.a = umiVar;
        this.b = cy1Var;
        this.c = dz1Var;
        this.d = q32Var;
        this.e = x12Var;
        this.f = ny1Var;
        this.g = qy1Var;
        this.h = gy1Var;
        this.i = i52Var;
        this.j = a52Var;
        this.k = jy1Var;
        this.l = jy1Var2;
        qde qdeVar = new qde(l08.a);
        this.m = qdeVar;
        this.n = new ArrayList();
        this.o = new LinkedHashSet();
        final byte b = 0;
        xf8.u(dz1Var.g).j(ndcVar, new ug(new Function1(this) { // from class: yx1
            public final /* synthetic */ iy1 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                switch (b) {
                    case 0:
                        ((Map) obj).forEach(new by1(new s2(2, this.b, iy1.class, "onUploadFileChanged", "onUploadFileChanged(Ljava/lang/String;Lcom/opera/android/webaiassistant/AriaFileUploader$Status;)V", 0, (byte) 4), (byte) 0));
                        break;
                    default:
                        for (jx1 jx1Var : (List) obj) {
                            if (jx1Var != null) {
                                if (jx1Var instanceof px1) {
                                    px1 px1Var = (px1) jx1Var;
                                    String str = px1Var.a;
                                    wxe wxeVar = px1Var.b;
                                    ey1 ey1Var = px1Var.d;
                                    iy1 iy1Var = this.b;
                                    gy1 gy1Var2 = iy1Var.h;
                                    LinkedHashSet linkedHashSet = iy1Var.o;
                                    if (linkedHashSet.contains(str)) {
                                        continue;
                                    } else {
                                        linkedHashSet.add(str);
                                        iy1Var.b.c();
                                        int iOrdinal = ey1Var.ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1) {
                                            gy1Var2.o(wxeVar.G() ? 2132017609 : 2132018857);
                                        } else if (iOrdinal != 2) {
                                            if (iOrdinal == 3) {
                                                gy1Var2.o(wxeVar.G() ? 2132017605 : 2132017606);
                                            } else if (iOrdinal != 4) {
                                                h9o.p();
                                                break;
                                            } else {
                                                gy1Var2.o(wxeVar.G() ? 2132017620 : 2132018882);
                                            }
                                        } else if (((Boolean) iy1Var.k.invoke()).booleanValue()) {
                                            gy1Var2.o(2132017511);
                                        } else {
                                            gy1Var2.c(iy1Var.l);
                                        }
                                    }
                                } else if ((jx1Var instanceof rx1) || (jx1Var instanceof sx1) || (jx1Var instanceof fz1)) {
                                }
                            }
                            h9o.p();
                            break;
                        }
                        break;
                }
                return Unit.a;
            }
        }, (byte) 3));
        final byte b2 = 1;
        qdeVar.j(ndcVar, new ug(new Function1(this) { // from class: yx1
            public final /* synthetic */ iy1 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                switch (b2) {
                    case 0:
                        ((Map) obj).forEach(new by1(new s2(2, this.b, iy1.class, "onUploadFileChanged", "onUploadFileChanged(Ljava/lang/String;Lcom/opera/android/webaiassistant/AriaFileUploader$Status;)V", 0, (byte) 4), (byte) 0));
                        break;
                    default:
                        for (jx1 jx1Var : (List) obj) {
                            if (jx1Var != null) {
                                if (jx1Var instanceof px1) {
                                    px1 px1Var = (px1) jx1Var;
                                    String str = px1Var.a;
                                    wxe wxeVar = px1Var.b;
                                    ey1 ey1Var = px1Var.d;
                                    iy1 iy1Var = this.b;
                                    gy1 gy1Var2 = iy1Var.h;
                                    LinkedHashSet linkedHashSet = iy1Var.o;
                                    if (linkedHashSet.contains(str)) {
                                        continue;
                                    } else {
                                        linkedHashSet.add(str);
                                        iy1Var.b.c();
                                        int iOrdinal = ey1Var.ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1) {
                                            gy1Var2.o(wxeVar.G() ? 2132017609 : 2132018857);
                                        } else if (iOrdinal != 2) {
                                            if (iOrdinal == 3) {
                                                gy1Var2.o(wxeVar.G() ? 2132017605 : 2132017606);
                                            } else if (iOrdinal != 4) {
                                                h9o.p();
                                                break;
                                            } else {
                                                gy1Var2.o(wxeVar.G() ? 2132017620 : 2132018882);
                                            }
                                        } else if (((Boolean) iy1Var.k.invoke()).booleanValue()) {
                                            gy1Var2.o(2132017511);
                                        } else {
                                            gy1Var2.c(iy1Var.l);
                                        }
                                    }
                                } else if ((jx1Var instanceof rx1) || (jx1Var instanceof sx1) || (jx1Var instanceof fz1)) {
                                }
                            }
                            h9o.p();
                            break;
                        }
                        break;
                }
                return Unit.a;
            }
        }, (byte) 3));
    }

    public final void a(Uri uri, String str, String str2) {
        qde qdeVar = this.m;
        ArrayList arrayList = qdeVar.l;
        arrayList.removeIf(new zx1(new k51((byte) 24), (byte) 0));
        arrayList.add(new fz1(uri, str, str2));
        qdeVar.r(CollectionsKt.k0(arrayList));
    }

    public final void b() {
        qde qdeVar = this.m;
        ArrayList arrayList = qdeVar.l;
        arrayList.clear();
        qdeVar.r(CollectionsKt.k0(arrayList));
        ArrayList arrayList2 = this.n;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((fy1) obj).b.k((CancellationException) null);
        }
        arrayList2.clear();
    }

    public final File c(String str) {
        return ulp.D(snf.c, str, "webp");
    }

    public final void d(String str, py1 py1Var, ux1 ux1Var, String str2, o29 o29Var) {
        File file = py1Var.b;
        qde qdeVar = this.m;
        ArrayList arrayList = qdeVar.l;
        arrayList.add(new sx1(str, new qx1(o29Var, file, str2), ux1Var));
        qdeVar.r(CollectionsKt.k0(arrayList));
        new rml(Unit.a, this.a).a(new q3(this, py1Var, (byte) 12)).t(new rg((Object) this, (Object) str, (Object) file, (Object) str2, (byte) 2)).l();
    }

    public final void e(String str, o0g o0gVar, ux1 ux1Var) {
        File file;
        if (o0gVar instanceof v12) {
            file = ((v12) o0gVar).j;
        } else if (o0gVar instanceof u12) {
            file = ((u12) o0gVar).j;
        } else {
            if (!(o0gVar instanceof w12)) {
                h9o.p();
                return;
            }
            file = ((w12) o0gVar).j;
        }
        qde qdeVar = this.m;
        ArrayList arrayList = qdeVar.l;
        arrayList.add(new sx1(str, new qx1(o29.IMAGE, file, "image/webp"), ux1Var));
        qdeVar.r(CollectionsKt.k0(arrayList));
        new rml(Unit.a, this.a).a(new q3(this, o0gVar, (byte) 13)).t(new f9((Object) this, (Object) str, (Object) file, (byte) 6)).l();
    }

    public final void f(ux1 ux1Var, Callback callback) {
        String strValueOf = String.valueOf(System.currentTimeMillis());
        File fileC = c(strValueOf);
        new rml(Unit.a, this.a).b(new wx1(fileC, (byte) 0)).t(new ai(this, fileC, callback, strValueOf, ux1Var)).l();
    }

    public final void g(String str, boolean z) {
        Object next;
        Object obj;
        qde qdeVar = this.m;
        Iterator it = ((Iterable) qdeVar.g()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.a(((jx1) next).getId(), str)) {
                    break;
                }
            }
        }
        jx1 jx1Var = (jx1) next;
        ArrayList arrayList = qdeVar.l;
        arrayList.removeIf(new zx1(new tx0(str, (byte) 6), (byte) 1));
        qdeVar.r(CollectionsKt.k0(arrayList));
        ArrayList arrayList2 = this.n;
        int size = arrayList2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i);
            i++;
            if (Intrinsics.a(((fy1) obj).a, str)) {
                break;
            }
        }
        fy1 fy1Var = (fy1) obj;
        if (fy1Var != null) {
            fy1Var.b.k((CancellationException) null);
            arrayList2.remove(fy1Var);
        }
        if (z && jx1Var != null && (jx1Var instanceof vx1)) {
            wxe wxeVar = ((vx1) jx1Var).b;
            if (wxeVar instanceof qx1) {
                new rml(Unit.a, this.a).a(new wx1(((qx1) wxeVar).m, (byte) 1)).l();
            }
        }
    }

    public final void h(String str) {
        Object next;
        String str2;
        z92 z92Var;
        qde qdeVar = this.m;
        Iterator it = ((Iterable) qdeVar.g()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.a(((jx1) next).getId(), str)) {
                    break;
                }
            }
        }
        jx1 jx1Var = (jx1) next;
        if (jx1Var != null) {
            if (!(jx1Var instanceof px1)) {
                if ((jx1Var instanceof rx1) || (jx1Var instanceof sx1) || (jx1Var instanceof fz1)) {
                    return;
                }
                h9o.p();
                return;
            }
            wxe wxeVar = ((px1) jx1Var).b;
            if (wxeVar != null) {
                boolean z = wxeVar instanceof qx1;
                LinkedHashSet linkedHashSet = this.o;
                int i = 0;
                if (z) {
                    linkedHashSet.remove(str);
                    ArrayList arrayList = qdeVar.l;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        int i3 = i + 1;
                        if (i < 0) {
                            j95.n();
                            throw null;
                        }
                        jx1 jx1Var2 = (jx1) obj;
                        if ((jx1Var2 instanceof vx1) && Intrinsics.a(((vx1) jx1Var2).a, str)) {
                            arrayList.set(i, new sx1((vx1) jx1Var2));
                        }
                        i = i3;
                    }
                    qdeVar.r(CollectionsKt.k0(arrayList));
                    qx1 qx1Var = (qx1) wxeVar;
                    File file = qx1Var.m;
                    String str3 = qx1Var.n;
                    if (str3 == null) {
                        str3 = "";
                    }
                    i(file, str, str3);
                    return;
                }
                if (wxeVar instanceof tx1) {
                    linkedHashSet.remove(str);
                    ArrayList arrayList2 = qdeVar.l;
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        int i6 = i4 + 1;
                        if (i4 < 0) {
                            j95.n();
                            throw null;
                        }
                        jx1 jx1Var3 = (jx1) obj2;
                        if ((jx1Var3 instanceof vx1) && Intrinsics.a(((vx1) jx1Var3).a, str)) {
                            arrayList2.set(i4, new sx1((vx1) jx1Var3));
                        }
                        i4 = i6;
                    }
                    qdeVar.r(CollectionsKt.k0(arrayList2));
                    tx1 tx1Var = (tx1) wxeVar;
                    String str4 = tx1Var.o;
                    if (str4 != null && (str2 = tx1Var.p) != null && (z92Var = tx1Var.n) != null) {
                        j(str, tx1Var.m, str4, str2, z92Var.a);
                        return;
                    }
                    ArrayList arrayList3 = qdeVar.l;
                    int size3 = arrayList3.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        Object obj3 = arrayList3.get(i7);
                        i7++;
                        int i8 = i + 1;
                        if (i < 0) {
                            j95.n();
                            throw null;
                        }
                        jx1 jx1Var4 = (jx1) obj3;
                        if ((jx1Var4 instanceof vx1) && Intrinsics.a(((vx1) jx1Var4).a, str)) {
                            arrayList3.set(i, new px1((vx1) jx1Var4, ey1.a));
                        }
                        i = i8;
                    }
                    qdeVar.r(CollectionsKt.k0(arrayList3));
                    return;
                }
            }
            h9o.p();
        }
    }

    public final void i(File file, String str, String str2) {
        dz1 dz1Var = this.c;
        this.n.add(new fy1(str, na2.B(dz1Var.e, (CoroutineContext) null, (rx5) null, new s71(dz1Var, str, file, str2, (mt5) null, (byte) 2), 3)));
    }

    public final void j(String str, Uri uri, String str2, String str3, String str4) {
        dz1 dz1Var = this.c;
        this.n.add(new fy1(str, na2.B(dz1Var.d, (CoroutineContext) null, (rx5) null, new ld1(dz1Var, str, uri, str2, str3, str4, (mt5) null, (byte) 1), 3)));
    }
}
