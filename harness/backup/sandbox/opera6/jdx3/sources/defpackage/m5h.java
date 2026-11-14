package defpackage;

import ads_mobile_sdk.xu0;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Size;
import android.widget.Toast;
import androidx.core.graphics.drawable.IconCompat;
import com.leanplum.internal.Constants;
import com.opera.android.BrowserActivity;
import com.opera.android.utilities.ShortcutUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class m5h {
    public static boolean a;
    public static boolean b;
    public static sa4 c;

    public static boolean A(Context context, String str) {
        Iterator<ShortcutInfo> it = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getPinnedShortcuts().iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void B(Context context, String str) {
        Toast.makeText(context, context.getResources().getString(2132021896, str), 1).show();
    }

    public static apm C(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = w6g.b;
        String strO = !Intrinsics.a(str2, "/") ? c.o(str, str2, "/") : str;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strO.length()) {
            char cCharAt = strO.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strO.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strO.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strO.substring(0, i6);
            strSubstring = strO.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i3 != -1 ? strO.substring(i3, iMin2) : null;
        String strSubstring4 = i4 != -1 ? strO.substring(i4, iMin) : null;
        String strSubstring5 = i2 != -1 ? strO.substring(i2, strO.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strS = strSubstring2 != null ? s(strSubstring2, bArr) : null;
        String strS2 = strSubstring != null ? s(strSubstring, bArr) : null;
        String strS3 = strSubstring3 != null ? s(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            s(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            s(strSubstring5, bArr);
        }
        return new apm(strO, str2, strS, strS2, strS3);
    }

    public static apm a(String str) {
        String str2 = w6g.b;
        StringBuilder sb = new StringBuilder();
        sb.append("file:");
        if (str != null) {
            sb.append(str);
        }
        return new apm(sb.toString(), str2, "file", null, str);
    }

    public static void b(String str) {
        vr3 vr3Var = xu0.a;
        xu0.b("4: ".concat(str), (Throwable) null);
    }

    public static void c(Collection collection, v2p v2pVar) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            v2pVar.accept(it.next());
        }
    }

    public static boolean d(List list) {
        return list == null || list.isEmpty();
    }

    public static eyj e(Context context, b3c b3cVar, Size size, Size size2, int i, int i2) {
        boolean z;
        Size size3;
        txj txjVar;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        int i5 = i;
        Resources resources = context.getResources();
        boolean z5 = size.getWidth() > size.getHeight();
        vxj vxjVarL = l(context, size);
        int iOrdinal = b3cVar.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = vxjVarL.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                z = false;
            } else {
                if (iOrdinal2 != 3) {
                    h9o.p();
                    return null;
                }
                z = true;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167649);
            nxj nxjVarG = g(context, z, new sxj(dimensionPixelSize, context.getResources().getDimensionPixelSize(2131167650), dimensionPixelSize, context.getResources().getDimensionPixelSize(2131167648)));
            sxj sxjVar = nxjVarG.e;
            int dimensionPixelSize2 = (z5 || size.getHeight() < context.getResources().getDimensionPixelSize(2131167665)) ? 0 : context.getResources().getDimensionPixelSize(2131167666);
            int iH = z7h.h(context, 188.0f);
            int iH2 = z7h.h(context, 16.0f);
            int iH3 = z7h.h(context, 24.0f) + dimensionPixelSize2;
            int height = ((size.getHeight() - iH2) - iH3) - i2;
            int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(2131167675);
            if (height < dimensionPixelSize3) {
                height = dimensionPixelSize3;
            }
            if (size2.getWidth() <= size2.getHeight()) {
                int iB = zed.b(size2.getHeight() * 0.6f);
                if (iB > height) {
                    iB = height;
                }
                int width = (size2.getWidth() * iB) / size2.getHeight();
                if (width >= iH) {
                    iH = width;
                }
                size3 = new Size(iH, iB);
            } else {
                int width2 = size.getWidth() / 3;
                if (width2 > height) {
                    width2 = height;
                }
                if (width2 >= iH) {
                    iH = width2;
                }
                size3 = new Size(iH, width2);
            }
            Size size4 = size3;
            int height2 = (height - size4.getHeight()) / 2;
            int i6 = iH2 + height2;
            int i7 = iH3 + height2;
            int iH4 = z7h.h(context, 16.0f);
            int width3 = ((size.getWidth() - size4.getWidth()) / 2) - iH4;
            int width4 = ((size.getWidth() - size4.getWidth()) / 2) - iH4;
            sxj sxjVar2 = new sxj(z7h.h(context, 72.0f), z7h.h(context, 16.0f), 0, 4, 0);
            jsc jscVar = jsc.f;
            qxj qxjVar = new qxj(new lxh(2131232116), null, null, 254);
            int width5 = size4.getWidth() - (sxjVar.a + sxjVar.c);
            int height3 = size4.getHeight() - ((nxjVarG.c + sxjVar.b) + sxjVar.d);
            rxj rxjVar = new rxj(width5, height3);
            cyj cyjVar = new cyj(jscVar, null, null, rxjVar, null, null, qxjVar, new pxj(6, new ixh(6.0f), m(2132083327, context), 44), 54);
            if (dimensionPixelSize2 > 0) {
                int height4 = size4.getHeight() + i6;
                int height5 = size.getHeight() - height4;
                int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(2131167663);
                int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(2131167661);
                float f = dimensionPixelSize5 / height3;
                Size size5 = new Size((width5 * dimensionPixelSize5) / height3, dimensionPixelSize5);
                int i8 = dimensionPixelSize4 << 1;
                Size size6 = new Size(size5.getWidth() + i8, size5.getHeight() + i8);
                int width6 = (size.getWidth() - size6.getWidth()) / 2;
                Resources resources2 = context.getResources();
                int iOrdinal3 = vxjVarL.ordinal();
                if (iOrdinal3 == 0) {
                    i3 = 2131167668;
                } else {
                    if (iOrdinal3 != 1 && iOrdinal3 != 2 && iOrdinal3 != 3) {
                        h9o.p();
                        return null;
                    }
                    i3 = 2131167667;
                }
                int dimensionPixelSize6 = resources2.getDimensionPixelSize(i3);
                shf shfVar = jscVar.b;
                jsc jscVar2 = new jsc(shfVar, shfVar);
                rxj rxjVarA = rxj.a(rxjVar, size5.getWidth(), size5.getHeight());
                jxh jxhVar = new jxh(2131167664);
                ixh ixhVar = new ixh(2.0f);
                qxj qxjVar2 = cyjVar.g;
                qxj qxjVarA = qxj.a(qxjVar2, qxjVar2.h * f);
                ixh ixhVar2 = new ixh(1.0f);
                pxj pxjVar = cyjVar.h;
                txjVar = new txj(height4, height5, width6, dimensionPixelSize6, size6, cyj.a(cyjVar, jscVar2, jxhVar, ixhVar, rxjVarA, qxjVarA, new pxj(pxjVar.a, ixhVar2, pxjVar.c, pxjVar.d, pxjVar.e, pxjVar.f), 48));
            } else {
                txjVar = null;
            }
            int width7 = (size4.getWidth() - sxjVar2.a) - sxjVar2.c;
            int height6 = size4.getHeight();
            int i9 = sxjVar2.b;
            int i10 = sxjVar2.d;
            Size size7 = new Size(width7, (height6 - i9) - i10);
            Size size8 = new Size(1, size4.getHeight());
            int i11 = iH4 << 1;
            wxj wxjVar = new wxj(size4.getWidth() + i11);
            oxj oxjVar = new oxj(new sxj(iH4, i6, iH4, i7), sxjVar2, new sxj(iH4, i6, 0, i7), new sxj(0, i6, iH4, i7), new Size(1, (size4.getHeight() - i9) - i10), new Size(width3, 1), new Size(width3, 1));
            lxh lxhVar = new lxh(2131231875);
            int width8 = size.getWidth() / 2;
            return new eyj(nxjVarG, 0, 2, size4, size7, size4, size8, wxjVar, oxjVar, cyjVar, txjVar, null, null, null, lxhVar, null, width8 < i11 ? i11 : width8, 0, 0, true, true, 0.0f, 0.0f, width4, width4, width4, width4, 528707584);
        }
        yxj yxjVar = yxj.b;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    h9o.p();
                    return null;
                }
                int dimensionPixelSize7 = context.getResources().getDimensionPixelSize(2131167638);
                Size size9 = new Size(size2.getWidth(), size2.getHeight());
                int width9 = size9.getWidth() + (dimensionPixelSize7 << 1);
                int dimensionPixelSize8 = context.getResources().getDimensionPixelSize(2131167644);
                sxj sxjVar3 = new sxj(0, 0, dimensionPixelSize7, 3, 0);
                int dimensionPixelSize9 = context.getResources().getDimensionPixelSize(2131167637);
                Size size10 = new Size(dimensionPixelSize9, size9.getHeight());
                Size size11 = new Size(dimensionPixelSize9, size9.getHeight());
                xxj xxjVar = new xxj(new lxh(2131233239), dimensionPixelSize9, size9.getHeight());
                oxj oxjVar2 = new oxj(sxjVar3, new sxj(0, 0, 0, 7, 0), sxjVar3, sxjVar3, new Size(z7h.h(context, 4.0f), size9.getHeight()), new Size(resources.getDimensionPixelSize(2131167636), 1), new Size(resources.getDimensionPixelSize(2131167635), 1));
                cyj cyjVarF = f(context, new dxh(2130969288));
                lxh lxhVar2 = new lxh(2131233238);
                lxh lxhVar3 = new lxh(2131233251);
                lxh lxhVar4 = new lxh(2131233250);
                lxh lxhVar5 = new lxh(2131233237);
                int iH5 = z7h.h(context, 40.0f);
                int width10 = (size.getWidth() / 2) / width9;
                return new eyj(mxj.a, 0, 2, size9, size9, size10, size11, xxjVar, oxjVar2, cyjVarF, null, lxhVar2, lxhVar3, lxhVar4, null, lxhVar5, iH5, width10 < 1 ? 1 : width10, width9, false, false, 0.95f, 0.95f, dimensionPixelSize9, dimensionPixelSize9, dimensionPixelSize8 + dimensionPixelSize9, dimensionPixelSize8, 343967746);
            }
            int iOrdinal4 = vxjVarL.ordinal();
            if (iOrdinal4 == 0 || iOrdinal4 == 1 || iOrdinal4 == 2) {
                z4 = false;
            } else {
                if (iOrdinal4 != 3) {
                    h9o.p();
                    return null;
                }
                z4 = true;
            }
            int dimensionPixelSize10 = context.getResources().getDimensionPixelSize(2131167658);
            sxj sxjVar4 = new sxj(dimensionPixelSize10, dimensionPixelSize10, dimensionPixelSize10, dimensionPixelSize10);
            lxj lxjVar = z4 ? new lxj(new kxj(context.getResources().getDimensionPixelSize(2131167676), new lxh(2131233254), new lxh(2131233252), new lxh(2131232034)), context.getResources().getDimensionPixelSize(2131167659), context.getResources().getDimensionPixelSize(2131167656), sxjVar4, z7h.h(context, 48.0f)) : new lxj(new kxj(context.getResources().getDimensionPixelSize(2131167677), new lxh(2131233255), new lxh(2131233253), new lxh(2131232039)), context.getResources().getDimensionPixelSize(2131167660), context.getResources().getDimensionPixelSize(2131167657), sxjVar4, z7h.h(context, 32.0f));
            int iH6 = z7h.h(context, 12.0f);
            int iH7 = z7h.h(context, z4 ? 8.0f : 4.0f);
            int iH8 = z7h.h(context, z4 ? 8.0f : 4.0f);
            sxj sxjVar5 = lxjVar.d;
            int i12 = sxjVar5.b;
            int i13 = lxjVar.c;
            int i14 = i12 + i13 + sxjVar5.d;
            int i15 = i14 + iH7 + iH8;
            int iH9 = z7h.h(context, 16.0f);
            int i16 = iH9 < i5 ? i5 : iH9;
            int iH10 = z7h.h(context, 16.0f);
            sxj sxjVar6 = new sxj(0, iH7, 0, iH8);
            int i17 = i16 << 1;
            int width11 = size.getWidth() - i17;
            sxj sxjVar7 = new sxj(0, 0, iH10, 3, 0);
            Size size12 = new Size(width11, i14);
            Size size13 = new Size((width11 - sxjVar7.a) - sxjVar7.c, (i14 - sxjVar7.b) - sxjVar7.d);
            Size size14 = new Size(width11, i14);
            Size size15 = new Size(width11, i14);
            oxj oxjVar3 = new oxj(sxjVar6, sxjVar7, sxjVar6, sxjVar6, new Size((size.getWidth() - i17) - (iH10 << 1), z7h.h(context, 8.0f)), new Size(1, iH6 - iH7), new Size(1, 1));
            cyj cyjVar2 = new cyj(jsc.e, new hxh(2130970944), new hxh(2130970945), new rxj(lxjVar.b, i13), null, new uxj(null, 125), new qxj(new lxh(2131232114), null, null, 254), new pxj(4, new ixh(2.0f), m(2132083308, context), 12), 16);
            int height7 = (size.getHeight() / 2) / i15;
            return new eyj(lxjVar, i16, 2, size12, size13, size14, size15, yxjVar, oxjVar3, cyjVar2, null, null, null, null, null, null, i15, height7 < 1 ? 1 : height7, i15, true, true, 0.9f, 0.9f, i15, (size.getHeight() - i15) / 2, 0, 0, 360970242);
        }
        int iOrdinal5 = vxjVarL.ordinal();
        if (iOrdinal5 == 0 || iOrdinal5 == 1 || iOrdinal5 == 2) {
            z2 = false;
        } else {
            if (iOrdinal5 != 3) {
                h9o.p();
                return null;
            }
            z2 = true;
        }
        int iOrdinal6 = vxjVarL.ordinal();
        if (iOrdinal6 == 0 || iOrdinal6 == 1 || iOrdinal6 == 2) {
            z3 = false;
        } else {
            if (iOrdinal6 != 3) {
                h9o.p();
                return null;
            }
            z3 = true;
        }
        int iOrdinal7 = l(context, size).ordinal();
        if (iOrdinal7 == 0) {
            i4 = 2;
        } else if (iOrdinal7 == 1) {
            i4 = 4;
        } else {
            if (iOrdinal7 != 2 && iOrdinal7 != 3) {
                h9o.p();
                return null;
            }
            i4 = 5;
        }
        int i18 = i4 - 1;
        int dimensionPixelSize11 = context.getResources().getDimensionPixelSize(2131167653);
        nxj nxjVarG2 = g(context, z2, new sxj(dimensionPixelSize11, context.getResources().getDimensionPixelSize(2131167654), dimensionPixelSize11, context.getResources().getDimensionPixelSize(2131167652)));
        int iH11 = z7h.h(context, 16.0f);
        int iH12 = z7h.h(context, z3 ? 12.0f : 8.0f);
        int iH13 = z7h.h(context, z3 ? 12.0f : 8.0f);
        int iH14 = z7h.h(context, 16.0f);
        if (iH14 >= i5) {
            i5 = iH14;
        }
        int iH15 = z7h.h(context, 16.0f);
        int i19 = iH15 / 2;
        int iH16 = z7h.h(context, 16.0f);
        int width12 = size.getWidth() - (i5 << 1);
        int i20 = iH15 * i18;
        ma2 ma2Var = z5 ? new ma2(1, 1) : new ma2(4, 5);
        int i21 = (width12 - i20) / i4;
        int i22 = (ma2Var.b * i21) / ma2Var.a;
        int i23 = i5 - i19;
        sxj sxjVar8 = new sxj(i19, iH12, i19, iH13);
        int dimensionPixelSize12 = context.getResources().getDimensionPixelSize(2131167651);
        Size size16 = new Size(i21, i22);
        Size size17 = new Size(-1, i22);
        Size size18 = new Size(i21, i22);
        Size size19 = new Size(width12, dimensionPixelSize12);
        oxj oxjVar4 = new oxj(sxjVar8, new sxj(0, 0, iH16, 3, 0), sxjVar8, new sxj(i19, 0, i19, iH13), new Size(((size.getWidth() - (i23 << 1)) - (i19 << 1)) - (iH16 << 1), z7h.h(context, 8.0f)), new Size(1, iH11 - iH12), new Size(1, 1));
        jsc jscVar3 = jsc.e;
        qxj qxjVar3 = new qxj(new lxh(2131232115), null, null, 254);
        sxj sxjVar9 = nxjVarG2.e;
        return new eyj(nxjVarG2, i23, i4, size16, size17, size18, size19, yxjVar, oxjVar4, new cyj(jscVar3, null, null, new rxj(i21 - (sxjVar9.a + sxjVar9.c), i22 - ((nxjVarG2.c + sxjVar9.b) + sxjVar9.d)), null, null, qxjVar3, new pxj(4, new ixh(4.0f), m(2132083328, context), 44), 54), null, null, null, null, null, null, iH12 + iH13 + dimensionPixelSize12, 0, i22 + iH12 + iH13, true, true, 0.0f, 0.0f, dimensionPixelSize12 + iH12, (size.getHeight() - i22) / 2, 0, 0, 528742400);
    }

    public static cyj f(Context context, cxh cxhVar) {
        jsc jscVar = jsc.d;
        ixh ixhVar = new ixh(9.0f);
        ixh ixhVar2 = new ixh(9.0f);
        qxj qxjVar = new qxj(new lxh(2131232113), new gxh(0), cxhVar, 248);
        uxj uxjVar = new uxj(null, 125);
        return new cyj(jscVar, ixhVar, ixhVar2, new rxj(z7h.h(context, 18.0f), z7h.h(context, 18.0f)), new zxj(new byj(new lxh(2131232198), cxhVar)), uxjVar, qxjVar, new pxj(4, new ixh(2.0f), (kxh) null, 60));
    }

    public static nxj g(Context context, boolean z, sxj sxjVar) throws Resources.NotFoundException {
        if (!z) {
            return new nxj(new kxj(context.getResources().getDimensionPixelSize(2131167679), new lxh(2131233255), new lxh(2131233253), new lxh(2131232039)), context.getResources().getDimensionPixelSize(2131167683), context.getResources().getDimensionPixelSize(2131167681), 2132083340, sxjVar, f(context, new fxh(2131103812)));
        }
        kxj kxjVar = new kxj(context.getResources().getDimensionPixelSize(2131167678), new lxh(2131233254), new lxh(2131233252), new lxh(2131232034));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167680);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131167682);
        fxh fxhVar = new fxh(2131103812);
        jsc jscVar = jsc.d;
        ixh ixhVar = new ixh(12.0f);
        ixh ixhVar2 = new ixh(12.0f);
        qxj qxjVar = new qxj(new lxh(2131232112), new gxh(0), fxhVar, 248);
        uxj uxjVar = new uxj(null, 125);
        return new nxj(kxjVar, dimensionPixelSize2, dimensionPixelSize, 2132083339, sxjVar, new cyj(jscVar, ixhVar, ixhVar2, new rxj(z7h.h(context, 24.0f), z7h.h(context, 24.0f)), new zxj(new byj(new lxh(2131232197), fxhVar)), uxjVar, qxjVar, new pxj(4, new ixh(2.0f), (kxh) null, 60)));
    }

    public static SpannableStringBuilder h(Context context, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, 2132083353), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static final String i(apm apmVar) {
        List listJ = j(apmVar);
        String str = apmVar.b;
        if (listJ.isEmpty()) {
            return null;
        }
        if (!c.q(apmVar.e, str, false)) {
            str = "";
        }
        return CollectionsKt.P(listJ, apmVar.b, str, (String) null, 0, (Function1) null, 60);
    }

    public static final List j(apm apmVar) {
        String str = apmVar.e;
        if (str == null) {
            return l08.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iK = StringsKt.K(str, '/', i2, 4);
            if (iK == -1) {
                iK = str.length();
            }
            String strSubstring = str.substring(i2, iK);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iK;
        }
        return arrayList;
    }

    public static List k(Context context) {
        try {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getPinnedShortcuts();
        } catch (IllegalStateException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public static vxj l(Context context, Size size) {
        int iOrdinal = ddh.t(size.getWidth(), context).ordinal();
        if (iOrdinal == 0) {
            return vxj.a;
        }
        if (iOrdinal == 1) {
            return vxj.b;
        }
        if (iOrdinal == 2) {
            return vxj.c;
        }
        if (iOrdinal == 3) {
            return vxj.d;
        }
        h9o.p();
        return null;
    }

    public static kxh m(int i, Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, zhh.y);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, z7h.h(context, 12.0f));
        typedArrayObtainStyledAttributes.recycle();
        return new kxh(dimensionPixelSize);
    }

    public static final g06 n(w7n w7nVar) {
        return w7nVar instanceof n7a ? ((n7a) w7nVar).getDefaultViewModelCreationExtras() : e06.b;
    }

    public static final boolean o(sf1 sf1Var) {
        int length = sf1Var.b.length();
        List list = sf1Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                rf1 rf1Var = (rf1) list.get(i);
                if ((rf1Var.a instanceof pfc) && tf1.b(0, length, rf1Var.b, rf1Var.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean p(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static boolean q() {
        if (!a) {
            b = ((ShortcutManager) t8.a.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
            a = true;
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList r(g1g r31) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5h.r(g1g):java.util.ArrayList");
    }

    public static final String s(String str, byte[] bArr) {
        int length = str.length();
        int i = 0;
        int iMax = Math.max(0, length - 2);
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return c.j(i2, 5, bArr);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    bArr[i2] = (byte) Integer.parseInt(str.substring(i + 1, i3), CharsKt.checkRadix(16));
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static final List t(wsk wskVar) {
        int i = uyg.i(wskVar, "id");
        int i2 = uyg.i(wskVar, "seq");
        int i3 = uyg.i(wskVar, "from");
        int i4 = uyg.i(wskVar, "to");
        ehc ehcVarB = a.b();
        while (wskVar.n()) {
            ehcVarB.add(new jj9((int) wskVar.getLong(i), (int) wskVar.getLong(i2), wskVar.l(i3), wskVar.l(i4)));
        }
        return CollectionsKt.b0(a.a(ehcVarB));
    }

    public static final val u(osk oskVar, String str, boolean z) {
        wsk wskVarH = oskVar.h("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int i = uyg.i(wskVarH, "seqno");
            int i2 = uyg.i(wskVarH, "cid");
            int i3 = uyg.i(wskVarH, Constants.Params.NAME);
            int i4 = uyg.i(wskVarH, "desc");
            if (i == -1 || i2 == -1 || i3 == -1 || i4 == -1) {
                fr3.t(wskVarH, (Throwable) null);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (wskVarH.n()) {
                if (((int) wskVarH.getLong(i2)) >= 0) {
                    int i5 = (int) wskVarH.getLong(i);
                    String strL = wskVarH.l(i3);
                    String str2 = wskVarH.getLong(i4) > 0 ? "DESC" : "ASC";
                    linkedHashMap.put(Integer.valueOf(i5), strL);
                    linkedHashMap2.put(Integer.valueOf(i5), str2);
                }
            }
            List listC0 = CollectionsKt.c0(new au9((byte) 19), linkedHashMap.entrySet());
            ArrayList arrayList = new ArrayList(k95.o(listC0, 10));
            Iterator it = listC0.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getValue());
            }
            List listK0 = CollectionsKt.k0(arrayList);
            List listC02 = CollectionsKt.c0(new au9((byte) 20), linkedHashMap2.entrySet());
            ArrayList arrayList2 = new ArrayList(k95.o(listC02, 10));
            Iterator it2 = listC02.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
            }
            val valVar = new val(str, listK0, CollectionsKt.k0(arrayList2), z);
            fr3.t(wskVarH, (Throwable) null);
            return valVar;
        } finally {
        }
    }

    public static final Object v(tcc tccVar, qcc qccVar, Function2 function2, kuk kukVar) {
        Object objQ;
        if (qccVar != qcc.b) {
            return (((qdc) tccVar).i != qcc.a && (objQ = sgb.q(new s71(tccVar, qccVar, function2, (mt5) null, (byte) 27), kukVar)) == px5.a) ? objQ : Unit.a;
        }
        qp2.o("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final Object w(ndc ndcVar, qcc qccVar, Function2 function2, kuk kukVar) {
        Object objV = v(ndcVar.getLifecycle(), qccVar, function2, kukVar);
        return objV == px5.a ? objV : Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void x(BrowserActivity browserActivity) {
        Intent intentB = mdb.b(browserActivity);
        intentB.setAction("android.intent.action.MAIN");
        y(browserActivity, "xiaomi_launcher_shortcut_id", browserActivity.getResources().getString(2132017591), IconCompat.c(2131231915, browserActivity), intentB);
    }

    public static void y(Context context, String str, String str2, IconCompat iconCompat, Intent intent) {
        try {
            nhj nhjVar = new nhj();
            nhjVar.a = context;
            nhjVar.b = str;
            nhjVar.e = str2;
            nhjVar.c = new Intent[]{intent};
            nhjVar.h = iconCompat;
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr = nhjVar.c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            Intent intent2 = new Intent(context, (Class<?>) ShortcutUtils.Receiver.class);
            intent2.setAction("com.opera.android.action.SHORTCUT_ADDED");
            intent2.putExtra("com.opera.browser.title", str2);
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(nhjVar.a(), PendingIntent.getBroadcast(context, 0, intent2, 1275068416).getIntentSender());
        } catch (IllegalStateException unused) {
            B(context, str2);
        }
    }

    public static void z(dx3 dx3Var, Canvas canvas) {
        int iA = fan.a(4.0f, dx3Var.getResources());
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_WINDING);
        RectF rectF = new RectF(new Rect(0, 0, canvas.getWidth(), canvas.getHeight()));
        rectF.inset(1.0f, 1.0f);
        float f = iA;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(path, paint);
    }
}
