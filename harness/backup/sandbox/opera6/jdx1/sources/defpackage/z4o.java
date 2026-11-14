package defpackage;

import ads_mobile_sdk.pd;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import com.opera.android.StatusBarDrawingFrameLayout;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class z4o {
    public static final ue5 a = new ue5(-1759434350, new gf5((byte) 28), false);
    public static final v5h b;
    public static final v5h c;
    public static final u5h d;
    public static final u5h e;
    public static final w5h f;
    public static final u5h g;
    public static final u5h h;
    public static final u5h i;
    public static final u5h j;
    public static final u5h[] k;
    public static final String[] l;
    public static final int[][] m;
    public static final int[][][] n;
    public static final gd7 o;
    public static final gd7 p;
    public static final int[] q;

    static {
        u5h v5hVar = new v5h();
        b = v5hVar;
        u5h v5hVar2 = new v5h();
        c = v5hVar2;
        u5h u5hVar = new u5h();
        d = u5hVar;
        u5h u5hVar2 = new u5h();
        e = u5hVar2;
        u5h w5hVar = new w5h();
        f = w5hVar;
        u5h u5hVar3 = new u5h();
        g = u5hVar3;
        u5h u5hVar4 = new u5h();
        h = u5hVar4;
        u5h u5hVar5 = new u5h();
        i = u5hVar5;
        u5h u5hVar6 = new u5h();
        j = u5hVar6;
        k = new u5h[]{v5hVar, v5hVar2, u5hVar, u5hVar2, w5hVar, u5hVar3, u5hVar4, u5hVar5, u5hVar6};
        l = new String[]{"opera"};
        m = new int[][]{new int[0], new int[]{6, 18}, new int[]{6, 22}, new int[]{6, 26}, new int[]{6, 30}, new int[]{6, 34}, new int[]{6, 22, 38}, new int[]{6, 24, 42}, new int[]{6, 26, 46}, new int[]{6, 28, 50}, new int[]{6, 30, 54}, new int[]{6, 32, 58}, new int[]{6, 34, 62}, new int[]{6, 26, 46, 66}, new int[]{6, 26, 48, 70}, new int[]{6, 26, 50, 74}, new int[]{6, 30, 54, 78}, new int[]{6, 30, 56, 82}, new int[]{6, 30, 58, 86}, new int[]{6, 34, 62, 90}, new int[]{6, 28, 50, 72, 94}, new int[]{6, 26, 50, 74, 98}, new int[]{6, 30, 54, 78, pd.U0}, new int[]{6, 28, 54, 80, pd.g1}, new int[]{6, 32, 58, 84, pd.k1}, new int[]{6, 30, 58, 86, 114}, new int[]{6, 34, 62, 90, 118}, new int[]{6, 26, 50, 74, 98, 122}, new int[]{6, 30, 54, 78, pd.U0, 126}, new int[]{6, 26, 52, 78, pd.V0, 130}, new int[]{6, 30, 56, 82, pd.i1, 134}, new int[]{6, 34, 60, 86, 112, 138}, new int[]{6, 30, 58, 86, 114, 142}, new int[]{6, 34, 62, 90, 118, 146}, new int[]{6, 30, 54, 78, pd.U0, 126, 150}, new int[]{6, 24, 50, 76, pd.U0, NotificationCompat.FLAG_HIGH_PRIORITY, 154}, new int[]{6, 28, 54, 80, pd.g1, 132, 158}, new int[]{6, 32, 58, 84, pd.k1, 136, 162}, new int[]{6, 26, 54, 82, pd.k1, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
        n = new int[][][]{new int[][]{new int[]{41, 25, 17, 10}, new int[]{34, 20, 14, 8}, new int[]{27, 16, 11, 7}, new int[]{17, 10, 7, 4}}, new int[][]{new int[]{77, 47, 32, 20}, new int[]{63, 38, 26, 16}, new int[]{48, 29, 20, 12}, new int[]{34, 20, 14, 8}}, new int[][]{new int[]{127, 77, 53, 32}, new int[]{pd.T0, 61, 42, 26}, new int[]{77, 47, 32, 20}, new int[]{58, 35, 24, 15}}, new int[][]{new int[]{187, 114, 78, 48}, new int[]{149, 90, 62, 38}, new int[]{pd.l1, 67, 46, 28}, new int[]{82, 50, 34, 21}}, new int[][]{new int[]{255, 154, pd.g1, 65}, new int[]{202, 122, 84, 52}, new int[]{144, 87, 60, 37}, new int[]{pd.g1, 64, 44, 27}}, new int[][]{new int[]{322, 195, 134, 82}, new int[]{255, 154, pd.g1, 65}, new int[]{178, pd.i1, 74, 45}, new int[]{139, 84, 58, 36}}, new int[][]{new int[]{370, 224, 154, 95}, new int[]{293, 178, 122, 75}, new int[]{207, 125, 86, 53}, new int[]{154, 93, 64, 39}}, new int[][]{new int[]{461, 279, 192, 118}, new int[]{365, 221, 152, 93}, new int[]{259, 157, pd.i1, 66}, new int[]{202, 122, 84, 52}}, new int[][]{new int[]{552, 335, 230, 141}, new int[]{432, 262, 180, pd.l1}, new int[]{312, 189, 130, 80}, new int[]{235, 143, 98, 60}}, new int[][]{new int[]{652, 395, 271, 167}, new int[]{513, 311, 213, 131}, new int[]{364, 221, 151, 93}, new int[]{288, 174, 119, 74}}, new int[][]{new int[]{772, 468, 321, 198}, new int[]{604, 366, 251, 155}, new int[]{427, 259, 177, pd.j1}, new int[]{331, 200, 137, 85}}, new int[][]{new int[]{883, 535, 367, 226}, new int[]{691, 419, 287, 177}, new int[]{489, 296, 203, 125}, new int[]{374, 227, 155, 96}}, new int[][]{new int[]{1022, 619, 425, 262}, new int[]{796, 483, 331, 204}, new int[]{580, 352, 241, 149}, new int[]{427, 259, 177, pd.j1}}, new int[][]{new int[]{1101, 667, 458, 282}, new int[]{871, 528, 362, 223}, new int[]{621, 376, 258, 159}, new int[]{468, 283, 194, 120}}, new int[][]{new int[]{1250, 758, 520, 320}, new int[]{991, 600, 412, 254}, new int[]{703, 426, 292, 180}, new int[]{530, 321, 220, 136}}, new int[][]{new int[]{1408, 854, 586, 361}, new int[]{1082, 656, 450, 277}, new int[]{775, 470, 322, 198}, new int[]{602, 365, 250, 154}}, new int[][]{new int[]{1548, 938, 644, 397}, new int[]{1212, 734, 504, 310}, new int[]{876, 531, 364, 224}, new int[]{674, 408, 280, 173}}, new int[][]{new int[]{1725, 1046, 718, 442}, new int[]{1346, 816, 560, 345}, new int[]{948, 574, 394, 243}, new int[]{746, 452, 310, 191}}, new int[][]{new int[]{1903, 1153, 792, 488}, new int[]{1500, 909, 624, 384}, new int[]{1063, 644, 442, 272}, new int[]{813, 493, 338, 208}}, new int[][]{new int[]{2061, 1249, 858, 528}, new int[]{1600, 970, 666, 410}, new int[]{1159, 702, 482, 297}, new int[]{919, 557, 382, 235}}, new int[][]{new int[]{2232, 1352, 929, 572}, new int[]{1708, 1035, 711, 438}, new int[]{1224, 742, 509, 314}, new int[]{969, 587, 403, 248}}, new int[][]{new int[]{2409, 1460, 1003, 618}, new int[]{1872, 1134, 779, 480}, new int[]{1358, 823, 565, 348}, new int[]{1056, 640, 439, 270}}, new int[][]{new int[]{2620, 1588, 1091, 672}, new int[]{2059, 1248, 857, 528}, new int[]{1468, 890, 611, 376}, new int[]{1108, 672, 461, 284}}, new int[][]{new int[]{2812, 1704, 1171, 721}, new int[]{2188, 1326, 911, 561}, new int[]{1588, 963, 661, 407}, new int[]{1228, 744, 511, 315}}, new int[][]{new int[]{3057, 1853, 1273, 784}, new int[]{2395, 1451, 997, 614}, new int[]{1718, 1041, 715, 440}, new int[]{1286, 779, 535, 330}}, new int[][]{new int[]{3283, 1990, 1367, 842}, new int[]{2544, 1542, 1059, 652}, new int[]{1804, 1094, 751, 462}, new int[]{1425, 864, 593, 365}}, new int[][]{new int[]{3517, 2132, 1465, 902}, new int[]{2701, 1637, 1125, 692}, new int[]{1933, 1172, 805, 496}, new int[]{1501, 910, 625, 385}}, new int[][]{new int[]{3669, 2223, 1528, 940}, new int[]{2857, 1732, 1190, 732}, new int[]{2085, 1263, 868, 534}, new int[]{1581, 958, 658, 405}}, new int[][]{new int[]{3909, 2369, 1628, 1002}, new int[]{3035, 1839, 1264, 778}, new int[]{2181, 1322, 908, 559}, new int[]{1677, 1016, 698, 430}}, new int[][]{new int[]{4158, 2520, 1732, 1066}, new int[]{3289, 1994, 1370, 843}, new int[]{2358, 1429, 982, 604}, new int[]{1782, 1080, 742, 457}}, new int[][]{new int[]{4417, 2677, 1840, 1132}, new int[]{3486, 2113, 1452, 894}, new int[]{2473, 1499, 1030, 634}, new int[]{1897, 1150, 790, 486}}, new int[][]{new int[]{4686, 2840, 1952, 1201}, new int[]{3693, 2238, 1538, 947}, new int[]{2670, 1618, 1112, 684}, new int[]{2022, 1226, 842, 518}}, new int[][]{new int[]{4965, 3009, 2068, 1273}, new int[]{3909, 2369, 1628, 1002}, new int[]{2805, 1700, 1168, 719}, new int[]{2157, 1307, 898, 553}}, new int[][]{new int[]{5253, 3183, 2188, 1347}, new int[]{4134, 2506, 1722, 1060}, new int[]{2949, 1787, 1228, 756}, new int[]{2301, 1394, 958, 590}}};
        byte b2 = 4;
        o = new gd7("NONE", b2);
        p = new gd7("PENDING", b2);
        q = new int[]{-1, -1};
    }

    public static void A(int i2, int i3) {
        String strJ;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strJ = n1h.j("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    qp2.o(sko.i(i3, "negative size: "));
                    return;
                }
                strJ = n1h.j("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static HashSet A0(String str) {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, TextUtils.split(str, ","));
        return hashSet;
    }

    public static void B(ListenableFuture listenableFuture, String str, Object obj) {
        if (listenableFuture != null) {
            return;
        }
        t3p.q(n1h.j(str, obj));
    }

    public static void B0(pki pkiVar, tcc tccVar) {
        qcc qccVar = ((qdc) tccVar).i;
        if (qccVar == qcc.b || qccVar.d(qcc.d)) {
            pkiVar.d();
        } else {
            tccVar.a(new el5(tccVar, pkiVar, (byte) 2));
        }
    }

    public static void C(Object obj) {
        obj.getClass();
    }

    public static int C0(int i2, byte[] bArr) {
        return (bArr[i2 + 1] - 48) + ((bArr[i2] - 48) * 10);
    }

    public static void D(Object obj, String str) {
        if (obj != null) {
            return;
        }
        t3p.q(str);
    }

    public static boolean D0(int i2, byte[] bArr) {
        return i2 + 2 <= bArr.length && f0(bArr[i2]) && f0(bArr[i2 + 1]);
    }

    public static void E(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            h9o.u(o(i2, i3, "index"));
        }
    }

    public static boolean E0(int i2, byte[] bArr) {
        int iC0 = C0(i2, bArr);
        int iC02 = C0(i2 + 2, bArr);
        return iC0 >= 1 && iC0 <= 12 && iC02 >= 1 && iC02 <= 31 && C0(i2 + 4, bArr) <= 23;
    }

    public static void F(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? o(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? o(i3, i4, "end index") : n1h.j("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static boolean F0(byte[] bArr) {
        return D0(10, bArr) && C0(10, bArr) <= 59;
    }

    public static void G(String str, boolean z) {
        if (z) {
            return;
        }
        qp2.n(str);
    }

    public static void H(boolean z) {
        if (z) {
            return;
        }
        h9o.e();
    }

    public static void I(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        qp2.n(n1h.j(str, obj));
    }

    public static void J(Cursor cursor) {
        if (cursor != null) {
            try {
                u35.p(cursor);
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static final hki K(pki pkiVar, tcc tccVar, String str, Bundle bundle) {
        gki gkiVar;
        Bundle bundleA = pkiVar.a(str);
        if (bundleA != null) {
            bundle = bundleA;
        }
        if (bundle == null) {
            gkiVar = new gki();
        } else {
            bundle.setClassLoader(gki.class.getClassLoader());
            u9d u9dVar = new u9d(bundle.size());
            for (String str2 : bundle.keySet()) {
                u9dVar.put(str2, bundle.get(str2));
            }
            gkiVar = new gki(u9dVar.g());
        }
        hki hkiVar = new hki(str, gkiVar);
        hkiVar.h(pkiVar, tccVar);
        B0(pkiVar, tccVar);
        return hkiVar;
    }

    public static final x4o M(Context context, jl5 jl5Var) {
        u5i u5iVarF;
        a5o a5oVar = new a5o(jl5Var.c);
        Context applicationContext = context.getApplicationContext();
        ioj iojVar = jl5Var.d;
        if (context.getResources().getBoolean(2131034136)) {
            u5iVarF = new u5i(applicationContext, WorkDatabase.class, null);
            u5iVarF.i = true;
        } else {
            u5iVarF = xih.f(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            u5iVarF.h = new kw0(applicationContext);
        }
        if (u5iVarF.p != null) {
            qp2.o("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            return null;
        }
        u5iVarF.f = a5oVar.a;
        u5iVarF.d.add(new e25());
        u5iVarF.a(czd.h);
        u5iVarF.a(new uxh(applicationContext, 2, 3));
        u5iVarF.a(czd.i);
        u5iVarF.a(czd.j);
        u5iVarF.a(new uxh(applicationContext, 5, 6));
        u5iVarF.a(czd.k);
        u5iVarF.a(czd.l);
        u5iVarF.a(czd.m);
        u5iVarF.a(new uxh(applicationContext));
        u5iVarF.a(new uxh(applicationContext, 10, 11));
        u5iVarF.a(czd.d);
        u5iVarF.a(czd.e);
        u5iVarF.a(czd.f);
        u5iVarF.a(czd.g);
        u5iVarF.a(new uxh(applicationContext, 21, 22));
        u5iVarF.n = false;
        u5iVarF.o = true;
        WorkDatabase workDatabase = (WorkDatabase) u5iVarF.b();
        azl azlVar = new azl(context.getApplicationContext(), a5oVar);
        t1h t1hVar = new t1h(context.getApplicationContext(), jl5Var, a5oVar, workDatabase);
        return new x4o(context.getApplicationContext(), jl5Var, a5oVar, workDatabase, (List) y4o.a.k(context, jl5Var, a5oVar, workDatabase, azlVar, t1hVar), t1hVar, azlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object N(hi5 hi5Var, g7h g7hVar) {
        if (!((b8e) hi5Var).a.n) {
            a8b.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        oag oagVar = (oag) ui6.e0(hi5Var).B;
        oagVar.getClass();
        return alo.d0(oagVar, g7hVar);
    }

    public static final void O(osk oskVar) {
        ehc ehcVarB = a.b();
        wsk wskVarH = oskVar.h("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (wskVarH.n()) {
            try {
                ehcVarB.add(wskVarH.l(0));
            } finally {
            }
        }
        fr3.t(wskVarH, null);
        mea meaVarListIterator = a.a(ehcVarB).listIterator(0);
        while (true) {
            mea meaVar = meaVarListIterator;
            if (!meaVar.hasNext()) {
                return;
            }
            String str = (String) meaVar.next();
            if (c.q(str, "room_fts_content_sync_", false)) {
                nxg.k(oskVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final boolean P(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return parentFile.mkdirs() || parentFile.exists();
        }
        file.toString();
        throw new IllegalStateException("");
    }

    public static boolean Q(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = false;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
                if (cursorQuery.getCount() > 0) {
                    z = true;
                }
            } catch (Exception e2) {
                e2.toString();
            }
            return z;
        } finally {
            J(cursorQuery);
        }
    }

    public static r25[] R() {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, T());
        Collections.addAll(arrayList, new v25(), new z25((byte) 1), new n25(), new t25((byte) 0));
        return (r25[]) arrayList.toArray(new r25[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a82 S(ge4 ge4Var) {
        int[] iArr = {0};
        Object objC = ((ma4) ge4Var).c(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (objC != 0) {
            iArr = objC;
        }
        return new a82(iArr, (byte) 0);
    }

    public static r25[] T() {
        return new r25[]{new q25((byte) 0), new z25((byte) 0), new y25(), new o25((byte) 1), new q25((byte) 1)};
    }

    public static r25[] U(Context context) {
        ArrayList arrayList = new ArrayList();
        SharedPreferences sharedPreferences = ru9.c(context).a;
        if (sharedPreferences.getBoolean("exit_dialog_close_tabs", true)) {
            arrayList.add(new z25((byte) 0));
        }
        if (sharedPreferences.getBoolean("exit_dialog_clear_data", false)) {
            arrayList.add(new q25((byte) 0));
        }
        return (r25[]) arrayList.toArray(new r25[0]);
    }

    public static String V(Context context, r25[] r25VarArr) {
        String string = context.getString(2132018306, "", "");
        StringBuilder sb = new StringBuilder();
        for (r25 r25Var : r25VarArr) {
            if (sb.length() > 0) {
                sb.append(string);
                rxh rxhVar = r25Var.c;
                if (rxhVar != null) {
                    sb.append(rxhVar.a(context.getResources()));
                } else {
                    sb.append(r25Var.b.a(context.getResources()));
                }
            } else {
                sb.append(r25Var.b.a(context.getResources()));
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int W(ge4 ge4Var, int i2) {
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        int[] iArr = {0};
        ma4 ma4Var = (ma4) ge4Var;
        Object objC = ma4Var.c(key);
        if (objC != 0) {
            iArr = objC;
        }
        if (new a82(iArr, (byte) 0).contains(Integer.valueOf(i2))) {
            return i2;
        }
        Object objC2 = ma4Var.c(key);
        Object obj = {0};
        if (objC2 != null) {
            obj = objC2;
        }
        return new a82((int[]) obj, (byte) 0).contains(1) ? 1 : 0;
    }

    public static final void a(n01 n01Var, boolean z, c8e c8eVar, ih5 ih5Var, int i2) {
        c8e c8eVar2;
        ikl iklVar;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(902172655);
        int i3 = i2 | (vt9Var.f(n01Var) ? 4 : 2) | 384;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 14) == 4;
            Object objK = vt9Var.K();
            if (z2 || objK == hh5.a) {
                objK = qyn.B(n01Var);
                vt9Var.g0(objK);
            }
            String str = (String) objK;
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            xf8.j(iza.a(k1g.A(n01Var.a), vt9Var), "Reward", mpj.h(z7eVar, z ? 24.0f : 18.0f), null, null, 0.0f, null, vt9Var, 56, 120);
            if (z) {
                vt9Var.W(-869980191);
                iklVar = ((wam) vt9Var.j(abm.a)).e;
            } else {
                vt9Var.W(-869978756);
                iklVar = ((wam) vt9Var.j(abm.a)).j;
            }
            vt9Var.p(false);
            ijl.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, iklVar, vt9Var, 0, 24576, 114686);
            vt9Var = vt9Var;
            vt9Var.p(true);
            c8eVar2 = z7eVar;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new q01((Object) n01Var, z, c8eVar2, i2, (byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    public static final void b(final em4 em4Var, final String str, final Function0 function0, final Function0 function02, final Function0 function03, c8e c8eVar, ih5 ih5Var, final int i2) throws oye {
        int i3;
        String str2;
        final c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(385576795);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(em4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i3 |= vt9Var.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.h(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= vt9Var.h(function03) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if (vt9Var.N(i4 & 1, (74899 & i4) != 74898)) {
            boolean z = em4Var instanceof zl4;
            z7e z7eVar = z7e.b;
            if (z) {
                vt9Var.W(1976044347);
                int i5 = i4 & 14;
                int i6 = i4 >> 3;
                c((zl4) em4Var, function0, function02, z7eVar, vt9Var, i5 | (i6 & 112) | (i6 & 896) | 3072);
                vt9Var.p(false);
            } else if (em4Var instanceof bm4) {
                vt9Var.W(1976289495);
                e(z7eVar, vt9Var, 6);
                vt9Var.p(false);
            } else if (em4Var instanceof cm4) {
                vt9Var.W(1976399483);
                g(function0, function03, str2, z7eVar, vt9Var, ((i4 >> 6) & 14) | ((i4 >> 9) & 112) | ((i4 << 3) & 896) | 3072);
                vt9Var.p(false);
            } else if (em4Var instanceof am4) {
                vt9Var.W(1976679289);
                am4 am4Var = (am4) em4Var;
                d(uyg.q(am4Var.a, vt9Var), am4Var.b, function0, z7eVar, vt9Var, (i4 & 896) | 3072);
                vt9Var.p(false);
            } else {
                if (!(em4Var instanceof dm4)) {
                    throw fki.m(vt9Var, 1172121074, false);
                }
                vt9Var.W(1976967093);
                dm4 dm4Var = (dm4) em4Var;
                i(dm4Var.a, dm4Var.b, dm4Var.c, dm4Var.d, dm4Var.e, function0, z7eVar, vt9Var, ((i4 << 9) & 458752) | 1572864);
                z7eVar = z7eVar;
                vt9Var = vt9Var;
                vt9Var.p(false);
            }
            c8eVar2 = z7eVar;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: tl4
                public final Object invoke(Object obj, Object obj2) throws oye {
                    ((Integer) obj2).getClass();
                    z4o.b(em4Var, str, function0, function02, function03, c8eVar2, (ih5) obj, aoh.m(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(zl4 zl4Var, Function0 function0, Function0 function02, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        c8e c8eVar2;
        Function0 function03;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1012660155);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(zl4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            c8eVar2 = c8eVar;
            i3 |= vt9Var.f(c8eVar2) ? 2048 : 1024;
        } else {
            c8eVar2 = c8eVar;
        }
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            c8e c8eVarX = a26.X(wxe.Q(c8eVar2), 24.0f);
            db5 db5VarA = cb5.a(b72.c, rbe.o, vt9Var, 48);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarX);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            Function0 function04 = m3c.S;
            if (z) {
                vt9Var.k(function04);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, db5VarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            String strQ = uyg.q((shk) ahk.j.getValue(), vt9Var);
            hp7 hp7Var = abm.a;
            int i4 = i3;
            ijl.b(strQ, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).f, vt9Var, 0, 0, 131070);
            z7e z7eVar = z7e.b;
            ocp.c(vt9Var, mpj.c(z7eVar, 16.0f));
            x62 x62Var = new x62(4.0f, true, new t40((byte) 19));
            sd3 sd3Var = rbe.k;
            o9i o9iVarA = m9i.a(x62Var, sd3Var, vt9Var, 6);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, z7eVar);
            vt9Var.a0();
            if (vt9Var.S) {
                function03 = function04;
                vt9Var.k(function03);
            } else {
                function03 = function04;
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            String str = zl4Var.a;
            ikl iklVar = ((wam) vt9Var.j(hp7Var)).c;
            hp7 hp7Var2 = ua5.a;
            Function0 function05 = function03;
            ijl.b(str, null, ((sa5) vt9Var.j(hp7Var2)).a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, iklVar, vt9Var, 0, 0, 131066);
            ijl.b(k1g.E(zl4Var.b, vt9Var), null, ((kk8) vt9Var.j(lk8.a)).j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).c, vt9Var, 0, 0, 131066);
            vt9 vt9Var2 = vt9Var;
            vt9Var2.p(true);
            if (zl4Var.c != null) {
                vt9Var2.W(47442342);
                ocp.c(vt9Var2, mpj.c(z7eVar, 4.0f));
                ijl.b(zl4Var.c, null, ((sa5) vt9Var2.j(hp7Var2)).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var)).j, vt9Var2, 0, 0, 131066);
                vt9Var2 = vt9Var2;
                vt9Var2.p(false);
            } else {
                vt9Var2.W(47698929);
                vt9Var2.p(false);
            }
            ocp.c(vt9Var2, mpj.c(z7eVar, 16.0f));
            String strQ2 = uyg.q((shk) ahk.u.getValue(), vt9Var2);
            String str2 = zl4Var.d;
            ue5 ue5Var = c26.f;
            i39 i39Var = mpj.a;
            zi4.g(strQ2, str2, i39Var, ue5Var, vt9Var2, 384);
            ocp.c(vt9Var2, mpj.c(z7eVar, 24.0f));
            o9i o9iVarA2 = m9i.a(new x62(16.0f, true, new t40((byte) 19)), sd3Var, vt9Var2, 6);
            int iHashCode3 = Long.hashCode(vt9Var2.T);
            oag oagVarL3 = vt9Var2.l();
            c8e c8eVarP3 = qyn.P(vt9Var2, i39Var);
            vt9Var2.a0();
            if (vt9Var2.S) {
                vt9Var2.k(function05);
            } else {
                vt9Var2.j0();
            }
            y4h.o(vt9Var2, o9iVarA2, ah5Var);
            y4h.o(vt9Var2, oagVarL3, ah5Var2);
            u35.j(iHashCode3, vt9Var2, ah5Var3, vt9Var2);
            y4h.o(vt9Var2, c8eVarP3, ah5Var4);
            if (1.0f <= 0.0d) {
                y7b.a("invalid weight; must be greater than zero");
            }
            vt9 vt9Var3 = vt9Var2;
            yi4.i(function0, new g4c(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, (paj) null, (z14) null, (go3) null, (zvf) null, c26.g, vt9Var3, ((i4 >> 3) & 14) | 805306368, 508);
            if (1.0f <= 0.0d) {
                y7b.a("invalid weight; must be greater than zero");
            }
            yi4.a(function02, new g4c(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, c26.h, vt9Var3, ((i4 >> 6) & 14) | 805306368, 508);
            vt9Var = vt9Var3;
            vt9Var.p(true);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fz0(zl4Var, function0, function02, c8eVar, i2);
        }
    }

    public static final void d(String str, String str2, Function0 function0, c8e c8eVar, ih5 ih5Var, int i2) {
        String str3;
        int i3;
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-376550133);
        if ((i2 & 6) == 0) {
            str3 = str;
            i3 = (vt9Var.f(str3) ? 4 : 2) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            c8eVar2 = c8eVar;
            i3 |= vt9Var.f(c8eVar2) ? 2048 : 1024;
        } else {
            c8eVar2 = c8eVar;
        }
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            c8e c8eVarX = a26.X(wxe.Q(c8eVar2), 24.0f);
            byte b2 = 19;
            x62 x62Var = new x62(24.0f, true, new t40(b2));
            rd3 rd3Var = rbe.n;
            db5 db5VarA = cb5.a(x62Var, rd3Var, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarX);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            fza fzaVar = m3c.S;
            if (z) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, db5VarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            db5 db5VarA2 = cb5.a(new x62(8.0f, true, new t40(b2)), rd3Var, vt9Var, 6);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, z7e.b);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA2, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            hp7 hp7Var = abm.a;
            int i4 = i3;
            ijl.b(str3, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).k, vt9Var, i3 & 14, 0, 131070);
            vt9Var = vt9Var;
            if (str2 != null) {
                vt9Var.W(-156687256);
                ijl.b(str2, null, ((sa5) vt9Var.j(ua5.a)).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).l, vt9Var, (i4 >> 3) & 14, 0, 131066);
                vt9Var = vt9Var;
                vt9Var.p(false);
            } else {
                vt9Var.W(-156485973);
                vt9Var.p(false);
            }
            vt9Var.p(true);
            yi4.a(function0, mpj.a, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, c26.k, vt9Var, ((i4 >> 6) & 14) | 805306416, 508);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fz0((Object) str, str2, function0, c8eVar, i2, (byte) 3);
        }
    }

    public static final int d0(t72 t72Var, Object obj, int i2) {
        int i3 = t72Var.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iF = x1p.f(i3, i2, t72Var.a);
            if (iF < 0 || Intrinsics.a(obj, t72Var.b[iF])) {
                return iF;
            }
            int i4 = iF + 1;
            while (i4 < i3 && t72Var.a[i4] == i2) {
                if (Intrinsics.a(obj, t72Var.b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iF - 1; i5 >= 0 && t72Var.a[i5] == i2; i5--) {
                if (Intrinsics.a(obj, t72Var.b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            t40.e();
            return 0;
        }
    }

    public static final void e(c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1089209131);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            c8e c8eVarX = a26.X(c8eVar.d(mpj.a), 24.0f);
            db5 db5VarA = cb5.a(new x62(24.0f, true, new t40((byte) 19)), rbe.o, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarX);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ijl.b(uyg.q((shk) ahk.v.getValue(), vt9Var), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).j, vt9Var, 0, 0, 131070);
            vt9Var = vt9Var;
            v4h.a(mpj.h(z7e.b, 48.0f), 0L, 0.0f, 0L, 0, 0.0f, vt9Var, 6, 62);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ul4(c8eVar, i2, (byte) 0);
        }
    }

    public static final long e0(long j2) {
        if (j2 < 0) {
            pn7.b.getClass();
            return pn7.d;
        }
        pn7.b.getClass();
        return pn7.c;
    }

    public static final nak f(Object obj) {
        if (obj == null) {
            obj = vtp.d;
        }
        return new nak(obj);
    }

    public static boolean f0(byte b2) {
        return b2 >= 48 && b2 <= 57;
    }

    public static final void g(Function0 function0, Function0 function02, String str, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1164732039);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(function02) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.f(str) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            c8eVar2 = c8eVar;
            i3 |= vt9Var.f(c8eVar2) ? 2048 : 1024;
        } else {
            c8eVar2 = c8eVar;
        }
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            c61 c61VarF = a26.F(vt9Var);
            c8e c8eVarX = a26.X(wxe.Q(c8eVar2), 24.0f);
            x62 x62Var = new x62(16.0f, true, new t40((byte) 19));
            rd3 rd3Var = rbe.n;
            db5 db5VarA = cb5.a(x62Var, rd3Var, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarX);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            Function0 function03 = m3c.S;
            if (z) {
                vt9Var.k(function03);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, db5VarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            String strQ = uyg.q((shk) ahk.H0.getValue(), vt9Var);
            hp7 hp7Var = abm.a;
            boolean z2 = false;
            ijl.b(strQ, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).f, vt9Var, 0, 0, 131070);
            ijl.b(uyg.q((shk) ahk.I0.getValue(), vt9Var), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).k, vt9Var, 0, 0, 131070);
            db5 db5VarA2 = cb5.a(b72.c, rd3Var, vt9Var, 0);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, z7e.b);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(function03);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA2, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            i39 i39Var = mpj.a;
            int i4 = i3 & 14;
            yi4.i(function0, i39Var, false, (paj) null, (z14) null, (go3) null, (zvf) null, c26.i, vt9Var, i4 | 805306416, 508);
            boolean zH = ((i3 & 112) == 32) | vt9Var.h(c61VarF) | ((i3 & 896) == 256);
            if (i4 == 4) {
                z2 = true;
            }
            boolean z3 = zH | z2;
            Object objK = vt9Var.K();
            if (z3 || objK == hh5.a) {
                vl4 vl4Var = new vl4(function02, c61VarF, str, function0, (byte) 0);
                vt9Var.g0(vl4Var);
                objK = vl4Var;
            }
            yi4.a((Function0) objK, i39Var, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, c26.j, vt9Var, 805306416, 508);
            vt9Var = vt9Var;
            vt9Var.p(true);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new wl4(function0, function02, str, c8eVar, i2, (byte) 0);
        }
    }

    public static boolean g0(int i2, int i3, byte[] bArr) {
        if (i2 + i3 <= bArr.length) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (f0(bArr[i2 + i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public static e0g h() {
        return new e0g(true, 8);
    }

    public static boolean h0(int i2, byte[] bArr) {
        byte b2;
        if (i2 + 5 != bArr.length || ((b2 = bArr[i2]) != 43 && b2 != 45)) {
            return false;
        }
        int i3 = i2 + 1;
        return g0(i3, 4, bArr) && C0(i3, bArr) <= 14 && C0(i2 + 3, bArr) <= 59;
    }

    public static final void i(String str, l01 l01Var, String str2, String str3, String str4, Function0 function0, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        ue5 ue5VarP;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(351381945);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.d(l01Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.f(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.f(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= vt9Var.f(str4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= vt9Var.h(function0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= vt9Var.f(c8eVar) ? 1048576 : 524288;
        }
        if (vt9Var.N(i3 & 1, (599187 & i3) != 599186)) {
            c8e c8eVarX = a26.X(wxe.Q(c8eVar), 24.0f);
            db5 db5VarA = cb5.a(b72.c, rbe.o, vt9Var, 48);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarX);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            fza fzaVar = m3c.S;
            if (z) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, db5VarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            String strQ = uyg.q((shk) ahk.x.getValue(), vt9Var);
            hp7 hp7Var = abm.a;
            int i4 = i3;
            ijl.b(strQ, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).f, vt9Var, 0, 0, 131070);
            z7e z7eVar = z7e.b;
            ocp.c(vt9Var, mpj.c(z7eVar, 16.0f));
            o9i o9iVarA = m9i.a(new x62(4.0f, true, new t40((byte) 19)), rbe.k, vt9Var, 6);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, z7eVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            byte b2 = 6;
            ijl.b(str, null, ((sa5) vt9Var.j(ua5.a)).a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).c, vt9Var, i4 & 14, 0, 131066);
            int i5 = i4 >> 3;
            ijl.b(k1g.E(l01Var, vt9Var), null, ((kk8) vt9Var.j(lk8.a)).j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).c, vt9Var, 0, 0, 131066);
            vt9Var.p(true);
            ocp.c(vt9Var, mpj.c(z7eVar, 16.0f));
            String strQ2 = uyg.q((shk) ahk.C.getValue(), vt9Var);
            if (str3 == null || str4 == null) {
                vt9Var.W(154293211);
                vt9Var.p(false);
                ue5VarP = null;
            } else {
                vt9Var.W(154020907);
                ue5VarP = gyg.P(-1872948827, new b57(str3, str4, b2), vt9Var);
                vt9Var.p(false);
            }
            ue5 ue5Var = ue5VarP;
            i39 i39Var = mpj.a;
            zi4.g(strQ2, str2, i39Var, ue5Var, vt9Var, (i5 & 112) | 384);
            ocp.c(vt9Var, mpj.c(z7eVar, 16.0f));
            yi4.a(function0, i39Var, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, c26.l, vt9Var, ((i4 >> 15) & 14) | 805306416, 508);
            vt9Var = vt9Var;
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new xl4(str, l01Var, str2, str3, str4, function0, c8eVar, i2);
        }
    }

    public static apa i0(String str) {
        apa apaVar = apa.b;
        if (Intrinsics.a(str, "GET")) {
            return apaVar;
        }
        apa apaVar2 = apa.c;
        if (Intrinsics.a(str, "POST")) {
            return apaVar2;
        }
        apa apaVar3 = apa.d;
        if (Intrinsics.a(str, "PUT")) {
            return apaVar3;
        }
        apa apaVar4 = apa.e;
        if (Intrinsics.a(str, "PATCH")) {
            return apaVar4;
        }
        apa apaVar5 = apa.i;
        if (Intrinsics.a(str, "TRACE")) {
            return apaVar5;
        }
        apa apaVar6 = apa.f;
        if (Intrinsics.a(str, "DELETE")) {
            return apaVar6;
        }
        apa apaVar7 = apa.g;
        if (Intrinsics.a(str, "HEAD")) {
            return apaVar7;
        }
        apa apaVar8 = apa.j;
        if (Intrinsics.a(str, "QUERY")) {
            return apaVar8;
        }
        return Intrinsics.a(str, "OPTIONS") ? apa.h : new apa(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(java.lang.String r23, java.lang.String r24, defpackage.c8e r25, defpackage.ih5 r26, int r27) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4o.j(java.lang.String, java.lang.String, c8e, ih5, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static defpackage.i7b j0(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] k(nxo r11, int r12, int r13) {
        /*
            int r0 = r11.m
            int r11 = r11.n
            r1 = 0
            int[] r2 = defpackage.z4o.q
            r1 = r2[r1]
            if (r0 == r1) goto L5f
            r1 = 1
            r1 = r2[r1]
            if (r11 == r1) goto L5f
            if (r12 != r0) goto L19
            if (r13 != r11) goto L19
            int[] r11 = new int[]{r0, r11}
            return r11
        L19:
            float r1 = (float) r0
            float r2 = (float) r11
            float r1 = r1 / r2
            float r2 = (float) r12
            float r3 = (float) r13
            float r2 = r2 / r3
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r3 < 0) goto L2a
            double r6 = (double) r2
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 >= 0) goto L4a
        L2a:
            double r6 = (double) r1
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 >= 0) goto L33
            int r8 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r8 <= 0) goto L4a
        L33:
            int r8 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r8 <= 0) goto L3b
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L54
        L3b:
            double r8 = (double) r2
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 >= 0) goto L44
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L54
        L44:
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 < 0) goto L4e
            if (r10 >= 0) goto L4e
        L4a:
            int r11 = r11 * r12
            int r13 = r11 / r0
            goto L5a
        L4e:
            if (r3 >= 0) goto L58
            int r12 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r12 < 0) goto L58
        L54:
            int r0 = r0 * r13
            int r12 = r0 / r11
            goto L5a
        L58:
            r13 = r11
            r12 = r0
        L5a:
            int[] r11 = new int[]{r12, r13}
            return r11
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4o.k(nxo, int, int):int[]");
    }

    public static jo1 k0(g1g g1gVar) {
        int iM = g1gVar.m();
        if (g1gVar.m() != 1684108385) {
            w7d.K("Failed to parse cover art attribute");
            return null;
        }
        int iM2 = g1gVar.m();
        byte[] bArr = yr3.a;
        int i2 = iM2 & 16777215;
        String str = i2 == 13 ? "image/jpeg" : i2 == 14 ? "image/png" : null;
        if (str == null) {
            vep.y(i2, "Unrecognized cover art flags: ");
            return null;
        }
        g1gVar.O(4);
        int i3 = iM - 16;
        byte[] bArr2 = new byte[i3];
        g1gVar.k(bArr2, 0, i3);
        return new jo1(str, null, 3, bArr2);
    }

    public static final void l(l7n l7nVar, pki pkiVar, tcc tccVar) {
        hki hkiVar = (hki) l7nVar.d("androidx.lifecycle.savedstate.vm.tag");
        if (hkiVar == null || hkiVar.c) {
            return;
        }
        hkiVar.h(pkiVar, tccVar);
        B0(pkiVar, tccVar);
    }

    public static ui3 l0(izd izdVar) throws vi3, IOException {
        Object next;
        xi3 xi3Var;
        izdVar.readInt();
        String strH = izdVar.h();
        p4j p4jVar = new p4j();
        ui3 ui3Var = zi3.k;
        p4jVar.addAll(u0(izdVar, sj3.a));
        p4jVar.addAll(u0(izdVar, sj3.b));
        p4jVar.addAll(u0(izdVar, sj3.c));
        p4jVar.addAll(u0(izdVar, sj3.d));
        p4j p4jVarA = z4j.a(p4jVar);
        short s = izdVar.readShort();
        long jK = izdVar.k();
        u9d u9dVar = new u9d();
        int i2 = (int) jK;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                u9d u9dVarG = u9dVar.g();
                pn7Var = strH != null ? Uri.parse(strH) : null;
                on7 on7Var = pn7.b;
                return new ui3(pn7Var, p4jVarA, cs5.x0(s, un7.h), u9dVarG);
            }
            ui3 ui3Var2 = zi3.k;
            byte[] bArr = new byte[(int) izdVar.k()];
            izdVar.read(bArr);
            izd izdVar2 = new izd(new ByteArrayInputStream(bArr));
            String strH2 = izdVar2.h();
            if (strH2 == null) {
                throw new vi3("Unable to read metadata entry key");
            }
            int iK = (int) izdVar2.k();
            if (iK == 0) {
                xi3Var = null;
            } else {
                byte[] bArr2 = new byte[iK];
                izdVar2.read(bArr2);
                izd izdVar3 = new izd(new ByteArrayInputStream(bArr2));
                int i4 = izdVar3.readInt();
                byte b2 = izdVar3.readByte();
                Iterator it = ti3.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((ti3) next).a == b2) {
                        break;
                    }
                }
                ti3 ti3Var = (ti3) next;
                if (ti3Var == null) {
                    throw new vi3(sko.i(b2, "Unknown section "));
                }
                xi3Var = new xi3(i4, ti3Var, izdVar3.h(), izdVar3.h(), izdVar3.h());
            }
            int i5 = izdVar2.readInt();
            short s2 = izdVar2.readShort();
            Integer numValueOf = Integer.valueOf(s2);
            if (s2 == 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                on7 on7Var2 = pn7.b;
                pn7Var = new pn7(cs5.x0(numValueOf.intValue(), un7.h));
            }
            u9dVar.put(strH2, new wi3(xi3Var, new yi3(pn7Var, i5)));
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005d -> B:21:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.uuk r8, defpackage.gmg r9, z53 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.aj9
            if (r0 == 0) goto L13
            r0 = r10
            aj9 r0 = (defpackage.aj9) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            aj9 r0 = new aj9
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            gmg r8 = r0.u
            uuk r9 = r0.t
            defpackage.ybh.y(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L60
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            r8 = 0
            return r8
        L36:
            defpackage.ybh.y(r10)
            vuk r10 = r8.f
            fmg r10 = r10.s
            java.util.List r10 = r10.a
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = r3
        L47:
            if (r5 >= r2) goto L7e
            java.lang.Object r6 = r10.get(r5)
            lmg r6 = (defpackage.lmg) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L7b
        L53:
            r0.t = r8
            r0.u = r9
            r0.w = r4
            java.lang.Object r10 = r8.a(r9, r0)
            if (r10 != r1) goto L60
            return r1
        L60:
            fmg r10 = (defpackage.fmg) r10
            java.util.List r10 = r10.a
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = r3
        L6c:
            if (r5 >= r2) goto L7e
            java.lang.Object r6 = r10.get(r5)
            lmg r6 = (defpackage.lmg) r6
            boolean r6 = r6.d
            if (r6 != 0) goto L53
            int r5 = r5 + 1
            goto L6c
        L7b:
            int r5 = r5 + 1
            goto L47
        L7e:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4o.m(uuk, gmg, z53):java.lang.Object");
    }

    public static xil m0(int i2, g1g g1gVar, String str) {
        int iM = g1gVar.m();
        if (g1gVar.m() == 1684108385 && iM >= 22) {
            g1gVar.O(10);
            int iH = g1gVar.H();
            if (iH > 0) {
                String strValueOf = String.valueOf(iH);
                int iH2 = g1gVar.H();
                if (iH2 > 0) {
                    strValueOf = strValueOf + "/" + iH2;
                }
                return new xil(str, null, h1b.v(strValueOf));
            }
        }
        w7d.K("Failed to parse index/count attribute: ".concat(e04.c(i2)));
        return null;
    }

    public static final Object n(pmg pmgVar, Function2 function2, mt5 mt5Var) {
        Object objT0 = ((vuk) pmgVar).T0(new bj9(mt5Var.getContext(), function2, null, (byte) 0), mt5Var);
        return objT0 == px5.a ? objT0 : Unit.a;
    }

    public static int n0(g1g g1gVar) {
        int iM = g1gVar.m();
        if (g1gVar.m() == 1684108385) {
            g1gVar.O(8);
            int i2 = iM - 16;
            if (i2 == 1) {
                return g1gVar.A();
            }
            if (i2 == 2) {
                return g1gVar.H();
            }
            if (i2 == 3) {
                return g1gVar.D();
            }
            if (i2 == 4 && (g1gVar.j() & NotificationCompat.FLAG_HIGH_PRIORITY) == 0) {
                return g1gVar.E();
            }
        }
        w7d.K("Failed to parse data atom to int");
        return -1;
    }

    public static String o(int i2, int i3, String str) {
        if (i2 < 0) {
            return n1h.j("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return n1h.j("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        qp2.o(sko.i(i3, "negative size: "));
        return null;
    }

    public static oua o0(int i2, String str, g1g g1gVar, boolean z, boolean z2) {
        int iN0 = n0(g1gVar);
        if (z2) {
            iN0 = Math.min(1, iN0);
        }
        if (iN0 >= 0) {
            return z ? new xil(str, null, h1b.v(Integer.toString(iN0))) : new xb5("und", str, Integer.toString(iN0));
        }
        w7d.K("Failed to parse uint8 attribute: ".concat(e04.c(i2)));
        return null;
    }

    public static xil p0(int i2, g1g g1gVar, String str) {
        int iM = g1gVar.m();
        if (g1gVar.m() == 1684108385) {
            g1gVar.O(8);
            return new xil(str, null, h1b.v(g1gVar.w(iM - 16)));
        }
        w7d.K("Failed to parse text attribute: ".concat(e04.c(i2)));
        return null;
    }

    public static boolean q(Context context, Uri uri) throws Throwable {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strT0 = t0(context, uri, "mime_type");
        int iS0 = (int) s0(context, uri, "flags", 0L);
        if (TextUtils.isEmpty(strT0)) {
            return false;
        }
        if ((iS0 & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(strT0) || (iS0 & 8) == 0) {
            return (TextUtils.isEmpty(strT0) || (iS0 & 2) == 0) ? false : true;
        }
        return true;
    }

    public static final void q0(View view) {
        if ((view instanceof ViewGroup) && ((view instanceof tpi) || (view instanceof ScrollView))) {
            ((ViewGroup) view).setClipToPadding(false);
        }
        kje kjeVar = new kje(view, (byte) 0);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(view, kjeVar);
    }

    public static String r(r25[] r25VarArr) {
        ArrayList arrayList = new ArrayList();
        for (r25 r25Var : r25VarArr) {
            arrayList.add(r25Var.a);
        }
        return TextUtils.join(",", arrayList);
    }

    public static final void r0(StatusBarDrawingFrameLayout statusBarDrawingFrameLayout, dxh dxhVar) {
        q9n.f(statusBarDrawingFrameLayout, new vs5(dxhVar, new dxh(2130969497), statusBarDrawingFrameLayout, (byte) 3));
    }

    public static void s(int i2, int i3, String str, boolean z) {
        if (z) {
            return;
        }
        qp2.o(n1h.j(str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static long s0(Context context, Uri uri, String str, long j2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    return cursorQuery.getLong(0);
                }
            } catch (Exception e2) {
                e2.toString();
            }
            return j2;
        } finally {
            J(cursorQuery);
        }
    }

    public static void t(int i2, String str, boolean z) {
        if (z) {
            return;
        }
        qp2.o(n1h.j(str, Integer.valueOf(i2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.database.Cursor] */
    public static String t0(Context context, Uri uri, String str) throws Throwable {
        Cursor cursor;
        Throwable th;
        Exception exc;
        Cursor cursorQuery;
        ContentResolver contentResolver = context.getContentResolver();
        String string = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                        string = cursorQuery.getString(0);
                    }
                } catch (Exception e2) {
                    exc = e2;
                    exc.toString();
                    uri = cursorQuery;
                    J(uri);
                    return string;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = uri;
                J(cursor);
                throw th;
            }
        } catch (Exception e3) {
            exc = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
            J(cursor);
            throw th;
        }
        uri = cursorQuery;
        J(uri);
        return string;
    }

    public static void u(long j2, boolean z, String str) {
        if (z) {
            return;
        }
        qp2.o(n1h.j(str, Long.valueOf(j2)));
    }

    public static List u0(izd izdVar, sj3 sj3Var) throws vi3, IOException {
        rw7 sw7Var;
        String str;
        int unsignedShort = izdVar.readUnsignedShort();
        if (unsignedShort == 0) {
            return l08.a;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < unsignedShort; i2++) {
            ui3 ui3Var = zi3.k;
            String strH = izdVar.h();
            if (strH == null || strH.length() == 0) {
                throw new vi3("Empty name");
            }
            String strH2 = izdVar.h();
            if (strH2 == null || strH2.length() == 0) {
                throw new vi3("Empty checksum");
            }
            int length = strH2.length();
            x7a x7aVar = x7a.a;
            if (length != 64) {
                sw7Var = new rw7(x7aVar);
            } else {
                for (int i3 = 0; i3 < strH2.length(); i3++) {
                    char cCharAt = strH2.charAt(i3);
                    if (('a' > cCharAt || cCharAt >= 'g') && (('A' > cCharAt || cCharAt >= 'G') && ('0' > cCharAt || cCharAt >= ':'))) {
                        sw7Var = new rw7(new w7a(cCharAt));
                        break;
                    }
                }
                sw7Var = new sw7(new c8a(strH2.toLowerCase(Locale.ROOT)));
            }
            if (sw7Var instanceof rw7) {
                y7a y7aVar = (y7a) sw7Var.a;
                if (y7aVar instanceof w7a) {
                    str = "Invalid character: " + ((w7a) y7aVar).a;
                } else {
                    if (!Intrinsics.a(y7aVar, x7aVar)) {
                        h9o.p();
                        return null;
                    }
                    str = "Invalid length";
                }
                throw new vi3(str);
            }
            if (!(sw7Var instanceof sw7)) {
                h9o.p();
                return null;
            }
            arrayList.add(new xj3(new wj3(sj3Var, ((c8a) ((sw7) sw7Var).a).a), strH));
        }
        return arrayList;
    }

    public static void v(String str, boolean z) {
        if (z) {
            return;
        }
        qp2.o(str);
    }

    public static final long v0(long j2, long j3, un7 un7Var) {
        long jP = pn7.p(j3, un7Var);
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (!pn7.i(j3) || (jP ^ j2) >= 0) {
                return j2;
            }
            qp2.o("Summing infinities of different signs");
            return 0L;
        }
        if (((jP - 1) | 1) != Long.MAX_VALUE) {
            long j4 = j2 + jP;
            return ((j2 ^ j4) & (jP ^ j4)) < 0 ? j2 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j4;
        }
        long jD = pn7.d(j3);
        long jP2 = pn7.p(jD, un7Var);
        return ((jP2 - 1) | 1) == Long.MAX_VALUE ? jP2 : v0(v0(j2, jD, un7Var), pn7.l(j3, jD), un7Var);
    }

    public static void w(boolean z) {
        if (z) {
            return;
        }
        hai.d();
    }

    public static final long w0(long j2, long j3, un7 un7Var) {
        long j4 = j2 - j3;
        if (((j4 ^ j2) & (~(j4 ^ j3))) >= 0) {
            return cs5.y0(j4, un7Var);
        }
        un7 un7Var2 = un7.d;
        if (un7Var.compareTo(un7Var2) >= 0) {
            return pn7.r(e0(j4));
        }
        long jConvert = un7Var.a.convert(1L, TimeUnit.MILLISECONDS);
        long j5 = (j2 / jConvert) - (j3 / jConvert);
        long j6 = (j2 % jConvert) - (j3 % jConvert);
        on7 on7Var = pn7.b;
        return pn7.m(cs5.y0(j5, un7Var2), cs5.y0(j6, un7Var));
    }

    public static void x(boolean z, String str, long j2, long j3) {
        if (z) {
            return;
        }
        qp2.o(n1h.j(str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static final long x0(long j2, long j3, un7 un7Var) {
        if (((j3 - 1) | 1) != Long.MAX_VALUE) {
            return ((j2 - 1) | 1) == Long.MAX_VALUE ? e0(j2) : w0(j2, j3, un7Var);
        }
        if (j2 != j3) {
            return pn7.r(e0(j3));
        }
        pn7.b.getClass();
        return 0L;
    }

    public static void y(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        qp2.o(n1h.j(str, obj));
    }

    public static void y0(int i2, lxd lxdVar, nj9 nj9Var, lxd lxdVar2, lxd... lxdVarArr) {
        if (lxdVar2 == null) {
            lxdVar2 = new lxd(new jxd[0]);
        }
        if (lxdVar != null) {
            z0b z0bVarP = h1b.p();
            for (jxd jxdVar : lxdVar.a) {
                if (ofd.class.isAssignableFrom(jxdVar.getClass())) {
                    z0bVarP.c((jxd) ofd.class.cast(jxdVar));
                }
            }
            a1b a1bVarU = z0bVarP.g().u(0);
            while (a1bVarU.hasNext()) {
                ofd ofdVar = (ofd) a1bVarU.next();
                if (!ofdVar.a.equals("com.android.capture.fps") || i2 == 2) {
                    lxdVar2 = lxdVar2.a(ofdVar);
                }
            }
        }
        for (lxd lxdVar3 : lxdVarArr) {
            lxdVar2 = lxdVar2.b(lxdVar3);
        }
        if (lxdVar2.a.length > 0) {
            nj9Var.k = lxdVar2;
        }
    }

    public static void z(boolean z, String str, Object obj, Comparable comparable) {
        if (z) {
            return;
        }
        qp2.o(n1h.j(str, obj, comparable));
    }

    public static void z0(ContextWrapper contextWrapper, HashSet hashSet) {
        nv6 nv6VarB = ru9.c(contextWrapper).b();
        ((SharedPreferences.Editor) nv6VarB.a).putStringSet("clearonexit.categories.ongoing", hashSet);
        nv6VarB.w();
    }

    public abstract String L();

    public final void X(osk oskVar, Object obj) {
        if (obj == null) {
            return;
        }
        wsk wskVarH = oskVar.h(L());
        try {
            p(wskVarH, obj);
            wskVarH.n();
            fr3.t(wskVarH, null);
            wskVarH = oskVar.h("SELECT changes()");
            try {
                wskVarH.n();
                wskVarH.getLong(0);
                fr3.t(wskVarH, null);
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public abstract void Y(String str, boolean z);

    public boolean Z(pzh pzhVar, byte[] bArr) {
        return false;
    }

    public final void a0(osk oskVar, Iterable iterable) {
        if (iterable == null) {
            return;
        }
        wsk wskVarH = oskVar.h(L());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    p(wskVarH, obj);
                    wskVarH.n();
                    wskVarH.m();
                    wskVarH = oskVar.h("SELECT changes()");
                    try {
                        wskVarH.n();
                        wskVarH.getLong(0);
                        fr3.t(wskVarH, null);
                    } finally {
                    }
                }
            }
            fr3.t(wskVarH, null);
        } finally {
        }
    }

    public boolean b0(pzh pzhVar, byte[] bArr) {
        return false;
    }

    public abstract void c0(pzh pzhVar, orb orbVar);

    public abstract void p(wsk wskVar, Object obj);
}
