package defpackage;

import android.app.ActivityManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.opera.android.import_data.ImportChromePasswordsActivity;
import com.opera.android.suggestion.Suggestion;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class nv6 implements m7h, o87, wn8, oeb, rk8, xr8, d94, kjm, rr9, m4g, qo3, qld, hsd, vnk {
    public Object a;

    public nv6(byte b) {
        switch (b) {
            case 21:
                this.a = new dfe(new a5c[16]);
                break;
            case 25:
                this.a = new Bundle();
                break;
            case 29:
                this.a = new g1g();
                break;
            default:
                this.a = h1b.p();
                break;
        }
    }

    public nv6(Context context, byte b) {
        switch (b) {
            case 23:
                StringBuilder sb = zym.a;
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                this.a = new ua1((byte) 2, (int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) << 20) / 7));
                break;
            default:
                this.a = oup.Z(context);
                break;
        }
    }

    public nv6(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        sQLiteDatabase.beginTransaction();
        try {
            if (!dyg.j(sQLiteDatabase, "meta")) {
                sQLiteDatabase.execSQL("CREATE TABLE meta ('key' LONGVARCHAR NOT NULL UNIQUE PRIMARY KEY, 'value' LONGVARCHAR)");
                L(-1L, "mmap_status");
                L(43L, "version");
                L(40L, "last_compatible_version");
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public /* synthetic */ nv6(Object obj) {
        this.a = obj;
    }

    public nv6(mt3 mt3Var, a64 a64Var) {
        this.a = a26.o0(qbe.t(ic4.l(f03.g(new fg6((byte) 28, (mt5) null, mt3Var)), -1)), a64Var, aej.b, Boolean.FALSE);
    }

    public static void K(nv6 nv6Var, m7h m7hVar) {
        if (((m7h) nv6Var.a) == null) {
            nv6Var.a = m7hVar;
        } else {
            h9o.e();
        }
    }

    public final void A(int i, long j) throws s1g {
        efd efdVar = (efd) this.a;
        if (i == 240) {
            if (efdVar.z) {
                return;
            }
            efdVar.e(i);
            if (efdVar.H == -1) {
                efdVar.H = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (efdVar.z) {
                return;
            }
            efdVar.e(i);
            if (efdVar.G == -1) {
                efdVar.G = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j != 0) {
                throw s1g.d("ContentEncodingOrder " + j + " not supported", null);
            }
            return;
        }
        if (i == 20530) {
            if (j != 1) {
                throw s1g.d("ContentEncodingScope " + j + " not supported", null);
            }
            return;
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    efdVar.f(i);
                    efdVar.y.e = 2;
                    return;
                }
                if (i2 == 2) {
                    efdVar.f(i);
                    efdVar.y.e = 1;
                    return;
                } else if (i2 == 17) {
                    efdVar.f(i);
                    efdVar.y.e = 3;
                    return;
                } else if (i2 != 33) {
                    efdVar.f(i);
                    efdVar.y.e = -1;
                    return;
                } else {
                    efdVar.f(i);
                    efdVar.y.e = 5;
                    return;
                }
            case 136:
                efdVar.f(i);
                efdVar.y.Y = j == 1;
                return;
            case 155:
                efdVar.Q = efdVar.l(j);
                return;
            case 159:
                efdVar.f(i);
                efdVar.y.Q = (int) j;
                return;
            case 176:
                efdVar.f(i);
                efdVar.y.n = (int) j;
                return;
            case 179:
                if (efdVar.z) {
                    return;
                }
                efdVar.e(i);
                efdVar.E = efdVar.l(j);
                return;
            case 186:
                efdVar.f(i);
                efdVar.y.o = (int) j;
                return;
            case 215:
                efdVar.f(i);
                efdVar.y.d = (int) j;
                return;
            case 231:
                efdVar.M = efdVar.l(j);
                return;
            case 238:
                efdVar.X = (int) j;
                return;
            case 247:
                if (efdVar.z) {
                    return;
                }
                efdVar.e(i);
                efdVar.F = (int) j;
                return;
            case 251:
                efdVar.Y = true;
                return;
            case 16871:
                efdVar.f(i);
                efdVar.y.h = (int) j;
                return;
            case 16980:
                if (j != 3) {
                    throw s1g.d("ContentCompAlgo " + j + " not supported", null);
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    throw s1g.d("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j != 1) {
                    throw s1g.d("EBMLReadVersion " + j + " not supported", null);
                }
                return;
            case 18401:
                if (j != 5) {
                    throw s1g.d("ContentEncAlgo " + j + " not supported", null);
                }
                return;
            case 18408:
                if (j != 1) {
                    throw s1g.d("AESSettingsCipherMode " + j + " not supported", null);
                }
                return;
            case 21420:
                efdVar.B = j + efdVar.s;
                return;
            case 21432:
                int i3 = (int) j;
                efdVar.f(i);
                if (i3 == 0) {
                    efdVar.y.y = 0;
                    return;
                }
                if (i3 == 1) {
                    efdVar.y.y = 2;
                    return;
                } else if (i3 == 3) {
                    efdVar.y.y = 1;
                    return;
                } else {
                    if (i3 == 15) {
                        efdVar.y.y = 3;
                        return;
                    }
                    return;
                }
            case 21680:
                efdVar.f(i);
                efdVar.y.q = (int) j;
                return;
            case 21682:
                efdVar.f(i);
                efdVar.y.s = (int) j;
                return;
            case 21690:
                efdVar.f(i);
                efdVar.y.r = (int) j;
                return;
            case 21930:
                efdVar.f(i);
                efdVar.y.X = j == 1;
                return;
            case 21938:
                efdVar.f(i);
                dfd dfdVar = efdVar.y;
                dfdVar.z = true;
                dfdVar.p = (int) j;
                return;
            case 21998:
                efdVar.f(i);
                efdVar.y.g = (int) j;
                return;
            case 22186:
                efdVar.f(i);
                efdVar.y.T = j;
                return;
            case 22203:
                efdVar.f(i);
                efdVar.y.U = j;
                return;
            case 25188:
                efdVar.f(i);
                efdVar.y.R = (int) j;
                return;
            case 30114:
                efdVar.Z = j;
                return;
            case 30321:
                efdVar.f(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    efdVar.y.t = 0;
                    return;
                }
                if (i4 == 1) {
                    efdVar.y.t = 1;
                    return;
                } else if (i4 == 2) {
                    efdVar.y.t = 2;
                    return;
                } else {
                    if (i4 == 3) {
                        efdVar.y.t = 3;
                        return;
                    }
                    return;
                }
            case 2352003:
                efdVar.f(i);
                efdVar.y.f = (int) j;
                return;
            case 2807729:
                efdVar.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        efdVar.f(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            efdVar.y.C = 2;
                            return;
                        } else {
                            if (i5 == 2) {
                                efdVar.y.C = 1;
                                return;
                            }
                            return;
                        }
                    case 21946:
                        efdVar.f(i);
                        int iG = ja5.g((int) j);
                        if (iG != -1) {
                            efdVar.y.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        efdVar.f(i);
                        efdVar.y.z = true;
                        int iF = ja5.f((int) j);
                        if (iF != -1) {
                            efdVar.y.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        efdVar.f(i);
                        efdVar.y.D = (int) j;
                        return;
                    case 21949:
                        efdVar.f(i);
                        efdVar.y.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r6 == r8) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(yxc r7, nt5 r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.a
            ft6 r0 = (ft6) r0
            boolean r1 = r8 instanceof defpackage.mv6
            if (r1 == 0) goto L17
            r1 = r8
            mv6 r1 = (defpackage.mv6) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.w = r2
            goto L1c
        L17:
            mv6 r1 = new mv6
            r1.<init>(r6, r8)
        L1c:
            java.lang.Object r6 = r1.u
            px5 r8 = px5.a
            int r2 = r1.w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            defpackage.ybh.y(r6)
            goto L74
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L35:
            yxc r7 = r1.t
            defpackage.ybh.y(r6)
            goto L5f
        L3b:
            defpackage.ybh.y(r6)
            r1.t = r7
            r1.w = r5
            kz6 r6 = r0.b
            int r2 = r7.ordinal()
            if (r2 == 0) goto L53
            if (r2 != r5) goto L4f
            zxc r2 = zxc.d
            goto L55
        L4f:
            h9o.p()
            return r3
        L53:
            zxc r2 = zxc.c
        L55:
            java.lang.Object r6 = r6.i(r2, r1)
            if (r6 == r8) goto L5d
            kotlin.Unit r6 = kotlin.Unit.a
        L5d:
            if (r6 == r8) goto L73
        L5f:
            yxc r6 = yxc.b
            if (r7 != r6) goto L74
            r1.t = r3
            r1.w = r4
            kz6 r6 = r0.b
            java.lang.Object r6 = r6.a(r1)
            if (r6 == r8) goto L71
            kotlin.Unit r6 = kotlin.Unit.a
        L71:
            if (r6 != r8) goto L74
        L73:
            return r8
        L74:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv6.B(yxc, nt5):java.lang.Object");
    }

    public final void C(Suggestion suggestion) {
        odb odbVar = (odb) ((SparseArray) this.a).get(suggestion.a);
        if (odbVar != null) {
            odbVar.b(suggestion);
        }
    }

    public final void D(Suggestion suggestion) {
        odb odbVar = (odb) ((SparseArray) this.a).get(suggestion.a);
        if (odbVar != null) {
            odbVar.a(suggestion);
        }
    }

    public final void E(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            t3p.q("null key in entry: null=".concat(sfe.L0(listAsList)));
            return;
        }
        Iterator it = listAsList.iterator();
        if (it.hasNext()) {
            nc5 nc5Var = (nc5) this.a;
            if (nc5Var == null) {
                nc5Var = new nc5();
                nc5Var.j(3);
                this.a = nc5Var;
            }
            t1b t1bVar = (w0b) nc5Var.get(obj);
            if (t1bVar == null) {
                List list = listAsList;
                int iMax = list instanceof Set ? Math.max(4, ((Set) list).size()) : 4;
                int i = u1b.c;
                scd.q(iMax, "expectedSize");
                t1bVar = new t1b(iMax);
                t1bVar.d = new Object[u1b.o(iMax)];
                nc5 nc5Var2 = (nc5) this.a;
                if (nc5Var2 == null) {
                    nc5Var2 = new nc5();
                    nc5Var2.j(3);
                    this.a = nc5Var2;
                }
                nc5Var2.put(obj, t1bVar);
            }
            while (it.hasNext()) {
                Object next = it.next();
                scd.p(obj, next);
                t1bVar.a(next);
            }
        }
    }

    public final void F(String str, Bitmap bitmap) {
        Integer num = (Integer) xjd.c.get(str);
        if (num == null || num.intValue() == 2) {
            ((Bundle) this.a).putParcelable(str, bitmap);
        } else {
            qp2.o(sko.k("The ", str, " key cannot be used to put a Bitmap"));
        }
    }

    public final void G(String str, long j) {
        Integer num = (Integer) xjd.c.get(str);
        if (num == null || num.intValue() == 0) {
            ((Bundle) this.a).putLong(str, j);
        } else {
            qp2.o(sko.k("The ", str, " key cannot be used to put a long"));
        }
    }

    public final void H(String str, yjh yjhVar) {
        Parcelable parcelable;
        float f = yjhVar.b;
        Integer num = (Integer) xjd.c.get(str);
        if (num != null && num.intValue() != 3) {
            qp2.o(sko.k("The ", str, " key cannot be used to put a Rating"));
            return;
        }
        Bundle bundle = (Bundle) this.a;
        if (yjhVar.c == null) {
            boolean zB = yjhVar.b();
            int i = yjhVar.a;
            if (zB) {
                switch (i) {
                    case 1:
                        yjhVar.c = Rating.newHeartRating(i == 1 && f == 1.0f);
                        break;
                    case 2:
                        yjhVar.c = Rating.newThumbRating(i == 2 && f == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        yjhVar.c = Rating.newStarRating(i, yjhVar.a());
                        break;
                    case 6:
                        if (i != 6 || !yjhVar.b()) {
                            f = -1.0f;
                        }
                        yjhVar.c = Rating.newPercentageRating(f);
                        break;
                    default:
                        parcelable = null;
                        break;
                }
            } else {
                yjhVar.c = Rating.newUnratedRating(i);
            }
            parcelable = yjhVar.c;
        } else {
            parcelable = yjhVar.c;
        }
        bundle.putParcelable(str, parcelable);
    }

    public final void I(String str, String str2) {
        Integer num = (Integer) xjd.c.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.a).putCharSequence(str, str2);
        } else {
            qp2.o(sko.k("The ", str, " key cannot be used to put a String"));
        }
    }

    public final void J(CharSequence charSequence, String str) {
        Integer num = (Integer) xjd.c.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.a).putCharSequence(str, charSequence);
        } else {
            qp2.o(sko.k("The ", str, " key cannot be used to put a CharSequence"));
        }
    }

    public final void L(long j, String str) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("key", str);
        contentValues.put("value", Long.valueOf(j));
        ((SQLiteDatabase) this.a).insertWithOnConflict("meta", null, contentValues, 5);
    }

    public final void M(int i, long j, long j2) throws s1g {
        efd efdVar = (efd) this.a;
        efdVar.j0.getClass();
        if (i == 160) {
            efdVar.Y = false;
            efdVar.Z = 0L;
            return;
        }
        if (i == 174) {
            dfd dfdVar = new dfd();
            dfdVar.n = -1;
            dfdVar.o = -1;
            dfdVar.p = -1;
            dfdVar.q = -1;
            dfdVar.r = -1;
            dfdVar.s = 0;
            dfdVar.t = -1;
            dfdVar.u = 0.0f;
            dfdVar.v = 0.0f;
            dfdVar.w = 0.0f;
            dfdVar.x = null;
            dfdVar.y = -1;
            dfdVar.z = false;
            dfdVar.A = -1;
            dfdVar.B = -1;
            dfdVar.C = -1;
            dfdVar.D = 1000;
            dfdVar.E = 200;
            dfdVar.F = -1.0f;
            dfdVar.G = -1.0f;
            dfdVar.H = -1.0f;
            dfdVar.I = -1.0f;
            dfdVar.J = -1.0f;
            dfdVar.K = -1.0f;
            dfdVar.L = -1.0f;
            dfdVar.M = -1.0f;
            dfdVar.N = -1.0f;
            dfdVar.O = -1.0f;
            dfdVar.Q = 1;
            dfdVar.R = -1;
            dfdVar.S = 8000;
            dfdVar.T = 0L;
            dfdVar.U = 0L;
            dfdVar.W = false;
            dfdVar.Y = true;
            dfdVar.Z = "eng";
            efdVar.y = dfdVar;
            dfdVar.a = efdVar.w;
            return;
        }
        if (i == 183) {
            if (efdVar.z) {
                return;
            }
            efdVar.e(i);
            efdVar.F = -1;
            efdVar.G = -1L;
            efdVar.H = -1L;
            return;
        }
        if (i == 187) {
            if (efdVar.z) {
                return;
            }
            efdVar.e(i);
            efdVar.E = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            efdVar.A = -1;
            efdVar.B = -1L;
            return;
        }
        if (i == 20533) {
            efdVar.f(i);
            efdVar.y.i = true;
            return;
        }
        if (i == 21968) {
            efdVar.f(i);
            efdVar.y.z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = efdVar.s;
            if (j3 != -1 && j3 != j) {
                throw s1g.d("Multiple Segment elements not supported", null);
            }
            efdVar.s = j;
            efdVar.r = j2;
            return;
        }
        if (i == 475249515) {
            if (efdVar.z) {
                return;
            }
            efdVar.D = true;
        } else {
            if (i != 524531317 || efdVar.z) {
                return;
            }
            if (efdVar.d && efdVar.K != -1) {
                efdVar.J = true;
            } else {
                efdVar.j0.h(new rv2(efdVar.v));
                efdVar.z = true;
            }
        }
    }

    public final void N(int i, String str) throws s1g {
        efd efdVar = (efd) this.a;
        if (i == 134) {
            efdVar.f(i);
            efdVar.y.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                efdVar.w = str.equals("webm");
                return;
            }
            throw s1g.d("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            efdVar.f(i);
            efdVar.y.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            efdVar.f(i);
            efdVar.y.Z = str;
        }
    }

    public final void a(int i) {
        ((ImportChromePasswordsActivity) this.a).E0(i);
    }

    public final void b() {
        ((ImageView) this.a).setVisibility(8);
    }

    public final boolean c() {
        return !(((er8) this.a) instanceof rch);
    }

    public final void d() {
        ((hld) this.a).z.setVisibility(8);
    }

    public final void e(cie cieVar) {
        View view;
        jsd jsdVar = (jsd) this.a;
        HashMap map = jsdVar.a;
        mgh mghVar = cieVar.X;
        nxo nxoVar = mghVar != null ? (nxo) mghVar.c : null;
        if (nxoVar == null) {
            return;
        }
        if (map.containsKey(cieVar)) {
            view = (h7p) map.get(cieVar);
        } else {
            Context context = jsdVar.getContext();
            View h7pVar = new h7p(context);
            ((h7p) h7pVar).a = nxoVar;
            new ami(context, (byte) 16);
            map.put(cieVar, h7pVar);
            view = h7pVar;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        jsdVar.addView(view, layoutParams);
    }

    public final Object f() {
        ro9 ro9Var = (ro9) this.a;
        return new cj6((e38) ro9Var.c, (ua7) ro9Var.d);
    }

    public final void g(int i) {
        ImportChromePasswordsActivity importChromePasswordsActivity = (ImportChromePasswordsActivity) this.a;
        importChromePasswordsActivity.B0();
        importChromePasswordsActivity.setResult(-1);
        importChromePasswordsActivity.finish();
        ac8.b(new m3b(i));
        importChromePasswordsActivity.L0(v2b.c, i);
    }

    public final Object get() {
        m7h m7hVar = (m7h) this.a;
        if (m7hVar != null) {
            return m7hVar.get();
        }
        h9o.e();
        return null;
    }

    public final int getHeight() {
        return ((ExtendedFloatingActionButton) this.a).getMeasuredHeight();
    }

    public final int getPaddingEnd() {
        return ((ExtendedFloatingActionButton) this.a).c0;
    }

    public final int getPaddingStart() {
        return ((ExtendedFloatingActionButton) this.a).b0;
    }

    public final int getWidth() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.a;
        return ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.b0 + extendedFloatingActionButton.c0;
    }

    public final void h() {
        er8 er8Var = (er8) this.a;
        if (er8Var.d()) {
            er8Var.l();
        }
    }

    public final int i() {
        return ((fr8) ((er8) this.a)).f;
    }

    public final void invalidate() {
        ((er8) this.a).invalidate();
    }

    @Override // defpackage.vnk
    public final void j(byte[] bArr, int i, int i2, unk unkVar, op5 op5Var) {
        x36 x36VarA;
        g1g g1gVar = (g1g) this.a;
        g1gVar.L(bArr, i2 + i);
        g1gVar.N(i);
        ArrayList arrayList = new ArrayList();
        while (g1gVar.a() > 0) {
            z4o.v("Incomplete Mp4Webvtt Top Level box header found.", g1gVar.a() >= 8);
            int iM = g1gVar.m() - 8;
            if (g1gVar.m() == 1987343459) {
                CharSequence charSequenceF = null;
                w36 w36VarA = null;
                while (iM > 0) {
                    z4o.v("Incomplete vtt cue box header found.", iM >= 8);
                    int iM2 = g1gVar.m();
                    int iM3 = g1gVar.m();
                    int i3 = iM2 - 8;
                    byte[] bArr2 = g1gVar.a;
                    int i4 = g1gVar.b;
                    String str = tym.a;
                    String str2 = new String(bArr2, i4, i3, StandardCharsets.UTF_8);
                    g1gVar.O(i3);
                    iM = (iM - 8) - i3;
                    if (iM3 == 1937011815) {
                        kzn kznVar = new kzn();
                        lzn.e(str2, kznVar);
                        w36VarA = kznVar.a();
                    } else if (iM3 == 1885436268) {
                        charSequenceF = lzn.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (w36VarA != null) {
                    w36VarA.a = charSequenceF;
                    w36VarA.b = null;
                    x36VarA = w36VarA.a();
                } else {
                    Pattern pattern = lzn.a;
                    kzn kznVar2 = new kzn();
                    kznVar2.c = charSequenceF;
                    x36VarA = kznVar2.a().a();
                }
                arrayList.add(x36VarA);
            } else {
                g1gVar.O(iM);
            }
        }
        op5Var.accept(new a46(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public final vmj k(String str) {
        return ((er8) this.a).u(str);
    }

    public final void l() {
        ((er8) this.a).y();
    }

    public final lak m() {
        return (rlh) this.a;
    }

    public final ViewGroup.LayoutParams n() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public final void o(jjm jjmVar, hjm hjmVar) {
        qm9 qm9Var = (qm9) this.a;
        qm9Var.c = null;
        gtj gtjVar = qm9Var.d;
        if (gtjVar != null) {
            gtjVar.a();
            qm9Var.d = null;
        }
        mim mimVar = qm9Var.e;
        if (mimVar == null || qm9Var.f) {
            return;
        }
        qm9Var.e = null;
        mimVar.run();
    }

    public final void onFailure(Throwable th) throws Exception {
        ((vva) this.a).close();
    }

    public final void onSuccess() {
    }

    public final void onSuccess(Object obj) {
    }

    public final String p() {
        return ((er8) this.a).w();
    }

    public final neb q() {
        WebContents webContents = (WebContents) this.a;
        s58 s58Var = new s58();
        s58Var.a = webContents;
        return s58Var;
    }

    public final j87 r(List list, List list2) {
        return uup.k(new n87((ArrayList) list, list2, this), true);
    }

    public final int s() {
        return ((er8) this.a).k();
    }

    public final void show(int i) {
        hld hldVar = (hld) this.a;
        hldVar.y.setProgress(i);
        hldVar.z.setVisibility(0);
    }

    public final void t(ArrayList arrayList, o8f o8fVar, vdf vdfVar) {
        ImportChromePasswordsActivity importChromePasswordsActivity = (ImportChromePasswordsActivity) this.a;
        importChromePasswordsActivity.B0();
        arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(Integer.valueOf(((n4g) obj).a));
        }
        qim qimVar = ((dx3) importChromePasswordsActivity).o;
        Objects.requireNonNull(qimVar);
        z77 z77Var = qimVar.c;
        orm ormVar = ((l2b) importChromePasswordsActivity).U;
        if (ormVar == null) {
            ormVar = null;
        }
        j4g j4gVar = new j4g(arrayList2, o8fVar, vdfVar, ormVar);
        z77Var.getClass();
        z77Var.b(j4gVar, ijm.b);
        x5f x5fVar = ((l2b) importChromePasswordsActivity).U;
        (x5fVar != null ? x5fVar : null).l0(gm0.f);
    }

    public final int v() {
        return ((fr8) ((er8) this.a)).c;
    }

    public final void w() {
        ((SharedPreferences.Editor) this.a).apply();
    }

    public final void x(int i, int i2, lp6 lp6Var) throws s1g, InterruptedIOException {
        int i3;
        byte b;
        int i4;
        int i5;
        byte b2;
        int i6;
        long j;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        efd efdVar = (efd) this.a;
        z zVar = efdVar.b;
        SparseArray sparseArray = efdVar.c;
        g1g g1gVar = efdVar.k;
        g1g g1gVar2 = efdVar.i;
        byte b3 = 2;
        int i11 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (efdVar.O == 2) {
                    dfd dfdVar = (dfd) sparseArray.get(efdVar.U);
                    int i12 = efdVar.X;
                    g1g g1gVar3 = efdVar.p;
                    if (i12 != 4 || !"V_VP9".equals(dfdVar.c)) {
                        lp6Var.h(i2, false);
                        return;
                    } else {
                        g1gVar3.K(i2);
                        lp6Var.readFully(g1gVar3.a, 0, i2, false);
                        return;
                    }
                }
                return;
            }
            if (i == 16877) {
                efdVar.f(i);
                dfd dfdVar2 = efdVar.y;
                int i13 = dfdVar2.h;
                if (i13 != 1685485123 && i13 != 1685480259) {
                    lp6Var.h(i2, false);
                    return;
                }
                byte[] bArr = new byte[i2];
                dfdVar2.P = bArr;
                lp6Var.readFully(bArr, 0, i2, false);
                return;
            }
            if (i == 16981) {
                efdVar.f(i);
                byte[] bArr2 = new byte[i2];
                efdVar.y.j = bArr2;
                lp6Var.readFully(bArr2, 0, i2, false);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                lp6Var.readFully(bArr3, 0, i2, false);
                efdVar.f(i);
                efdVar.y.k = new gyl(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(g1gVar.a, (byte) 0);
                lp6Var.readFully(g1gVar.a, 4 - i2, i2, false);
                g1gVar.N(0);
                efdVar.A = (int) g1gVar.C();
                return;
            }
            if (i == 25506) {
                efdVar.f(i);
                byte[] bArr4 = new byte[i2];
                efdVar.y.l = bArr4;
                lp6Var.readFully(bArr4, 0, i2, false);
                return;
            }
            if (i != 30322) {
                throw s1g.d("Unexpected id: " + i, null);
            }
            efdVar.f(i);
            byte[] bArr5 = new byte[i2];
            efdVar.y.x = bArr5;
            lp6Var.readFully(bArr5, 0, i2, false);
            return;
        }
        int i14 = 8;
        if (efdVar.O == 0) {
            efdVar.U = (int) zVar.l(lp6Var, false, true, 8);
            efdVar.V = zVar.b;
            efdVar.Q = -9223372036854775807L;
            efdVar.O = (byte) 1;
            g1gVar2.K(0);
        }
        dfd dfdVar3 = (dfd) sparseArray.get(efdVar.U);
        if (dfdVar3 == null) {
            lp6Var.h(i2 - efdVar.V, false);
            efdVar.O = (byte) 0;
            return;
        }
        dfdVar3.a0.getClass();
        if (efdVar.O == 1) {
            efdVar.j(lp6Var, 3);
            int i15 = (g1gVar2.a[2] & 6) >> 1;
            if (i15 == 0) {
                efdVar.S = 1;
                int[] iArr2 = efdVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length << 1, 1)];
                }
                efdVar.T = iArr2;
                iArr2[0] = (i2 - efdVar.V) - 3;
            } else {
                efdVar.j(lp6Var, 4);
                int i16 = (g1gVar2.a[3] & 255) + 1;
                efdVar.S = i16;
                int[] iArr3 = efdVar.T;
                if (iArr3 == null) {
                    iArr3 = new int[i16];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i16) {
                        iArr3 = new int[Math.max(iArr3.length << 1, i16)];
                    }
                }
                efdVar.T = iArr3;
                if (i15 == 2) {
                    int i17 = (i2 - efdVar.V) - 4;
                    int i18 = efdVar.S;
                    Arrays.fill(iArr3, 0, i18, i17 / i18);
                } else {
                    if (i15 != 1) {
                        if (i15 != 3) {
                            throw s1g.d("Unexpected lacing value: " + i15, null);
                        }
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = i3;
                        while (true) {
                            int i22 = efdVar.S - 1;
                            int[] iArr4 = efdVar.T;
                            if (i19 >= i22) {
                                b = b3;
                                i4 = i11;
                                iArr4[i22] = ((i2 - efdVar.V) - i21) - i20;
                                break;
                            }
                            iArr4[i19] = i11;
                            int i23 = i21 + 1;
                            efdVar.j(lp6Var, i23);
                            if (g1gVar2.a[i21] == 0) {
                                throw s1g.d("No valid varint length mask found", null);
                            }
                            int i24 = i11;
                            while (true) {
                                if (i24 >= i14) {
                                    i5 = i14;
                                    b2 = b3;
                                    i6 = i11;
                                    j = 0;
                                    i7 = i23;
                                    break;
                                }
                                i5 = i14;
                                int i25 = 1 << (7 - i24);
                                i6 = i11;
                                if ((g1gVar2.a[i21] & i25) != 0) {
                                    i7 = i23 + i24;
                                    efdVar.j(lp6Var, i7);
                                    b2 = b3;
                                    j = g1gVar2.a[i21] & 255 & (~i25);
                                    while (i23 < i7) {
                                        j = (j << i5) | (g1gVar2.a[i23] & 255);
                                        i23++;
                                    }
                                    if (i19 > 0) {
                                        j -= (1 << ((i24 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i24++;
                                    i11 = i6;
                                    i14 = i5;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i26 = (int) j;
                            int[] iArr5 = efdVar.T;
                            if (i19 != 0) {
                                i26 += iArr5[i19 - 1];
                            }
                            iArr5[i19] = i26;
                            i20 += i26;
                            i19++;
                            i21 = i7;
                            i11 = i6;
                            i14 = i5;
                            b3 = b2;
                        }
                        throw s1g.d("EBML lacing sample size out of range.", null);
                    }
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = i3;
                    while (true) {
                        i8 = efdVar.S - 1;
                        iArr = efdVar.T;
                        if (i27 >= i8) {
                            break;
                        }
                        iArr[i27] = 0;
                        while (true) {
                            i9 = i29 + 1;
                            efdVar.j(lp6Var, i9);
                            int i30 = g1gVar2.a[i29] & 255;
                            int[] iArr6 = efdVar.T;
                            i10 = iArr6[i27] + i30;
                            iArr6[i27] = i10;
                            if (i30 != 255) {
                                break;
                            } else {
                                i29 = i9;
                            }
                        }
                        i28 += i10;
                        i27++;
                        i29 = i9;
                    }
                    iArr[i8] = ((i2 - efdVar.V) - i29) - i28;
                }
            }
            b = 2;
            i4 = 0;
            byte[] bArr6 = g1gVar2.a;
            efdVar.P = efdVar.l((bArr6[i4] << 8) | (bArr6[1] & 255)) + efdVar.M;
            efdVar.W = (dfdVar3.e == 1 || (i == 163 && (g1gVar2.a[b] & 128) == 128)) ? 1 : i4;
            efdVar.O = b;
            efdVar.R = i4;
        }
        if (i == 163) {
            while (true) {
                int i31 = efdVar.R;
                if (i31 >= efdVar.S) {
                    efdVar.O = (byte) 0;
                    return;
                } else {
                    efdVar.g(dfdVar3, ((efdVar.R * dfdVar3.f) / 1000) + efdVar.P, efdVar.W, efdVar.m(lp6Var, dfdVar3, efdVar.T[i31], false), 0);
                    efdVar.R++;
                }
            }
        } else {
            while (true) {
                int i32 = efdVar.R;
                if (i32 >= efdVar.S) {
                    return;
                }
                int[] iArr7 = efdVar.T;
                iArr7[i32] = efdVar.m(lp6Var, dfdVar3, iArr7[i32], true);
                efdVar.R++;
            }
        }
    }

    public final int y(String str) {
        Cursor cursorQuery = ((SQLiteDatabase) this.a).query("meta", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            Cursor cursor = cursorQuery;
            long j = cursor.moveToNext() ? cursor.getLong(0) : 0L;
            vtp.v(cursorQuery, null);
            return (int) j;
        } finally {
        }
    }

    @Override // defpackage.vnk
    public final int z() {
        return 2;
    }
}
