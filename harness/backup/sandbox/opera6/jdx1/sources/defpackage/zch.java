package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class zch {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(kotlin.jvm.functions.Function1 r4, mt5 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.y0i
            if (r0 == 0) goto L13
            r0 = r5
            y0i r0 = (defpackage.y0i) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            y0i r0 = new y0i
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r5)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            goto L3c
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r5)
            p0i r5 = t0i.b     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            r0.u = r3     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            java.lang.Object r5 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            if (r5 != r1) goto L3c
            return r1
        L3c:
            p0i r4 = t0i.b     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            return r5
        L3f:
            r4 = move-exception
            p0i r5 = t0i.b
            q0i r5 = new q0i
            r5.<init>(r4)
            return r5
        L48:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zch.A(kotlin.jvm.functions.Function1, mt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [b8e] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [b8e] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void B(f17 f17Var, Object obj, Function1 function1) throws pxb {
        tah tahVar;
        if (!((b8e) f17Var).a.n) {
            a8b.b("visitAncestors called on an unattached node");
        }
        b8e b8eVar = ((b8e) f17Var).a.e;
        m3c m3cVarE0 = ui6.e0(f17Var);
        while (m3cVarE0 != null) {
            if ((((b8e) m3cVarE0.F.g).d & 262144) != 0) {
                while (b8eVar != null) {
                    if ((b8eVar.c & 262144) != 0) {
                        i17 i17VarU = b8eVar;
                        ?? dfeVar = 0;
                        while (i17VarU != 0) {
                            if (i17VarU instanceof u5m) {
                                u5m u5mVar = (u5m) i17VarU;
                                if (!(obj.equals(u5mVar.h()) ? ((Boolean) function1.invoke(u5mVar)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((i17VarU.c & 262144) != 0 && (i17VarU instanceof i17)) {
                                b8e b8eVar2 = i17VarU.p;
                                int i = 0;
                                i17VarU = i17VarU;
                                dfeVar = dfeVar;
                                while (b8eVar2 != null) {
                                    if ((b8eVar2.c & 262144) != 0) {
                                        i++;
                                        dfeVar = dfeVar;
                                        if (i == 1) {
                                            i17VarU = b8eVar2;
                                        } else {
                                            if (dfeVar == 0) {
                                                dfeVar = new dfe(new b8e[16]);
                                            }
                                            if (i17VarU != 0) {
                                                dfeVar.c(i17VarU);
                                                i17VarU = 0;
                                            }
                                            dfeVar.c(b8eVar2);
                                        }
                                    }
                                    b8eVar2 = b8eVar2.f;
                                    i17VarU = i17VarU;
                                    dfeVar = dfeVar;
                                }
                                if (i != 1) {
                                }
                            }
                            i17VarU = ui6.U(dfeVar);
                        }
                    }
                    b8eVar = b8eVar.e;
                }
            }
            m3cVarE0 = m3cVarE0.u();
            b8eVar = (m3cVarE0 == null || (tahVar = m3cVarE0.F) == null) ? null : (lbl) tahVar.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [f17, java.lang.Object, u5m] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [b8e] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [b8e] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void C(u5m u5mVar, Function1 function1) throws pxb {
        tah tahVar;
        b8e b8eVar = (b8e) u5mVar;
        if (!b8eVar.a.n) {
            a8b.b("visitAncestors called on an unattached node");
        }
        b8e b8eVar2 = b8eVar.a.e;
        m3c m3cVarE0 = ui6.e0(u5mVar);
        while (m3cVarE0 != null) {
            if ((((b8e) m3cVarE0.F.g).d & 262144) != 0) {
                while (b8eVar2 != null) {
                    if ((b8eVar2.c & 262144) != 0) {
                        i17 i17VarU = b8eVar2;
                        ?? dfeVar = 0;
                        while (i17VarU != 0) {
                            boolean zBooleanValue = true;
                            if (i17VarU instanceof u5m) {
                                u5m u5mVar2 = (u5m) i17VarU;
                                if (Intrinsics.a(u5mVar.h(), u5mVar2.h()) && u5mVar.getClass() == u5mVar2.getClass()) {
                                    zBooleanValue = ((Boolean) function1.invoke(u5mVar2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((i17VarU.c & 262144) != 0 && (i17VarU instanceof i17)) {
                                b8e b8eVar3 = i17VarU.p;
                                int i = 0;
                                i17VarU = i17VarU;
                                dfeVar = dfeVar;
                                while (b8eVar3 != null) {
                                    if ((b8eVar3.c & 262144) != 0) {
                                        i++;
                                        dfeVar = dfeVar;
                                        if (i == 1) {
                                            i17VarU = b8eVar3;
                                        } else {
                                            if (dfeVar == 0) {
                                                dfeVar = new dfe(new b8e[16]);
                                            }
                                            if (i17VarU != 0) {
                                                dfeVar.c(i17VarU);
                                                i17VarU = 0;
                                            }
                                            dfeVar.c(b8eVar3);
                                        }
                                    }
                                    b8eVar3 = b8eVar3.f;
                                    i17VarU = i17VarU;
                                    dfeVar = dfeVar;
                                }
                                if (i != 1) {
                                }
                            }
                            i17VarU = ui6.U(dfeVar);
                        }
                    }
                    b8eVar2 = b8eVar2.e;
                }
            }
            m3cVarE0 = m3cVarE0.u();
            b8eVar2 = (m3cVarE0 == null || (tahVar = m3cVarE0.F) == null) ? null : (lbl) tahVar.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [b8e] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [b8e] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void D(b8e b8eVar, String str, Function1 function1) {
        if (!b8eVar.a.n) {
            a8b.b("visitSubtreeIf called on an unattached node");
        }
        dfe dfeVar = new dfe(new b8e[16]);
        b8e b8eVar2 = b8eVar.a;
        b8e b8eVar3 = b8eVar2.f;
        if (b8eVar3 == null) {
            ui6.h(dfeVar, b8eVar2);
        } else {
            dfeVar.c(b8eVar3);
        }
        while (true) {
            int i = dfeVar.c;
            if (i == 0) {
                return;
            }
            b8e b8eVar4 = (b8e) dfeVar.l(i - 1);
            if ((b8eVar4.d & 262144) != 0) {
                for (b8e b8eVar5 = b8eVar4; b8eVar5 != null && b8eVar5.n; b8eVar5 = b8eVar5.f) {
                    if ((b8eVar5.c & 262144) != 0) {
                        i17 i17VarU = b8eVar5;
                        ?? dfeVar2 = 0;
                        while (i17VarU != 0) {
                            if (i17VarU instanceof u5m) {
                                u5m u5mVar = (u5m) i17VarU;
                                t5m t5mVar = str.equals(u5mVar.h()) ? (t5m) function1.invoke(u5mVar) : t5m.a;
                                if (t5mVar == t5m.c) {
                                    return;
                                }
                                if (t5mVar == t5m.b) {
                                    break;
                                }
                            } else if ((i17VarU.c & 262144) != 0 && (i17VarU instanceof i17)) {
                                b8e b8eVar6 = i17VarU.p;
                                int i2 = 0;
                                i17VarU = i17VarU;
                                dfeVar2 = dfeVar2;
                                while (b8eVar6 != null) {
                                    if ((b8eVar6.c & 262144) != 0) {
                                        i2++;
                                        dfeVar2 = dfeVar2;
                                        if (i2 == 1) {
                                            i17VarU = b8eVar6;
                                        } else {
                                            if (dfeVar2 == 0) {
                                                dfeVar2 = new dfe(new b8e[16]);
                                            }
                                            if (i17VarU != 0) {
                                                dfeVar2.c(i17VarU);
                                                i17VarU = 0;
                                            }
                                            dfeVar2.c(b8eVar6);
                                        }
                                    }
                                    b8eVar6 = b8eVar6.f;
                                    i17VarU = i17VarU;
                                    dfeVar2 = dfeVar2;
                                }
                                if (i2 != 1) {
                                }
                            }
                            i17VarU = ui6.U(dfeVar2);
                        }
                    }
                }
            }
            ui6.h(dfeVar, b8eVar4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, u5m] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [b8e] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [b8e] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void E(u5m u5mVar, Function1 function1) {
        b8e b8eVar = (b8e) u5mVar;
        if (!b8eVar.a.n) {
            a8b.b("visitSubtreeIf called on an unattached node");
        }
        dfe dfeVar = new dfe(new b8e[16]);
        b8e b8eVar2 = b8eVar.a;
        b8e b8eVar3 = b8eVar2.f;
        if (b8eVar3 == null) {
            ui6.h(dfeVar, b8eVar2);
        } else {
            dfeVar.c(b8eVar3);
        }
        while (true) {
            int i = dfeVar.c;
            if (i == 0) {
                return;
            }
            b8e b8eVar4 = (b8e) dfeVar.l(i - 1);
            if ((b8eVar4.d & 262144) != 0) {
                for (b8e b8eVar5 = b8eVar4; b8eVar5 != null && b8eVar5.n; b8eVar5 = b8eVar5.f) {
                    if ((b8eVar5.c & 262144) != 0) {
                        i17 i17VarU = b8eVar5;
                        ?? dfeVar2 = 0;
                        while (i17VarU != 0) {
                            if (i17VarU instanceof u5m) {
                                u5m u5mVar2 = (u5m) i17VarU;
                                t5m t5mVar = (Intrinsics.a(u5mVar.h(), u5mVar2.h()) && u5mVar.getClass() == u5mVar2.getClass()) ? (t5m) function1.invoke(u5mVar2) : t5m.a;
                                if (t5mVar == t5m.c) {
                                    return;
                                }
                                if (t5mVar == t5m.b) {
                                    break;
                                }
                            } else if ((i17VarU.c & 262144) != 0 && (i17VarU instanceof i17)) {
                                b8e b8eVar6 = i17VarU.p;
                                int i2 = 0;
                                i17VarU = i17VarU;
                                dfeVar2 = dfeVar2;
                                while (b8eVar6 != null) {
                                    if ((b8eVar6.c & 262144) != 0) {
                                        i2++;
                                        dfeVar2 = dfeVar2;
                                        if (i2 == 1) {
                                            i17VarU = b8eVar6;
                                        } else {
                                            if (dfeVar2 == 0) {
                                                dfeVar2 = new dfe(new b8e[16]);
                                            }
                                            if (i17VarU != 0) {
                                                dfeVar2.c(i17VarU);
                                                i17VarU = 0;
                                            }
                                            dfeVar2.c(b8eVar6);
                                        }
                                    }
                                    b8eVar6 = b8eVar6.f;
                                    i17VarU = i17VarU;
                                    dfeVar2 = dfeVar2;
                                }
                                if (i2 != 1) {
                                }
                            }
                            i17VarU = ui6.U(dfeVar2);
                        }
                    }
                }
            }
            ui6.h(dfeVar, b8eVar4);
        }
    }

    public static csk a() {
        return new csk((unb) null);
    }

    public static pee b(Class cls, String str, String str2) {
        pee peeVar = new pee(cls, str, str2, 0);
        uqh.a.getClass();
        return peeVar;
    }

    public static void c(uio uioVar) {
        if (uioVar.f) {
            g(uioVar);
        } else {
            qp2.n("AdSession is not started");
        }
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        qp2.o(str);
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            qp2.o(str2);
        }
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
    }

    public static void g(uio uioVar) {
        if (uioVar.g) {
            qp2.n("AdSession is finished");
        }
    }

    public static Bitmap h(Bitmap bitmap, Integer num, float f, int i, int i2) {
        try {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.RGB_565;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
            if (num != null) {
                bitmapCreateBitmap.eraseColor(num.intValue());
            }
            float width = bitmap.getWidth() * f;
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            float f2 = width / 2.0f;
            float height = (f * bitmap.getHeight()) / 2.0f;
            RectF rectF = new RectF((bitmapCreateBitmap.getWidth() / 2.0f) - f2, (bitmapCreateBitmap.getHeight() / 2.0f) - height, (bitmapCreateBitmap.getWidth() / 2.0f) + f2, (bitmapCreateBitmap.getHeight() / 2.0f) + height);
            Paint paint = new Paint();
            paint.setFilterBitmap(true);
            canvas.drawBitmap(bitmap, rect, rectF, paint);
            bitmap.recycle();
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    public static void j(uio uioVar) {
        if (gvf.NATIVE == ((gvf) uioVar.b.b)) {
            return;
        }
        qp2.n("Impression event is not expected from the Native AdSession");
    }

    public static String l(e54 e54Var) {
        StringBuilder sb = new StringBuilder(e54Var.size());
        for (int i = 0; i < e54Var.size(); i++) {
            byte bD = e54Var.d(i);
            if (bD == 34) {
                sb.append("\\\"");
            } else if (bD == 39) {
                sb.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb.append('\\');
                            sb.append((char) (((bD >>> 6) & 3) + 48));
                            sb.append((char) (((bD >>> 3) & 7) + 48));
                            sb.append((char) ((bD & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bD);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String m(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static rxh n(zan zanVar) {
        switch (zanVar.ordinal()) {
            case 0:
                return new rxh(2132017507);
            case 1:
            case 6:
                return new rxh(2132017509);
            case 2:
                return null;
            case 3:
                return new rxh(2132017509);
            case 4:
                return new rxh(2132020523);
            case 5:
                return new rxh(2132017508);
            default:
                h9o.p();
                return null;
        }
    }

    public static void o(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 1152921504606846975L;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    public static void p(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        o(jArr, jArr4);
        o(jArr2, jArr5);
        long[] jArr6 = new long[8];
        q(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        q(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        q(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        q(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        q(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        q(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        q(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        q(jArr6, j, j3, jArr7, 0);
        q(jArr6, j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j6 ^ j7);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 60);
        jArr3[1] = (j13 >>> 4) ^ (j8 << 56);
        jArr3[2] = (j8 >>> 8) ^ (j9 << 52);
        jArr3[3] = (j9 >>> 12) ^ (j10 << 48);
        jArr3[4] = (j10 >>> 16) ^ (j11 << 44);
        jArr3[5] = (j11 >>> 20) ^ (j14 << 40);
        jArr3[6] = (j14 >>> 24) ^ (j15 << 36);
        jArr3[7] = j15 >>> 28;
    }

    public static void q(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        int i2 = (int) j;
        long j7 = jArr[i2 & 7] ^ (jArr[(i2 >>> 3) & 7] << 3);
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (1152921504606846975L & j7);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j7 >>> 60) ^ ((j8 ^ (((j & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5)) << 4));
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean s(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void t(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        p(jArr, jArr2, jArr4);
        w(jArr4, jArr3);
    }

    public static tw7 u(String str) {
        int i = 0;
        List listX = StringsKt.X(str, new char[]{','});
        ArrayList arrayList = new ArrayList(k95.o(listX, 10));
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.l0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.isEmpty() ? new rw7(i1g.b) : new sw7(arrayList2);
    }

    public static void w(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = ((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47);
        long j15 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j16 = j15 >>> 47;
        jArr2[0] = j12 ^ j16;
        jArr2[1] = j13;
        jArr2[2] = j14 ^ (j16 << 30);
        jArr2[3] = j15 & 140737488355327L;
    }

    public static void x(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        ui6.t(jArr, jArr3, 4);
        w(jArr3, jArr2);
    }

    public static void y(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[8];
        ui6.t(jArr, jArr3, 4);
        while (true) {
            w(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                ui6.t(jArr2, jArr3, 4);
            }
        }
    }

    public static final Object z(Function2 function2, nt5 nt5Var) {
        bsk bskVar = new bsk(nt5Var, nt5Var.getContext());
        Object objQ = ocp.q(bskVar, true, bskVar, function2);
        px5 px5Var = px5.a;
        return objQ;
    }

    public abstract String i(byte[] bArr, int i, int i2);

    public abstract int k(String str, byte[] bArr, int i, int i2);

    public abstract int v(int i, int i2, byte[] bArr);
}
